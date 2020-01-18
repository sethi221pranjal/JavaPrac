/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author P.Sethi
 */
import java.util.*;
public class triplet {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases: ");
		int t = sc.nextInt();
		for (int j = 0; j < t; j++) {
			System.out.println("Enter the size of array: ");
			int arrs = sc.nextInt();
			int arr[] = new int[arrs];
			System.out.println("Enter the values: ");
			for (int i = 0; i < arrs; i++) {
				arr[i] = sc.nextInt();
			}
			check(arr, arrs);
		}
	}

	public static void check(int[] arr, int arrs) {
		Arrays.sort(arr);
		int flag = 0;
		for (int i = 0; i < arrs; i++) {
			int v = arr[i] * arr[i];
			for (int j = 0; j < arrs - 1; j++) {
				if ((arr[j] * arr[j]) + (arr[j + 1] * arr[j + 1]) == v) {
					flag++;
				}
			}
		}
		if (flag > 0) {
			System.out.println("There exist such triplets");
		} else {
			System.out.println("No such triplets exist");
		}

	}

}



