package com.huangsky.multiThread.chapater4;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @author:huangtiande
 * @date:2019/12/22 16:33
 * @Email:huangtiande@jd.com
 */
public class ThreadStatusDemo {

    public static void main(String[] args) {
        new Thread(()->{
            while (true){
                try {
                    TimeUnit.SECONDS.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        },"timeWaiting").start();

        new Thread(()->{
            while (true) {
                synchronized (ThreadStatusDemo.class) {
                    try {
                        ThreadStatusDemo.class.wait();
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"waiting").start();

        new Thread(new BlockDemo(),"BlockDemo-0").start();
        new Thread(new BlockDemo(),"BlockDemo-1").start();


    }

    public static class BlockDemo extends Thread {
        public void run (){
            synchronized (BlockDemo.class){
                while (true) {
                    try {
                        TimeUnit.SECONDS.sleep(100);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
