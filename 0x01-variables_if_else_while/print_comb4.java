public class print_comb4 {
    public static void main(String[] args) {
        int i, j, k;

        for (i = 0; i < 8; i++){
            for (j = i + 1; j < 9; j++){
                for (k = j + 1; k < 10; k++){
                    System.out.print(i);
                    System.out.print(j);
                    System.out.print(k);
                    if (i != 7 || j != 8 || k !=9){
                        System.out.print(", ");
                    }
                }
            }
        }
    }
}
