import java.util.Map;
import java.util.Set;

public class Moneda {

    private Map<String, Double> conversion_rates;

    public Map<String, Double> getConversionRates() {
        return conversion_rates;
    }

    public void setConversionRates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    // Método para obtener solo los códigos de moneda
    public Set<String> getCodigosMoneda() {
        return conversion_rates.keySet();
    }
}
