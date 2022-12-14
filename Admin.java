import java.util.ArrayList;

public class Admin extends Human{
    private final int nrOfTables = 10;
    private final Player player;
    private final Table table;
    private final int number;

    public Admin(Player player, Table table, int number){
        this.table= table;
        this.player = player;
        this.number = number;
    }

    public int provideTable(ArrayList<Player> customersList) {     //ArrayList<Player> customersList, int i

        if ((number)  < nrOfTables) {
            System.out.println("Admin: We have free space. Please take a seat at table " + (table.getNumber() + 1));
            customersList.get(table.getNumber()).opinion++;
            setReputation(1);
            setServicedPlayers();
            return 1;
        }
        else{
            System.out.println("Admin: Sorry, we don't have space in restaurant.");
            setReputation(-5);
            return 0;
        }
    }

    public void greeting(){
        System.out.println("Admin: Nice to meet you " + player.name + ". Let's find you a table.");
    }

    public void speak(){
        int phrase = random.nextInt(phrases.length);
        System.out.println("Admin: " + phrases[phrase] + ".\nAdmin: I should stop talking to myself.");
    }

    public void goodBye(){
        if(opinion < 3){
            System.out.println("Admin: " + player.name + "We are so sorry for not providing you " +
                               "a high-level service. Hope, you will give us another chance.");
            setReputation(-1);
        }
        else {
            System.out.println("Admin: Hope you had a great time. Waiting for your next visit.");
            setReputation(1);
        }
    }
}
