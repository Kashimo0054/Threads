//Threads using extends 

class Hello1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hellow 1");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Hello2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hellow 2");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class App {
    public static void main(String[] args) {
        Hello1 h1 = new Hello1();
        Hello2 h2 = new Hello2();
        h1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        h2.start();
        // System.out.println(h2.getPriority()); checking priority of thread

    }
}

///////////////////////////////////////////////////////


Threads using Implements

class Hello1 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hellow 1");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Hello2 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hellow 2");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class App {
    public static void main(String[] args) {
        Runnable h1 = new Hello1();
        Runnable h2 = new Hello2();

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        t1.start();
        t2.start();

    }
}


/////////////////////////////////////////////////

Simpliying code with lambda expression

() -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hellow 1");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        
            
        };



