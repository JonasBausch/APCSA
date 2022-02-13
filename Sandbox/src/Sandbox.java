import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {

        Scanner func = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = func.nextInt();
        sum(x);
        int sum1 = 0;
        System.out.println("The sum is = " + sum1);
        //return ;
    }

    public static int sum(int n) {
        //int sum1 = 0;
        int sum1 = (n + 1) * (n / 2);
        return sum1;
    }
}

