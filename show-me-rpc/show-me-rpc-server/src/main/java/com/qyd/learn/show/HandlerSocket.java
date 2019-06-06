package com.qyd.learn.show;

import com.qyd.learn.show.domain.RequestObj;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/6 11:05
 * @Description:
 */
public class HandlerSocket implements  Runnable{

    private Socket socket;

    public HandlerSocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream in=null;
        OutputStream out=null;

        try {
            in=socket.getInputStream();
            out=socket.getOutputStream();

            ObjectInputStream objInput=new ObjectInputStream(in);

            ObjectOutputStream objectOutputStream=new ObjectOutputStream(out);

            RequestObj retObj=(RequestObj)objInput.readObject();

            Object ret=proxyProcess(retObj);

            objectOutputStream.writeObject(ret);
            objectOutputStream.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    private Object proxyProcess(RequestObj readObject) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        String className = readObject.getClassName();

        if(!className.isEmpty()){
            Object c=Server.hashMap.get(className);
            if(c!=null){
                Class<?> proxyClass = c.getClass();

                Method method=proxyClass.getMethod(readObject.getMethodName(),readObject.getTypes());
                Object ret=method.invoke(c, readObject.getArgs());
                return ret;
            }

            return null;
        }
        return null;
    }
}
