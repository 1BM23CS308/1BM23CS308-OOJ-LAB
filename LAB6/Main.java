import CIE.Internals;
import SEE.External;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter USN for student 1: ");
        String usn1 = scanner.nextLine();
        System.out.print("Enter name for student 1: ");
        String name1 = scanner.nextLine();
        System.out.println("Enter 5 internal marks for student 1:");
        int[] internalMarks1 = new int[5];
        for (int i = 0; i < 5; i++) {
            internalMarks1[i] = scanner.nextInt();
        }
        System.out.println("Enter 5 external marks for student 1:");
        int[] externalMarks1 = new int[5];
        for (int i = 0; i < 5; i++) {
            externalMarks1[i] = scanner.nextInt();
        }
        
        
        scanner.nextLine();
        System.out.print("Enter USN for student 2: ");
        String usn2 = scanner.nextLine();
        System.out.print("Enter name for student 2: ");
        String name2 = scanner.nextLine();
        System.out.println("Enter 5 internal marks for student 2:");
        int[] internalMarks2 = new int[5];
        for (int i = 0; i < 5; i++) {
            internalMarks2[i] = scanner.nextInt();
        }
        System.out.println("Enter 5 external marks for student 2:");
        int[] externalMarks2 = new int[5];
        for (int i = 0; i < 5; i++) {
            externalMarks2[i] = scanner.nextInt();
        }

        
        External student1 = new External(usn1, name1, 5, internalMarks1, externalMarks1);
        External student2 = new External(usn2, name2, 5, internalMarks2, externalMarks2);

        
        System.out.println("\nFinal Marks of " + student1.getName() + " (" + student1.getUsn() + "):");
        System.out.println("Total Internal Marks: " + student1.getTotalInternalMarks());
        System.out.println("Total External Marks: " + student1.getTotalExternalMarks());
        System.out.println("Final Marks: " + student1.getFinalMarks());

        
        System.out.println("\nFinal Marks of " + student2.getName() + " (" + student2.getUsn() + "):");
        System.out.println("Total Internal Marks: " + student2.getTotalInternalMarks());
        System.out.println("Total External Marks: " + student2.getTotalExternalMarks());
        System.out.println("Final Marks: " + student2.getFinalMarks());
        
        scanner.close();  
    }
}
