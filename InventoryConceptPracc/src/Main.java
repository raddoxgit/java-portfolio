
public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addItem("Kar98k", "95 physical dmg", "bolt-action rifle", 5);
        inventory.addItem("Knife", "120 physical dmg", 1);
        inventory.addItem("Flash Granade", "flashes enemies", "5 physical dmg");
        inventory.addItem("Kevlar armor", "-14% physical dmg");

        inventory.displayInfo();
    }
}