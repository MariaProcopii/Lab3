import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        int nrOfPlayers = 1;
        ArrayList<Player> customersList = new ArrayList<>();
        for(int i = 0; i < nrOfPlayers; i++){
            customersList.add(new Player());
        }

        for(int i = 0; i < customersList.size(); i++){
            Player player = customersList.get(i);
            Table table = new Table(i, player);
            Admin admin = new Admin(player, table);
            Menu menu = new Menu(player);
            Meal meal = new Meal(player, menu);
            Waiter waiter = new Waiter(menu, meal, player);
            Cook cook = new Cook(meal, waiter, player, table);
            Cleaner cleaner = new Cleaner(player, table);
            Deck deck = new Deck();
            Barman barman = new Barman(player, deck);

            player.greeting();
            admin.greeting();
            admin.provideTable(customersList);
            table.qualityCheck();
            menu.qualityCheck();
            waiter.greeting();
            waiter.takeOrder();
            cook.qualityCheck();
            meal.qualityCheck();
            cook.cooking();
            cleaner.cleanTable();
            barman.greeting();
            waiter.bringBill();
            player.goodBye();
            admin.goodBye();
        }
    }
}
