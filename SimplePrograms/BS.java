import java.util.*;

public class BS{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number to be searched :");
		int target = in.nextInt();
		int[] arr = {2,3,5,14,23,34,56,67,90,101};
		System.out.println(binarysearch(arr, target));
	}
	static int binarysearch(int[] arr, int target){
	int start = 0;
	int end = arr.length -1;
	
	while(start<=end){
		int mid = start + (end - start)/2;
		if (arr[mid] > target){
			end = mid -1;
			}
		else if(arr[mid] < target){
			start = mid + 1;
			}
		else{
			return mid;
			}
		}
		return -1;
	}
}
//https://www.youtube.com/watch?v=F4Zu5ZZAG7I
