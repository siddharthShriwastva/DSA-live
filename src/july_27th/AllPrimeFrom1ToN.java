package july_27th;

public class AllPrimeFrom1ToN {
    public static void main(String[] args) {
        int n=100;
        for(int i=2;i<=n;i++){
            if(!getAllPrime(100)[i]){
                System.out.println(i);
            }
        }
    }

    /**
     * sieve of Eratosthenes
     * todo j can also be started from i*i why?
     */
    public static boolean[] getAllPrime(int n){
        boolean[] mark = new boolean[n+1];
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                for(int j=i+i;j<=n;j=j+i){
                    mark[j]=true;
                }
            }
        }
        return mark;
    }

    public static boolean isPrime(int n){
        if(n<1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
