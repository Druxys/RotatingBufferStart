package com.jad.RotatingBuffer;

class RotatingBufferReader<Data> extends RotatingBufferActor<Data> implements IRotatingBufferReader<Data>{
    @Override
    public Data read() {
        return null;
    }

    @Override
    public int getIndex() {
        return 0;
    }
}
