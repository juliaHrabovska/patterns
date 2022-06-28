package com.test.builder.realexample;

public class RegistrationRequest {
    private String name;
    private String secondName;
    private String email;
    private String password;
    private String repeatPassword;
    private String location;
    private String dateOfBirth;

    private RegistrationRequest(
            String name, 
            String secondName, 
            String email, 
            String password, 
            String repeatPassword, 
            String location, 
            String dateOfBirth) {
        this.name = name;
        this.secondName = secondName;
        this.email = email;
        this.password = password;
        this.repeatPassword = repeatPassword;
        this.location = location;
        this.dateOfBirth = dateOfBirth;
    }

    public static RegistrationRequestBuilder builder() {
        return new RegistrationRequestBuilder();
    }

    public static class RegistrationRequestBuilder {
        private String name;
        private String secondName;
        private String email;
        private String password;
        private String repeatPassword;
        private String location;
        private String dateOfBirth;

        RegistrationRequestBuilder() {
        }

        public RegistrationRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public RegistrationRequestBuilder secondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public RegistrationRequestBuilder email(String email) {
            this.email = email;
            return this;
        }

        public RegistrationRequestBuilder password(String password) {
            this.password = password;
            return this;
        }

        public RegistrationRequestBuilder repeatPassword(String repeatPassword) {
            this.repeatPassword = repeatPassword;
            return this;
        }

        public RegistrationRequestBuilder location(String location) {
            this.location = location;
            return this;
        }

        public RegistrationRequestBuilder dateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public RegistrationRequest build() {
            return new RegistrationRequest(name, secondName, email, password, repeatPassword, location, dateOfBirth);
        }
    }

    @Override
    public String toString() {
        return "RegistrationRequest{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", repeatPassword='" + repeatPassword + '\'' +
                ", location='" + location + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
