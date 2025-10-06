public class Throwable extends Item {

    private String effect;

    public Throwable(String name, String stat, String effect) {
        super(name, stat);
        this.effect = effect;
    }

    public String getEffect() {
        return effect;
    }

    @Override
    public void displayItem() {
        System.out.println("Name: " + getName() + ", Effect: " + getEffect() + ", Stat: " + getStat());
    }
}
