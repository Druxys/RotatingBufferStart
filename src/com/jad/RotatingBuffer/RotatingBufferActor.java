package com.jad.RotatingBuffer;

abstract class RotatingBufferActor<Data> {
    private int index=0;
    private final RotatingBuffer<Data> buffer;

    public RotatingBufferActor(RotatingBuffer<Data> buffer) {
        this.buffer = buffer;
    }

    final public int getIndex() {
        return index;
    }

    public RotatingBuffer<Data> getBuffer() {
        return buffer;
    }

    public void incrementIndex() {
        if (this.buffer.getSize() ==++ this.index){
            this.index = 0;
        }
    }
}
