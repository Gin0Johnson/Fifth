package Helloo;

import java.io.FileOutputStream;

public class A {
	public static void main(String args[]){    
		try{    
		
		             FileOutputStream fout=new FileOutputStream("D:\\Gino.txt");    
		             fout.write(65);    
		             fout.close();    
		             System.out.println("successfully placed");    
		            } catch(Exception e){System.out.println(e);}    
		      }   
}