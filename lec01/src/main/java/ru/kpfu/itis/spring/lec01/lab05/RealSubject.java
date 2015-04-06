package ru.kpfu.itis.spring.lec01.lab05;

import ru.kpfu.itis.spring.lec01.lab07.Benchmark;
import ru.kpfu.itis.spring.lec01.lab08.Transactional;

/**
 * Created by Admin on 06.04.2015.
 */
@Transactional
public class RealSubject  implements Subject{
    @Benchmark
    public int longMethod() throws InterruptedException {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            count++;
        }
        return count;
    }
}
