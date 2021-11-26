package com.jad.RotatingBuffer;

public interface IRotatingBufferReader<Data> {
    Data read();
    int getIndex();
}
