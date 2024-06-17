public class print_comb3 {
    public static void main(String[] args) {
        int i, j;

        for (i = 0; i < 9; i++){
            for(j = i + 1; j < 10; j++){
                System.out.print(i);
                System.out.print(j);
                if (i != 8 || j != 9){
                    System.out.print(", ");
                }
            }
        }
    }
}
