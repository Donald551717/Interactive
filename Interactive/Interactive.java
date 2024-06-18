import java.util.Scanner;

public class Interactive{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi there! What is your name? ");
        String name = scanner.nextLine();

        System.out.println("Hey "+ name +", Welcome! Will you be willing to answer a few questions?(Yes/No)");
        String response = scanner.nextLine();

        while(response.equalsIgnoreCase("Yes")){
            System.out.println("Good! So lets start with your phone number:");
            String phone = scanner.nextLine();

            System.out.println("And your email address? ");
            String email = scanner.nextLine();

            System.out.println("Great! So your phone number is "+ phone +" and your email is "+ email +"(Yes/No)");
            String answer = scanner.nextLine();

            while(answer.equalsIgnoreCase("Yes")){
                System.out.println("Great! Now can you tell me how you would rate this conversation?");
                String rate = scanner.nextLine();

                System.out.println("Summary");
                System.out.println("name: " + name);
                System.out.println("phone: " + phone);
                System.out.println("email: " + email);
                System.out.println("rate: " + rate);
                System.out.println("Goodbye!");
            }
        }
        scanner.close();
    }
}
       