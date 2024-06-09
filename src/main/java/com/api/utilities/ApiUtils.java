package com.api.utilities;

import com.api.customexceptions.InValidReqFilePathException;
import com.api.customexceptions.InValidResponseFilePathException;
import io.restassured.response.Response;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class ApiUtils {
    private ApiUtils(){}



    public static String readJsonReturnAsString(String filePath){
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            throw new InValidReqFilePathException("Please check the request body file path "+ filePath);
        }
    }

    public static void writeJsonStoreAsString(String filePath, Response response){
        try {
            Files.write(Paths.get(filePath),response.asByteArray());
        } catch (IOException e) {
            throw new InValidResponseFilePathException("Please check the response store file path "+ filePath);
        }
    }
}
