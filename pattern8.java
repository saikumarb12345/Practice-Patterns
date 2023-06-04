class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*n-(2*i+1);k++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
// output:-
// *********
//  *******
//   *****
//    ***
//     *