package com.callableInterfaceDemo;

import java.util.concurrent.Callable;

class MessageScheduler implements Callable<Boolean> {
	private final String message;
	private final long delay;

	public MessageScheduler(final String message, final long delay) {
		this.message = message;
		this.delay = delay;
	}

	@Override
	public Boolean call() throws InterruptedException {

		if (message == null) {
			throw new NullPointerException("message should not be null");
		}

		Thread.sleep(delay);

		System.out.println("message:"+message);

		return true;

	}
}

class MessageSchedulerExample {
	public static void main(String[] args) throws InterruptedException {
		MessageScheduler ms = new MessageScheduler("navyathati", 5);
		ms.call();
	}
}
