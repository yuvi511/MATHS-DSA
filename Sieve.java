class Sieve{
    public static void Sieve(int n,boolean[] primes){
        //loop from 2 to Number sqrt(N) becoz after the sqrt(N) the number keeps getting repeated
        for(int i = 2;i*i<=n;i++){
            //if marked as false then mark it's multiples as true if not marked before therefole true = not prime
            //and false=prime
            if(!primes[i]){
                for(int j=i*2;j<=n;j=j+i){
                    if(!primes[j]){
                        primes[j] = true;
                    }


                }
            }
        }
        // print all the unmarked numbers i.e the numbers that are false
        for(int k = 2;k<=n;k++){
            if(!primes[k]){
                System.out.print(k+" ");
            }
        }
    }


    public static void main(String[] args){
        int n = 40;
        boolean[] primes = new boolean[n+1];
        Sieve(n,primes);
    }
}