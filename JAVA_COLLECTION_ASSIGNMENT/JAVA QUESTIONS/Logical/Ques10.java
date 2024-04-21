// A 
// B B 
// C C C 
// D D D D 
// E E E E E 
// F F F F F F 


class Ques10{
    public static void main(String [] args){
        int n =5;
        int i,j,k;
        int a = 65;
        for( i = 1;i<=n;i++){
            for(j= 1 ; j<= i ; j++){
                System.out.print((char)a+" ");
            }
            a++;
            System.out.println();
        } 
       
    }
}
 
