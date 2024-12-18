// Custom exception class for invalid age
class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

// Father class
class Father {
    int age;

    // Constructor for Father's class, throws exception if age is negative
    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative!");
        }
        this.age = age;
        System.out.println("Father's age is set to: " + this.age);
    }
}

// Son class inherits from Father class
class Son extends Father {
    int sonAge;

    // Constructor for Son's class, takes both father's and son's age
    public Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge); // Call Father class constructor for validation

        // Validate if son's age is greater than or equal to father's age
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
            // Test case 1: valid ages
            System.out.println("Test case 1:");
            Father father1 = new Father(40);
            Son son1 = new Son(40, 15);
            System.out.println();

            // Test case 2: negative father's age
            System.out.println("Test case 2:");
            Father father2 = new Father(-10);  // This will throw an exception
            System.out.println();

            // Test case 3: son's age greater than or equal to father's age
            System.out.println("Test case 3:");
            Father father3 = new Father(30);
            Son son3 = new Son(30, 30);  // This should print the error message
            System.out.println();

            // Test case 4: valid son's age
            System.out.println("Test case 4:");
            Father father4 = new Father(50);
            Son son4 = new Son(50, 25);  // This should work fine
        } catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
