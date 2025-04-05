package org.example.Composite;

//Leaf node in composite pattern
public class BinaryFile extends File {

    private String name;

    private Integer size;

    public BinaryFile(String name, Integer size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(this.getName() + "\t" + this.size);
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException();
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeFile(File file) {
        throw new UnsupportedOperationException();
    }
}
