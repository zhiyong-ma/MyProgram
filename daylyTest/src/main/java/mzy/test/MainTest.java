package mzy.test;

public class MainTest {

    void dispose(Instrument instrument){
        instrument.play();
        System.out.println("now paly " + instrument.toString());
    }
    public static void main(String[] args) {
        ErHu erHu = new ErHu();
        Gu gu = new Gu();
        MainTest mainTest = new MainTest();
        mainTest.dispose(erHu);
    }
}
