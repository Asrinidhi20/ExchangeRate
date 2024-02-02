package com.example.ExchangeRateDifference.Controller;

/*import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;*/
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//import com.example.ExchangeRateDifference.Service.ExchangeRateDifferenceService;

@Controller
@Component
public class ExchangeRateDifferenceScheduler {
  /*  @Autowired
        private ExchangeRateDifferenceService exchangeRateService;

        // Runs the task at midnight regularly
        @Scheduled(cron = "0 0 0 * * *")
        public void retrieveAndStoreLastYearUsdExchangeRates() {
            String lastYearDate = "02-02-2022";//LocalDate.now().minusYears(1);
            exchangeRateService.retrieveAndStoreUsdExchangeRates(lastYearDate);
        }*/
}
