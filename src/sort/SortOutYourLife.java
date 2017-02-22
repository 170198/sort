package sort;

public class SortOutYourLife {
	public static void main(String[]args){
		int[]x={2,3,6,7,4,8,5,1,0,9};
		//int[]x={0,1,2,3,4,5,6,7,8,9};
		int[]y=new int[10];
		y=sorting.selection(x);
		for(int r = 0; r< y.length;r++){
			System.out.println(y[r]);
		}
		y=sorting.insertion(x);
		for(int r = 0; r< y.length;r++){
			System.out.println(y[r]);
		}
		
	}

}
