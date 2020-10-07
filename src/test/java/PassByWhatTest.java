import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassByWhatTest {

    MobilePhone iphone;
    MobilePhone android;

    @Before
    public void changeFieldThroughReference() {

        // create two objects of the class MobilePhone
        iphone = new MobilePhone(
                "Apple",
                false,
                1,
                "ATT"
        );

        android = new MobilePhone(
                "Samsung",
                true,
                2,
                "Tmobile"
        );
        System.out.println(iphone);
        System.out.println(android);
    }

    @Test
    public void resetNetwork() {
        String newNetwork = "Verizon";
        android.setNetwork(newNetwork);

        // will this pass?
        assertEquals("Verizon", android.network);
    }

    @Test
    public void resetStringUsingString() {
        resetString(iphone.network, "Verizon");

        // will this pass?
        assertEquals("Verizon", iphone.network);
    }

    private void resetString(String str1, String str2) {
        str1 = str2;
    }

    @Test
    public void resetStringUsingReference() {
        resetStringUsingReference(iphone, "Verizon");

        // will this pass?
        assertEquals("Verizon", iphone.network);
    }

    private void resetStringUsingReference(MobilePhone phone, String network) {
        phone.network = network;
    }
}
