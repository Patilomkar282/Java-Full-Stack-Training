public class Patterns {
    public static void main(String args[]){
        // for(int i=0;i<4;i++){
        //     System.out.print("*");
        // }
        //Q2)4*4 pattern
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<4;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Q3)pyramid numeric pattern
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Q4) print the tables

        for(int i=2;i<=9;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i + " x " + j + " = " + (i*j) );
            }
            System.out.println("----------------------------");
        }





    }
}
