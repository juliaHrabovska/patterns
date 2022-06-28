package com.test.builder.realexample;

public class Main {
    public static void main(String[] args) {
        RegistrationRequest.RegistrationRequestBuilder positiveDataBuilder = RegistrationRequest.builder();
        RegistrationRequest requestWithValidData = positiveDataBuilder
                .name("Olha")
                .secondName("Sviatoshynska")
                .email("olha.sviatoshynska@gmail.com")
                .password("123456")
                .repeatPassword("123456")
                .dateOfBirth("01.01.2001")
                .location("Ukraine")
                .build();
        System.out.println(requestWithValidData);

        RegistrationRequest.RegistrationRequestBuilder negativeDataBuilder = RegistrationRequest.builder();
        RegistrationRequest requestWithInvalidData = negativeDataBuilder
                .name("Olha")
                .secondName("Sviatoshynska")
                .email("olha.sviatoshynska")
                .password("123456")
                .repeatPassword("6543221")
                .dateOfBirth("01.01.2001")
                .build();

        System.out.println(requestWithInvalidData);
    }
}
