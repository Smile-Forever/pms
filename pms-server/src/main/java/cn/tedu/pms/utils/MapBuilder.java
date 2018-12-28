package cn.tedu.pms.utils;

import java.util.HashMap;

/**
 * @author Smile
 * Created at 2018/12/28
 */
public class MapBuilder extends HashMap<String, Object> {
    public MapBuilder kv(String key, Object value) {
        super.put(key, value);
        return this;
    }
}