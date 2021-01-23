package mzy.test1;

import java.util.ArrayList;
import java.util.List;

public class MainTest {


    void doSometing(Shap shap){
        shap.eraser();
    }

    public static void main(String[] args) {
        List<Shap> shapList = new ArrayList<Shap>();
        for (Shap shap:shapList) {
            System.out.println(shap.toString());
        }
    }

}
