import java.util.ArrayList;

public class Inventory {

    public ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(String name, String stat, String type, int mag) {
        items.add(new Weapon(name, stat, type, mag));
    }

    public void addItem(String name, String stat, int reach) {
        items.add(new Meele(name, stat, reach));
    }

    public void addItem(String name, String effect, String stat) {
        items.add(new Throwable(name, effect, stat));
    }

    public void addItem(String name, String stat) {
        items.add(new Armor(name, stat));
    }

    public void displayInfo() {
        for (Item item : items) {
            item.displayItem();
        }
    }
}