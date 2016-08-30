package cashregister;

class CashRegister {

    Printer mock;

    public CashRegister(Printer mock) {
        this.mock=mock;
    }

    public void process(Purchase purchase) {
        mock.print(purchase.asString());
    }
}
