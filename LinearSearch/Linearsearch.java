package LinearSearch;
public class Linearsearch{
    public static void main(String[] args) {
        int[] nums = {4, 5, 12, 90, 34, 67, 34};
        System.out.println(linearsearch(nums, 34));
    }
    // search in that array, return the index
    // return -1 if item does not exist
    static int linearsearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]==target){
                return index;
            }
        }
        // if element not found
        return -1;
    }
}