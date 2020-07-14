class Solution:
    def angleClock(self, hour: int, minutes: int) -> float:
        #hrs 30:0.5
        #min 6
        hr=((hour%12)*30)+(minutes*0.5)
        mi=minutes*6
        res=hr-mi if(hr>mi) else mi-hr
        res=res if(res<360-res) else 360-res
        return res
