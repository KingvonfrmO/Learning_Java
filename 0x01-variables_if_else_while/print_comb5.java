public class print_comb5 {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 100; i++){
            for(j = i + 1; j < 100; j++){
                if (i < 10){
                    System.out.print('0');
                }
                System.out.print(i);
                System.out.print(" ");
                if (j < 10){
                    System.out.print('0');
                }
                System.out.print(j);

                if (i != 98 || j != 99){
                    System.out.print(", ");
                }

            }
        }
    }
}
