import java.util.Scanner;
public class FrontDoor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinearEquation testicle = new LinearEquation(1,2,3,3);
        System.out.println(testicle.CalculateSlope());
    }
}
