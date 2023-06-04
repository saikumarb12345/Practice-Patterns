class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            // for spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            // for starts
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            // for spaces
            for(int l=0;l<n-i-1;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
// output:-
//     *
//    ***  
//   *****
//  *******
// *********