import java.util.Arrays;
import java.util.Scanner;

public class GradeStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subject :");
        int noOfGrade =  sc.nextInt();
        double[] arr = new double[noOfGrade];
        for (int i = 0; i < noOfGrade; i++) {
            int num = i+1;
            System.out.println("Enter the Grade of number "+num);
            arr[i] =sc.nextDouble();
        }
        int lengthOfArr = arr.length;
        double total = 0.f;
        for (double v : arr) {
            total = total + v;
        }
        double avg = total/lengthOfArr;
        System.out.println("Average of the total Grade is : "+avg);
    }
}
