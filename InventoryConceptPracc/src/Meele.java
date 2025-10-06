public class Meele extends Item {

    private int reach;

    public Meele(String name, String stat, int reach) {
        super(name, stat);
        this.reach = reach;
    }

    //GETTERS
    public int getReach() {
        return reach;
    }

    @Override
    public void displayItem() {
        System.out.println("Name: " + getName() + ", Stat: " + getStat() + ", Reach: " + getReach() + "m");
    }
}
