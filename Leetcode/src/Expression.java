import java.util.Scanner;
import java.util.Stack;

public class Expression {
public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	String expression = in.nextLine();
	Stack s = new Stack();
	char[] array = expression.toCharArray();
	int count = 0;

	if((array.length%2) != 0){
		System.out.println("-1");
	}
	else{
		for(char ch: array){
		switch(ch){
		case '{':
			s.push('{');
			break;
		case '}':
			if(s.isEmpty()){
				s.push('{');
				count++;
			}
			else
				s.pop();
			break;
		}
	}
		if(!s.isEmpty()){
			count += s.size()/2;
		}
		System.out.println(count);
	}
	
}
}

