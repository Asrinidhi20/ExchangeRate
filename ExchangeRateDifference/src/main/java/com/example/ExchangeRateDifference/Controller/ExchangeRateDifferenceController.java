package com.example.ExchangeRateDifference.Controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import com.example.ExchangeRateDifference.Model.ExchangeRate;
import com.example.ExchangeRateDifference.Service.ExchangeRateDifferenceService;

//import java.time.LocalDate;
//import java.util.List;

@RestController
@RequestMapping("/api/exchangeRate")
public class ExchangeRateDifferenceController {
    
    @Autowired
    private ExchangeRateDifferenceService exchangeRateService;

    @GetMapping("/last-year-usd")
    public ExchangeRate getLastYearUsdExchangeRates() {
        return exchangeRateService.getLastYearUsdExchangeRates();
    }

    @PostMapping("/create")
    public ExchangeRate createExchangeRate(@RequestBody ExchangeRate exchangeRate) {
        return exchangeRateService.createExchangeRate(exchangeRate);
    }

    @PutMapping("/update/{id}")
    public void updateExchangeRate(@PathVariable String id, @RequestBody ExchangeRate updatedExchangeRate) {
        exchangeRateService.updateExchangeRate(id, updatedExchangeRate);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteExchangeRate(@PathVariable String id) {
        exchangeRateService.deleteExchangeRate(id);
    }

   /* @GetMapping("/diff")
    public String getExchangeRateDifference(@RequestParam String code) {
        // Get exchange rates for the specified code
        List<ExchangeRate> exchangeRates = exchangeRateService.getLastYearUsdExchangeRates();//getExchangeRatesByCode(code);
    
        // Calculate percentage change for different time intervals
        String result = "Last one day: " + calculatePercentageChange(exchangeRates, 1) + "\n" +
                        "Last one week: " + calculatePercentageChange(exchangeRates, 7) + "\n" +
                        "Last one Month: " + calculatePercentageChange(exchangeRates, 30) + "\n" +
                        "Last 3 Month: " + calculatePercentageChange(exchangeRates, 90) + "\n" +
                        "Last 6 Month: " + calculatePercentageChange(exchangeRates, 180) + "\n" +
                        "Last 9 Month: " + calculatePercentageChange(exchangeRates, 270) + "\n" +
                        "Last 12 Month: " + calculatePercentageChange(exchangeRates, 365);
    
        return result;
        }
    
        // Helper method to calculate percentage change
        private String calculatePercentageChange(List<ExchangeRate> exchangeRates, int days) {
            if (exchangeRates.size() < 2) {
                return "Insufficient data for calculation";
            }
    
            ExchangeRate latestRate = exchangeRates.get(0);
            ExchangeRate pastRate = getExchangeRateByDate(exchangeRates, days);
    
            if (latestRate == null || pastRate == null) {
                return "Insufficient data for calculation";
            }
    
            double percentageChange = ((latestRate.getConversion_rates() - pastRate.getConversion_rates()) / pastRate.getConversion_rates()) * 100;
            return String.format("<+%.2f%%>/<-%.2f%%>", Math.max(0, percentageChange), Math.abs(Math.min(0, percentageChange)));
        }
    
       /* // Helper method to get exchange rate from a specific date
        private ExchangeRate getExchangeRateByDate(List<ExchangeRate> exchangeRates, int daysAgo) {
            LocalDate targetDate = LocalDate.now().minusDays(daysAgo);
    
            for (ExchangeRate rate : exchangeRates) {
                if (rate.getDate().toLocalDate().isEqual(targetDate)) {
                    return rate;
                }
            }
    
            return null;
        }*/
    }


    
