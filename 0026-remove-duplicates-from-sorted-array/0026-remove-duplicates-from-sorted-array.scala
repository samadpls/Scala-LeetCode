object Solution {
    def removeDuplicates(nums: Array[Int]): Int = {
        var result=nums.distinct
        result.zipWithIndex.foreach{
            case(value,idx)=>nums(idx)=value
        }
        result.length
        
    }
}