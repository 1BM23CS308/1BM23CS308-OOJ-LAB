package CIE;

public class Student1 {
    protected String usn;     
    protected String name;    
    protected int sem;       
       public Student1 (String usn, String name, int sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }

       public String getUsn() {
        return usn;
    }

    public String getName() {
        return name;
    }

    public int getSem() {
        return sem;
    }
}
