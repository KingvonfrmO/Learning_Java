import java.util.Random;

public class last_digit {
    public static void main(String[] args) {
        Random rand = new Random();

        int n = rand.nextInt();
        int last_digit = Math.abs(n % 10);

        if (last_digit > 5) {
            System.out.println("Last digit of " + n + " is " + last_digit + " and is greater than 5");
        }else if (last_digit == 0){
            System.out.println("Last digit of " + n + " is " + last_digit + " and is zero");
        }else{
            System.out.println("Last digit of " + n + " is " + last_digit + " and is less than 6 and not 0");
        }
    }
}
