import java.util.Random;
import java.util.Scanner;

class Game{//Game class
    public int number; // number to be guessed by player
    public int inputNumber; // number entered by player
    public int noOfGuesses = 0; // number of guesses player has made so far

    public int getNoOfGuesses() {//getter for noOfGuesses variable
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) { //setter for noOfGuesses variable
        this.noOfGuesses = noOfGuesses;//this keyword is used to refer to the current object
    }

    Game(){//constructor to initialize number variable with a random number between 0 and 100
        Random rand = new Random(); //creating an object of Random class
        this.number = rand.nextInt(100);//nextInt() method of Random class returns a random number between 0 and 100
    }
    void takeUserInput(){ //method to take input from user
        System.out.println("Guess the number");//print statement
        Scanner sc = new Scanner(System.in);//creating an object of Scanner class
        inputNumber = sc.nextInt();//nextInt() method of Scanner class returns the integer entered by user
    }
    boolean isCorrectNumber(){ //method to check if the number entered by user is correct or not
        noOfGuesses++; //incrementing the noOfGuesses variable by 1
        if (inputNumber==number){ //if the number entered by user is equal to the number to be guessed
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);//print statement
            return true;//returning true
        }
        else if(inputNumber<number){//if the number entered by user is less than the number to be guessed
            System.out.println("Too low...");
        }
        else if(inputNumber>number){//if the number entered by user is greater than the number to be guessed
            System.out.println("Too high...");
        }
        return false;//returning false
    }

}
public class CodeXam {
    public static void main(String[] args) {
        /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */

        Game g = new Game();
        boolean b= false;//boolean variable to check if the number entered by user is correct or not
        while(!b){//while loop to keep on asking user to enter a number until the number entered by user is correct
            g.takeUserInput();//calling takeUserInput() method of Game class
            b = g.isCorrectNumber();//calling isCorrectNumber() method of Game class and storing the returned value in b variable
        }

    }
}