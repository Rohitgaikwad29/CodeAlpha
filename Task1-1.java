
// Student Grade Tracker

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Arrays to store student names and grades

        String[] studentNames = new String[numStudents];
        int[] grades = new int[numStudents];

        // Input student names and grades
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student " + (i + 1) + " name: ");
            studentNames[i] = sc.next();
            System.out.print("Enter " + studentNames[i] + "'s grade: ");
            grades[i] = sc.nextInt();
        }

        // Calculate average grade
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = (double) sum / numStudents;

        // Find highest and lowest grade
        int highestGrade = grades[0];
        int lowestGrade = grades[0];
        for (int i = 1; i < numStudents; i++) {
            if (grades[i] > highestGrade) {
                highestGrade = grades[i];
            }
            if (grades[i] < lowestGrade) {
                lowestGrade = grades[i];
            }
        }

        // Output
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);

        sc.close();
    }
}