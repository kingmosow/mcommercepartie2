package com.mproduits.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mes-configs")
public class ApplicationPropertiesConfiguration {

    private int limitProduits;

    public int getLimitProduits() {
        return limitProduits;
    }

    public void setLimitProduits(int limitProduits) {
        this.limitProduits = limitProduits;
    }
}
