class Operations {
    int result =0;
    void add(int a, int b){
        result = a + b;
        System.out.println("Addition: " + result);
    }


    void average(){
        float avg= (float) result/2f; //type casting 
        System.out.println("Average: " + avg);


    }
}

public class Math {
    public static void main(String[] args) {
        Operations op = new Operations();
        op.add(10,20);
        op.average();
        
    }
}
