package core.adapters;

import core.types.MetricEnum;

public class WeightAdapter {
    public MetricEnum from;
    public double value = 0;

    public WeightAdapter(double value) {
        this.value = value;
    }

    public WeightAdapter From(MetricEnum metric) {
        this.from = metric;
        return this;
    }

    public double To(MetricEnum metric) {
        return switch (this.from) {
            case Kilograms -> switch (metric) {
                case Kilograms -> this.value;
                case Pounds -> this.value * 2.205;
            };
            case Pounds -> switch (metric) {
                case Kilograms -> this.value / 2.205;
                case Pounds -> this.value;
            };
        };
    }

}
