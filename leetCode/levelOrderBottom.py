# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrderBottom(self, root: TreeNode) -> List[List[int]]:
        if(root==None):
            return []
        res=[]
        arr1=[]
        arr2=[]
        arr1.append(root)
        res.append(arr1)
        while(len(arr1)!=0 or len(arr2)!=0):
            while(len(arr1)!=0):
                if(arr1[0].left!=None):
                    arr2.append(arr1[0].left)
                if(arr1[0].right!=None):
                    arr2.append(arr1[0].right)
                arr1=arr1[1:len(arr1)]
            if(len(arr2)!=0):
                res.append(arr2)
            while(len(arr2)!=0):
                if(arr2[0].left!=None):
                    arr1.append(arr2[0].left)
                if(arr2[0].right!=None):
                    arr1.append(arr2[0].right)
                arr2=arr2[1:len(arr2)]
            if(len(arr1)!=0):
                res.append(arr1)
                
        result=[]
        for i in reversed(res):
            temp=[]
            for j in i:
                temp.append(j.val)
            result.append(temp)
        return result
