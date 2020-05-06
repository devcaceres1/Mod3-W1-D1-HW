import java.util.Scanner;

public class Converting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Insert for inch: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");

    }
}
