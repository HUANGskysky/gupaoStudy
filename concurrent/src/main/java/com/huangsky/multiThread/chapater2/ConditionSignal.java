package com.huangsky.multiThread.chapater2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ConditionSignal extends Thread {

    private Lock lock;

    private Condition condition; //jdk层面的wait和notify

    public ConditionSignal(Lock lock, Condition condition) {
        this.lock = lock;
        this.condition = condition;
    }

    @Override
    public void run() {

        try {
            lock.lock();
            System.out.println("ConditionSingal 执行启动！");
            condition.signal();
            System.out.println("ConditionSignal 执行结束！");

        }finally {
            lock.unlock();
        }

    }

}
