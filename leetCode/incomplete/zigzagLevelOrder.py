# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: TreeNode) -> List[List[int]]:
        res=list(list())
        temp1=list()
        temp2=list()
        temp1.append(root)
        while(len(temp1)!=0 or len(temp2)!=0):
            if(len(temp1)>0):
                res.append(temp1)
            while(len(temp1)!=0):
                if(temp1[0].left!=None):
                    temp2.append(temp1[0].left)
                if(temp1[0].right!=None):
                    temp2.append(temp1[0].right)
                temp1=temp1[1:len(temp1)]    
            # temp1.clear()
            if(len(temp2)>0):
                res.append(temp2[::-1])
            while(len(temp2)!=0):
                if(temp2[0].left!=None):
                    temp1.append(temp2[0].left)
                if(temp2[0].right!=None):
                    temp1.append(temp2[0].right)
                # temp2.clear()
                temp1=temp1[1:len(temp1)]
                
        n=len(res)
        for _ in range(n):
            temp=list()
            for i in res[_]:
                temp.append(i.val)
            res.append(temp)
            res=res[1:len(res)]

        return res
            
