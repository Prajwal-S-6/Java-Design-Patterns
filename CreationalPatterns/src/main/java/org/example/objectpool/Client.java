package org.example.objectpool;

import java.util.function.Supplier;

public class Client {

    public static  final ObjectPool<Bitmap> bitMapPool = new ObjectPool<>(() -> new Bitmap("image.png"), 2);

    public static void main(String[] args) {

        Bitmap b1 = bitMapPool.getObject();
        b1.setLocation(new Point2D(20,10));
        b1.draw();

        Bitmap b2 = bitMapPool.getObject();
        b2.setLocation(new Point2D(10,10));
        b2.draw();

        bitMapPool.releaseObject(b1);
        bitMapPool.releaseObject(b2);

        Bitmap b3 = bitMapPool.getObject();
        b3.setLocation(new Point2D(20,20));
        b3.draw();

        Bitmap b4 = bitMapPool.getObject();
        b4.setLocation(new Point2D(30,20));
        b4.draw();

    }
}
