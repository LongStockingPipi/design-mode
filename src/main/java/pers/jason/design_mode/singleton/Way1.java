package pers.jason.design_mode.singleton;

/**
 * 利用静态成员变量只会被初始化一次
 * 缺点：不管用没用到，都会在JVM加载类的时候进行初始化；
 * 支持并发
 */
public class Way1 {

  private Way1() {}

  private static Way1 way1 = new Way1();

  public static Way1 getInstance() {
    return way1;
  }
}
