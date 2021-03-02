package com.question1.singleton;

public class EagerInitialization {
	
	//Instance of Singleton Class is created at the time of class loading
    private static final EagerInitialization  instance = new EagerInitialization();
    
    private EagerInitialization(){
    	if( instance != null ) {
            throw new InstantiationError( "Creating of this object is not allowed." );
        }
    	
    	//System.setSecurityManager(new SecurityManager());
    }

    public static EagerInitialization getInstance(){
        return instance;
    }

}
