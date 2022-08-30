package com.example.author;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@Component
public class InfoConfig implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("runtime", System.currentTimeMillis());
        Map map = new HashMap();
        map.put("buildertime", "2022");
        map.put("key", "value");
        builder.withDetails(map);
    }
}
