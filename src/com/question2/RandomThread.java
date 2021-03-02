package com.question2;

import java.util.Random;

class RandomThread implements Runnable {

	Random random = new Random();
	private int number;
	public void run() {
		number = random.nextInt(10)+1;
	}

	int getNumber() {
		return number;
	}

	public static void main(String args[]) throws InterruptedException {

		RandomThread rt1 = new RandomThread();
		RandomThread rt2 = new RandomThread();
		RandomThread rt3 = new RandomThread();
		RandomThread rt4 = new RandomThread();
		RandomThread rt5 = new RandomThread();

		Thread t1 = new Thread(rt1);
		Thread t2 = new Thread(rt2);
		Thread t3 = new Thread(rt3);
		Thread t4 = new Thread(rt4);
		Thread t5 = new Thread(rt5);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();

		System.out.println("Thread 1: " + rt1.getNumber());
		System.out.println("Thread 2: " + rt2.getNumber());
		System.out.println("Thread 3:  " + rt3.getNumber());
		System.out.println("Thread 4: " + rt4.getNumber());
		System.out.println("Thread 5:  " + rt5.getNumber());

		int sum = rt1.getNumber()+rt2.getNumber()+rt3.getNumber()+rt4.getNumber()+rt5.getNumber();

		System.out.println("Sum: " + sum);

	}

}
