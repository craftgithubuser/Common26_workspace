package one;

public class Challenge1 {
	
	public static void main(String[] arguments) {
		int arr[]= {106,26,81,5,1};
		System.out.println("orginal array:");
		for(int i=0; i< arr.length; i++)
			System.out.println(arr[i] +"");
			int temp = 0;
		for(int i=0; i< arr.length; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[i]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j] =temp;
			}
		}
			
		}
		System.out.println("orginal array:");
			for(int i=0; i< arr.length; i++)
				System.out.println(arr[i] +"");
			
			
	}
		}
