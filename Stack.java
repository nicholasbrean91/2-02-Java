import java.util.ArrayList;
public class Stack {
	private final ArrayList<Integer> list = new ArrayList<Integer>();
	
	public void push(int num) {
		list.add(num);
	}		
	public void pop(int num) {
		list.remove(num);
	}
	public void print() {
		System.out.print(list);
	}
}
