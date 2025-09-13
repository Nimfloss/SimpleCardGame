import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cards cards = new Cards();

		while (true) {
			System.out.println("This is a test terminal program");
			System.out.println("Cards class is already constructed.");
			System.out.println("! You should first create subsystem !");
			System.out.println("1 - createSubsystem()");
			System.out.println("2 - printCardsAsRandomized()");
			System.out.println("3 - printRevealedCardsArray()");
			System.out.println("4 - isCardRevealed(int i)");
			System.out.println("5 - revealCard(int i)");
			System.out.println("6 - unrevealCard(int i)");
			System.out.println("7 - cardsShow()");
			System.out.println("8 - loadOutput()");
			System.out.println("9 - co(int i)");
			System.out.println("10 - isSame(int i1,int i2)");
			System.out.println("0 - Exit test terminal");
			
			
			int selectionNumber = scanner.nextInt();
			if (selectionNumber == 1 ){
				cards.createSubsystem();
			}
			else if (selectionNumber == 2) {
				cards.printCardsAsRandomized();
			}
			else if (selectionNumber == 3) {
				cards.printRevealedCardsArray();
			}
			else if (selectionNumber == 4) {
				int selectedCard = scanner.nextInt();
				System.out.println(cards.isCardRevealed(selectedCard));
			}
			else if (selectionNumber == 5) {
				int selectedCard = scanner.nextInt();
				cards.revealCard(selectedCard);
			}
			else if (selectionNumber == 6) {
				int selectedCard = scanner.nextInt();
				cards.unrevealCard(selectedCard);
			}
			else if (selectionNumber == 7) {
				cards.cardsShow();
			}
			else if (selectionNumber == 8) {
				cards.loadOutput();
			}
			else if (selectionNumber == 9) {
				int selectedCard = scanner.nextInt();
				System.out.println(cards.co(selectedCard));
			}
			else if (selectionNumber == 10) {
				int i1 = scanner.nextInt();
				int i2 = scanner.nextInt();
				System.out.println(cards.isSame(i1,i2));
			}
			else if (selectionNumber == 0) {
				break;
			}
		}
		scanner.close();
	}
}
