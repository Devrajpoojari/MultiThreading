package com.multi;

public class Main {

	public static void main(String[] args){
		Company c=new Company();
		
		Producer p=new Producer(c);
		Consumer consum=new Consumer(c);
		p.start();
		consum.start();
		

	}

}
