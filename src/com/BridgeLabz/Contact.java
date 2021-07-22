package com.BridgeLabz;

public class Contact {



        private String firstName;
        private  String  lastName;
        private String  address;
        private  String city;
        private  String state;
        private  String zip;
        private  String phoneNum;
        private  String email;


        public Contact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNum, String email)
        {
            this.firstName=firstName;
            this.lastName=lastName;
            this.address=address;
            this.city=city;
            this.state=state;
            this.zip=zip;
            this.phoneNum=phoneNum;
            this.email=email;

        }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
