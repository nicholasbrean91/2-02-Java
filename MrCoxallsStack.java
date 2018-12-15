//Created By: Nicholas Brean
//Created On: October 2018
//Created to add a number to a stack

import java.util.Scanner;
public class MrCoxallsStack {
	public static void main(String args[]){
	Scanner userInput = new Scanner(System.in);
	Stack stackNum = new Stack();
	
	do{
	System.out.println("Enter a number to be placed on the Stack");
	int userNum = userInput.nextInt();
	if (userNum >= 0){
		stackNum.push(userNum);
	}else if (userNum == -1){
		stackNum.pop(1);
	}else{
		break;
	}
		

	stackNum.print();
	
	}while(true);
	
 }
}
	
