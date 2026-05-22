class CountThreadDM extends Thread {
    int from, to;

    public CountThreadDM(int from, int to){
        this.from = from;
        this.to = to;
    }
    public void run(){
        for (int i = from; i < to; i++){
            try {
                Thread.sleep(500);
                System.out.println("i = " + i);
            } catch(InterruptedException ie){}
        }
    }
    public static void main(String[] args){
        for (int i = 0; i < 5; i++){
            CountThreadDM thrd = new CountThreadDM(i*200, (i+1)*200);
            thrd.start();
        }
    }
}