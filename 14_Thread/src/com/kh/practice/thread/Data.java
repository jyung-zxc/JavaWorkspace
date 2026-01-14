package com.kh.practice.thread;

public class Data {
	private int value;
	private boolean isEmpty = true;

	public Data() {

	}

	public void setValue(int value) {
		this.value = value;
		synchronized (this) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (isEmpty) {
				getValue();
				isEmpty = false;
				notify();
			}
		}
	}

	public int getValue() {
		synchronized (this) {
			if(isEmpty == false) {
				isEmpty = true;
				notify();
			}
		}
	}
}
