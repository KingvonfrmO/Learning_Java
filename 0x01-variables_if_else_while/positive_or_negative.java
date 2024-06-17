import java.util.Random;

public class positive_or_negative {
    public static void main(String[] args) {
        Random rand = new Random();

        int n = rand.nextInt();
        if (n > 0){
            System.out.println(n + " is positive");
        }else if (n == 0){
            System.out.println(n + " is zero");
        }else{
            System.out.println(n + " is negative");
        }
    }
}
