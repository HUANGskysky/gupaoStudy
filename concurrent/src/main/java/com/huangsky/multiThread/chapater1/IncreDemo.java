package com.huangsky.multiThread.chapater1;

/**
 * @Description:
 * @author:huangtiande
 * @date:2020/3/28 16:05
 * @Email:huangtiande@jd.com
 */
public class IncreDemo {

    public volatile int i = 0;

    public void incre(){
        i++;
    }

    public static void main(String[] args) {
        new IncreDemo().incre();
    }
}
