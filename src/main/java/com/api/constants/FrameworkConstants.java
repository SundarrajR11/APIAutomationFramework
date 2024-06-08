package com.api.constants;

import lombok.Getter;


public final class FrameworkConstants {
    private FrameworkConstants(){}
    public static  FrameworkConstants getInstance(){
        return new FrameworkConstants();
    }

    private static final String CWD = System.getProperty("user.dir");
    private static final String CONFIG_FILE_PATH = CWD+"/src/test/resources/config/config.properties";

    public String getConfigFilePath(){
        return CONFIG_FILE_PATH;
    }

}
