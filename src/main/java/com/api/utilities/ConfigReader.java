package com.api.utilities;

import com.api.constants.FrameworkConstants;
import com.api.enums.Econfig;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

@Test
public final class ConfigReader {
    private ConfigReader(){

    }
    public static String getValue() throws IOException {

        try(FileInputStream fis =new FileInputStream(new File(FrameworkConstants.getInstance().getConfigFilePath()))){
            Properties properties = new Properties();
            properties.load(fis);
            return properties.getProperty(String.valueOf(Econfig.BASE_URI));
        }
        catch (IOException e){

        }


    }
}
