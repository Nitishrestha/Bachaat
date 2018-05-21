package com.kat.bachaat.util;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ActivationCodeUtil {

    @Bean
    public int getActivationCode() {
        Random random = new Random();
        int activationCode = random.nextInt(900000) + 100000;
        return activationCode;
    }
}
