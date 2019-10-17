
class MultiThreading extends Thread {
    public void run() {
        try {
            System.out.println("Thread");
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
}