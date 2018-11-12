package com.youaiduan.chapter21.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Singleton {
	private static Singleton instance = new Singleton();
	private static byte[] b = {};
	
	private Singleton() {
		System.out.println("in:" + Thread.currentThread());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Singleton getInstance(){
		System.out.println("getInstance:" + Thread.currentThread());
//		if(instance == null) {
//			synchronized (b) {
//				if(instance == null) {
//					System.out.println(Thread.currentThread() + ":½«Ë¯Ãß");
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					instance = new Singleton();
//				}
//			}
//		}
//		
		
		return instance;
	}
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		for(int i = 0; i < 10; i++) {
			executorService.execute(new Runnable() {		
				@Override
				public void run() {
					Singleton instance2 = Singleton.getInstance();
					System.out.println(Thread.currentThread() + "\t\t" + instance2);
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
				}
			});
		}
		
		executorService.shutdown();
		while (!executorService.isTerminated()) {
			
		}
		
		System.out.println("finished");
		
	}
	
	
}
