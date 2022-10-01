import java.util.Random;

abstract class Entities extends SuperClass {

    public Random random = new Random();
    public int qualityIndex;

    public void qualityCheck() {
        if (qualityIndex == 1) {
            reputation--;
            System.out.println("It looks so bad... Gross.");
        }
        else if (qualityIndex == 2) {
            reputation++;
            System.out.println("It looks quite nice.\n");

        }
        else {
            reputation +=2;
            System.out.println("It loos so perfect !\n");
        }
    }

    public void change(String string){
        System.out.println("Maybe I should change it ?");
        boolean answer = random.nextBoolean();
        if(answer){
            if(qualityIndex == 1){
                System.out.println("Sorry, can you change it ?");
                switch (string) {
                    case "Card" -> cardNr++;
                    case "Deck" -> deckNr++;
                    case "Meal" -> mealNr++;
                    case "Menu" -> menuNr++;
                }
            }
        }
        else{
            System.out.println("No, I'll keep it.");
        }
        System.out.println("\n");
    }
}
