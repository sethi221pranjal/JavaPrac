/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author P.Sethi
 */
import java.util.Scanner;
public class duplicateRem {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		String input=sc.next();
		String res = removeDup(input);
		System.out.println("Output is:"+res);
		sc.close();
	}
	public static String removeDup(String input) {
		if(input.length()<=1) {
			return input;
		}
		if(input.charAt(0)==input.charAt(1)) {
			int i=0;
			while(i<input.length()-1 && input.charAt(0)==input.charAt(i+1)) {
				i++;
			}
			return removeDup(input.substring(i+1));
		}
		else {
			return input.charAt(0)+removeDup(input.substring(1));
		}
	}
}

