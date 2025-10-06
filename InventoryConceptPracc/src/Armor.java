public class Armor extends Item {

    public Armor(String name, String stat) {
        super(name, stat);
    }

    @Override
    public void displayItem() {
        System.out.println("Name: " + getName() + ", Stat: " + getStat());
    }
}
