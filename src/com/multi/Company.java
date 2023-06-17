package com.multi;

public class Company {

	int n;

	boolean flag = false;

	synchronized public void produceNumber(int n) throws InterruptedException {

		if (flag) { // false
			wait();
		}
		this.n = n;
		System.out.println("Produce : " + n);
		flag = true;
		notify();

	}

	synchronized public int consumNumber() throws InterruptedException {
		if (!flag) {
			wait();
		}
		System.out.println("consumed : " + n);
		notify();
		return n;

	}

}
