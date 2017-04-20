/**
   * file: Queue.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 7, ex10_10
   * due date: April 20th, 2017
   * version: 1.0
   */
public class Queue {
  private int [] elements;
  private int size;
  public static final int DEFAULT_CAPACITY =8;
  Queue(){
    elements= new int[DEFAULT_CAPACITY];	
  }
  public void enqueue(int v) {
    if (size >= elements.length) {
      int [] temp= new int[elements.length *2];
	  System.arraycopy(elements, 0, temp, 0, elements.length);
	  elements= temp;
	}
	elements[size++] = v;
  }
  public int dequeue(){
    int v= elements[0];
	int[] temp = new int[elements.length];
	System.arraycopy(elements, 1, temp, 0, size);
	elements = temp;
	size--;
	return v;
  }
  public boolean empty(){
    return size ==0;
  }
  public int getSize() {
    return size;
  }
}