class Solution:
    def numberOfSteps(self, num: int) -> int:
        count=0
        while True:
            if num==0:
                break
            elif num%2==0:
                num/=2
            elif num==0:
                break
            else:
                num-=1
            count+=1
        return count
            
        