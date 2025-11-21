public class Reverse {
    public static void main(String args[]){
        String s="Omkar";
        String reversedString="";
        for(int i=s.length()-1;i>=0;i--){
            reversedString=reversedString + s.charAt(i);
        }

        System.out.println("Reversed Number: " + reversedString);
    }
}
