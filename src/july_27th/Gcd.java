package july_27th;

public class Gcd {
    public static void main(String[] args) {
        System.out.println(getGCD(60,36));
        System.out.println(getGCDEuclideanAlgo(60,36));
    }

    /**
     * approach 1
     * @param a first number
     * @param b second number
     * @return gcd
     * TC - O(min(a,b))
     *
     */
    public static int getGCD(int a, int b){
        int result = Math.min(a,b);
        while(result>0){
            if(a%result==0 && b%result==0){
                break;
            }
            result--;
        }
        return result;
    }

    /**
     *
     * @param a first number
     * @param b second number
     * @return gcd
     * GCD(a,b) if(a=0) then b
     *          else if(b=0) then a
     *
     * TC O(log(min(a,b))
     */
    public static int getGCDEuclideanAlgo(int a, int b){
        if(b==0) return a;
        return getGCDEuclideanAlgo(b,a%b);
    }
    //    dry run
}
