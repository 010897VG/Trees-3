// Time Complexity : O(2^n)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution{
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null) return new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        LinkedList<Integer> nodes = new LinkedList<>();
        int sum = root.val;
        nodes.add(root.val);
        DFS(root, result, nodes, sum, targetSum);
        return result;
    }

    private void DFS(TreeNode node, List<List<Integer>> result, LinkedList<Integer> nodes, int sum,int targetSum) {
        if(node.left == null && node.right == null && sum == targetSum) {
            result.add(new LinkedList<>(nodes));
            return;
        }

        if(node.left != null) {
            nodes.add(node.left.val);
            DFS(node.left, result, nodes, sum + node.left.val, targetSum);
            // backtracking
            nodes.removeLast();
        }

        if(node.right != null) {
            nodes.add(node.right.val);
            DFS(node.right, result, nodes, sum + node.right.val, targetSum);
            // backtracking
            nodes.removeLast();
        }
    }
}



// Your code here along with comments explaining your approach