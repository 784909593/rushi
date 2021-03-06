package com.nowcoder.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 784909593
 * @data 2019/7/30 - 14:37
 */
public class ViewObject {
    private Map<String, Object> objs = new HashMap();

    public void set(String key, Object value) {
        objs.put(key, value);
    }

    public Object get(String key) {
        return objs.get(key);
    }
}
