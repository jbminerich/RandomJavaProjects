import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String ready = scan.nextLine();
        
        if (ready.equals("no")) {
        	System.out.println("Exiting...");
        	System.exit(0);
        } else if (ready.equals("yes")) {
        	System.out.println("Great!");
        	System.out.println("rock, paper, scissors, shoot!");
        	String userInput = scan.nextLine();
        	String computerInput = computerChoice();
        	printResult(userInput, computerInput, result(userInput, computerInput));
        	
        } else {
        	System.out.println("Exiting...");
        	System.exit(0);
        }
              

        scan.close();
    }


    
    public static String computerChoice() {
    	double randomPick = Math.random() * 3;
    	int pick = (int)randomPick;
    	switch (pick) {
	    	case 0: return "rock";
	    	case 1: return "paper";
	    	case 2: return "scissors";
	    	default: return "";
    	}
    	
    }

    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        
        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
        	result = "You win";
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
        	result = "You win";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
        	result = "You win";
        } else if (yourChoice.equals(computerChoice)){
        	result = "It's a tie";
        } else {
        	result = "You lose";
        }

        return result;
      }

    public static void printResult(String yourChoice, String computerChoice, String result) {
    	System.out.println("You chose: " + yourChoice);
    	System.out.println("The computer chose: " + computerChoice);
    	System.out.println(result);
    }
}
