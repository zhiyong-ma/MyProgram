package mzy.test;

public abstract class Instrument {

    /**
     * 演奏
     */
    void play() {
        System.out.println(" father play ");
    }

    /**
     * 调试
     */
    void tune() {
        System.out.println("father tune ");
    }
}
