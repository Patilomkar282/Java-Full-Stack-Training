import java.util.*;

class AgeNotEligibleException extends Exception{
    AgeNotEligibleException(String message){
        super(message);
    }
}


public class UserdefineException {

    static void checkAge (int age) throws AgeNotEligibleException {
        if(age<18){
            throw new AgeNotEligibleException("You are not eligible for the voting");
        }else{
            System.out.println("You are eligible");
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        try{
            checkAge(age);
        }
        catch(AgeNotEligibleException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Done with the exaception");
        }
    }
    
}
