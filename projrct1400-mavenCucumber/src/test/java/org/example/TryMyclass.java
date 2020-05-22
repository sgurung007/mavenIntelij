package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class TryMyclass {
    public static void main(String[] args) {
        Random rand=new Random();
        int n=rand.nextInt(100);
        System.out.println(n);
    }
    @Test
    public void testProfileGenerator(){
        ExcelProfileDataGenerator user1=new ExcelProfileDataGenerator();
        Assert.assertNotEquals(null,user1.getFirstName(),"first name is null");
        Assert.assertNotEquals(null,user1.getLastName(),"last name is null");
        Assert.assertNotEquals(null,user1.getUserName(),"password is null");
        Assert.assertNotEquals(null,user1.getPassword(),"password is null");
    }

}
