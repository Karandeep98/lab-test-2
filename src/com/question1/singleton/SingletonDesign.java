package com.question1.singleton;

public class SingletonDesign implements Cloneable{
	private static volatile SingletonDesign instance;
	
    private  SingletonDesign(){}
	
	
	public static SingletonDesign getInstance(){
		if (instance == null)
        {
        
            synchronized (SingletonDesign.class)
            {
              //create only one instance of class
                if (instance==null)
                    instance = new SingletonDesign();
            }
        }
        return instance;
    }
	
	 @Override
		protected Object clone() throws CloneNotSupportedException {
			//throw new CloneNotSupportedException();
			return super.clone();
		}

}

