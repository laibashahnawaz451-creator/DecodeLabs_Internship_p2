import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Subjects = ");
        int sub = sc.nextInt();
        sc.nextLine(); 

        int totalMarks = 0;

        for (int i = 1; i <= sub; i++) {
            System.out.print("Enter Subject name = ");
            String subName = sc.nextLine();

            System.out.print("Enter marks obtained in " + subName + " = ");
            int marks = sc.nextInt();
            sc.nextLine(); 

            totalMarks += marks;

        }

        
        double average = (double) totalMarks / sub;
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average percentage = " + average+"%");

        
        if (average >= 90) {
            System.out.println("Overall Grade: A");
        } else if (average >= 80) {
            System.out.println("Overall Grade: B");
        } else if (average >= 70) {
            System.out.println("Overall Grade: C");
        } else if (average >= 60) {
            System.out.println("Overall Grade: D");
        } else {
            System.out.println("Overall Grade: Fail");
        }
    }
}


