package com.company;

import java.util.*;
import java.util.NoSuchElementException;

public class QueueLinkedList<E> {
   private Queue<E> queueList;

   //constructor
   public QueueLinkedList() {
      queueList = new LinkedList<E>();
   }

   // add object to queue
   public void enqueue(E object) {
      queueList.add(object);
   }

   // remove object from queue
   public E dequeue() throws NoSuchElementException {
      return queueList.remove();
   }

   // determine if queue is empty
   public boolean isEmpty() {
      return queueList.isEmpty();
   }

   // output queue contents
   public void printQueue() {
      Iterator<E> iterator = queueList.iterator();
      while (iterator.hasNext()) {
         Object value = iterator.next();
         System.out.print(value);
         if (iterator.hasNext()) {
         System.out.print("-");
         }
      }
      System.out.println();
   }
   public void list() {
      Iterator<E> iterator = queueList.iterator();
      while (iterator.hasNext()) {
         Object value = iterator.next();
         System.out.println(value + " ");
      }
      System.out.println();
   }
}

