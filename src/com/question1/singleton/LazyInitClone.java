package com.question1.singleton;

public class LazyInitClone implements Cloneable{
  private static LazyInitClone instance;
    
    private LazyInitClone(){}
    
    //Lazy Initialization of the instance
    public static LazyInitClone getInstance(){
        if(instance == null){
            instance = new LazyInitClone();
        }
        return instance;
    }
    
    @Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}
}
