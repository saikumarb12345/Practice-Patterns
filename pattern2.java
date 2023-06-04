
class Solution {

    public static void main(String[] args){
        int n = 4;
        printTriangle(n);
     }
    static void printTriangle(int n) {
        // j should for i times
        for(int i=0;i<n;i++){

            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
// output:-

// * 
// * * 
// * * * 
// * * * * 
// * * * * *