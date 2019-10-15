import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InternetRadioTest {

    private InternetRadio radio;

    @Before
    public void before(){
        radio = new InternetRadio();
    }

    @Test
    public void testInternetRadioCanConnect(){
        assertEquals("connecting to: CodeClan", radio.connect("CodeClan"));
    }

    @Test
    public void testCanTune(){
        assertEquals("tuned to Radio1", radio.tune("Radio1"));
    }
}
