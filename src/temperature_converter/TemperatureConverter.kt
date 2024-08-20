package temperature_converter

fun main() {
    val degCelsius = 27.0
    val degKelvin = 350.0
    val degFahrenheit = 10.0

    printFinalTemperature(
        initialMeasurement = degCelsius,
        initialUnit = "Celsius",
        finalUnit = "Fahrenheit",
        conversionFormula = { measurement ->
            (9.0 / 5.0 * measurement) + 32
        }
    )

    printFinalTemperature(
        initialMeasurement = degKelvin,
        initialUnit = "Kelvin",
        finalUnit = "Celsius",
        conversionFormula = { measurement ->
            measurement - 273.15
        }
    )

    printFinalTemperature(
        initialMeasurement = degFahrenheit,
        initialUnit = "Fahrenheit",
        finalUnit = "Kelvin",
        conversionFormula = { measurement ->
            (5.0 / 9.0 * (measurement - 32)) + 273.15
        }
    )
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}