//stack with scanner
import java.util.Scanner;

class mystack{
	private int arr[];
	private int top;
	private int capactiy;
	
	mystack(int size){
		arr=new int[size];
		capactiy=size;
		top=-1;
	}
	
	public void push(int x){
		if(isFull()){
			System.out.println("Stack overflow");
			System.exit(1);
		}
		System.out.println("inserting"+x);
		arr[++top]=x;
	}
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			System.exit(1);
		}
		return arr[top--];
	}
	public int getsSize(){
		return top+1;
	}
	
	public Boolean isEmpty(){
		return top==1;
	}
	public Boolean isFull(){
		return top==capactiy-1;
	}
	public void printstack(){
		for(int i=0; i<=top; i++){
			System.out.println(arr[i]+",");
		}
	}
}
	public class cop{
		public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		
		mystack stack=new mystack(5);
		
		int one=obj.nextInt();
		int two=obj.nextInt();
		int three=obj.nextInt();
		int four=obj.nextInt();
		stack.push(one);
		stack.push(two);
		stack.push(three);
		stack.push(four);
		System.out.println("stack");
		stack.printstack();
		stack.pop();
		System.out.println("after poping out");
		stack.printstack();
		
		}
		}