# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    sum=0
    def sumNumbers(self, root: TreeNode) -> int:
        self.checkNode(root,0)
        return self.sum
    
    def checkNode(self,root,x):
        if(root==None):
            return
        p=(x*10)+root.val
        if(root.left==None and root.right==None):
            self.sum+=p
            return
        self.checkNode(root.left,p)
        self.checkNode(root.right,p)
