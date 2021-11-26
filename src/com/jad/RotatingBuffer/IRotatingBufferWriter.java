package com.jad.RotatingBuffer;

public interface IRotatingBufferWriter<Data> {
    boolean write(Data data);
    int getIndex();
}
