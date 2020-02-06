/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author P.Sethi
 */
import java.io.*; 
public class twinPrime {
static void TwinPrime(int n) 
{ 
boolean prime[] = new boolean[n + 1]; 
for (int i = 0; i <= n; i++) 
prime[i] = true; 

for (int a = 2; a * a <= n; a++) { 
			
if (prime[a] == true) { 			
for (int i = a * 2; i <= n; i += a) 
prime[i] = false; 
} 
} 

for (int i = 2; i <= n - 2; i++) { 

if (prime[i] == true && 
prime[i + 2] == true)  
System.out.println(" (" + i + ", " +(i + 2) + ")"); 
} 
} 

public static void main(String args[]) 
{ 
int n = 100; 
TwinPrime(n); 
} 
}



