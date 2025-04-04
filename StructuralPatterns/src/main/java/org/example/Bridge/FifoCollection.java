package org.example.Bridge;

//This is the abstraction. 
//It represents a First in First Out collection
// Establishes bridge between this and LinkedList using Composition
public interface FifoCollection<T> {

	//Adds element to collection
	void offer(T element);
	
	//Removes & returns first element from collection
	T poll();

	// added new behavior to the (abstraction) part without affecting our implementation part
	T peek();

}
