# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    
    def check(self,root,mini,maxi,lvl,pos):
        if(root==None):
            return
        if(mini.get(lvl)==None or mini.get(lvl)>pos):
            mini[lvl]=pos
        if(maxi.get(lvl)==None or maxi.get(lvl)<pos):
            maxi[lvl]=pos
        
        self.check(root.left,mini,maxi,lvl+1,pos-1)
        self.check(root.right,mini,maxi,lvl+1,pos+1)
    
    def widthOfBinaryTree(self, root: TreeNode) -> int:
        mini=dict()
        maxi=dict()
        self.check(root,mini,maxi,0,0)
        max=0
        for i in mini:
            if(maxi.get(i)!=None):
                temp=maxi.get(i)-mini.get(i)
                if(temp>max):
                    max=temp
        return max
        
        
