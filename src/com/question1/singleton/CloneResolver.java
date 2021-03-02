package com.question1.singleton;

public class CloneResolver {
	 public static void main(String[] args) throws CloneNotSupportedException, Exception {
		 LazyInitClone instance1 = LazyInitClone.getInstance();
		 LazyInitClone instance2 = (LazyInitClone) instance1.clone();
	        System.out.println("hashCode of instance 1 - " + instance1.hashCode());
	        System.out.println("hashCode of instance 2 - " + instance2.hashCode());
	    }

}