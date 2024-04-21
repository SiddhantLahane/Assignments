// 1 
// 2 1 
// 3 2 1 
// 4 3 2 1 
// 5 4 3 2 1


class Ques6{
    public static void main(String [] args){

        int n =5;
       
        int i,j,k;

        for( i = 1;i<=n;i++){
            for(j= i ; j>= 1 ; j--){
                System.out.print(j+" ");
            }

            System.out.println();
        } 
       
    }
}