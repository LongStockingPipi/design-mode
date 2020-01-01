package pers.jason.design_mode.singleton;

/**
 * 内部类的静态成员变量只有被调用的时候才会实例化
 * 支持并发
 */
public class Way4 {

  private static Way4 way4;

  private Way4() {}

  private static class Way4Holder {
    private static Way4 way4 = new Way4();
  }

  public static Way4 getInstance() {
    return Way4Holder.way4;
  }
}
