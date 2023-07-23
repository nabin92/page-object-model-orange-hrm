package com.orangehrmlive.demo.util;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {
    static Properties prop = new Properties();

    @SneakyThrows
    public static void loadProperties() {
        FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
        prop.load(fis);
    }

    public static String getProperty(String key) {
        loadProperties();
        return(prop.getProperty(key));
    }
}

