import java.util.Stack;

/**
 * Created by name on 2016/6/14.
 */
public class StackToQueue {
    public static class MList<T>{
        private Stack<T> stack1 = new Stack<>();
        private Stack<T> stack2 = new Stack<>();
        public  MList(){

        }
        public void addTail(T t){
            stack1.add(t);
        }
        public T removeHead(){
            if(stack2.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.add(stack1.pop());
                }
            }
            if(stack2.isEmpty()){
                throw new RuntimeException("No more elements");
            }
            return stack2.pop();
        }
    }
    public static void main(String[] args){
        MList mList = new MList();
        mList.addTail(1);
        mList.addTail(2);
        mList.addTail(3);
        mList.removeHead();
        for (int i = 0; i < mList.stack2.size(); i++) {
            System.out.println(mList.stack2.elementAt(i));
        }
    }
}
