import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        System.out.println("Let the game begin!!!");

        ArrayList<Integer> userNumbersList = new ArrayList<>();

        while (isRunning) {
            System.out.println("ENTER YOUR NAME (or type 'exit' to quit):");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                isRunning = false;
            } else {
                System.out.println("Enter the number from 0 to 100");
                String userNumber = scanner.nextLine();
                int parsedUserNumber = Integer.parseInt(userNumber);
                int randomNumber = (int) (Math.random() * 101);
                System.out.println(randomNumber);
                userNumbersList.add(parsedUserNumber);

                if (parsedUserNumber < 0 || parsedUserNumber > 100) {
                    System.out.println("Please enter a number between 0 and 100.");
                    continue;
                } else if(parsedUserNumber < randomNumber) {
                    System.out.println("Your number is too small. Please, try again.");
                } else if (parsedUserNumber > randomNumber){
                    System.out.println("Your number is too big. Please, try again.");
                } else {
                    System.out.println("Congratulations, " + name + "!");
                }
            }
        }

        Collections.sort(userNumbersList);
        System.out.println("Your entered numbers: " + userNumbersList);

        scanner.close();
    }
}

// чтоб запустить код, нужно сначала удалить файл класса, заново его скомпилировать и только потом запускается код
