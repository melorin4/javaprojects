import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int range1;
        int range2;
        int div1;

        System.out.print("please enter the first range: ");
        range1 = Integer.parseInt(in.nextLine());

        System.out.print("please enter the second range: ");
        range2 = Integer.parseInt(in.nextLine());

        System.out.print("please enter the first number that will be divisible with: ");
        div1 = Integer.parseInt(in.nextLine());
        for (int i=range1; i<range2; i++)
            if (i % div1 == 0)
                System.out.print(i + " ");
    }
}
