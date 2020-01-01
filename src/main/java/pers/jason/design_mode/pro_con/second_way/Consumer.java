package pers.jason.design_mode.pro_con.second_way;

public class Consumer implements Runnable {

  private Integer maxSize;

  private Storage storage;

  public Consumer(Integer maxSize, Storage storage) {
    this.maxSize = maxSize;
    this.storage = storage;
  }

  @Override
  public void run() {
    for(int i=0;i<maxSize;i++) {
      try {
        storage.get();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
