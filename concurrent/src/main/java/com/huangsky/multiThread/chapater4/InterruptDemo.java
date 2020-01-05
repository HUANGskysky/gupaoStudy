package com.huangsky.multiThread.chapater4;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @author:huangtiande
 * @date:2019/12/22 16:53
 * @Email:huangtiande@jd.com
 */
public class InterruptDemo {

    private static int i;

    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(()->{

            while (!Thread.currentThread().isInterrupted()) {
                i++;
            }
            System.out.println(i);
        },"interruptedDemo");
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        thread.interrupt(); //设置interrupt标识为true
        System.out.println(thread.isInterrupted());
    }


}
