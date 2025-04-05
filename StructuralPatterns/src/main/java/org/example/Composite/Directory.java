package org.example.Composite;

import java.util.ArrayList;
import java.util.List;

//Composite in the composite pattern
public class Directory extends File {

    private String name;

    private List<File> fileList = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void ls() {
        System.out.println(this.getName());
        fileList.forEach(File::ls);
    }

    @Override
    public void addFile(File file) {
        fileList.add(file);
    }

    @Override
    public File[] getFiles() {
        return fileList.toArray(new File[fileList.size()]);
    }

    @Override
    public boolean removeFile(File file) {
        return fileList.remove(file);
    }
}
