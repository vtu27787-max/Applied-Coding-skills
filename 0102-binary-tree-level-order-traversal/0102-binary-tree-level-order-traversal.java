class Solution {
    public java.util.List<java.util.List<Integer>> levelOrder(TreeNode root) {

        java.util.List<java.util.List<Integer>> ans = new java.util.ArrayList<>();

        if (root == null) {
            return ans;
        }

        java.util.Queue<TreeNode> q = new java.util.LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            int size = q.size();

            java.util.List<Integer> level = new java.util.ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                level.add(node.val);

                if (node.left != null) {
                    q.offer(node.left);
                }

                if (node.right != null) {
                    q.offer(node.right);
                }
            }

            ans.add(level);
        }

        return ans;
    }
}