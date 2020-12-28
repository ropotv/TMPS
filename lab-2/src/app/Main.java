package app;

import core.adapters.WeightAdapter;
import core.models.UserModel;
import core.types.MetricEnum;

public class Main {

    public static void main(String[] args) {
        UserModel user = new UserModel();
        user.firstName = "John";
        user.metric = MetricEnum.Kilograms;
        user.weight = 85;

        double weightInKg = new WeightAdapter(user.weight).From(user.metric).To(MetricEnum.Kilograms);
        System.out.println("User weight in kilograms is " + weightInKg);
    }
}
