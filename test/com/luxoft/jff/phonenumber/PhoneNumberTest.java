package com.luxoft.jff.phonenumber;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by udav on 12.06.16.
 */
public class PhoneNumberTest {

    @Test
    public void phoneNumberTest() {
        final Map<PhoneNumber, String> phones =  new HashMap<>();
        phones.put(new PhoneNumber(111, 777, 6523), "Jones");

        Assert.assertNotNull(phones.get(new PhoneNumber(111, 777, 6523)));
    }
}
