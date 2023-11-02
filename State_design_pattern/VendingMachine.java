// Defining the VendingMachine class that uses the state design pattern
class VendingMachine {
    private VendingMachineState currentState;
    private int itemCount;

    public VendingMachine(int itemCount) {
        currentState = new NoSelectionState();
        this.itemCount = itemCount;
    }

    public void selectItem() {
        currentState.selectItem(this);
    }

    public void insertMoney() {
        currentState.insertMoney(this);
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

    public void changeState(VendingMachineState newState) {
        this.currentState = newState;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void releaseItem() {
        System.out.println("Item dispensed. Enjoy your snack!");
        itemCount--;
    }
}
