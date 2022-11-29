import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int[] dataPoints = new int[100];
        int val = rnd.nextInt(100) + 1;
        int index = rnd.nextInt(dataPoints.length);
        int sum = 0;
        double average = 0;
        int interestValue;
        int interestCount = 0;
        boolean pointFound = false;

        for (int e = 0; e < dataPoints.length; e++)
        {
            dataPoints[e] = rnd.nextInt(100) + 1;
        }
        for (int e : dataPoints)
        {
            System.out.printf("%3d |", e);
        }
        for (int e :dataPoints)
        {
            sum += e;
        }
        average = (double) sum / dataPoints.length;

        System.out.println("\nThe sum of data set is " +sum+ " \nThe average of the data set is " +average);

        interestValue = SafeInput.getRangedInt(in, "Enter the integer you are interested in for the data set: ", 1,100);

        for(int e = 0; e < dataPoints.length; e++)
        {
            if (dataPoints[e] == interestValue)
            {
                interestCount++;
                pointFound = true;
            }
        }
        System.out.println("The interested value appears " +interestCount+ " time(s) in the data set");

        for(int e = 0; e < dataPoints.length; e++)
        {
            if (dataPoints[e] == interestValue)
            {
                e = e + 1;
                System.out.println("\nThe interested value is positioned " +e+ " in the data set");
                pointFound = true;
                break;
            }
        }
        int max = dataPoints[0];
        int min = dataPoints[99];
        for(int e:dataPoints)
        {
            if(e > max)
            {
                max = e;
            }
            if(e < min)
            {
                min = e;
            }
        }
        System.out.printf("\nThe min max is %4d %4d", min, max);
        System.out.println("\nThe average of the data-points is " +getAverage(dataPoints));
    }
    public static double getAverage(int values[])
    {
        int sum = 0;
        double average = 0;
        for(int i : values)
        {
            sum += i;
        }
        average = (double) sum / values.length;
        return average;
    }
}