package com.example.piris.weatherapp;

import java.util.HashMap;

/**
 * Created by PIRIS on 5/19/2015.
 */
public class SampleGattAttributes {
    // characteristics uuids
    private static HashMap<String, String> attributes = new HashMap();
    public static String TEMPERATURE_MEASUREMENT = "00002a1c-0000-1000-8000-00805f9b34fb";
    public static String HUMIDITY_MEASUREMENT = "00002a6f-0000-1000-8000-00805f9b34fb";
    public static String SPEED_FAN = "1000-0001-0000-0000-fdfd-fdfd-fdfd-fdfd";
    static {
        // Sample Services.
        attributes.put("00000002-0000-0000-fdfd-fdfdfdfdfdfd", "Weather Service");
        attributes.put("00000001-0000-0000-fdfd-fdfdfdfdfdfd", "Fan Control Service");


        // Sample Characteristics.
        attributes.put(TEMPERATURE_MEASUREMENT, "Temperature Measurement");
        attributes.put(HUMIDITY_MEASUREMENT, "Humidity Measurement");
        attributes.put(SPEED_FAN, "Intensity of Speed");

    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
