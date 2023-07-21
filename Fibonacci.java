import java.util.*;

class ThreadFib extends Thread {
    private int num;
    private int val;
    private String name;
    
    public ThreadFib(int num, int val, String name) {
        this.num = num;
        this.val = val;
        this.name = name;
    }

    @Override
    public void run() {
        this.num -= this.val;
        System.out.println("Num = " + this.num + this.name);
    }

    public int getNum() {
        return this.num;
    }

}

public class Fibonacci {

    public static synchronized int getNum(int num) throws InterruptedException {

        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            // System.out.println(num); 
            // ThreadFib t1 = new ThreadFib(num, 1, " Thread 1");
            // ThreadFib t2 = new ThreadFib(num, 2, " Thread 2");

            // t1.start();
            // t2.start();

            // t1.join();
            // t2.join();
            // return t1.getNum() + t2.getNum();

            return getNum(num - 1 ) + getNum(num - 2);
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos desejada: ");
        int qtd = input.nextInt();

        for (int i = 0; i < qtd; i++) {
            try {
                int fib = getNum(i);
                System.out.println(fib); 
            } catch (InterruptedException err) {
                System.out.println(err);
            }
        }
        input.close();
    }
}