import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int noElements = Integer.parseInt(in.nextLine());
		String element = in.nextLine();
		String swapEle = in.nextLine();
		String[] elements = element.split(" ");
		String[] swapVar = swapEle.split(" ");
		
		ListNode head = new ListNode(Integer.parseInt(elements[--noElements]));
		head.next = null;
		while(noElements >0){
			
			ListNode newNode = new ListNode(Integer.parseInt(elements[--noElements]));
			
			newNode.next = head;
			head = newNode;

		}
		
		
		ListNode prevXNode=null, prevYNode=null;
		ListNode xNode = head, yNode=head;
		
		while(xNode != null && xNode.x != Integer.parseInt(swapVar[0])){
			prevXNode = xNode;
			xNode = xNode.next;
			
		}
		

		while(yNode !=null && yNode.x != Integer.parseInt(swapVar[1])){
			prevYNode = yNode;
			yNode = yNode.next;
		}
		
		if(yNode == null || xNode == null) 
			return;
		
		if(prevXNode != null)
			prevXNode.next = yNode;
		else
			head = yNode;
		
		if(prevYNode != null)
			prevYNode.next = xNode;
		else
			head = xNode;
		
		
		ListNode temp = yNode.next;
		yNode.next = xNode.next;
		xNode.next = temp;
		
		ListNode curr = head;
		
		//Display
		while(curr.next != null){
			System.out.print(curr.x+"->");
			curr = curr.next;
		}
			System.out.print(curr.x);
		
	}

}
