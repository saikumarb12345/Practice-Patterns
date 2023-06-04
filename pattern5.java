class Solution {

    void printTriangle(int n) {
        for(int i=0;i<n;i++){

            for(int j=n;j>i;j--){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

// output:-
// * * * * *
// * * * * 
// * * * 
// * *  
// * 