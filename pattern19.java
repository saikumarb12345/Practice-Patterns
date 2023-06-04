class Solution {

    void printTriangle(int n) {
        // code here
        int inis = 0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            // Spaces
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            inis += 2;
            System.out.println();
        }
        inis = 2*n-2;
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // Spaces
            for(int j=0;j<inis;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            inis -= 2;
            System.out.println();
        }
    }
}

// Output:
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********