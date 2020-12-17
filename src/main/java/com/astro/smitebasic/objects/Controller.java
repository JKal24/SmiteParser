package com.astro.smitebasic.objects;

public interface Controller<T> {

    void addConnection(T info);

    Iterable<T> getConnections();

    void deleteConnection(T info);
}
