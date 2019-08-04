package com.qyd.learn.show.pattern.proxy.simpleproxy;

/**
 * qyd.
 */
public class Client {

    public static void main(String[] args) {

        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();

    }

}
