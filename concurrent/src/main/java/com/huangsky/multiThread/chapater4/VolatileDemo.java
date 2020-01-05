package com.huangsky.multiThread.chapater4;

/**
 * @Description:
 * @author:huangtiande
 * @date:2019/12/22 17:16
 * @Email:huangtiande@jd.com
 */
public class VolatileDemo {
    private volatile static boolean stop = false;

    public static void main(String[] args) throws InterruptedException {

        Thread thread=new Thread(()->{
            int i=0; while(!stop) {
                i++;
            } },"VolatileDemo");
        thread.start();
        System.out.println("begin start thread");
        Thread.sleep(1000);
        stop=true;

    }
}
