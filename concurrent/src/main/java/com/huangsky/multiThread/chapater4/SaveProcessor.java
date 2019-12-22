package com.huangsky.multiThread.chapater4;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * @Description:
 * @author:huangtiande
 * @date:2019/12/22 16:06
 * @Email:huangtiande@jd.com
 */
public class SaveProcessor extends Thread implements RequestProcessor{

    LinkedBlockingDeque<Request> linkedBlockingDeque = new LinkedBlockingDeque<>();

    @Override
    public void run(){
        while (true){
            try {
                Request request = linkedBlockingDeque.take();
                System.out.println("save data: " + request);
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
