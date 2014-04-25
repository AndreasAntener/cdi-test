package test;

import impl.Greeter;
import impl.Printer;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import org.jglue.cdiunit.CdiRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(CdiRunner.class)
public class MockTest {

    @Produces
    @Mock
    Greeter greeterMock;

    @Inject
    Printer printer;

    @Test
    public void testPrinterPassesNameToGreeter() {
        this.printer.printGreeting("Lauzge");
        Mockito.verify(this.greeterMock).greet(Mockito.eq("Lauzge"));
    }


}
