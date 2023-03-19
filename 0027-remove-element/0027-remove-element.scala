object Solution {
    def removeElement(nums: Array[Int], `val`: Int): Int = {
        var result= nums.filter(_ !=`val`)
        for (i<- 0 until result.length){
            nums(i)=result(i)
        }
          return result.length
    }
}