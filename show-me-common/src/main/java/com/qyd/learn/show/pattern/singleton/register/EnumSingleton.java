package com.qyd.learn.show.pattern.singleton.register;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 17:26
 * @Description:
 */
public enum  EnumSingleton {
    GOODPOPLE("1","GOODPOPLE");
    private String code;
    private String desc;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private EnumSingleton(String code, String desc){
    }

    public EnumSingleton getGoodpopleEnumSingleton(String code){
        for(EnumSingleton enumSingleton:EnumSingleton.values()) {
            if (enumSingleton.getCode().equals(code)) {
                return enumSingleton;
            }
        }
        return  null;
    }


}
