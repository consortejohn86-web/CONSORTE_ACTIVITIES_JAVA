public class NestedLoginValidator {
    
    public static void main(String[] args) {

        String correctUsername = "student";
        String correctPassword = "java123";

        // Change these values to test the program
        String username = "student";
        String password = "java123";
        boolean accountLocked = false;

        if (username.equals(correctUsername)) {

            if (password.equals(correctPassword)) {

                if (!accountLocked) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Login failed: Account is locked.");
                }

            } else {
                System.out.println("Login failed: Incorrect password.");
            }

        } else {
            System.out.println("Login failed: Incorrect username.");
        }
    }
}
