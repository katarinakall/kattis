import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double x1, y1, x2, y2, p, distance;
        List<Double>numbers = new ArrayList<>();

        while(scanner.hasNextDouble()){
            numbers.add(scanner.nextDouble());
        }

            for (int i = 0; i < numbers.size()-1; i+=5) {

                x1 = numbers.get(i);
                y1 = numbers.get(i+1);
                x2 = numbers.get(i+2);
                y2 = numbers.get(i+3);
                p = numbers.get(i+4);


                distance = Math.pow((Math.pow(Math.abs(x1 - x2), p) + Math.pow(Math.abs(y1 - y2), p)), (1 / p));
                NumberFormat formatter = new DecimalFormat("#0.0000000000");
                System.out.println(formatter.format(distance));
            }
        }
}
