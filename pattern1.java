class Solution {
     
     public static void main(String[] args){
        int n = 4;
        printSquare(n);
     }

   static void printSquare(int n) {
        // code here
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
// output:-
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *