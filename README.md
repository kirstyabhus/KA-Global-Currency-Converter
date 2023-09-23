# Currency Converter Application (Java)

An application that can convert a user-defined amount in a source currency to a destination currency. This application gives the user the option to convert currencies in the given, hard-coded class, or by using the live (daily-refreshed) exchange rates fetched from the ExchangeRate-API API (found at https://www.exchangerate-api.com). ExchangeRate-API currently supports all 161 commonly circulating world currencies.
-> put demo gif of command line application, showing the 3 options (maybe thing of removing option 2?)

## Description
### Currency Converter
#### CurrencyConverter interface
The CurrencyConverter class includes three methods:
- `double convertCurrency(String sourceCurrencyCode, String destinationCurrencyCode, double amount)`: This method accepts a source currency code, a destination currency code, and an amount. It will return the converted amount.
- `String[] getCurrencyCodes()`: This method returns an array of available currency codes
- `double getExchangeRate(String sourceCurrencyCode, String destinationCurrencyCode)`: This method returns the exchange rate between the provided currencies.
#### BasicCurrencyConverter class
The BasicCurrenciesConverter class implements the 'CurrencyConverter' interface.
### Currency Converter (API)
The CurrenciesAPI class
## Prerequisites

This project uses the [Java][1] programming language.

Before getting started, ensure you have Java 17 LTS (or higher) installed locally. The following commands should output the version of Java installed.

```bash
$ javac -version

javac 17.0.4
```

```bash
$ java -version

openjdk version "17.0.4" 2022-07-19 LTS
OpenJDK Runtime Environment Zulu17.36+13-CA (build 17.0.4+8-LTS)
OpenJDK 64-Bit Server VM Zulu17.36+13-CA (build 17.0.4+8-LTS, mixed mode, sharing)
```
## Demo
<p align="center">
  <img src="https://github.com/cbfacademy/java-currency-converter-assessment-kirstyabhus/blob/main/images/Currency%20Converter%20Demo.gif" alt="Currency Converter demo" />
</p>

## How to Install and Run this project

1. Clone this repository to your local machine.
```bash
git clone git@github.com:kirstyabhus/Currency-Converter.git
cd Currency-Converter
git checkout -b ${your-branch-name}
```

3. Open in Visual Studio Code (or your preferred IDE).
4. Install the project dependencies and validate your project by running the following command in a terminal at the root of your project:

```bash
./mvnw clean validate
```

If you are on a Windows machine, that will be:

```bat
mvnw clean validate
```
