package com.pack;

/*
 *包装纸类对包装接口的实现
 */

public class Wrapper implements Packing {

    @Override
    public String pack(){
        return "Wrapper";
    }
}
