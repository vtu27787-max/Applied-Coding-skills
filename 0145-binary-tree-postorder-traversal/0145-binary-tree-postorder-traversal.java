class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)return ans;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode cur=st.pop();
            ans.add(cur.val);
            if(cur.left!=null)st.push(cur.left);
            if(cur.right!=null)st.push(cur.right);
        }
        Collections.reverse(ans);
        return ans;
    }
}