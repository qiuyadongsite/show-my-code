package com.qyd.learn.show;

import com.qyd.learn.show.domain.RequestObj;

import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.Socket;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/6 13:54
 * @Description:
 */
public class ClientHandler implements InvocationHandler {
    private String ip;
    private int port;
    private String className;
    public ClientHandler(String localhost, int port,String className) {
        this.ip=localhost;
        this.port=port;
        this.className=className;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用远端的实现


        Socket socket=null;

        OutputStream outputStream=null;
        Object o=null;
        try {
            socket =new Socket(ip,port);



            ObjectOutputStream objectOutputStream=new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream objectInputStream=new ObjectInputStream(socket.getInputStream());
            RequestObj requestObj=new RequestObj();

            requestObj.setClassName(className);

            requestObj.setMethodName(method.getName());

            requestObj.setTypes(method.getParameterTypes());

            requestObj.setArgs(args);

            objectOutputStream.writeObject(requestObj);

            objectOutputStream.flush();
           o=objectInputStream.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if(outputStream!=null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        return o;
    }
}
