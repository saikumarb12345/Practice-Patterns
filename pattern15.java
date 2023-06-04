class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=n;i>0;i--){
            
            for(char j='A';j<i+'A';j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
// Output:
// ABCDE
// ABCD
// ABC
// AB
// A