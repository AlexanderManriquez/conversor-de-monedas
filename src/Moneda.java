import java.util.Map;

public class Moneda {

    private Map<String, Double> conversion_rates;

    public Map<String, Double> getConversionRates() {
        return conversion_rates;
    }

    public void setConversionRates(Map<String, Double> conversionRates) {
        this.conversion_rates = conversion_rates;
    }

}
