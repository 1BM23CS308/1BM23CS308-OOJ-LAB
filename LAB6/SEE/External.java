package SEE;

import CIE.Internals;  

public class External extends Internals {
    private int[] externalMarks = new int[5];  
     public External(String usn, String name, int sem, int[] internalMarks, int[] externalMarks) {
        super(usn, name, sem, internalMarks);  
        this.externalMarks = externalMarks;
    }


    public int[] getExternalMarks() {
        return externalMarks;
    }


    public int getTotalExternalMarks() {
        int total = 0;
        for (int mark : externalMarks) {
            total += mark;
        }
        return total;
    }


    public int getFinalMarks() {
        return getTotalInternalMarks() + getTotalExternalMarks();
    }
}
