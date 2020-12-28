package core.adapters;

public class WeightAdapter {
    public String from;
    public String to;
    public double value = 0;


    public WeightAdapter FromKg(double value) {
        this.from = "kg";
        this.value = value;
        return this;
    }

    public WeightAdapter FromLbs(double value) {
        this.from = "lbs";
        this.value = value;
        return this;
    }

    public double ToKg() {
        if (this.from.equals("kg")) {
            return this.value;
        }
        return this.value / 2.205;
    }

    public double ToLbs() {
        if (this.from.equals("lbs")) {
            return this.value;
        }
        return this.value * 2.205;
    }

}
