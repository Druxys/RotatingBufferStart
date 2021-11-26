package com.jad.RotatingBuffer;

class RotatingBufferWriter<Data> extends RotatingBufferActor<Data> implements IRotatingBufferWriter<Data> {
    @Override
    public boolean write(final Data data) {
        return false;
    }

    @Override
    public int getIndex() {
        return 0;
    }
}
