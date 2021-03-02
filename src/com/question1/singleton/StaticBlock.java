package com.question1.singleton;

public class StaticBlock {
private static StaticBlock instance;
    
    private StaticBlock(){}
    
    //static block initialization
    static{
            instance = new StaticBlock();
    }
    
    public static StaticBlock getInstance(){
        return instance;
    }

}
