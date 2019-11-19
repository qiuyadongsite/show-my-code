package com.qyd.learn.show.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 18:17
 * @Description:
 */
public class Client {
    ProtoType startClone(ProtoType b){
        return b.clone();
    }

    public static void main(String[] args) {
        Client client=new Client();
        SimpleProtoTypeA a=new SimpleProtoTypeA();
        a.setName("1");
        a.setSex("12323");
        List hobbys=new ArrayList();
        a.setHobbise(hobbys);

        SimpleProtoTypeA b=(SimpleProtoTypeA)client.startClone(a);

        System.out.println(b.getSex()==a.getSex());
        System.out.println(b.getName()==a.getName());
        System.out.println(b.getHobbise()==a.getHobbise());
        System.out.println(a==b);
        a.setSex("1223");
        ArrayList k=new ArrayList();
        k.add(12);
        a.setHobbise(k);
        System.out.println(b.getSex());
        System.out.println(b.getHobbise());
    }
}
