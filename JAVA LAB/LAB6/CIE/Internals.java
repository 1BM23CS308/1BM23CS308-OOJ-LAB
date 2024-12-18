package CIE;

public class Internals extends Student {
    private int[] internalMarks = new int[5];  
       public Internals(String usn, String name, int sem, int[] internalMarks) {
        super(usn, name, sem);  
        this.internalMarks = internalMarks;
    }

  
    public int[] getInternalMarks() {
        return internalMarks;
    }

       public int getTotalInternalMarks() {
        int total = 0;
        for (int mark : internalMarks) {
            total += mark;
        }
        return total;
    }
}
