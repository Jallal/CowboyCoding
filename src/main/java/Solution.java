public class Solution {
	
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode nodesSum = new ListNode();
		int i = getTheSumValues(l1) + getTheSumValues(l2);
		System.out.println("The first sum "+ getTheSumValues(l1)+"\n");
		System.out.println("The 2nd sum " +getTheSumValues(l2)+"\n");
		System.out.println("The total sum " +i+"\n");
		return nodesSum;
	}
	
	
	public int getTheSumValues(ListNode l1){
		
		int counter = linlistSize(l1);
		int sum =0;
		while(l1.getListNode()!=null) {
			//System.out.println("First values are : " + l1.value + "    " + (Math.pow (10,counter)) + " Counter " + counter + "  "+(l1.value)*(Math.pow (10,counter))+"\n");
			sum+=(l1.value)*(Math.pow (10,counter));
			l1 = l1.getListNode();
			counter--;
		}
		//System.out.println("First values are : " + l1.value + "    " + (Math.pow (10,counter)) + " Counter " + counter + "  "+(l1.value)*(Math.pow (10,counter))+"\n");
		sum+=(l1.value)*(Math.pow (10,counter));
		counter--;
		return sum;
	}
	
	public int linlistSize(ListNode l){
		int size =0;
		while(l.getListNode()!=null){
			l = l.getListNode();
			size++;
		}
		size++;
		return size;
	}
	
}
