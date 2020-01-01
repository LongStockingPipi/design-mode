package pers.jason.design_mode.singleton;

/**
 * 利用synchronized同步关键字对方法上锁
 * 缺点：每次获取实例的时候都会有加锁释放锁的操作，实际上只有首次创建的时候需要
 * 支持并发
 */
public class Way2 {

  private Way2() {}

  private static Way2 way2;

  public static synchronized Way2 getInstance() {
    if(null == way2) {
      way2 = new Way2();
    }
    return way2;
  }
}
