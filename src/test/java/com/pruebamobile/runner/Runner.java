
package com.pruebamobile.runner;

import com.igs.managers.AppiumServerManager;
import com.igs.managers.MobileDriverManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


@CucumberOptions(features = { "src/test/resources/features" },tags = "@reservaCompleta" ,glue = { "com.pruebamobile.stepdef" })
//@CucumberOptions(features = { "src/test/resources/features" },tags = "@busqueda" ,glue = { "com.pruebamobile.stepdef" })
//@CucumberOptions(features = { "src/test/resources/features" },tags = "@reserva" ,glue = { "com.pruebamobile.stepdef" })
//@CucumberOptions(features = { "src/test/resources/features" },tags = "@reservaUnHappyPaths" ,glue = { "com.pruebamobile.stepdef" })



public class Runner {
    
    @AfterClass
    public static void quit() {
        MobileDriverManager mobileDriverManager = new MobileDriverManager();
        if (mobileDriverManager.getDriver() != null) {
            mobileDriverManager.getDriver().quit();
            mobileDriverManager.setDriver(null);
        }

      AppiumServerManager serverManager = new AppiumServerManager();
        if (serverManager.getServer() != null) {
            serverManager.getServer().stop();
        }

    }
}