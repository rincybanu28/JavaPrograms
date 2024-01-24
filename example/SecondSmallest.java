package example;

public class SecondSmallest {

	public static int getSecondSmallest(int[] arr, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (arr[i] > arr[j])   
		                {  
		                    temp = arr[i];  
		                    arr[i] = arr[j];  
		                    arr[j] = temp;  
		                }  
		            }  
		        }  
		       return arr[1];//2nd element because index starts from 0  
		}  
		public static void main(String args[]){  
		int arr[]={23, 45, 32, 22, 20, 96};   
		//System.out.println("23, 45, 32, 22, 20, 96");
		System.out.println(getSecondSmallest(arr,6));  
		}
		
}  



