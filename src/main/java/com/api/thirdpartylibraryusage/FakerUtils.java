package com.api.thirdpartylibraryusage;

import com.api.factoryutils.ObjectFactory;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

/*
 * Implemented Facade Design Pattern
 * Service Layer where we can use Third Party library.
 * Main purpose is if any happened in Third Party library we can directly come and change our needs.*/

public final class FakerUtils {
    private FakerUtils(){}

    private static final Faker faker = new Faker();
    public static int idGenerator(int start, int end){
        return faker.number().numberBetween(start,end);
    }

    public static String firstNameGenerator() {
        return faker.name().firstName();
    }

    public static String lastNameGenerator() {
        return faker.name().lastName();
    }

    public static String emailGenerator() {
        return faker.internet().emailAddress();
    }

    public static boolean boolGenerator() {
        return faker.bool().bool();
    }


    public static <T> List<T> listGenerator(Class<T> clazz, int size) {
        List<T> customizedList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            customizedList.add(ObjectFactory.generateCustomType(clazz));
        }
        return customizedList;
    }
}
