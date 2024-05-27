package designPatterns.creational.objectPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

    private BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, int count) {
        availablePool = new LinkedBlockingQueue<>();
        for (int i = 0; i < count; i++) {
            availablePool.offer(creator.get());
        }
    }

    public T getObject() {
        try {
            return availablePool.take();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public void releaseObject(T obj) {
        obj.reset();
        availablePool.offer(obj);
    }

}
