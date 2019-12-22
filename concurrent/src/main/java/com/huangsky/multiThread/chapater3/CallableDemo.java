package com.huangsky.multiThread.chapater3;


import java.util.concurrent.*;

/**
 * @Description:
 * @author:huangtiande
 * @date:2019/12/22 15:51
 * @Email:huangtiande@jd.com
 */
public class CallableDemo implements Callable<String> {


    public static void main(String[] args) throws ExecutionException,InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CallableDemo callableDemo = new CallableDemo();
        Future<String> future = executorService.submit(callableDemo);
        String result = future.get(); //阻塞
        System.out.println(result);
        executorService.shutdown();
    }

    @Override
    public String call() throws Exception {

        return "string:"+1;

    }
}
