package pers.jason.design_mode.pro_con.first_way;

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
      storage.get();
    }
  }
}
