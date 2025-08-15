package july_27th;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }

    /**
     *
     * @param n number to check isPrime
     * @return boolean
     * n = a*b; a>sqrt(n) and b>sqrt(n) then a*b>n which is impossible so
     * there must be one factor which will be less than sqrt(n) if another is bigger
     */
    public static boolean isPrime(int n){
        if(n<1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    /**
     * find all the prime numbers from 1 to N
     */

}
