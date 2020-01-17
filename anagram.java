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
public class anagram {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter your first string");
     String f=sc.next();	
     System.out.println("enter your second string");
     String s=sc.next();
     int flag=0;
     String s1=f.toLowerCase();
     String s2=s.toLowerCase();
     if(s1.length()!=s2.length())
     {
    	 System.out.println(s1 + " and " + s2 +" are not anagram");
     }
     else {
     for(int i=0;i<s1.length();i++)
     {
    	 for(int j=0;j<s2.length();j++)
    	 {
    		 if(s1.charAt(i)==s2.charAt(j))
    		 {
    			 flag++;
    			 break;
    		 }
    	 }
     }

     if(flag==s1.length())

     {
    	 System.out.println(s1 + " and " + s2 +" are anagrams");
     }

     else {
    	 System.out.println("are not anagrams");
     }
     }
    }
}

