public class LCM {
    public static void main(String[] args) {
        int a = 9;
        int b = 18;
        int lcm = lcm(a,b);
        System.out.println(lcm);

    }

    public static int hcf(int a,int b){
        if(a == 0){
            return b;
        }

        return hcf(b%a,a);
    }

    public static int lcm(int a,int b){
        int gcd = hcf(a,b);
        return (a*b)/gcd;
    }
}
