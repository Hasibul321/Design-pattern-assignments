public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(5);

        vendingMachine.selectItem();
        vendingMachine.insertMoney();
        vendingMachine.dispenseItem();

        vendingMachine.selectItem();
        vendingMachine.insertMoney();
        vendingMachine.insertMoney();
        vendingMachine.dispenseItem();
        vendingMachine.dispenseItem();
    }
}