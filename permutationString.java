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
public class permutationString {
    void get_str(String str,String ans)
	{
		
        if (str.length() == 0) { 
            System.out.print(ans + " "); 
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            char ch = str.charAt(i); 
  
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 

            get_str(ros, ans + ch); 
        } 
	}
	
	public static void main(String args[])
	{
		permutationString obj=new permutationString();
		
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		obj.get_str(str," ");
	}
}




