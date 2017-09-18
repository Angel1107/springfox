package com.angel1107.shuangseqiu;

import java.util.Scanner;

public class Choice {

	public static void main(String[] args) {
		System.out.println("___欢迎来到中国福利彩票___ ");
		Lottery lot = new Lottery();
		System.out.println(" ");
		System.out.println("请输入你要几组双色球,需要是大于0的整数");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (n > 0 && n % 1 == 0) {
			System.out.println("开始机选摇号!");

			for (int i = 0; i < n; i++) {
				System.out.println(" ");
				System.out.println("第" + (i + 1) + "组");

				int a[] = { 0, 1, 2, 3, 4, 5 };// 定义一个有6个数的数组
				boolean flag = true;

				while (flag) {
					for (int j = 0; j < 6; j++) {

						a[j] = lot.startRed();

					} // 这个for循环用于输入和存储6个红色球在数组中

					for (int s = 0; s < 6; s++) { // 这个冒泡循环用于判断，数组中的6个数是否相同
						for (int k = s + 1; k < 6; k++) {
							if (a[s] != a[k]) {
							} else {
								flag = false;// 数组中有值不同赋予false使下一句if不打印这组值
							}
						}
					}
					if (flag == true) {
						for (int p = 0; p < 6; p++) {
							System.out.print("第" + (p + 1) + "颗红球:");
							System.out.println(a[p]);// 数组中的数都不同时，用这个if打印它们的值

						}
						System.out.println("蓝色球:");
						lot.startBlue();
						flag = false;// 赋予false 则while循环结束;进行下一组运算
					} else {
						flag = true;// 数组中有相同的值；一直赋予真，则while一直循环；直到数组中所有数都不同
					}
				}

			}

		}

		else {
			System.out.println("你的选择不规范；请输入大于0的整数！");
		}

		int money = 2;
		System.out.println("你一共买了" + n + "组彩票," + "请付钱:" + (money * n) + "元");

	}

}
