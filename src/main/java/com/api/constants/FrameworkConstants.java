package com.api.constants;

import lombok.Getter;
public final class FrameworkConstants {
    private FrameworkConstants(){}
    private static final String PWD=System.getProperty("user.dir");
    @Getter private static final String CONFIG_FILE_PATH = PWD+"/src/test/resources/config/config.properties";
    @Getter private static final String EXT_REQ_FILE_PATH= PWD+"/src/test/resources/externalReqBodies/request-body.json";
    @Getter private static final String RES_STORE_FOLDER_PATH= PWD+"/output/";

}

