package designPatterns.creational.objectPool;

import java.util.function.Supplier;

public class Client {

    static Supplier<Bitmap> bitmapSupplier=()->new Bitmap("Logo.bmp");
    public static final ObjectPool<Bitmap> bitmapPool=new ObjectPool<>(bitmapSupplier,5);
    public static void main(String[] args) {
        Bitmap b1=bitmapPool.getObject();
        b1.setLocation(new Point2D(100,100));
        Bitmap b2=bitmapPool.getObject();
        b2.setLocation(new Point2D(100,100));
        b1.draw();
        b2.draw();
        System.out.println(b1);
        System.out.println(b2);
        bitmapPool.releaseObject(b1);
        bitmapPool.releaseObject(b2);
    }
}
