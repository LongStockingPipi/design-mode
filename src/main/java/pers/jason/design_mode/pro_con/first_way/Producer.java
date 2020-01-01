package pers.jason.design_mode.pro_con.first_way;

import pers.jason.design_mode.pro_con.Goods;

public class Producer implements Runnable{

  private Integer maxSize;

  private Storage storage;

  public Producer(Integer maxSize, Storage storage) {
    this.maxSize = maxSize;
    this.storage = storage;
  }

  @Override
  public void run() {
    for(int i=0;i<maxSize;i++) {
      Goods goods = new Goods(new Long(i));
      storage.add(goods);
    }
  }

}
