import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Enter your name (or type 'exit' to quit):");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                isRunning = false;
            } else {
                System.out.println("Let the game begin!!!");

                System.out.println("Enter the number from 0 to 100");
                String userNumber = scanner.nextLine();
                int parsedUserNumber = Integer.parseInt(userNumber);
                int randomNumber = (int) (Math.random() * 101);
                System.out.println(randomNumber);

                if(parsedUserNumber < randomNumber) {
                    System.out.println("Your number is too small. Please, try again.");
                } else if (parsedUserNumber > randomNumber){
                    System.out.println("Your number is too big. Please, try again.");
                }else{
                    System.out.println("Congratulations, " + name);
                }
            }
        }

        scanner.close();
    }
}
