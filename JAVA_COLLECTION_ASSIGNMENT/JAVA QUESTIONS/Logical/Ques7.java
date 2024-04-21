// 10101
// 01010
// 10101
// 01010
// 10101



class Ques7{
    public static void main(String [] args){

        int n =5;
       
        int i,j,k;

        for( i = 1;i<=n;i++){
            for(j= 1 ; j<= n ; j++){
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