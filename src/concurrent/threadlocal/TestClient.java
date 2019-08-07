package concurrent.threadlocal;

public class TestClient extends Thread {

    private TestNum sn;

    public TestClient(TestNum sn) {
        this.sn = sn;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            // ④每个线程打出3个序列值
            System.out.println("thread[" + Thread.currentThread().getName() + "] --> sn["
                    + sn.getNextNum() + "]");
        }
    }
}
