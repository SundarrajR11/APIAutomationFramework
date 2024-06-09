package com.api.utilities;

import com.api.thirdpartyAPI.FakerUtils;
import com.github.javafaker.Faker;

import java.util.List;

public final class RandomProvider {
    private RandomProvider(){}

    public static int randomId(){
        return FakerUtils.idGenerator(10,1000);
    }
    public static String randomFirstName(){
        return FakerUtils.firstNameGenerator();
    }
    public static String randomLastName(){
        return FakerUtils.lastNameGenerator();
    }
    public static String randomEmail(){
        return FakerUtils.emailGenerator();
    }
    public static boolean randomBoolean(){
        return FakerUtils.boolGenerator();
    }
    public static List<Long> randomNumberList(){
        return FakerUtils.listGenerator(5);
    }

}
