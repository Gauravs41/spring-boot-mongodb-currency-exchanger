package com.techprimers.mongodb.springbootmongodbexample.currencyexchanger;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class Currency {
    
    @Id
    private String id;
    private String Currency_code;
    private String Currency_name;
    private String USDtoX;
    private String XtoUSD;

    public Currency(String id,String Currency_code,String Currency_name,String USDtoX,String XtoUSD)
    {
        this.id = id;
        this.Currency_code= Currency_code;
        this.Currency_name  =Currency_name;
        this.USDtoX = USDtoX;
        this.XtoUSD = XtoUSD;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getCurrency_code() {
        return Currency_code;
    }

    public void setCurrency_code(String Currency_code) {
        this.Currency_code = Currency_code;
    }

    public String getCurrency_name() {
        return Currency_name;
    }

    public void setCurrency_name(String Currency_name) {
        this.Currency_name = Currency_name;
    }

    public String getUSDtoX() {
        return USDtoX;
    }

    public void setUSDtoX(String USDtoX) {
        this.USDtoX = USDtoX;
    }

    public String getXtoUSD() {
        return XtoUSD;
    }

    public void setXtoUSD(String XtoUSD) {
        this.XtoUSD = XtoUSD;
    }
    
    
    
}
