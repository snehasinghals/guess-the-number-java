import java.util.Scanner;
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		Game g1=new Game();
		g1.takeUserInput();
	    while(!g1.isCorrectNumber()){ //Loop until user does not guess the right number 
		    g1.takeUserInput(); 
	    }
	}
}

class Game{
    int noOfGuesses, number, inputNumber;
    
    Game(){
        Random r=new Random();
        number=r.nextInt(100); //System genearte a random number
        noOfGuesses=0;
    }
    
    void takeUserInput(){
        Scanner sc=new Scanner(System.in); 
        System.out.print("Guess the number: ");
        inputNumber=sc.nextInt(); //Take input from user 
    }
    
    boolean isCorrectNumber(){ //method To check whether the user guess the right number or not
        noOfGuesses++;
        if(inputNumber==number){
            System.out.println("Yes you guessed it right, it was "+number+"\nYou guessed it in "+noOfGuesses+" attempts");
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low..");
        }
        else{
            System.out.println("Too high..");
        }
        return false;
    }
}