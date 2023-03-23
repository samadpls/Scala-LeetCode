object Solution {
    def addBinary(a: String, b: String): String = {
        return (BigInt(a,2)+BigInt(b,2)).toString(2)
    }
}