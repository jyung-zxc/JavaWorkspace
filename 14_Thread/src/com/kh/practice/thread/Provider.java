package com.kh.practice.thread;

public class Provider extends Thread {
	private Data data;

	public Provider(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		int random = (int) (Math.random() * 100 + 1);

		for (int i = 0; i < 10; i++) {
			data.setValue(random);
		}
	}
}
