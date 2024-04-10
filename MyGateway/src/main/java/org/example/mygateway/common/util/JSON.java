package org.example.mygateway.common.util;

import com.fasterxml.jackson.core.type.TypeReference;
import lombok.SneakyThrows;
import org.example.mygateway.common.config.JsonConfiguration;

public class JSON {

    @SneakyThrows
    public static String toJSONString(Object v) {
        return JsonConfiguration.getJsonMapper().writeValueAsString(v);
    }

    @SneakyThrows
    public static <T> T parseObject(String v, Class<T> tClass) {
        return JsonConfiguration.getJsonMapper().readValue(v, tClass);
    }

    @SneakyThrows
    public static <T> T parseObject(String v, TypeReference<T> typeReference) {
        return JsonConfiguration.getJsonMapper().readValue(v, typeReference);
    }

}