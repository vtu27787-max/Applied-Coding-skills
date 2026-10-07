class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode cur=q.poll();
                if(i==n-1)ans.add(cur.val);
                if(cur.left!=null)q.offer(cur.left);
                if(cur.right!=null)q.offer(cur.right);
            }
        }
        return ans;
    }
}