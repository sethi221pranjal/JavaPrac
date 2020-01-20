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
public class reverse {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        for(int i=0;i<t;i++)
        {
            String st=scan.next();
            String arr[]=st.split("\\.");
            String str="";
            for(int j=arr.length-1;j>0;j--)
            {
                str+=arr[j]+".";
            }
            str+=arr[0];
            System.out.println(str);
        }
    }
}