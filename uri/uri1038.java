import java.util.Scanner;

class Uri1038 {

    public static float getTotal(int codigo, float qtd) {

        switch (codigo) {
            case 1:
                return qtd * 4.00f;
            case 2:
                return qtd * 4.5f;
            case 3:
                return qtd * 5.00f;
            case 4:
                return qtd * 2.00f;
            case 5:
                return qtd * 1.50f;
            default:
                return 0.00f; 


        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigo;
        float qtd, total;

        codigo = input.nextInt();
        qtd = input.nextFloat();

        total = getTotal(codigo, qtd);

        System.out.printf("Total: R$ %1.2f\n",  total);
        input.close();

    }
}