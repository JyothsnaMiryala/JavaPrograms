package com.callableInterfaceDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class JavaCallableExample {

	public static void main(String argvs[]) throws Exception {

		FutureTask[] randomNoTasks = new FutureTask[10];

		for (int j = 0; j < 10; j++) {

			Callable clble = new JavaCallable();

			randomNoTasks[j] = new FutureTask(clble);

			Thread th = new Thread(randomNoTasks[j]);
			th.start();
		}

		for (int j = 0; j < 10; j++) {

			Object o = randomNoTasks[j].get();

			System.out.println("The random number is: " + o);

		}
	}
}
