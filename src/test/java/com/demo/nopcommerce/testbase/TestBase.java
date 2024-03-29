package com.demo.nopcommerce.testbase;

import com.demo.nopcommerce.propertyreader.PropertyReader;
import com.demo.nopcommerce.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

    public class TestBase extends Utility {

        String browser = PropertyReader.getInstance().getProperty("browser");

        @BeforeMethod
        public void setUp(){
            selectBrowser(browser);
        }

        @AfterMethod
        public void tearDown(){
            closeBrowser();
        }
    }

