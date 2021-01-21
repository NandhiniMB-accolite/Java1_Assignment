package assignment.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Sort {
	
	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		
		for(int i=0;i<10;i++)
		{
			int a= s.nextInt();
			l.add(a);
		}
		
		l.stream().sorted().forEach(System.out::println);
		
		
	}
	

}
