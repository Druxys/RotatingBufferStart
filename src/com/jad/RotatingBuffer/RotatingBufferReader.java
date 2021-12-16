package com.jad.RotatingBuffer;

class RotatingBufferReader<Data> extends RotatingBufferActor<Data> implements IRotatingBufferReader<Data>{

    public RotatingBufferReader(RotatingBuffer<Data> buffer) {
        super(buffer);
    }

    @Override
    public Data read() {
        RotatingBuffer<Data> buffer = getBuffer();
        RotatingBufferWriter<Data> writer = buffer.getWriter();
        if ((this.getIndex() != writer.getIndex()) || !buffer.isEmpty()) {
            Data[] dataArray = buffer.getDataArray();
            Data temp = dataArray[this.getIndex()];
            incrementIndex();
            if (this.getIndex() == writer.getIndex())
                buffer.setEmpty(true);
            return temp;
        }
        return null;
    }
}
