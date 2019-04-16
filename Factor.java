//Parth Mistry

import java.util.ArrayList;
import java.util.Scanner;

public class Factor {
	
	public static int[] factor(int num) {
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 2, count = 0; i <= num; ) {
			while (num % i == 0) {
				num /= i;
				++count;
				continue;
			}
			//else {
			if (count != 0) {
				al.add(i);
				al.add(count);
			}
				++i;
				count = 0;
			//}
		}
		//System.out.println(al);
		int[] list = new int[al.size()];
		for (int i = 0; i < list.length; i++) {
			list[i] = al.get(i);
		}
		return list;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter integer (0 to terminate): ");
		int num = input.nextInt();
		while (num != 0) {
			if (num == 1) {
				System.out.println("(1, 1)\n");
			}
			int[] list = factor(num);
			for (int i = 0; i < list.length; i+=2) {
				if (i == list.length-2) {
					System.out.println("(" + list[i] + ", " + list[i+1] + ")\n");
				} else {
					System.out.print("(" + list[i] + ", " + list[i+1] + "), ");
				}
			}
			System.out.print("Please enter integer (0 to terminate): ");
			num = input.nextInt();
		}
		System.exit(0);
	}

}
