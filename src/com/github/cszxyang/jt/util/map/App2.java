package com.github.cszxyang.jt.util.map;


import com.github.cszxyang.jt.common.CustomKey;
import com.github.cszxyang.jt.common.ThreadUtils;

public class App2 {
    public static void main(String[] args) {
        final HashMap<CustomKey, String> map = new HashMap<>(4, 1);
        final CustomKey k1 = new CustomKey(1, "a");
        CustomKey k2 = new CustomKey(1, "b");
        CustomKey k3 = new CustomKey(1, "c");
        final CustomKey k4 = new CustomKey(1, "d");
        final CustomKey k5 = new CustomKey(1, "e");
        map.put(k1, "aa");
        map.put(k2, "bb");
        map.put(k3, "cc");
        map.put(k4, "dd");

        final HashMap.Entry<CustomKey, String>[] table = map.table;
        for (HashMap.Entry<CustomKey, String> customKeyStringEntry : table) {
            System.out.println(customKeyStringEntry);
        }
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadUtils.sleep(1);
                map.put(k5, "ee");
            }
        });
        t1.setName("T1");

        for (int i = 2; i < 102; i++) {
            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    map.put(k5, "ee");
                    // 触发死循环
                    map.get(k1);
                }
            });
            t2.setName("T" + i);
            t2.start();
        }
        t1.start();
    }
}
