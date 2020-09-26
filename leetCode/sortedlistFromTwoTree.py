# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def checkElem(self,root,res):
        if(root == None):
            return
        res.append(root.val)
        self.checkElem(root.left,res)
        self.checkElem(root.right,res)

            
    def getAllElements(self, root1: TreeNode, root2: TreeNode) -> List[int]:
        res=[]
        self.checkElem(root1,res)
        self.checkElem(root2,res)
        res.sort()
        return res
