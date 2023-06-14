public class Sum_of_array {
    public static void main(String[] args) {
        int[] price = {2,3,4,5,6,9};
        System.out.println(sum(price));
        
    }
    static int sum(int[] arr){
        int res = 0;
        for(int num: arr){
            res = res+num;
        }
        return res;
    }
}
