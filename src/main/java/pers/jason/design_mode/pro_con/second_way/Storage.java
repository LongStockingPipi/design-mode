package pers.jason.design_mode.pro_con.second_way;

import pers.jason.design_mode.pro_con.Goods;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Jason
 */
public class Storage {

  private BlockingQueue<Goods> queue = new LinkedBlockingQueue<>(5);

  public void put(Goods goods) throws InterruptedException {
    queue.put(goods);
    System.out.println("生产者生产数据-" + goods.getNum());
  }

  public Goods get() throws InterruptedException {
    Goods goods = queue.take();
    System.out.println("消费者获取数据-" + goods.getNum());
    return goods;
  }

}
