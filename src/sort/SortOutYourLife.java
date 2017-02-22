package sort;

public class SortOutYourLife {
	public static void main(String[]args){
		int[]x={9,8,7,6,5,4,3,2,1,0};
		//int[]x={0,1,2,3,4,5,6,7,8,9};
		int[]y=new int[10];
		y=sorting.selection(x);
		for(int r = 0; r< y.length;r++){
			System.out.println(y[r]);
		}
		
	}

}
