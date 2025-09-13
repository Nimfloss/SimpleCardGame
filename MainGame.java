import java.util.Scanner;
import java.lang.Thread;

public class MainGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OutputHandler outputHandler = new OutputHandler();
        Cards cards = new Cards();
        outputHandler.languageOutput();
        String selectedLanguageOption = scanner.nextLine();
	String firstCardSelectionString;
	String secondCardSelectionString;
	int firstCardSelection;
	int secondCardSelection;
        outputHandler.languageSetup(selectedLanguageOption);
        outputHandler.languageUpdate();
        outputHandler.languageOutputSecond();
	cards.createSubsystem();
	cards.loadOutputFlowFull();
	cards.loadOutput();
        while (!cards.isAllCardsRevealed()) {
		outputHandler.selectionOutput(1);
		while (true) {
			firstCardSelectionString = scanner.nextLine();
			try {
				firstCardSelection = Integer.parseInt(firstCardSelectionString);
				if (firstCardSelection<1 || firstCardSelection>16) {
					outputHandler.powtcnOutput();
				}
				else {
					if (!cards.isCardRevealed(firstCardSelection-1)){
						cards.revealCard(firstCardSelection-1);
						break;
					}
					else {
						outputHandler.TCIAROutput();
					}
				}
			}
			catch (Exception e) {
				outputHandler.puownOutput();
			}
		}
		cards.loadOutput();
		System.out.printf(outputHandler.tcyoReturn(),cards.co(firstCardSelection-1));
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
		outputHandler.selectionOutput(2);
		while (true) {
			secondCardSelectionString = scanner.nextLine();
			try {
				secondCardSelection = Integer.parseInt(secondCardSelectionString);
				if (secondCardSelection<1 || secondCardSelection>16) {
					outputHandler.powtcnOutput();
				}
				else {
					if (!cards.isCardRevealed(secondCardSelection-1)){
						cards.revealCard(secondCardSelection-1);
						break;
					}
					else {
						outputHandler.TCIAROutput();
					}
				}
			}
			catch (Exception e) {
				outputHandler.puownOutput();
			}
		}
		cards.loadOutput();
		System.out.printf(outputHandler.tcyoReturn(),cards.co(secondCardSelection-1));
		if (cards.isSame(firstCardSelection-1,secondCardSelection-1)) {
			outputHandler.tiamOutput();
		}
		else {
			outputHandler.tarnmOutput();
			cards.unrevealCard(firstCardSelection-1);
			cards.unrevealCard(secondCardSelection-1);
		}
		try  {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		cards.loadOutput();
        }
	outputHandler.ywOutput();
	scanner.close();
    }
}
