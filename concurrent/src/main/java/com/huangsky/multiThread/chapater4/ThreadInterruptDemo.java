package com.huangsky.multiThread.chapater4;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @author:huangtiande
 * @date:2019/12/22 17:02
 * @Email:huangtiande@jd.com
 */
public class ThreadInterruptDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (true) {
                boolean res = Thread.currentThread().isInterrupted();
                if (res) {
                    System.out.println("before:" + res);
                    Thread.interrupted(); //对线程进行复位，中断标识为false
                    System.out.println("after:" + Thread.currentThread().isInterrupted());
                }
            }
        },"ThreadInterruptDemo");
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        thread.interrupt();//设置中断标识,中断标识为true }
    }

}
