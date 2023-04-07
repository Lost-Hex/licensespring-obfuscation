package com.losthex;

import com.losthex.licensespring.MyLicenseManager;

public class App {
    public static void main(String[] args) {
        System.out.println("Starting...");
        MyLicenseManager licenseManagerClass = new MyLicenseManager();

        if (args.length != 5  && args.length!=4) {
            String errorMessage = "Four arguments required: apiKey, sharedKey, licenceKey, productName and optional isStaging(yes/no) variable";
            System.out.println(errorMessage);
            throw new IllegalArgumentException(errorMessage);
        } else {
            String isStaging = args.length == 5 ? args[4] : "no";
            licenseManagerClass.activateAndCheckLicense(args[0], args[1], args[2], args[3], isStaging);
        }
    }
}
