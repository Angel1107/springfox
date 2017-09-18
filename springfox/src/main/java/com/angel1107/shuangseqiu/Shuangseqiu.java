package com.angel1107.shuangseqiu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shuangseqiu {
public static void main(String[] args) {
	List<Integer> list1 = new ArrayList<Integer>();
	List<Integer> list2 = new ArrayList<Integer>();
	Random rand = new Random();
	while (list1.size() < 6) {
		Integer result = new Integer((Math.abs(rand.nextInt() % 33)) + 1);
		if (!list1.contains(result)) {
			list1.add(result);
		}
	}
	System.out.println("-----" + list1.toString());

	while (list2.size() < 1) {
		Integer result = new Integer((Math.abs(rand.nextInt() % 16)) + 1);
		if (!list2.contains(result)) {
			list2.add(result);
		}
	}
	System.out.println("-----" + list2.toString());
}
}
