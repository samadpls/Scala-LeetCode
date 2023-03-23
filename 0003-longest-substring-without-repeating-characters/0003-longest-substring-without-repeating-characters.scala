import scala.collection.mutable._
object Solution {
    def lengthOfLongestSubstring(s: String): Int = {
        var l,m=0
      
        var dic=Map[Char,Int]()
        (s.zipWithIndex).foreach{
            case(c,i) if (!dic.contains(c))=> dic(c)= i; m= math.max(m,i-l+1)
            case(c,i) if (dic.contains(c) && dic(c)<l) =>dic(c)=i; m= math.max(m,i-l+1)
            case (c,i) => 
                l=dic(c)+1
                dic+=(c->i)
           m= math.max(m,i-l+1)
        }
       m
        
    }
}