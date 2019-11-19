package com.qyd.learn.show.prototype.simple;

import java.util.List;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 18:14
 * @Description:
 */
public class SimpleProtoTypeA  implements ProtoType{

    private String name;
    private String sex;
    private List hobbise;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List getHobbise() {
        return hobbise;
    }

    public void setHobbise(List hobbise) {
        this.hobbise = hobbise;
    }

    @Override
    public ProtoType clone() {
        SimpleProtoTypeA a=new SimpleProtoTypeA();
        a.setName(this.name);
        a.setSex(this.sex);
        a.setHobbise(this.hobbise);
        return a;
    }
}
