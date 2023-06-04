import java.io.*;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws IOException {

        File file1 = new File(args[0]);
        File file2 = new File(args[1]);

        try (Scanner circleScanner = new Scanner(file1);
             Scanner pointScanner = new Scanner(file2)) {

            float xCircle = circleScanner.nextFloat();
            float yCircle = circleScanner.nextFloat();
            float rCircle = circleScanner.nextFloat();

            float hypo;
            float xPoint;
            float yPoint;
            while (pointScanner.hasNextLine()) {
                String[] pointCoords = pointScanner.nextLine().split(" ");
                xPoint = Float.parseFloat(pointCoords[0]);
                yPoint = Float.parseFloat(pointCoords[1]);
                hypo = (float) Math.sqrt((xPoint - xCircle) * (xPoint - xCircle) + (yPoint - yCircle) * (yPoint - yCircle));
                if (hypo > rCircle) {
                    System.out.println(2);
                } else if (hypo == rCircle) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            }
        }
    }
}