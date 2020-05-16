package leetcode;

public class ValidateBinaryTree {

	public static void main(String[] args) {
		/*\
		 * /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 
class Solution {
    public boolean isValidBST(TreeNode root) {
        return valid(root,Integer.MAX_VALUE,true);
    }
    public boolean valid(TreeNode node,int temp,boolean lvar)
    {
        if(node==null)
            return true;
        if(lvar&&temp!=Integer.MAX_VALUE&&node.val>temp)
            return false;
        if(!lvar&&node.val<temp)
            return false;
        if(temp==node.data)
            return false;
        boolean lans=valid(node.left,node.val,true);
        boolean rans=valid(node.right,node.val,false);
        return lans&rans;
    }
}

		 * 
		 * 
		 * 
		 */
	}

}