object Solution {
    def searchInsert(nums: Array[Int], target: Int): Int = {
        var start=0
        var end=nums.length-1
        while (start<=end){
            var mid= start +(end- start).toInt/2
            if (nums(mid)==target) return mid
            else if (nums(mid)<target) start=mid+1
            else end=mid-1
            
        }
        return start
    }
}