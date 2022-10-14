import java.util.Scanner;//Scanner my beloved (Allows user input)
public class FrontDoor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//setup for input
        System.out.println("Please enter your first coordinate (x,y)");
        String coord1 = input.nextLine();
        int extractor1 = coord1.indexOf("(");//extracts the ints from String of first coordinate
        int extractor2 = coord1.indexOf(",");
        int extractor3 = coord1.indexOf(")");
        int x1 = Integer.parseInt(coord1.substring(extractor1 + 1, extractor2));
        int y1 = Integer.parseInt(coord1.substring(extractor2 + 1, extractor3));
        System.out.println("Please input your second coordinate (x,y)");
        String coord2 = input.nextLine();
        extractor1 = coord2.indexOf("(");//extracts the ints from String of seconds coordinate
        extractor2 = coord2.indexOf(",");
        extractor3 = coord2.indexOf(")");
        int x2 = Integer.parseInt(coord2.substring(extractor1 + 1, extractor2));
        int y2 = Integer.parseInt(coord2.substring(extractor2 + 1, extractor3));
        LinearEquation test = new LinearEquation(x1, y1, x2, y2);//creates object
        System.out.println(test);//toString() method allows it to print the value of the object
        System.out.println("Enter an X integer value on the line to calculate the Y value");
        System.out.println(test.yValue(input.nextDouble()));
    }
}
