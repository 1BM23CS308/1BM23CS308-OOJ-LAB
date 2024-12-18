import CIE.Internals;  
import SEE.External;     
public class Main {
    public static void main(String[] args) {
       
        int[] internalMarks1 = {18, 20, 16, 19, 20};
        int[] internalMarks2 = {15, 18, 17, 19, 16};

       
        int[] externalMarks1 = {40, 45, 50, 42, 38};
        int[] externalMarks2 = {35, 40, 44, 41, 38};

        External student1 = new External("1BM18CS001", "John Doe", 5, internalMarks1, externalMarks1);
        External student2 = new External("1BM18CS002", "Jane Smith", 5, internalMarks2, externalMarks2);

       
        System.out.println("Final Marks of " + student1.getName() + " (" + student1.getUsn() + "):");
        System.out.println("Total Internal Marks: " + student1.getTotalInternalMarks());
        System.out.println("Total External Marks: " + student1.getTotalExternalMarks());
        System.out.println("Final Marks: " + student1.getFinalMarks());

        System.out.println();

        
        System.out.println("Final Marks of " + student2.getName() + " (" + student2.getUsn() + "):");
        System.out.println("Total Internal Marks: " + student2.getTotalInternalMarks());
        System.out.println("Total External Marks: " + student2.getTotalExternalMarks());
        System.out.println("Final Marks: " + student2.getFinalMarks());
    }
}
