package com.jad.RotatingBuffer;

class RotatingBufferWriter<Data> extends RotatingBufferActor<Data> implements IRotatingBufferWriter<Data> {

    public RotatingBufferWriter(RotatingBuffer<Data> buffer) {
        super(buffer);
    }
    @Override

    public boolean write(final Data data) {
        RotatingBuffer<Data> buffer = getBuffer();
        RotatingBufferReader<Data> reader = buffer.getReader();
        if ((this.getIndex() != reader.getIndex()) || buffer.isEmpty()) {
            buffer.getDataArray()[this.getIndex()] = data;
            buffer.setEmpty(false);
            incrementIndex();
            return true;
        }
        return false;
    }
}
