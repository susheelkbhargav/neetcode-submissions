class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        setNoDuplicates = set()
        for num in nums :
            if num in setNoDuplicates:
                return True
            setNoDuplicates.add(num)
        return False
        