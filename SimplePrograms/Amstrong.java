public class Amstrong {
    public static void main(String[] args) {
       for (int i = 0; i < 1000; i++) {
            if(isAmstrong(i)){
                System.out.println(i);
            }
       }
    }
    static boolean isAmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        } 
        if (original == sum){
            return true;
        }else{
            return false;
        }
    }
}
//hi how are you? 
//i am fine! do you know what? i am an alien. so, i will eat you now.
//okay! fine by me! you can eat me. where are you going to start?
//and i forgot to say something! before you taste me, can i taste you a bit?
//what? hey!! who the heck are you?
//i am just an innocent humanbeing! lol!