package com.losthex;

import com.losthex.licensespring.MyLicenseManager;

public class App {
    public static void main(String[] args) {
        System.out.println("Starting...");
        if (args.length != 5) {
            System.out.println("Five arguments required: apiKey, sharedKey, licenceKey, productName and isStaging(yes/no) variable");
        } else {
            MyLicenseManager liscenceManagerClass = new MyLicenseManager();
            liscenceManagerClass.activateAndCheckLicense(args[0], args[1], args[2], args[3], args[4]);
        }
    }
}
