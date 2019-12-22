package com.huangsky.multiThread.chapater4;

/**
 * @Description:
 * @author:huangtiande
 * @date:2019/12/22 16:09
 * @Email:huangtiande@jd.com
 */
public class Demo {

    PrintProcessor printProcessor;

    public Demo() {
        SaveProcessor saveProcessor = new SaveProcessor();
        saveProcessor.start();
        printProcessor = new PrintProcessor(saveProcessor);
        printProcessor.start();
    }

    public static void main(String[] args) {
        Request request = new Request();
        request.setName("args:huangsky");
        new Demo().doTest(request);

    }

    public void doTest(Request request){

        printProcessor.processRequest(request);
    }
}
