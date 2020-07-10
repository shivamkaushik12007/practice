"""
# Definition for a Node.
class Node:
    def __init__(self, val, prev, next, child):
        self.val = val
        self.prev = prev
        self.next = next
        self.child = child
"""

class Solution:
    def doingFlatten(self,head,arr):
        temp=head
        while(temp!=None):
            arr.append(temp.val)
            if(temp.child!=None):
                self.doingFlatten(temp.child,arr)
            temp=temp.next
    
    def flatten(self, head: 'Node') -> 'Node':
        arr=list()
        self.doingFlatten(head,arr)
        # print(arr)
        if(len(arr)==0):
            return None
        res=Node(arr[0],None,None,None)
        temp=res
        for i in range(1,len(arr)):
            tp=Node(arr[i],temp,None,None)
            temp.next=tp
            temp=temp.next
            
        return res
        
