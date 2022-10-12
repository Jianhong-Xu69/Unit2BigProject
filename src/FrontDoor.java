import java.util.Scanner;
public class FrontDoor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first coordinate (x,y)");
        String coord1 = input.nextLine();
        int extractor1 = coord1.indexOf("(");
        int extractor2 = coord1.indexOf(",");
        int x1 = Integer.parseInt(coord1.substring(extractor1 + 1, extractor1 + 2));
        int y1 = Integer.parseInt(coord1.substring(extractor2 + 1, extractor2 + 2));
        System.out.println("(" + x1 + "," + y1 + ")");
        System.out.print("Please input your second coordinate (x,y)");
        String coord2 = input.nextLine();
        extractor1 = coord2.indexOf("(");
        extractor2 = coord2.indexOf(",");
        int x2 = Integer.parseInt(coord2.substring(extractor1 + 1, extractor1 + 2));
        int y2 = Integer.parseInt(coord2.substring(extractor2 + 1, extractor2 + 2));
        LinearEquation test = new LinearEquation(x1, y1, x2, y2);
        test.calculateSlope();
        test.intercept();
        test.distance();
    }
}
