import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Enums = (Enumerations) A special kind of class that represents a fixed set of a constants.
        //         They improve code reusability and are easy to maintain.
        //         More efficient with switches when comparing Strings.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Day of week: ");
        String response = scanner.nextLine().toUpperCase();

        try {
            Tag tag = Tag.valueOf(response);
            switch (tag) {
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is a week day");
                case SATURDAY,
                     SUNDAY -> System.out.println("It is a weekend");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Enter a valid day! ");
        }

        scanner.close();
    }
}
