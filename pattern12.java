
class Solution {

    void printTriangle(int n) {
        // code here
        int spaces = 2*(n-1);
        
        for(int i=1;i<=n;i++){
            // numbers
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            // spaces
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            // numbers
            for(int j=i;j>=1;j--){
                System.out.print(" "+j);
            }
            
           System.out.println();
           spaces -=2;
        }
    }
}
// output:-
// 1                 1
// 1 2             2 1
// 1 2 3         3 2 1
// 1 2 3 4     4 3 2 1
// 1 2 3 4 5 5 4 3 2 1