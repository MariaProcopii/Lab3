abstract class SuperClass {
    private static int playerNr = 0;
    private static int servicedPlayers = 0;
    private static int deckNr = 0;
    private static int cardNr = 0;
    private static int mealNr = 0;
    private static int menuNr = 0;
    private static int reputation = 0;


    public static void setPlayerNr() {
        playerNr++;
    }

    public static void setServicedPlayers() {
        servicedPlayers++;
    }

    public static void setDeckNr() {
        deckNr++;
    }

    public static void setCardNr() {
        cardNr++;
    }

    public static void setMealNr() {
        mealNr++;
    }

    public static void setMenuNr() {
        menuNr++;
    }

    public static void setReputation(int reputation) {
        SuperClass.reputation += reputation;
    }

    public void printStatistic(){
        System.out.println("\n========================");
        System.out.print("Card changed: " + cardNr + "\n" +
                         "Deck changed: " + deckNr + "\n" +
                         "Menu changed: " + menuNr + "\n" +
                         "Meal changed: " + mealNr + "\n" +
                         "Players arrived: " + playerNr + "\n" +
                         "Players served: " + servicedPlayers + "\n" +
                         "Reputation: " + reputation + "\n");
    }
}
