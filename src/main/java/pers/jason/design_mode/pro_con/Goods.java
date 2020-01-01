package pers.jason.design_mode.pro_con;

public class Goods {

  private Long num;

  public Goods(Long num) {
    this.num = num;
  }

  public Long getNum() {
    return num;
  }

  public void setNum(Long num) {
    this.num = num;
  }

  @Override
  public String toString() {
    return "Goods{" +
        "num=" + num +
        '}';
  }
}
