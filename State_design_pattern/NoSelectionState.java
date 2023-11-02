// Define the NoSelectionState
class NoSelectionState implements VendingMachineState {
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Please make a selection first.");
    }

    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("You haven't selected an item.");
    }

    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("No item selected.");
    }
}