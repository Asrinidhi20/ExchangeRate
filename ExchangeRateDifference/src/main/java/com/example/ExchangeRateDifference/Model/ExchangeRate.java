package com.example.ExchangeRateDifference.Model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.util.Map;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "exchange_rates")
@EntityScan
public class ExchangeRate {
    @Id
    private String id;
    private String date;
    //private LocalDateTime year;
    //private LocalDateTime month;
    private String base_code;
    private Map<String, Double> conversion_rates;

    // Getter
  public String getId() {
    return id;
  }

  // Setter
  public void setId(String id) {
    this.id = id;
  }

  // Getter
  public String getDate() {
    return date;
  }

  // Setter
  public void setDate(String date) {
    this.date = date;
  }

  // Getter
  public String getBase_code() {
    return base_code;
  }

  // Setter
  public void setBase_code(String base_code) {
    this.base_code = base_code;
  }

  // Getter
  public Map<String,Double> getConversion_rates() {
    return conversion_rates;
  }

  // Setter
  public void setConversion_rates(Map<String,Double> conversion_rates) {
    this.conversion_rates = conversion_rates;
  }

  //public ExchangeRate(String id, String date, String base_code, Map<String,Double> conversion_rates){

  
    
}
