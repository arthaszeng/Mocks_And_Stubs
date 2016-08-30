package cashregister;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashRegisterTest {
    @org.junit.Test
    public void shouldPrintInformationOfPurchase() throws Exception {
        MockPrinter mock = new MockPrinter();
        CashRegister cashRegister = new CashRegister(mock);

        Item[] items = new Item[1];
        items[0] = new Item("a", 1);
        Purchase purchase = new Purchase(items);

        cashRegister.process(purchase);
        assertEquals(mock.checkString(), purchase.asString());

    }

    @Test
    public void shouldCheckThePurchaseOfItems() throws Exception {
        MockPrinter mock = new MockPrinter();
        CashRegister cashRegister = new CashRegister(mock);

        Item[] items = new Item[1];
        items[0] = new Item("b", 1);
        Purchase mockPurchase = new MockPurchase(items);

        cashRegister.process(mockPurchase);
        assertEquals(mock.checkString(), mockPurchase.asString());

    }
}
