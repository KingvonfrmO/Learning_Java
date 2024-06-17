public class print_alphabt {
    public static void main(String[] args) {
        char ch;

        for (ch = 'a'; ch <= 'z'; ch++){
            if (ch != 'e' && ch != 'q'){
                System.out.print(ch);
            }
        }
        System.out.println();
    }
}
