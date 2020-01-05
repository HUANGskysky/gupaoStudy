package com.huangsky.multiThread.chapater4;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description:
 * @author:huangtiande
 * @date:2019/12/22 17:19
 * @Email:huangtiande@jd.com
 */
public class AtomicDemo {

    private static AtomicInteger count = new AtomicInteger(0);

    public static void inc(){
        try {

            Thread.sleep(1);

        }catch (Exception e) {
            e.printStackTrace();
        }
        count.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException{
        for (int i=0; i<1000; i++) {
            new Thread(AtomicDemo::inc).start();
        }
        Thread.sleep(4000);
        System.out.println("result:"+count);
    }

}
