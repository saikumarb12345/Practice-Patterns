class Solution {

    void printTriangle(int n) {
        // code here
        char ch = 'A';
        for(int i=0;i<n;i++){
            
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
}

// Output:
// A
// BB
// CCC
// DDDD
// EEEEE
