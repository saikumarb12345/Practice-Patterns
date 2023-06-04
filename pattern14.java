class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            
            for(char s='A';s<='A'+i;s++){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
// Output:
// A
// AB
// ABC
// ABCD
// ABCDE