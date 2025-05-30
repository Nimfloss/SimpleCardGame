package CGGABuilds.CGGA;
import java.util.Scanner;
import java.lang.Thread;
import java.util.InputMismatchException;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Cards trialCardDeck = new Cards();
        trialCardDeck.startDeck();
        int firstLine;
        int firstCollumn;
        int secondLine;
        int secondCollumn;

        // I got it too late but i should use input handler at least on another project.
        
        while (true){
            if (trialCardDeck.isAllRevealed() == true) {
                System.out.println("YOU WON!");
                input.close();
                break;
}
            trialCardDeck.updateOutput();
            while (true) {
                System.out.println("You should type your selections position.");
                while (true) {
                    System.out.println("Line:");
                    try {
                        firstLine = input.nextInt();
                        if (firstLine > 4) {
                            System.out.println("Your selection is bigger than 4.");
}
                        else {
                            firstLine--;
                            break;
}
}
                    catch(InputMismatchException e) {
                        System.out.println("Your input is not integer.");
                        input.nextLine();

}
}

                while (true) {
                    System.out.println("Collumn:");
                    try{
                        firstCollumn = input.nextInt();
                        if (firstCollumn > 4) {
                            System.out.println("Your selection is bigger than 4.");
}
                        else {
                            firstCollumn--;
                            break;
}
}
                    catch(InputMismatchException e) {
                        System.out.println("Your input is not integer.");
                        input.nextLine();
}
}
                if (trialCardDeck.isRevealed(firstLine,firstCollumn) == true) {
                    System.out.println("This selection is already revealed!!!");
}
                else {
                    trialCardDeck.reveal(firstLine,firstCollumn);
                    break;
}
}
            trialCardDeck.updateOutput();

            System.out.println("You gonna select your second card to reveal!");

            while (true) {
                System.out.println("You should type your selections position.");

                while (true) {
                    System.out.println("Line:");
                    try {
                        secondLine = input.nextInt();
                        if (secondLine > 4) {
                            System.out.println("Your selection is bigger than 4.");
}
                        else {
                            secondLine--;
                            break;
}
}
                    catch(InputMismatchException e) {
                        System.out.println("Your input is not integer.");
                        input.nextLine();

}
}

                while (true) {
                    System.out.println("Collumn:");
                    try{
                        secondCollumn = input.nextInt();
                        if (secondCollumn > 4) {
                            System.out.println("Your selection is bigger than 4.");
}
                        else {
                            secondCollumn--;
                            break;
}
}
                    catch(InputMismatchException e) {
                        System.out.println("Your input is not integer.");
                        input.nextLine();
}
}
                if (trialCardDeck.isRevealed(secondLine,secondCollumn) == true) {
                    System.out.println("This selection is already revealed!!!");
}
                else {
                    trialCardDeck.reveal(secondLine,secondCollumn);
                    break;
}
}
           if (trialCardDeck.isMatching(firstLine,firstCollumn,secondLine,secondCollumn)) {
                System.out.println("They are matching!");
                trialCardDeck.updateOutput();
                try {
                    Thread.sleep(2000);
}
                catch(InterruptedException e) {
                    e.printStackTrace();
}
}
            else {
                System.out.println("They are not matching :c");
                trialCardDeck.updateOutput();
                try {
                    Thread.sleep(2000);
}
                catch(InterruptedException e) {
                    e.printStackTrace();
}
                trialCardDeck.unreveal(firstLine,firstCollumn);
                trialCardDeck.unreveal(secondLine,secondCollumn);
}
}
}
}
