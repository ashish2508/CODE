import java.util.*;
public class PatternQuestions {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        //outer loop
        for(int i=1;i<=rows;i=i+1){
            //inner loop
            for(int j=1;j<=columns;j=j+1){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}

