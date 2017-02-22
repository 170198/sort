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
		for(int e = 0;e<length;e++){ //allows for all of the array to be sorted no matter how long
			for(int x = 0;x<length-1;x++){
			if(arr2[x]>arr2[x+1]){
				int f = arr2[x]; //assigns it to z in order to for the values to be switched without losing the original value
				arr2[x]=arr2[x+1];
				arr2[x+1]=f;				
			}			
		}		
		}
		return arr2;	
	}
	
	
	public static int[] insertion(int [] arr1){
		int length = arr1.length;
		int[] arr2 = new int[length];
		for(int z =0; z<length; z++){
			arr2[z]=arr1[z];
		}
		
		for(int x = 0;x<length;x++){
			for(int z = 0;z<length-1;z++){	
				if(arr2[x]<arr2[z]){
					int e = arr2[x];
					arr2[x]=arr2[z];
					arr2[z]=e;
					}
				}
			}		
		return arr2;
	}

}
