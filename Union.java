import java.util.*;

class Union {
    public static void main(String args[]) {
        int N = 5;
        int M = 5;
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 3, 6, 7};
        
        Solution obj = new Solution();
        ArrayList<Integer> res = obj.findUnion(arr1, arr2, N, M);
        
        for (int i = 0; i < res.size(); i++)
            System.out.print(res.get(i) + " ");
        System.out.println();
    }
}

// User function Template for Java

// arr1, arr2 : the arrays
// n, m: size of arrays
class Solution {
    public ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        Set<Integer> st = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            st.add(arr1[i]);
        }
        
        for (int i = 0; i < m; i++) {
            st.add(arr2[i]);
        }
        
        ArrayList<Integer> res = new ArrayList<>(st);
        
        Collections.sort(res);
        
        return res;
    }
}
