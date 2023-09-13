package Exceptions.StudentChallenge;

public class Stack {

    private int A[];

    private int top = -1;

    private int sz;

    Stack(int size) {

        sz = size;

        A = new int[sz];
    }

    public void push(int number) throws StackOverFlow {

        if (top == sz - 1) {

            throw new StackOverFlow();
        } else {
            top++;
            A[top] = number;
            
        }

        System.out.println("The elements in the array are : ");

        for (int i = 0; i < A.length - 1; i++) {

            System.out.println(A[i]);
        }
    }

    public void pop() throws StackUnderFlow {

        if (top < 0) {

            throw new StackUnderFlow();
        } else {

            A[top]= -1;
            top--;
        }

        System.out.println("The elements in the array after pop are : ");

        for (int i = 0; i < A.length - 1; i++) {

            System.out.println(A[i]);
        }
    }

}
