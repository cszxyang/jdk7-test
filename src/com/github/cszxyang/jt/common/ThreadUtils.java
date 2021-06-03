package com.github.cszxyang.jt.common;

import java.util.concurrent.TimeUnit;

/**
 * @author yzx
 */
public class ThreadUtils {

    public static void sleep(long sleepSeconds) {
        try {
            TimeUnit.SECONDS.sleep(sleepSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
