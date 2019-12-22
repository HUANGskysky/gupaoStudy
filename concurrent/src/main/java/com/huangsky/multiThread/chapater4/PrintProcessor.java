package com.huangsky.multiThread.chapater4;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * @Description:
 * @author:huangtiande
 * @date:2019/12/22 16:00
 * @Email:huangtiande@jd.com
 */
public class PrintProcessor extends Thread implements RequestProcessor{

    LinkedBlockingDeque<Request> linkedBlockingDeque = new LinkedBlockingDeque<>();

    private final RequestProcessor nextProcessor;

     public PrintProcessor(RequestProcessor nextProcessor) {
         this.nextProcessor = nextProcessor;
     }

    @Override
    public void run(){
         while (true){
             try {
                 Request request = linkedBlockingDeque.take();
                 System.out.println("print data: " + request);
                 nextProcessor.processRequest(request);
             }catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
    }
    
    @Override
    public void processRequest(Request request){
         linkedBlockingDeque.add(request);
    }



}
