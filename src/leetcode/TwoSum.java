package leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    @Test
    public void test(){
        int nums[] = {2,7,11,15};
        int target = 9;

        int array[] = twoSum(nums,target);
        for(int arr :array){
            System.out.println(arr);
        }

        ListNode l1 = new ListNode(0);
        l1.next = new ListNode(2);

    }

    public int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }

        }
        return arr;

    }
    /*
    标签：哈希映射
    这道题本身如果通过暴力遍历的话也是很容易解决的，时间复杂度在 O(n2)
    由于哈希查找的时间复杂度为 O(1)，所以可以利用哈希容器 map 降低时间复杂度
    遍历数组 nums，i 为当前下标，每个值都判断map中是否存在 target-nums[i] 的 key 值
    如果存在则找到了两个值，如果不存在则将当前的 (nums[i],i) 存入 map 中，继续遍历直到找到为止
            如果最终都没有结果则抛出异常
    时间复杂度：O(n)
    */
    public int[] twoSum1(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    /*  题目如下：  使用链表的形式，进行两个数的相加
    给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
    如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
    您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
    示例：
    输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
    输出：7 -> 0 -> 8
    原因：342 + 465 = 807
*/

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);

        ListNode p=l1,q=l2,curr=head;   //curr做辅助节点

        int carry = 0;

        while (p!= null || q != null){
            int x = p != null ? p.val : 0;
            int y = q != null ? q.val : 0;
            int sum =  x + y + carry;
            carry = sum/10;

            curr.next = new ListNode(sum%10);  //需要在创建一个当前节点指向的下一个节点，以sum取余来建立新节点
            curr = curr.next;  //将当前节点指向当前节点的下一个节点

            if(p!=null){p=p.next;}
            if(q !=null){q=q.next;}


        }
        if(carry>0){
            curr.next = new ListNode(carry);
        }
        return head.next;

    }


}
