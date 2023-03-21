object Solution {
    def lengthOfLastWord(s: String): Int = {
        val ss= s.split(" ")
        return ss(ss.length-1).length
    }
}