package pers.jason.design_mode.pro_con.second_way;

public class Ut2 {

  public static void main(String[] args) {
    Storage storage = new Storage();
    Integer maxSize = 20;

    Thread threadPro = new Thread(new Producer(maxSize, storage));
    Thread threadCon = new Thread(new Consumer(maxSize, storage));

    threadPro.start();
    threadCon.start();
  }

}
