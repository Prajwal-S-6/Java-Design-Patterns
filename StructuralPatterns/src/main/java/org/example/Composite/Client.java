package org.example.Composite;

public class Client {
	
	// if we didnt have composite, then client had to write code to get the leaf nodes(child classes)
	//client code doesnt know whether it is working to composite object or a leaf object(both behave same)
	public static void main(String[] args) {
		File file1 = createTreeOne();
		file1.ls();
		System.out.println("-----------------------------------------------------------------------");
		File file2 = createTreeTwo();
		file2.ls();
	}
	
	//Client builds tree using leaf and composites
	private static File createTreeOne() {
		File file1 = new BinaryFile("File1", 1000);
		Directory dir1 = new Directory("dir1");
		dir1.addFile(file1);
		File file2 = new BinaryFile("file2", 2000);
		File file3 = new BinaryFile("file3", 150);
		Directory dir2 = new Directory("dir2");
		dir2.addFile(file2);
		dir2.addFile(file3);
		dir2.addFile(dir1);
		return dir2;
	}

	private static File createTreeTwo() {
		return new BinaryFile("Another file", 200);
	}
}
