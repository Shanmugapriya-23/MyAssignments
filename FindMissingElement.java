package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int array1[] = {1, 4,3,2,8, 6, 7};
		Arrays.sort(array1);
		System.out.println(array1.length);
			for (int i = 0; i <array1.length;i++) {
					if(i != array1[i]-1) {
						System.out.println("Missing Element:" + (array1[i]-1));
						break;
					}
				}
				
			}
	}
