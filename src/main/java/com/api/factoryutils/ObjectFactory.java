package com.api.factoryutils;

import com.github.javafaker.Faker;

public final class ObjectFactory {
    private ObjectFactory(){}

    private static final Faker faker= new Faker();
    @SuppressWarnings("unchecked")
    public static  <T> T generateCustomType(Class<T> clazz){
        return switch (clazz.getSimpleName()){
            case  "Integer" ->  (T) Integer.valueOf(faker.number().numberBetween(1,100));
            case  "Double"  ->  (T) Double.valueOf(faker.number().randomDouble(1,1,10));
            case  "String"  ->  (T) faker.name().name();
            default -> throw new IllegalArgumentException("Unsupported generic type :"+ clazz);
        };
    }
}
