// Import the necessary Java synchronization and scheduling classes.

package edu.vuum.mocca;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;

/**
 * @class SimpleAtomicLong
 *
 * @brief This class implements a subset of the
 *        java.util.concurrent.atomic.SimpleAtomicLong class using a
 *        ReentrantReadWriteLock to illustrate how they work.
 */
class SimpleAtomicLong
{
    /**
     * The value that's manipulated atomically via the methods.
     */
    private long mValue;
<<<<<<< HEAD
    
    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */
    // TODO - replace the null with the appropriate initialization:
    private ReentrantReadWriteLock mRWLock = null;
=======


    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */
    // TODO - add the implementation
>>>>>>> upstream/master

    /**
     * Creates a new SimpleAtomicLong with the given initial value.
     */
<<<<<<< HEAD
    public SimpleAtomicLong(long initialValue)
    {
        long value = 0;
=======
    public SimpleAtomicLong(long initialValue) {
>>>>>>> upstream/master
        // TODO - you fill in here
    }

    /**
<<<<<<< HEAD
     * @brief Gets the current value.
     * 
     * @returns The current value
     */
    public long get()
    {
        long value = 0;
        // TODO - you fill in here, using a readLock()
        return value;
=======
     * @brief Gets the current value
     * 
     * @returns The current value
     */
    public long get() {
        // TODO - you fill in here
>>>>>>> upstream/master
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the updated value
     */
<<<<<<< HEAD
    public long decrementAndGet()
    {
        long value = 0;
        // TODO - you fill in here, using a writeLock()
        return value;
=======
    public long decrementAndGet() {
        // TODO - you fill in here
>>>>>>> upstream/master
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the previous value
     */
<<<<<<< HEAD
    public long getAndIncrement()
    {
        long value = 0;
        // TODO - you fill in here, using a writeLock()
        return value;
=======
    public long getAndIncrement() {
        // TODO - you fill in here
>>>>>>> upstream/master
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the previous value
     */
<<<<<<< HEAD
    public long getAndDecrement()
    {
        long value = 0;
        // TODO - you fill in here, using a writeLock()
        return value;
=======
    public long getAndDecrement() {
        // TODO - you fill in here
>>>>>>> upstream/master
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the updated value
     */
<<<<<<< HEAD
    public long incrementAndGet()
    {
        long value = 0;
        // TODO - you fill in here, using a writeLock()
        return value;
=======
    public long incrementAndGet() {
        // TODO - you fill in here
>>>>>>> upstream/master
    }
}

