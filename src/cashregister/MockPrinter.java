package cashregister;

public class MockPrinter extends Printer{
    public String printMessage;

    @Override
    public void print(String printThis) {
        System.out.println(printThis);
        this.printMessage=printThis;
    }

    public String checkString()
    {
        return printMessage;
    }
}
