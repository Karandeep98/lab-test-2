package com.question1.singleton;

public class ThreadSafe {
	
private static ThreadSafe instance;
    
    private ThreadSafe(){}
    
    //by using synchronized only one thread can use this method at a time
    public static synchronized ThreadSafe getInstance(){
        if(instance == null){
            instance = new ThreadSafe();
        }
        return instance;
    }

}
