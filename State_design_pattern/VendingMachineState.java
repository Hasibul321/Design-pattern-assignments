// Define the VendingMachineState interface
interface VendingMachineState {
    void selectItem(VendingMachine vendingMachine);
    void insertMoney(VendingMachine vendingMachine);
    void dispenseItem(VendingMachine vendingMachine);
}