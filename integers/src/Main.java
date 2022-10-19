import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int first, second, third;

        Scanner  x = new Scanner(System.in);
        System.out.print("enter the first integer: ");
        first = x.nextInt();

        Scanner  y = new Scanner(System.in);
        System.out.print("enter the second integer: ");
        second = y.nextInt();

        Scanner  z = new Scanner(System.in);
        System.out.print("enter the third integer: ");
        third = z.nextInt();

        if(first > second && first > third){
            System.out.print("the greatest integer is: " + first);
        }
        else if(second > third){
            System.out.print("the greatest integer is: " + second);
        }
        else{
            System.out.print("the greatest integer is: " + third);
        }
    }
}
