package org.institutoserpis.ed;



public class Vector {
	
	public static void main(String[] args) {
		int[] v = new int[] {16, 12, 15, 14, 17};
		
		int index = indexOf(v,12);
		System.out.println("index="+index);
		
	}
	public static int indexOf(int[] v,int x) {
//		int i= 0;
//		while(i < v.length && v[i] != 12) {
//			i++;
//			}
//		if(i== v.length) {
//			return -1;
//		}
//		return i;	
		for(int i = 0; i < v.length;i++) 
			if(v[i] == x)
				return i;
				
			return -1;
		
		
	}
	
	public static int min(int[] v) {
		int i=1, min=v[0];
		
		while(i< v.length) {// To do implementar
			if(min > v[i]) min = v[i];
			i++;
			
		}
		return min;
	}
	
	public static int indexOfMin(int[] v) {
		int i = 1; int min = v[0]; int pos = 0;
		
		while(i<v.length) { 
		if (min > v[i]) {min = v[i];
		pos = i;
		}
		i++;
		}
		

	return pos;
	}




	
	public static void sort(int[] v) {
		for(int i =0; i<v.length-1; i++) {
			for(int j = i+1; j < v.length; j++) {
				if(v[i] > v[j]) {
					int aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
		
		
				
			}
		}
	
		
		
		
	}
}
	
		

		
