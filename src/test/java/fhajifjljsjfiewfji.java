import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author lide
 */
public class fhajifjljsjfiewfji {
    static boolean b = true;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            printTime("inner" + Thread.interrupted());
//            while (!Thread.interrupted()) {
//                printTime("inner");
//            }
            printTime("inner interrupt end" + Thread.currentThread().isInterrupted());
        });
        t.setName("t");
        t.start();


        Thread.sleep(400);
        t.interrupt();
        printTime(t.isInterrupted() + "outer");
        printTime("outer");

    }

    private static void printTime(String... prefix) {
        System.out.println(Arrays.toString(prefix) + System.nanoTime());
    }

    @Test
    void classloader() {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
    }
}
