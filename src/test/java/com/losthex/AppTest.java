package com.losthex;

import com.licensespring.model.exceptions.LicenseSpringException;
import org.junit.Test;


public class AppTest {

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidArgumentsLength() {
        String[] invalidArgs = {"arg1", "arg2", "arg3"};
        App.main(invalidArgs);
    }

    @Test(expected = LicenseSpringException.class)
    public void testRandomArguments() {
        String[] randomArgs = {"random1", "random2", "random3", "random4"};
        App.main(randomArgs);
    }

}



}