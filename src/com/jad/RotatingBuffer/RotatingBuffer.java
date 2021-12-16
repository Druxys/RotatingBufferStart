package com.jad.RotatingBuffer;

public class RotatingBuffer<Data>{

    private int size;
    private Data[] dataArray;
    private boolean empty = true;
    private RotatingBufferReader<Data> reader = new RotatingBufferReader<Data>(this);
    private RotatingBufferWriter<Data> writer = new RotatingBufferWriter<Data>(this);

    public RotatingBuffer(int size) {
        this.size = size;
        this.dataArray = (Data[]) new Object[this.size];
    }

    public RotatingBufferReader<Data> getReader() {
        return reader;
    }

    public RotatingBufferWriter<Data> getWriter() {
        return writer;
    }

    public int getSize() {
        return size;
    }

    public Data[] getDataArray() {
        return dataArray;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public Data read() {
        return this.reader.read();
    }

    public boolean write(Data data) {
        return this.writer.write(data);
    }
}
