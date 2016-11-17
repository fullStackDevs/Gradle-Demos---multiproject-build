package com;

/**
 * Created by pbirzu on 11/16/2016.
 */
public interface Repository<T> {
    void add(T entity);
    void delete(T entity);
}
