package com.question1.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class JavaRefelctionBreakageTester {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        EagerInitialization instance1 = EagerInitialization.getInstance();
        EagerInitialization instance2 = null;
       
        @SuppressWarnings("rawtypes")
		Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
         constructors[0].setAccessible(true);
 		
         instance2 = (EagerInitialization) constructors[0].newInstance(); 
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}
