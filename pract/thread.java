class spotify extends thread{
    void run(){
        for(int i=0;i<5;i++){
            System.out.println("play song");
            System.out.println("lyrics");
            System.out.println("duration");
        }
    }
}
public class thread {
public static void main(String[] args) {
        spotify s1 = new spotify();
        Thread t1 = new Thread(s1);
        t1.start();
    }
}
