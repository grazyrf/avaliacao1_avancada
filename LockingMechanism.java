import java.util.concurrent.locks.ReentrantLock;

public class LockingMechanism {
    private ReentrantLock lock;

    public LockingMechanism() {
        lock = new ReentrantLock();
    }

    public void adquirirBloqueio() {
        lock.lock();
    }

    public void liberarBloqueio() {
        lock.unlock();
    }
}
