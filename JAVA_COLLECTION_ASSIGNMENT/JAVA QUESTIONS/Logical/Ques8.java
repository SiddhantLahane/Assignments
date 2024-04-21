// 1
// 10
// 101
// 1010
// 10101


class Ques8{
    public static void main(String [] args){

        int n =5;
       
        int i,j,k;

        for( i = 1;i<=n;i++){
            for(j= i ; j>= 1 ; j--){
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            System.out.println();
        } 
       
    }
}