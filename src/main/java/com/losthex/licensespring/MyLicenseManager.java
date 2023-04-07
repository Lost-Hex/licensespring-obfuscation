package com.losthex.licensespring;

import com.licensespring.License;
import com.licensespring.LicenseSpringConfiguration;
import com.licensespring.model.ActivationLicense;
import com.licensespring.model.exceptions.LicenseSpringException;



public class MyLicenseManager {
    public void activateAndCheckLicense(String apiKey, String sharedKey, String licenceKey,
                                        String productName, String staging){
        String serviceUrl = null;
        if (staging.equalsIgnoreCase("yes")) {
            serviceUrl = "https://api-staging.licensespring.com/";
        }

        LicenseSpringConfiguration configuration = LicenseSpringConfiguration.builder()
                .serviceURL(serviceUrl)
                .apiKey(apiKey)
                .productCode(productName)
                .sharedKey(sharedKey)
                .build();

        com.licensespring.LicenseManager licenseManager = com.licensespring.LicenseManager.getInstance();

        try {
            if (!licenseManager.isInitialized()) {
                licenseManager.initialize(configuration);
            }

        } catch (LicenseSpringException e) {
            System.out.println("Error" + e);
        }

        License license = licenseManager.activateLicense(ActivationLicense.fromKey(licenceKey));
        System.out.println(license.toString());

        License checkedLicense = licenseManager.checkLicense(license);
        System.out.println(checkedLicense);

        boolean b = licenseManager.deactivateLicense(license.getIdentity());
        System.out.println(b);

    }

}
