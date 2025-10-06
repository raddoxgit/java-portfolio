public class Weapon extends Item {

    private String type;
    private int mag;

    public Weapon(String name, String stat, String type, int mag) {
        super(name, stat);
        this.type = type;
        this.mag = mag;
    }

    //GETTERS
    public String getType() {
        return type;
    }
    public int getMag() { return mag; }

    @Override
    public void displayItem() {
        System.out.println("Name: " + getName() + ", Stat: " + getStat() + ", Type: " + getType() + ", Magazine: " + getMag());
    }
}
