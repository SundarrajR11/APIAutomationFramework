package com.api.utilities;

import com.api.constants.FrameworkConstants;
import com.api.customexceptions.InValidPropertyKeyException;
import com.api.enums.Econfig;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

@Test
public final class ConfigReader {
    private ConfigReader(){

    }
    private static final Map<String,String> CONFIG = new HashMap<>();
    private static final Properties PROPERTIES=new Properties();

    static {
        try(FileInputStream fis =new FileInputStream(FrameworkConstants.getCONFIG_FILE_PATH())){

            PROPERTIES.load(fis);
            PROPERTIES.entrySet().forEach((entry) -> CONFIG.put(
                    String.valueOf(entry.getKey()),
                    String.valueOf(entry.getValue())
            ));
        }
        catch (IOException e){
            System.exit(0);
        }
    }

    public static String getValue(Econfig key) {
        String k = key.toString();
        if(Objects.isNull(k)){
            throw new InValidPropertyKeyException("Property Key"+ k +" is not found.Please verify config.properties file!");
        }
        return PROPERTIES.getProperty(k);
    }
}
