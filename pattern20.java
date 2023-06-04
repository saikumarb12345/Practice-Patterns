
class Solution {

    void printTriangle(int n) {
        // code here
        int spaces = 2*n-2;
        for(int i=1;i<=2*n-1;i++){
            // stars
            int star = i;
            if(i>n) star = 2*n-i;
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            // spaces
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) spaces -= 2;
            else spaces += 2;
        }
    }
}
// Output:
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *
