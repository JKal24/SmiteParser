package com.astro.smitebasic.objects;

public interface InfoController<T> {

    void addConnection(T info);

    void addConnections(T[] info);

    Iterable<T> getConnections();

    void deleteConnection(T info);

}
