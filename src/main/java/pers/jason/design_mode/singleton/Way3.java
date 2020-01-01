package pers.jason.design_mode.singleton;

/**
 * 双重检查加锁方式，保证只有首次初始化时进行锁的争夺
 * 注意：volatile关键字的作用：
 *  java在创建一个对象的时候并不是一个原子操作，大致分为三步：创建一个空的对象、调用构造器、将对象赋给引用，但是由于重排序的机制，
 *  可能出现三个步骤执行顺序不同，这样容易发生先将空的对象赋给了引用，此时其他线程在执行第一重检查的时候就会认为对象已经创建直接返回，
 *  但实际上对象中的属性都是空。
 * 缺点 1.5之前版本不适用
 * 支持并发
 */
public class Way3 {

  private Way3() {}

  private volatile static Way3 way3;

  public static Way3 getInstance() {
    if(null == way3) {
      synchronized (Way3.class) {
        if(null == way3) {
          way3 = new Way3();
        }
      }
    }
    return way3;
  }
}
