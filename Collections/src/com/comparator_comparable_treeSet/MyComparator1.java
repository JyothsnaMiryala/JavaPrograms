package com.comparator_comparable_treeSet;

import java.util.Comparator;

public class MyComparator1 implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Integer i1=(Integer)obj1;
		Integer i2 =(Integer)obj2;
		return i1.compareTo(i2);
		//return -i1.compareTo(i2);
		//return i2.compareTo(i1);
		//return -i2.compareTo(i1);
		//return +1;
		//return -1;
		//return 0;
	}

}
