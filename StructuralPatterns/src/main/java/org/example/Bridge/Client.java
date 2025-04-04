package org.example.Bridge;

public class Client {

	public static void main(String[] args) {
		ArrayLinkedList<Integer> arrayLinkedList = new ArrayLinkedList<>();
		FifoCollection<Integer> fifoCollection = new Queue<>(arrayLinkedList);
		fifoCollection.offer(1);
		fifoCollection.offer(2);
		fifoCollection.offer(3);

//		System.out.println(fifoCollection.poll());
//		System.out.println(fifoCollection.poll());
//		System.out.println(fifoCollection.poll());
//		System.out.println(fifoCollection.poll());

		System.out.println(fifoCollection.peek());
		System.out.println(fifoCollection.poll());


	}

}
