package mzy.test;

public class ErHu extends Instrument {

    public ErHu() {
        System.out.println("this is a erhu");
    }

    @Override
    void play() {
        super.play();
        System.out.println("son play erhu");
    }

}
