package org.example;

import com.github.javafaker.Faker;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ExcelProfileDataGenerator {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;

    public ExcelProfileDataGenerator() {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        System.out.println("firstNme: "+firstName);
        String lastName = faker.name().lastName();
        System.out.println("lastName: "+lastName);
        Random rand=new Random();
        int n=rand.nextInt(100000);
        String email=lastName+n+firstName;
        System.out.println("email: "+ email);
        String password=generateRandomPassword();
        System.out.println("password: "+password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = email;
        this.password = password;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }




    public static void main(String[] args) {

        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        System.out.println("firstNme: "+firstName);
        String lastName = faker.name().lastName();
        System.out.println("lastName: "+lastName);
        Random rand=new Random();
        int n=rand.nextInt(10000);
        String email=lastName+n+firstName;
        System.out.println("email: "+ email);
        String password=generateRandomPassword();
        System.out.println("password: "+password);

//        String streetAddress = faker.address().streetAddress();
//        System.out.println("address: "+streetAddress);

    }

    public static String generateRandomPassword() {

        List rules = Arrays.asList(new CharacterRule(EnglishCharacterData.UpperCase, 1),
                new CharacterRule(EnglishCharacterData.LowerCase, 1), new CharacterRule(EnglishCharacterData.Digit, 1));

        PasswordGenerator generator = new PasswordGenerator();
        String password = generator.generatePassword(8, rules);
        return password;
    }

}
