package multithreading;

public class Extendingthread  extends Thread{
	public void run() {
		System.out.println("MULTI THREADING");
	}
    public static void main(String[] args) {
    	Extendingthread v=new Extendingthread();
    	v.start();
    }
}
