import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetworkTest {

    Network network;
    Desktop desktop;
    Printer printer;
    InternetRadio radio;

    @Before
    public void before() {
        network = new Network("CodeClan", 4);
        desktop = new Desktop("Keith's Desktop", "Apple", "Macbook Pro");
        printer = new Printer();
        radio = new InternetRadio();
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan", network.getName());
    }

    @Test
    public void deviceListStartsEmpty() {
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void canConnectDesktop() {
        network.connect(desktop);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void canConnectPrinter() {  //NEW TEST
        network.connect(printer);
        assertEquals(1, network.deviceCount());
        assertEquals("Added Successfully", network.connect(printer));
    }

    @Test
    public void shouldEmptyDeviceListAfterDisconnectingAll(){
        network.connect(desktop);
        network.connect(printer);
        network.disconnectAll();
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void testHowManyEmptySlotsLeft(){
        network.connect(desktop);
        network.connect(printer);
        network.connect(radio);
        assertEquals(1, network.getFreeSlots());
    }

    @Test
    public void testMaxNumberOfConnections(){
        network.connect(desktop);
        network.connect(desktop);
        network.connect(printer);
        network.connect(printer);
//        network.connect(printer);
        assertEquals(4, network.deviceCount());
        assertEquals("Sorry, Max number reached", network.connect(printer));
    }
}
