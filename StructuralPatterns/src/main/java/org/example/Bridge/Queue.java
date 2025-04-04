package org.example.Bridge;

//A refined abstraction.
public class Queue<T> implements FifoCollection<T> {

    private LinkedList<T> linkedList;

    public Queue(LinkedList<T> linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public void offer(T element) {
        this.linkedList.addLast(element);
    }

    @Override
    public T poll() {
        return this.linkedList.removeFirst();
    }

    @Override
    public T peek() {
        T element = this.linkedList.removeFirst();
        this.linkedList.addFirst(element);
        return element;
    }
}
