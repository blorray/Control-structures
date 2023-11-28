public class ControlStructures {

    public static void main(String[] args) {
        // Conditional Statements
        int age = 25;

        if (age >= 20 ) {
            System.out.println("You are eligible to vie for a seat.");
        } else {
            System.out.println("You are not eligible to vie yet.");
        }

        // Loops
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        for (int count = 1; count <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // Switch Statement
        String grade = "A";

        switch (grade) {
            case "A":
                System.out.println("Excellent!");
                break;
            case "B":
                System.out.println("Good!");
                break;
            case "C":
                System.out.println("Average!");
                break;
            default:
                System.out.println("Invalid grade!");
        }
    }
}