package hh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
List<Integer> al=new ArrayList<Integer>();
List<Integer> even=new ArrayList<Integer>();
List<Integer> odd=new ArrayList<Integer>();
Scanner sc=new Scanner(System.in);
     System.out.println("How many number you want to add list");
     int count=sc.nextInt();
         for (int i = 0; i < count; i++) {
        	
			al.add(sc.nextInt());		
		}    
          System.out.println(al);

              Iterator<Integer> itr =   al.iterator();
                  while(itr.hasNext()) {
                	 int i = itr.next();
                	 
                	 if(i%2==0) {
                		even.add(i); 
                	 }else {
                		 odd.add(i);
                	 }
                  }

		System.out.println(even);
		System.out.println(odd);
	}
}
