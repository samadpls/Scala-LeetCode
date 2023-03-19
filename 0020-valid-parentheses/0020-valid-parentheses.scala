import scala.collection.mutable.Stack
object Solution {
    def isValid(s: String): Boolean = {
      val mapp= Map(
          '('->')',
          '{'->'}',
          '['->']'
        )
      val stack= new Stack[Char]()
      s.foreach{
        case i if mapp.keySet.contains(i)=> stack.push(i)
        case _ if stack isEmpty=> return false
        case i if ! mapp.get(stack.pop()).contains(i)=> return false
        case _ =>

      }
      stack.isEmpty
        
    }
}
