package com.question1.singleton;

public class LazyInitialization {
	
private static LazyInitialization instance;
    
    private LazyInitialization(){}
    
    //Lazy Initialization of the instance
    public static LazyInitialization getInstance(){
        if(instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }
	
	

}
