
Time Complexity : O(N);
Space Complexity :O(N);
Did it run on leetcode: yes



class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return helper(root.left,root.right);


    }

    public boolean helper(TreeNode N1, TreeNode N2){
        if(N1 == null && N2 == null)
            return true;
        if(N1 == null || N2 == null || N1.val != N2.val)
            return false;
        return helper(N1.left,N2.right) && helper(N1.right,N2.left);


    }
}