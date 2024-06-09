package com.api.requestBuilders;

import com.api.enums.Econfig;
import com.api.utilities.ConfigReader;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public final class RequestDetailsBuilder {
    private RequestDetailsBuilder(){
    }
    public static RequestSpecification getCalls(){
        return given()
                .baseUri(ConfigReader.getValue(Econfig.BASE_URI))
                .log()
                .all();
    }
    public static RequestSpecification postCalls(){
        return given()
                .baseUri(ConfigReader.getValue(Econfig.BASE_URI))
                .contentType(ContentType.JSON)
                .log()
                .all();
    }
    public static RequestSpecification putCalls(){
        return given()
                .baseUri(ConfigReader.getValue(Econfig.BASE_URI))
                .log()
                .all();
    }
    public static RequestSpecification patchCalls(){
        return given()
                .baseUri(ConfigReader.getValue(Econfig.BASE_URI))
                .log()
                .all();
    }
    public static RequestSpecification deleteCalls(){
        return given()
                .baseUri(ConfigReader.getValue(Econfig.BASE_URI))
                .log()
                .all();
    }
}
