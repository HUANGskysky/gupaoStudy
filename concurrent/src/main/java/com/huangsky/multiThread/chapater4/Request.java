package com.huangsky.multiThread.chapater4;

/**
 * @Description:
 * @author:huangtiande
 * @date:2019/12/22 15:58
 * @Email:huangtiande@jd.com
 */
public class Request {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                '}';
    }
}
