import java.util.concurrent.locks.ReentrantLock;

public class Conta {

    private ReentrantLock lock = new ReentrantLock();
    private int valor = 0;

    Conta(){

    }

    public int getValor(){
        return this.valor;
    }

    public void addValor(int valor){
        lock.lock();
        this.valor += valor;
        lock.unlock();
    }

    public void remValor(int valor){
        lock.lock();
        this.valor -= valor;
        lock.unlock();
    }

    public void lock(){
        this.lock.lock();
    }

    public void unlock(){
        this.lock.unlock();
    }

}
