import java.util.*;

public class Water {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int heights[]=new int[n];
        for(int i=0;i<n;i++){
            heights[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        int minarea=0;
        while(left<right){
            int height=Math.min(heights[left],heights[right]);
            int width=right-left;
            int area=height*width;
            minarea=Math.max(minarea, area);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }


        
    }

    
}
