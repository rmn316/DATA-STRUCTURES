package com.ds;

import java.util.Arrays;

public class QueueDArray<T> {

    Object[] ArrayQueue;
    int Rear;
    int Front;
    int size;

    public QueueDArray(int size) {
        this.size = size;
        ArrayQueue = new Object[this.size];
        Front = -1;
        Rear = -1;
    }

    public Boolean isEmpty() {
        return Front == -1 || Front > Rear;
    }

    public void Queue(Object newItem) {
        ensureCapacity(Rear+2);
        Rear = Rear+1;
        ArrayQueue[Rear] = newItem;
        if (Front == -1) {
            Front = 0;
        }
    }

    public T DeQueue() {
        ensureCapacity(Rear+2);

        T ObjectOut =(T)ArrayQueue[Front];
        Front = Front+1;
        return ObjectOut;
    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = getSize();
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity*2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
                ArrayQueue = Arrays.copyOf(ArrayQueue, newCapacity);
            }
        }
    }

    public int getSize() {
        return ArrayQueue.length;
    }
}
