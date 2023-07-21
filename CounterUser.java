// Classe Counter

class Counter {

  private int count = 0;

  synchronized void increment() {
    if (count == 3) {
      System.out.println("Contador esperando para ser incrementado");
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    count++;
    System.out.println("Contador incrementado para " + count);
    notifyAll();
  }

  synchronized void decrement() {
    if (count == 0) {
      System.out.println("Contador esperando para ser decrementado");
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    count--;
    System.out.println("Contador decrementado para " + count);
    notifyAll();
  }

}

// Classe ThreadIncrement

class ThreadIncrement extends Thread {

  private Counter counter;

  public ThreadIncrement(Counter counter) {
    this.counter = counter;
  }

  @Override
  public void run() {
    for (int i = 0; i < 20; i++) {
      counter.increment();
      try {
        Thread.sleep((int) (Math.random() * 500));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}

// Classe ThreadDecrement

class ThreadDecrement extends Thread {

  private Counter counter;

  public ThreadDecrement(Counter counter) {
    this.counter = counter;
  }

  @Override
  public void run() {
    for (int i = 0; i < 20; i++) {
      counter.decrement();
      try {
        Thread.sleep((int) (Math.random() * 500));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}

// Classe CounterUser

class CounterUser {

  public static void main(String[] args) {
    Counter counter = new Counter();
    ThreadIncrement threadIncrement = new ThreadIncrement(counter);
    ThreadDecrement threadDecrement = new ThreadDecrement(counter);
    threadIncrement.start();
    threadDecrement.start();
    try {
      threadIncrement.join();
      threadDecrement.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}