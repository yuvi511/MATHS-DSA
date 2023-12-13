import java.util.*;
public class Factors {
    public static void main(String[] args){
        int n = 20;
        factors(20);
    }

    public static void factors(int n){
        ArrayList<Integer> list = new ArrayList<>(); 
        for(int i = 1;i*i<=n;i++){
            if(n%i == 0){
                //print statement stores the number in ascending order(ex:20%2 == 0) 
                System.out.print(i+" ");

                //list.add() stores the number in descending order(ex : 20/2 == 10)
                list.add(n/i);
            }
        }
        //therefore we start iterating from list.size()-1 to start from the ascending order of the decreasing list
        for(int j = list.size() - 1;j>=0;j--){
            System.out.print(list.get(j)+" ");
        }
    }
}
