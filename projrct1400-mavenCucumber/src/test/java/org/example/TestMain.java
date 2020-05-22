package org.example;

import runners.MyRunner;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.*;

public class TestMain extends MyRunner {
    public static void main(String[] args) throws InterruptedException {
        ExcelProfileDataGenerator user1=new ExcelProfileDataGenerator();

        MyRunner runner = new MyRunner();
        runner.beforeTest();
        //driver.get("https://www.google.com/gmail/about/#");
        driver.get("https://accounts.google.com/signup");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        //driver.findElement(new ByXPath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[3]/a")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        driver.findElement(new ByName("firstName")).sendKeys(user1.getFirstName());
        driver.findElement(new ByName("lastName")).sendKeys(user1.getLastName());
        driver.findElement(new ByName("Username")).sendKeys(user1.getUserName());
        driver.findElement(new ByName("Passwd")).sendKeys(user1.getPassword());
        driver.findElement(new ByName("ConfirmPasswd")).sendKeys(user1.getPassword());
        driver.findElement(new ByXPath("//*[@id=\"accountDetailsNext\"]/span/span")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(new ByClassName("whsOnd zHQkBf")).sendKeys("4053321836");
        driver.findElement(new ByXPath("//span[contains(text(),'Next')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Scanner myObj=new Scanner(System.in);
        System.out.println("Verification code from 405 332 1836 : ");
        long verificationCode=myObj.nextLong();
        Thread.sleep(3000);
        MyRunner.closeBrower();
    }

}
