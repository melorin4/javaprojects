import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to the area calculator!\n1 - rectangle  2 - square  3 - circle\nPlease enter the number of your shape: ");
        int  shapeChoose = Integer.parseInt(scanner.next());

        if(shapeChoose == 1){
            System.out.println("Please enter the length of the rectangle: (cm)");
            int length = Integer.parseInt(scanner.next());
            System.out.println("Please enter the width of the rectangle: (cm)");
            int width = Integer.parseInt(scanner.next());

            System.out.println("The area of your rectangle is " + length * width + "cm²");
        } else if(shapeChoose == 2){
            System.out.println("Please enter the length of a side: (cm)");
            int side = Integer.parseInt(scanner.next());

            System.out.println("The area of the square is " + side * side + "cm²");
        } else if(shapeChoose == 3) {
            System.out.println("Please enter the radius of the circle: (cm)");
            int radius = Integer.parseInt(scanner.next());

            System.out.println("The area of the circle is " + Math.PI * radius * radius + "cm²");
        }
    }
}
