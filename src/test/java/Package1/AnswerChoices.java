package Package1;

import java.util.Scanner;

public class AnswerChoices {

	public static void main(String[] args) {
		
		CheckChoice();

	}

	public static void CheckChoice() {
		
		String choice;
		String con;	
		Scanner sc = new Scanner(System.in);
        System.out.println("What is the command keyword to exit a loop in Java?");
        System.out.println("a.int");
        System.out.println("b.continue");
        System.out.println("c.break");
        System.out.println("d.exit");
        
        do{
        	System.out.println("Enter your choice");
        	choice=sc.nextLine();
        	
        	if(choice.compareTo("c")==0){
        		
        		System.out.println("Congragulations! Your answer is correct");
        	}
        	else if(choice.compareTo("q")==0 || (choice.compareTo("t")==0)){
        	
        		System.out.println("Exiting.....");
        	     break;
        	}

        	else System.out.println("Incorrect");
        	
        	System.out.println("Again? press y to continue:");
        	con=sc.nextLine();
        	
	
        }while(con.compareTo("y")==0);
        	}

}
