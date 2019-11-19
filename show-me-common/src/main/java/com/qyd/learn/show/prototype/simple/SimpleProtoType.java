package com.qyd.learn.show.prototype.simple;

import com.qyd.learn.show.pattern.factory.simplefactory.SimpleFactory;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 18:12
 * @Description:
 */
public class SimpleProtoType  {
    private ProtoType protoType;
    public SimpleProtoType(ProtoType protoType){
        this.protoType=protoType;
    }
    public ProtoType startClone(ProtoType protoType){
        return protoType.clone();
    }
}
