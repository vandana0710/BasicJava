package basic;

public class MyTwoDimentionalArray {
	
	
		public static void main(String args[]){  
			
//			int array11[][] = new int [10][14];
//			array11[0][0]=10
			//declaring and initializing 2D array  
			int arr[][]={{1,9,3}, 
					     {2,8,5},
					     {4,4,5}, 
					     {0,8,7}};  
			
			System.out.println("printing array = "+ arr[1][1]);
			//printing 2D array  
			for(int i=0;i<4;i++){  
				 for(int j=0;j<3;j++){  
				   System.out.print(arr[i][j]+" ");  
				 }  
			 System.out.println();  
			}  
		  
		}

}
