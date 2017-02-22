package sort;

public class sorting {
	public static int[] selection(int [] arr1){
		int length = arr1.length;
		int[] arr2 = new int[length];
		for(int z =0; z<length; z++){
			arr2[z]=arr1[z];
		}
		//for(int r = 0; r<arr2.length;r++){
			//System.out.println(arr2[r]);
		//}
		for(int e = 0;e<length;e++){
			for(int x = 0;x<length-1;x++){
			if(arr2[x]>arr2[x+1]){
				int z = arr2[x];
				arr2[x]=arr2[x+1];
				arr2[x+1]=z;
				
			}
			
		}
		
		}
		return arr2;
	
		
	}

}
