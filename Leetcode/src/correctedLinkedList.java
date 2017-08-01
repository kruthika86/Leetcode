import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class correctedLinkedList {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int noElements = Integer.parseInt(in.nextLine());
		String element = in.nextLine();
		
		String[] elements = element.split(" ");
		
		//Insert values
		ListNode head = new ListNode(Integer.parseInt(elements[--noElements]));
		head.next = null;
		while(noElements >0){
			
			ListNode newNode = new ListNode(Integer.parseInt(elements[--noElements]));
			
			newNode.next = head;
			head = newNode;

		}
		
		
		Set<Integer> set = new HashSet<Integer>();
		ListNode curr = head;
		ListNode prev = null;

		while(curr != null){
			
			if(set.contains(curr.x)){
				prev.next = curr.next;
				
			}
			else{
				set.add(curr.x);
				prev = curr;
				
			}
			curr = curr.next;
		}
		
		
		ListNode node = head;

		//Display
		while(node.next != null){
			System.out.print(node.x+"->");
			node = node.next;
		}
			System.out.print(node.x);

	}

}
