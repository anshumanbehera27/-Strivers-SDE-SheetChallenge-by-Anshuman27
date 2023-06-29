package stack;

public class implimentStackUsingArray {
    // declered the class
    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(5);
        s.push(3);
        s.push(6);


    }






}
class  Stack{
  int[] arr  = new int[5];
 int top  = -1 ;

 void push(int x){
     arr[++top] = x ;

}
int pop(){
  top--;
  return arr[top];
 }
 int peek(){
     return arr[top];
 }
  int size(){
     return  top +1 ;
 }
 boolean isempty(){
     return (top == -1 );
 }
}
