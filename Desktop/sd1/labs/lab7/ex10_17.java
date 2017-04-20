/**
   * file: ex10_17.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 7, ex10_17
   * due date: April 20th, 2017
   * version: 1.0
   */
import java.math.BigInteger;
public class ex10_17{
  public static void main(String[] args){
    BigInteger i= new BigInteger(Long.MAX_VALUE + " ");
    BigInteger end= i.add(new BigInteger("10"));
    for (i= new BigInteger(Long.MAX_VALUE + " "); i.compareTo(end) <= 0;
      i= i.add(newBigInteger("1"))) {
      System.out.println(i.multiply(i));
    }
  }
}