package com.droidroid.ch14.exer02;

/**
 * Created by leibnik on 16-11-4.
 */
import static com.droidroid.utils.Print.print;

/**
 * Created by leibnik on 16-11-4.
 */
interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

interface Hello{} // 新增的接口

class Toy{
    Toy(){}   // 注释掉 Toy 类的默认构造器，发现调用 Toy 的 class 对象的 newInstance 方法时，无法实例化。
    Toy(int i){}
}
class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, Hello{
    FancyToy(){
        super(1);
    }
}
public class ToyTest {
    static void printInfo(Class cc){
        print("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        print("Simple name: " + cc.getSimpleName());
        print("Canonical name: " + cc.getCanonicalName());
        print("\n");
    }

    public static void main(String[] args) {
        Class c = null;
        try{
            c = Class.forName("com.droidroid.ch14.exer02.FancyToy");
        } catch (ClassNotFoundException e) {
            print("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);

        for (Class face: c.getInterfaces()){
            printInfo(face);
        }

        Class up = c.getSuperclass();
        Object obj = null;
        try{
            obj = up.newInstance();
        } catch (InstantiationException e) {
            print("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            print("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
