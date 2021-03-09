//https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1
class Solution {
    int height(Node root) {
       if(root==null)
       return 0;
       int s = height(root.left);
       int p = height(root.right);
       int h = Math.max(s,p);
       return h+1;
    }
}
