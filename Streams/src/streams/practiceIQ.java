package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class practiceIQ {

	//print only unique/non repetative number from array
	public static void main(String[] args) {
		// TODO Auto-generated method 
		int a[]={1,2,3,4,1,2} ;
		
		List<Integer> ls = Arrays.asList(1,2,3,4,1,2);
		
		List<Integer> ls1=	ls.stream().filter(e->Collections.frequency(ls, e)<2).collect(Collectors.toList());
		System.out.println(ls1);
	
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();

	
		for (int i :a) {
			if(hs.containsKey(i)) {
		 
				hs.put(i,hs.get(i)+1);

		}else {
		        
			hs.put(i,1);
		
		} }
			
			for(int i=0;i<a.length;i++)
			{
				if (hs.get(a[i])==1) {
					
					System.out.print(" "+a[i]);
				}
				
			}
		


		 }}
		
		
	


//		for(int i=0;i<a.length;i++)
//		{
//		   for (int j=i+1;j<a.length;j++)
//		 {
//		         if(a[i]==a[j])
//		{
//		         System.out.println(a[i]);
//
//		}else {
//			
//			//    System.out.println(a[j]);
//		}

	


