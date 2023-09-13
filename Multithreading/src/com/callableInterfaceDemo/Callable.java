package com.callableInterfaceDemo;

import java.util.concurrent.Callable;
import java.util.Random;
import java.util.concurrent.FutureTask;

class JavaCallable implements Callable {
	@Override
	public Object call() throws Exception {

		Random randObj = new Random();

		Integer randNo = randObj.nextInt(10);

		Thread.sleep(randNo * 1000);

		return randNo;
	}
}
