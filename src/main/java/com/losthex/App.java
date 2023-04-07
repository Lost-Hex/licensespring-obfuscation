package com.losthex;

import com.losthex.licensespring.MyLicenseManager;

public class App {
    public static void main(String[] args) {
        System.out.println("Starting...");
        MyLicenseManager licenseManagerClass = new MyLicenseManager();

        if (args.length != 5  && args.length!=4) {
            System.out.println("Four arguments required: apiKey, sharedKey, licenceKey, productName and optional isStaging(yes/no) variable");
        } else if (args.length==5){
            licenseManagerClass.activateAndCheckLicense(args[0], args[1], args[2], args[3], args[4]);
        } else {
            licenseManagerClass.activateAndCheckLicense(args[0], args[1], args[2], args[3], "no");
        }
    }
}
