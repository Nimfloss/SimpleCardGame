public class OutputHandler{
    //Line management
    String firstCard = "";
    String choosenLine = "";
    String secondCard = "";
    String languageOutputSecond = "";
    String selectionOutput = "";
    String TCIAR = "";
    String TIAEO = "";
    String YW = "";
    String TCYO = "";
    String TIAM = "";
    String TARNM = "";
    String PUOWN = "";
    String POWTCN = "";
    String firstCardEN = "first card";
    String secondCardEN = "second card";
    String firstCardTR = "ilk kart";
    String secondCardTR = "ikinci kart";
    String firstCardDE = "erste Karte";
    String secondCardDE = "zweite Karte";
    String selectionOutputEN = "For your %s selection enter number of card:\n";
    String selectionOutputTR = "Açacağınız %s için kart numarasını giriniz:\n";
    String selectionOutputDE = "Geben Sie die Kartennummer für die %s ein, die Sie öffnen möchten:\n";
    String languageOutputSecondEN = "Your language selection is English\n";
    String languageOutputSecondDE = "Ihre Sprachauswahl ist Deutsch.\n";
    String languageOutputSecondTR = "Dil seçiminiz Türkçe.\n";
    String TCIARTR = "Bu kart zaten halihazırda açık!\n";
    String TCIAREN = "This card is already revealed!\n";
    String TCIARDE = "Diese Karte ist bereits aufgedeckt!\n";
    String TIAEOTR = "Bir sorun çıktı! Hata : %d\n";
    String TIAEOEN = "There is an error occurred! Error : %d\n";
    String TIAEODE = "Es ist ein Fehler aufgetreten! Fehler : %d\n";
    String YWEN = "You WON!\n";
    String YWTR = "Kazandınız!\n";
    String YWDE = "Sie haben gewonnen!\n";
    String TCYOEN = "The card you opened : %s\n";
    String TCYOTR = "Açtığınız kart : %s\n";
    String TCYODE = "Die von Ihnen geöffnete Karte : %s\n";
    String TIAMEN = "There is a match!\n";
    String TIAMTR = "Kartlar eşleşiyor!\n";
    String TIAMDE = "Passende Karten!\n";
    String TARNMEN = "They are not matching :c\n";
    String TARNMTR = "Kartlar eşleşmiyor :c\n";
    String TARNMDE = "Die Karten stimmen nicht überein :c\n";
    String PUOWNEN = "Please use only whole numbers!\n";
    String PUOWNTR = "Lütfen sadece tamsayı kullanın!\n";
    String PUOWNDE = "Bitte verwenden Sie nur ganze Zahlen!\n";
    String POWTCNEN = "Please only write the card numbers!\n";
    String POWTCNDE = "Bitte nur die Kartenzahlen verwenden!\n";
    String POWTCNTR = "Lütfen kart numaraları dışında sayı kullanmayın!\n";
    
    //Variables
    String choosenLanguage = "en";


    public void languageOutput() {
        System.out.printf("You can choose your language to play.\n");
        System.out.printf("[1] -> English\n");
        System.out.printf("[2] -> Turkish [Türkçe]\n");
        System.out.printf("[3] -> German [Deutsch]\n");
        System.out.printf("Waiting for your selection:\n");
    }

    public void languageUpdate() {
        if (choosenLanguage.equals("en")) {
            firstCard = firstCardEN;
            secondCard = secondCardEN;
            selectionOutput = selectionOutputEN;
            languageOutputSecond = languageOutputSecondEN;
            TCIAR = TCIAREN;
	    TIAEO = TIAEOEN;
	    YW = YWEN;
	    TCYO = TCYOEN;
	    TIAM = TIAMEN;
	    TARNM = TARNMEN;
	    PUOWN = PUOWNEN;
	    POWTCN = POWTCNEN;
	}
        else if (choosenLanguage.equals("tr")) {
            firstCard = firstCardTR;
            secondCard = secondCardTR;
            selectionOutput = selectionOutputTR;
            languageOutputSecond = languageOutputSecondTR;
            TCIAR = TCIARTR;
	    TIAEO = TIAEOTR;
	    YW = YWTR;
	    TCYO = TCYOTR;
	    TIAM = TIAMTR;
	    TARNM = TARNMTR;
	    PUOWN = PUOWNTR;
	    POWTCN = POWTCNTR;
	}
        else if (choosenLanguage.equals("de")) {
            firstCard = firstCardDE;
            secondCard = secondCardDE;
            selectionOutput = selectionOutputDE;
            languageOutputSecond = languageOutputSecondDE;
	    TCIAR = TCIARDE;
	    TIAEO = TIAEODE;
	    YW = YWDE;
	    TCYO = TCYODE;
	    TIAM = TIAMDE;
	    TARNM = TARNMDE;
	    PUOWN = PUOWNDE;
	    POWTCN = POWTCNDE;
	}
    }

    public void languageOutputSecond() {
        System.out.printf(languageOutputSecond);
    }

    public void puownOutput() {
	System.out.printf(PUOWN);
    }

    public void powtcnOutput() {
	System.out.printf(POWTCN);
    }

    public void tarnmOutput() {
	System.out.printf(TARNM);
    }

    public String TIAEOOutput() {
	return(TIAEO);
    }
    public void tiamOutput() {
	System.out.printf(TIAM);
    }

    public void TCIAROutput() {
	System.out.printf(TCIAR);
    }

    public void selectionOutput(int a) {
        if (a == 1) {
            choosenLine = firstCard;
        }
        else if (a == 2) {
            choosenLine = secondCard;
        }
        else {
            System.out.printf("There is a problem on OutputHandler...\n");
            System.exit(1);
        }
        System.out.printf(selectionOutput,choosenLine);
    }


    public void setLanguage(String input){
        this.choosenLanguage = input;
    }

    public void languageSetup(String a) {
        if (a.equals("1")) {
            setLanguage("en");
        }
        else if (a.equals("2")) {
            setLanguage("tr");
        }
        else if (a.equals("3")) {
            setLanguage("de");
        }
        else {
            setLanguage("en");
        }
    }

    public void ywOutput(){
	System.out.printf(YW);
    }

    public String tcyoReturn(){
	return TCYO;
    }
}
