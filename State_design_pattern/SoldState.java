// Define the SoldState
class SoldState implements VendingMachineState {
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Item has already been selected. Please proceed with payment.");
    }

    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Payment already received.");
    }

    public void dispenseItem(VendingMachine vendingMachine) {
        if (vendingMachine.getItemCount() > 0) {
            vendingMachine.releaseItem();
            if (vendingMachine.getItemCount() > 0) {
                vendingMachine.changeState(new HasSelectionState());
            } else {
                vendingMachine.changeState(new NoSelectionState());
            }
        } else {
            System.out.println("Out of items. Please select another item.");
            vendingMachine.changeState(new NoSelectionState());
        }
    }
}