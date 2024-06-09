package com.api.thirdpartyAPI;

import com.github.javafaker.Faker;
import com.github.javafaker.IdNumber;

import java.util.ArrayList;
import java.util.List;

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

    public static List<Long> listGenerator(int size) {
        ArrayList<Long> numList = new ArrayList<>();
        long numbers= faker.number().randomNumber();
        for (long i = 0; i < size; i++) {
            numList.add(numbers+i);
        }
        return numList;
    }
}
