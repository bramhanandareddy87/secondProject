package com.rjs.map;

import java.util.Comparator;

public class MyComparator2 implements Comparator {


	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Long lo1=(Long)obj1;
		Long lo2=(Long)obj2;

		return lo2.compareTo(lo1);
	}

	

}
