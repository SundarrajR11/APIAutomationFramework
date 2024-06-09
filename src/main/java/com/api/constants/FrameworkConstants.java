package com.api.constants;

import lombok.Getter;



public final class FrameworkConstants {
    private FrameworkConstants(){}

    private static final String CWD = System.getProperty("user.dir");

    @Getter private static   final String CONFIG_FILE_PATH = CWD+"/src/test/resources/config/config.properties";

}
