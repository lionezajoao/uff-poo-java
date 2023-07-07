import java.util.*;

class CalcPrimo extends Thread {
    private int init;
    private int num;
    private int cont;

    public CalcPrimo(int init, int num) {
        this.init = init;
        this.num = num;
        this.cont = 0;
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int getCount() { 
        return this.cont;
    }

    @Override
    public void run() {
        for (int i = this.init; i <= this.num ; i++) {
            if (isPrime(i)) this.cont++;
        }
    }
}


public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        CalcPrimo thread1 = new CalcPrimo(1, num / 2);
        CalcPrimo thread2 = new CalcPrimo(num / 2 + 1, num);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int total = thread1.getCount() + thread2.getCount();

        System.out.println(total);

        input.close();
    }
}
