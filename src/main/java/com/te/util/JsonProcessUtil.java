package com.te.util;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.StringWriter;

public class JsonProcessUtil {
    private static ObjectMapper mapper;

    public static synchronized ObjectMapper getMapperInstance(boolean createNew) {
        if (createNew) {
            return new ObjectMapper();
        } else if (mapper == null) {
            mapper = new ObjectMapper();
        }
        return mapper;
    }

    public static String beanToJson(Object obj) {
        StringWriter writer = new StringWriter();
        JsonGenerator gen;
        try {
            ObjectMapper mapper = getMapperInstance(false);
            gen = new JsonFactory().createGenerator(writer);
            mapper.writeValue(gen, obj);
            String json = writer.toString();
            gen.close();
            writer.close();
            return json;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }


    }
}
