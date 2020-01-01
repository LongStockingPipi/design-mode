package pers.jason.design_mode.pro_con.first_way;

import pers.jason.design_mode.pro_con.Goods;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jason
 */
public class Storage {

  private Integer maxSize = 5;

  private List<Goods> goodsList = new ArrayList<>();

  public synchronized boolean add(Goods goods) {
    while(goodsList.size() == maxSize) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    goodsList.add(goods);
    notify();
    System.out.println("生产者生产数据-" + goods.getNum());
    return true;
  }

  public synchronized Goods get() {
    while(goodsList.size() == 0) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    int num = goodsList.size() - 1;
    Goods goods = goodsList.get(num);
    goodsList.remove(num);
    notify();
    System.out.println("消费者获取数据-" + goods.getNum());
    return goods;
  }

}
