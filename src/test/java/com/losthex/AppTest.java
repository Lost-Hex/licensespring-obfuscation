package com.losthex;

import com.licensespring.model.exceptions.LicenseSpringException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class AppTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void testInvalidArgumentsLength() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Four arguments required: apiKey, sharedKey, licenceKey, productName and optional isStaging(yes/no) variable");

        String[] invalidArgs = {"arg1", "arg2", "arg3"};
        App.main(invalidArgs);
    }
    @Test
    public void testRandomArguments() {
        expectedException.expect(LicenseSpringException.class);

        String[] randomArgs = {"random1", "random2", "random3", "random4"};
        App.main(randomArgs);
    }
}