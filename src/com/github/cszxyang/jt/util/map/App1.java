package com.github.cszxyang.jt.util.map;


import com.github.cszxyang.jt.common.CustomKey;

public class App1 {
    public static void main(String[] args) {
        final HashMap<CustomKey, String> map = new HashMap<>(4, 1);
        final CustomKey k1 = new CustomKey(1, "a");
        CustomKey k2 = new CustomKey(1, "b");
        CustomKey k3 = new CustomKey(1, "c");
        CustomKey k4 = new CustomKey(1, "d");
        final CustomKey k5 = new CustomKey(1, "e");
        map.put(k1, "aa");
        map.put(k2, "bb");
        map.put(k3, "cc");
        map.put(k4, "dd");

        HashMap.Entry<CustomKey, String>[] table = map.table;
        for (HashMap.Entry<CustomKey, String> customKeyStringEntry : table) {
            System.out.println(customKeyStringEntry);
        }
        map.put(k5, "ee");
    }
}
