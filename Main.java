public class Main {

    public static void main(String[] args) {

        // Pruebas de Celsius a Fahrenheit

        System.out.println("0 Celsius = "
                + ConversorTemperaturas.celsiusAFahrenheit(0));

        System.out.println("100 Celsius = "
                + ConversorTemperaturas.celsiusAFahrenheit(100));


        // Pruebas de Fahrenheit a Celsius

        System.out.println("32 Fahrenheit = "
                + ConversorTemperaturas.fahrenheitACelsius(32));

        System.out.println("212 Fahrenheit = "
                + ConversorTemperaturas.fahrenheitACelsius(212));

    }

}
