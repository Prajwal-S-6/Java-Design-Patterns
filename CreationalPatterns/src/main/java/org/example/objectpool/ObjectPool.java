package org.example.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

    private BlockingQueue<T> availablePool;

    //creating some objects initially
    public ObjectPool(Supplier<T> creator, int countOfObjects) {
        availablePool = new LinkedBlockingDeque<>();
        for(int i=0; i<countOfObjects; i++) {
            try {
                availablePool.put(creator.get());
            } catch (InterruptedException e) {
                System.out.println("put() was interrupted");
            }
        }
    }

    // to get the object from the pool
    public T getObject() {
        try{
            if(availablePool.size() != 0) {
                return availablePool.take();
            } else {
                System.out.println("take() was interrupted");
            }

        } catch (InterruptedException e) {
            System.out.println("take() was interrupted");
        }
        return null;
    }

    //to release the object into the pool
    public void releaseObject(T obj) {
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException e) {
            System.out.println("put() was interrupted");
        }
    }

}
