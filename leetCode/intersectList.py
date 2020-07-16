class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        res=list()
        i=0
        while(i<len(nums1)):
            if(nums1[i] in nums2):
                res.append(nums1[i])
                nums2.remove(nums1[i])
                nums1.remove(nums1[i])
                
            else:
                i+=1
        return res
