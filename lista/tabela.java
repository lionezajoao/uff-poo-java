class tabela {
    public static void main(String[] args) {
        for ( int i = 1; i <= 10; i++) {
            System.out.printf("Tabuada do número %d:\n", i);
            for ( int j = 1; j <= 10; j++) {

                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
        }
    }
}