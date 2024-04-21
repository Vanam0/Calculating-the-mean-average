import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        double grade = 0; 
        double sum = 0;
        double average = 0;
        int numberOfGrades = 0;
        Scanner reader = new Scanner(System.in);
    
        System.out.println("Program calculates the average of inputted grades.");
        System.out.println("Finish with a negative integer.");


        do {
            System.out.print("Input a grade (4-10): ");
            grade = reader.nextDouble();
            
            
            if ((grade >= 4) && (grade <= 10)) {
                sum += grade;
                numberOfGrades++;
            }
           
            
            if ((grade > 10) || (grade >= 0 && grade < 4)){
                System.out.println("Invalid grade!");
            }
            
        }
        while (grade >= 0);
         
        if (numberOfGrades == 0) {
            System.out.println("You did not input any grades.");
        } else {
            average = sum / numberOfGrades;
            System.out.println( + numberOfGrades + " grades inputted.");
            System.out.println("Average of the grades: " + average);
        }
    }
}
