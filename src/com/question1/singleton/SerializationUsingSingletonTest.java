package com.question1.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationUsingSingletonTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		SerializationUsingSingleton instance1 = SerializationUsingSingleton.getInstance();
		
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(new File("test.ser")));
		
        out.writeObject(instance1);
        
        out.close();
        
    
        ObjectInputStream in=new ObjectInputStream(new FileInputStream(new File("test.ser")));
	
        SerializationUsingSingleton instance2 = (SerializationUsingSingleton) in.readObject();
        
        in.close();
        
        System.out.println("instanceOne hashCode="+instance1.hashCode());
        System.out.println("instanceTwo hashCode="+instance2.hashCode());
        
    }

}
