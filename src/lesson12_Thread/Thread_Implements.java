package lesson12_Thread;

public class Thread_Implements implements Runnable {

    @Override
    public void run() {
        System.out.println("-----------------------");
        System.out.println("Xin chào IT17101 !");
        System.out.println("-----------------------");

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread_Implements());
        Thread t2 = new Thread(new Thread_Implements());
        
         
        System.out.println("------------------");
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
        System.out.println("------------------");
       
        
        System.out.println("------------------");
        t2.start();
        System.out.println(t2.getId());
        System.out.println(t2.getName());
        System.out.println(t2.getPriority());
        System.out.println("------------------");
        
        System.out.println();
    }
}
