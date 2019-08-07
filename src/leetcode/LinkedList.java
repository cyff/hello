package leetcode;

public class LinkedList {

    class ListNode1{
        Object val;
        ListNode1 next =null;

    }
   private ListNode1 header = null;
    /**
     * 初始化链表
     * */
    void initList()
    {
        header = new ListNode1();
        header.val = null;
        header.next = null;
    }
    void insertList(Object o)
    {
        ListNode1 e=new ListNode1();
        e.val=o;
        if(header.next==null)//第一次插入元素
        {
            header.next=e;
        }else//不是第一次插入元素
        {
            //temp引用在栈中，temp和header引用都指向堆中的initList()中new的Element对象
            ListNode1 temp = header;
            while(temp.next!=null)//寻找最后一个元素
            {
                temp=temp.next;
            }
            temp.next=e;
        }
    }
}
