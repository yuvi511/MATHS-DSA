public class HCF {
    public static void main(String[] args){
        int a = 14;
        int b = 28;
        int x = hcf(a,b);
        System.out.println(x); 
    }

    public static int hcf(int a,int b){
        if(a == 0){
            return b;
        }

        return hcf(b%a,a); //recursive call according to euclidean theorem
    }
    
}
