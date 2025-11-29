import java.util.*;
public class Candies {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        int money=sc.nextInt();
        int count=0;
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(prices[i]%5==0){
                count++;
            }else{
                list.add(prices[i]);
            }
        }

        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            if(money>=list.get(i)){
                money=money-list.get(i);
                count++;
            }else{
                break;
            }
        }
        

        System.out.println(count);
    }
    
}
