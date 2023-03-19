object Solution {
    def strStr(haystack: String, needle: String): Int = {
        if (haystack.contains(needle)){
            return haystack.indexOf(needle)
        }
        return -1
        
    }
}