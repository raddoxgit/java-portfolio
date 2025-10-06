public abstract class Item {

    private String name;

    private String stat;

    public Item(String name, String stat) {
        this.name = name;
        this.stat = stat;
    }

    public abstract void displayItem();

    //GETTERS
    public String getName() {
        return name;
    }

    public String getStat() {
        return stat;
    }
}
