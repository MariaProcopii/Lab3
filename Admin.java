import java.util.ArrayList;

public class Admin extends Human{
    private final int nrOfTables = 3;
    private Player player;
    private Table table;

    public Admin(Player player, Table table){
        this.table= table;
        this.player = player;
    }

    public void provideTable(ArrayList<Player> customersList) {     //ArrayList<Player> customersList, int i

        if ((customersList.size() - 1)  < nrOfTables) {
            System.out.println("Admin: We have free space. Please take a seat at table " + (table.getNumber() + 1));
            customersList.get(table.getNumber()).opinion++;
            reputation++;
        }
        else{
            System.out.println("Admin: Sorry, we don't have space in restaurant.");
            reputation--;
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
            reputation--;
        }
        else {
            System.out.println("Admin: Hope you had a great time. Waiting for your next visit.");
            reputation++;
        }
    }

//    static ArrayList<Player> customersList = new ArrayList<>();

//    public static void main(String[] args){
//
//        Admin admin = new Admin();
//        Player pl1 = new Player();
//        pl1.greeting();
//        admin.greeting();
//        admin.provideTable(customersList, 1);
//        pl1.speak();
//        admin.speak();
//    }
}
