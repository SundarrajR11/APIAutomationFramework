package com.api.utilities;

import com.api.thirdpartylibraryusage.FakerUtils;

import java.util.List;

/*
* Implemented facesad design pattern
* Business Layer where we can alter as per our needs.*/
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
    public static List<? extends Object> randomNumberList(Class<?> tClass){
        return FakerUtils.listGenerator(tClass, 5);
    }

}
