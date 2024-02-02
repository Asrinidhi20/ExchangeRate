package com.example.ExchangeRateDifference.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;

import com.example.ExchangeRateDifference.Model.ExchangeRate;
import com.example.ExchangeRateDifference.Repository.ExchangeRateDifferenceRepository;

//import java.time.LocalDate;
//import java.util.List;

@Service
public class ExchangeRateDifferenceService {

    @Autowired
    private ExchangeRateDifferenceRepository exchangeRateRepository;

    public ExchangeRate getLastYearUsdExchangeRates() {
        String lastYearDate = "02-02-2022";//LocalDate.now().minusYears(1);
        return exchangeRateRepository.findByDate(lastYearDate);
    }

    public ExchangeRate createExchangeRate(ExchangeRate exchangeRate) {
        return exchangeRateRepository.save(exchangeRate);
    }

    public void updateExchangeRate(String id, ExchangeRate updatedExchangeRate) {
        updatedExchangeRate.setId(id);
        exchangeRateRepository.save(updatedExchangeRate);
    }

    public void deleteExchangeRate(String id) {
        exchangeRateRepository.deleteById(id);
    }

    /*public void getExchangeRateDifference(String id, String id){

    }*/

    /*public void retrieveAndStoreUsdExchangeRates(LocalDate date) {
        // Check if data for the given date already exists in the database
        if (exchangeRateRepository.findByDate(date).isEmpty()) {
            // Retrieve exchange rate data from API and store it in the database
            // Implement the logic to retrieve data from the Exchange Rate API
            // For simplicity, a RestTemplate example is shown below
            RestTemplate restTemplate = new RestTemplate();
            ExchangeRate exchangeRate = restTemplate.getForObject(
                    "https://v6.exchangerate-api.com/v6/eaa8b4782ed09be0e5dd71f3/latest/USD", ExchangeRate.class);


                if (exchangeRate != null) {
                exchangeRate.setDate(date);
                exchangeRateRepository.save(exchangeRate);
            }
        }
    }*/
    
}
