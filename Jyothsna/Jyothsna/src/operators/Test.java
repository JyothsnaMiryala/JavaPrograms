package operators;

class Test {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {

		Class<?> clz = Class.forName(args[0]);
		Object o = clz.newInstance();
		System.out.println("Object created for:" + o.getClass().getName());
	}
}
