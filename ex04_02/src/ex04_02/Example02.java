package ex04_02;

class SharedObject {
	int sum = 0;

	synchronized void add(int i) {
		sum += i;
	}

	synchronized void sub(int i) {
		sum -= i;
	}
}

class MyThread extends Thread {
	SharedObject obj;
	boolean add;

	public MyThread(boolean add, SharedObject obj) {
		this.add = add;
		this.obj = obj;
	}

	@Override
	public void run() {
		if (add == true) {
			for (int i = 1; i <= 100; i++) {
				obj.sum += i;
			}
		} else {
			for (int i = 1; i <= 100; i++) {
				obj.sum -= i;
			}
		}
	}
}

public class Example02 {
	public static void main(String[] args) {
		SharedObject obj = new SharedObject();
		MyThread threadOne = new MyThread(true, obj);
		MyThread threadTwo = new MyThread(false, obj);
		threadOne.start();
		threadTwo.start();
		try {
			threadOne.join();
			threadTwo.join();
		} catch (InterruptedException e) {
			System.out.println("interrupted");
		}

		System.out.println(obj.sum);
	}
}
