package com.multi;

public class Producer extends Thread {

	public Company c;

	public Producer(Company company) {
		this.c = company;
	}

	@Override
	public void run() {

		int i = 0;
		while (true) {
			try {
				c.produceNumber(i);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}

	}

}
