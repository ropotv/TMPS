package app;

import core.adapters.WeightAdapter;

public class Main {

    public static void main(String[] args) {
        double weightInPounds = new WeightAdapter().FromKg(85).ToLbs();
        System.out.println(weightInPounds);
    }
}
