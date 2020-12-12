package com.astro.smitebasic.db;

public interface Controller<T> {

    void addConnection(T info);

    Iterable<T> getConnections();

    void deleteConnection(T info);
}
