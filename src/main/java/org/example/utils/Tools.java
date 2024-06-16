package org.example.utils;

import java.util.Arrays;

/**
 * @author lide
 */
public final class Tools {
    public static void printThreadInfo(long time, Object... prefix) throws InterruptedException {
        Thread.sleep(time);
        System.out.println(Arrays.toString(prefix) + "from " + Thread.currentThread().getName());
    }
}
