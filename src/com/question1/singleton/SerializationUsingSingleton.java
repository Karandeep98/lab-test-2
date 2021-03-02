package com.question1.singleton;

import java.io.Serializable;

public class SerializationUsingSingleton implements Serializable{
	private static final long serialVersionUID = -7604766932017737115L;

    private SerializationUsingSingleton(){}
    
    private static class Singleton{
        private static final  SerializationUsingSingleton instance = new  SerializationUsingSingleton();
    }
    
    public static SerializationUsingSingleton getInstance(){
        return Singleton.instance;
    }
	
    
    //to overcome the serialization problem in singleton design pattern
    protected Object readResolve() {
    	return getInstance();
    	}

}
