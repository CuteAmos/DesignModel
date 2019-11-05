package test.singleton;

import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {
    @Test
    public void testHungrySingleton() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new Thread(() ->{
                    try {
                        Thread.sleep(100);
                        System.out.println(singleton.hungry.singleton.Singleton.getInstance());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }).start();
        }
        Thread.sleep(1000);
    }

    @Test
    public void testLazySingleton() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new Thread(()-> {
                    try {
                        Thread.sleep(100);
                        System.out.println(singleton.lazy.singleton.Singleton.getInstance());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).start();
        }
        Thread.sleep(1000);
    }

    @Test
    public void testLazySingleton2() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                    try {
                        Thread.sleep(100);
                        System.out.println(singleton.lazy.singleton2.Singleton2.getInstance());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).start();
        }
        Thread.sleep(1000);
    }
}