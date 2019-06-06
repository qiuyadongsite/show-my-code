package com.qyd.learn.show;


import com.qyd.learn.show.service.IHelloService;
import com.qyd.learn.show.service.impl.HelloServiceImpl;

import java.io.IOException;
import java.lang.reflect.Proxy;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.concurrent.*;

public class Server
{
    public static HashMap<String,Object> hashMap=new HashMap<>();
    public static void main( String[] args )
    {
        ThreadPoolExecutor executorService= new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());

        ServerSocket sever = null;
        try {
             sever= new ServerSocket(8080);

             publishServer(IHelloService.class.getName(),new HelloServiceImpl());

            while (true){
                executorService.submit(new HandlerSocket(sever.accept()));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                sever.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void publishServer(String iHelloServiceClass,Object object) {
        hashMap.put(iHelloServiceClass, object);

    }
}
