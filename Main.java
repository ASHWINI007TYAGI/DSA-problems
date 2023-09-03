import java.util.Scanner;

public class Main {
    public static boolean armstrong(int n) {
        int temp1 = n;
        int temp = n;
        int count = 0;
        
        while (n != 0) {
            n = n / 10;
            count++;
        }
        
        n = temp;
        temp = 0;
        
        while (n != 0) {
            int digit = n % 10;
            temp += Math.pow(digit, count);  // Corrected the exponentiation here
            n = n / 10;
        }
        
        return temp == temp1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean isArmstrong = armstrong(n);
        
        if (isArmstrong) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
