public class BubbleSort{
	public static void main(String[] args){
		long[] arr = {1, 6, 2, 8, 3, 78, 0};
		
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-1-i; j++){
				if(arr[j] >= arr[j+1]){
					long tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}