/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def middleNode(head: ListNode): ListNode = {
        // @annotation.tailrec
        // def recFind(s:ListNode,f:ListNode):ListNode={
        //     (s,f) match{
        //         case(f.next.next)=>s.next
        //         case(f.next)=>s
        //         case(_)=>recFind(s.next,f.next.next)
        //     }
        // }
        // recFind(head,head)
        var curNode=head
        var FasterNode=curNode
        while(FasterNode!=null && FasterNode.next!=null){
            curNode=curNode.next
            FasterNode=FasterNode.next.next
        }
        return curNode
        
    }
}