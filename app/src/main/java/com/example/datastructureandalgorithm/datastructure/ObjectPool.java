package com.example.datastructureandalgorithm.datastructure;

import android.util.SparseArray;

/**
 * Author: ChenGuiPing
 * Date: 2024/2/14
 * Description: 对象池模式
 * 当代码需要分配大量消耗资源的对象实例时，可以利用该模式来限制垃圾回收，避免内存抖动。
 * AsyncTask工作线程的执行，以及RecyclerView中View的重用，都是该模式的使用案例。
 */
public abstract class ObjectPool<T> {
    private final int maxCap;
    private SparseArray<T> freePool;
    private SparseArray<T> usedPool;

    public ObjectPool(int maxCap) {
        this(maxCap / 2, maxCap);
    }

    public ObjectPool(int initCap, int maxCap) {
        this.maxCap = maxCap;
        initPool(initCap);
    }

    //预先分配可重用对象
    private void initPool(int initCap) {
        freePool = new SparseArray<>();
        usedPool = new SparseArray<>();
        for (int i = 0; i < initCap; i++) {
            freePool.put(i, create());
        }
    }

    public T acquire() {
        T obj = null;
        synchronized (freePool) {
            int freeSize = freePool.size();
            for (int i = 0; i < freeSize; i++) {
                int key = freePool.keyAt(i);
                T t = freePool.get(key);
                if (t != null) {
                    usedPool.put(key, t);
                    freePool.remove(key);
                    return t;
                }
            }
            if (usedPool.size() + freeSize < maxCap) {
                obj = create();
                usedPool.put(usedPool.size() + freeSize, obj);
            }
        }
        return obj;
    }

    public void release(T t) {
        if (t == null) return;
        int index = usedPool.indexOfValue(t);
        restore(t);
        usedPool.removeAt(index);
        freePool.put(index, t);
    }

    protected abstract T create();

    protected void restore(T t) {
    }
}
