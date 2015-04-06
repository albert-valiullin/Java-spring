package ru.kpfu.itis.spring.lec01.lab05;

/**
 * Created by Admin on 06.04.2015.
 */
class BenchmarkProxySubject implements Subject {

    private RealSubject subject;

    public BenchmarkProxySubject() {
        subject = new RealSubject();
    }
    public int longMethod() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        int count = subject.longMethod();
        System.out.println("Time: "+ (System.currentTimeMillis() - startTime));
        return count;
    }
}
