// Define the HasSelectionState
class HasSelectionState implements VendingMachineState {
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Item already selected.");
    }

    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Money inserted. Please proceed.");
        vendingMachine.changeState(new SoldState());
    }

    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Payment required before dispensing.");
    }
}
