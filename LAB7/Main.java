class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}


class Father {
    int age;


    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative!");
        }
        this.age = age;
        System.out.println("Father's age is set to: " + this.age);
    }
}


class Son extends Father {
    int sonAge;


    public Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge); // Call Father class constructor for validation


        if (sonAge >= fatherAge) {
            System.out.println("Error: Son's age cannot be greater than or equal to Father's age!");
        } else {
            this.sonAge = sonAge;
            System.out.println("Son's age is set to: " + this.sonAge);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try {
         
            System.out.println("Test case 1:");
            Father father1 = new Father(40);
            Son son1 = new Son(40, 15);
            System.out.println();


            System.out.println("Test case 2:");
            Father father2 = new Father(-10);  
            System.out.println();


            System.out.println("Test case 3:");
            Father father3 = new Father(30);
            Son son3 = new Son(30, 30);  
            System.out.println();


            System.out.println("Test case 4:");
            Father father4 = new Father(50);
            Son son4 = new Son(50, 25);  
        } catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
