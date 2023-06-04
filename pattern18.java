class Solution {

    void printTriangle(int n) {
        // code here
        char mch = (char)('A'+n-1);
        for(int i=0;i<n;i++){
            
            for(char ch=mch;ch>=(char)(mch-i);ch--){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
// Output:
// E
// E D
// E D C
// E D C B
// E D C B A