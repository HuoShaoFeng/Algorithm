package Problem30;

import java.util.Stack;

public class StackWithGetMin {

    private Stack<Integer> dataStack;   //�洢���ݵ�ջ
    private Stack<Integer> minStack;    //�洢��Сֵ��ջ

    public StackWithGetMin(){
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public int getMin(){
        if (minStack.isEmpty())
            throw new RuntimeException("The Stack is empty....");
        else
            return minStack.peek(); //��ȡջ��Ԫ�ص�ֵ��������ջ

    }

    public void push(int num){
        //��dataStack���в���
        dataStack.push(num);

        //��minStack����
        if (minStack.isEmpty())
            minStack.push(num);
        else if (num <= getMin())
            minStack.push(num);

    }

    public int pop(){
        int value = dataStack.pop();//dataStack������ջ

        if (minStack.isEmpty())
            throw new RuntimeException("The Stack is empty....");

        if (value == getMin())//minStack����������ȵ�����²ų�ջ
            minStack.pop();
        return value;
    }

}
