import java.util.ArrayList;
import java.util.Random;

public class Cards{
	Random random = new Random();
	String outputFlowFull;
	String outputNumbLine1 = "!  1    2    3    4   !\n";
	String outputFlowLine1 = "! [%s] [%s] [%s] [%s] !\n";
	String outputNumbLine2 = "!  5    6    7    8   !\n";
	String outputFlowLine2 = "! [%s] [%s] [%s] [%s] !\n";
	String outputNumbLine3 = "!  9    10   11   12  !\n";
	String outputFlowLine3 = "! [%s] [%s] [%s] [%s] !\n";
	String outputNumbLine4 = "!  13   14   15   16  !\n";
	String outputFlowLine4 = "! [%s] [%s] [%s] [%s] !\n";
	String nunrevealedCard = "??";

	ArrayList<String> activeCardFlowList = new ArrayList<String>();
	ArrayList<Boolean> revealedCards = new ArrayList<Boolean>();
	ArrayList<String> cardsList = new ArrayList<String>();
	ArrayList<Integer> nonOccupiedCardLocations = new ArrayList<Integer>();
	ArrayList<String> charsList = new ArrayList<String>();
	ArrayList<String> outputChart = new ArrayList<String>();

	public void loadOutputFlowFull() {
		outputFlowFull = outputNumbLine1 + outputFlowLine1 +
			outputNumbLine2 + outputFlowLine2 +
			outputNumbLine3 + outputFlowLine3 +
			outputNumbLine4 + outputFlowLine4;
	}

	public void createSubsystem() {
		charsList.add("A ");
		charsList.add("A ");
		charsList.add("B ");
		charsList.add("B ");
		charsList.add("C ");
		charsList.add("C ");
		charsList.add("D ");
		charsList.add("D ");
		charsList.add("E ");
		charsList.add("E ");
		charsList.add("F ");
		charsList.add("F ");
		charsList.add("G ");
		charsList.add("G ");
		charsList.add("H ");
		charsList.add("H ");

		// revealedCards constructor --> actually using new Card class would be more usefull.
		for (int i=1;i<17;i++) {
			revealedCards.add(false);
		}
		for (int i=1;i<17;i++) {
			cardsList.add(null);
		}
		for (int i=0;i<16;i++) {
			activeCardFlowList.add(null);
		}

		randomizeCards();

	}
	
	public void printCardsAsRandomized() {
		for (int i=0;i<16;i++) {
			System.out.printf("Index = %d\nChar = %s\n----\n",i,cardsList.get(i));
		}
	}
	public boolean isAllCardsRevealed() {
		boolean isAllCardsRevealedTemp = true;
		for (int i = 0;i<16;i++) {
			if (!isCardRevealed(i)){
				isAllCardsRevealedTemp = false;
			}
		}
		return isAllCardsRevealedTemp;
	}

	public boolean isCardRevealed(int cardNumber) {
		return (revealedCards.get(cardNumber));
	}

	public void revealCard(int cardNumber) {
		revealedCards.set(cardNumber,true);
	}

	public void unrevealCard(int cardNumber) {
		revealedCards.set(cardNumber,false);
	}

	public void printRevealedCardsArray() {
		for (int i = 0; i < revealedCards.size();i++) {
			System.out.printf("Index Number = %d\nValue = %b\n",i,revealedCards.get(i));
		}
	}

	public void cardsShow() {
		for (int i=0;i<16;i++) {
			System.out.printf("Index Number = %d\nChar = %s\n----\n",i,cardsList.get(i));
		}
	}
	
	public boolean isThisSlotEmpty(int i) {
		if (cardsList.get(i) == null) {return true;}
		else {return false;}
	}

	public void randomizeCards() {
		for (String element : charsList) {
			while (true) {
				int randomNumber = random.nextInt(0,16);
				if (isThisSlotEmpty(randomNumber)) {
					placeCard(randomNumber,element);
					break;
				}
			}
			
		}
	}

	public void placeCard(int i,String a) {
		cardsList.set(i,a);
	}

	public void updateActiveCardFlow() {
		for (int i = 0;i<16;i++) {
			activeCardFlowList.set(i,null);
		}
		for (int i = 0;i<16;i++){
			if(isCardRevealed(i)) {
				activeCardFlowList.set(i,cardsList.get(i));
			}
			else {
				activeCardFlowList.set(i,nunrevealedCard);
			}
		}
	}

	public void loadOutput() {
		updateActiveCardFlow();
		loadOutputFlowFull();
		System.out.printf(outputFlowFull,co(0),co(1),co(2),co(3),co(4),co(5),co(6),co(7),co(8),
				co(9),co(10),co(11),co(12),co(13),co(14),co(15));
	}
	
	public String co(int i) {
		return activeCardFlowList.get(i);
	}

	public void printActiveCardFlowList() {
		for (String element : activeCardFlowList) {
			System.out.println(element);
		}
	}

	public boolean isSame(int i1,int i2) {
		return (co(i1).equals(co(i2)));
	}
}
