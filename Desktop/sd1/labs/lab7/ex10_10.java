/**
   * file: ex10_10.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 7, ex10_10
   * due date: April 20th, 2017
   * version: 1.0
   */
public class ex10_10 {
  public static void main(String[] args){
    Queue queue = new Queue();
    for (int i=1; i <= 20; i++){
    queue.enqueue(i);
    }
    while (!queue.empty()){
    System.out.print(queue.dequeue() + " ");
    }
    System.out.println();
    }
  }