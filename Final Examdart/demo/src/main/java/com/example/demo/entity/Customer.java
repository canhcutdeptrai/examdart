package com.example.demo.entity;

public class Customer {
    @Entity
    public class Customer {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String fullName;
        private LocalDate birthday;
        private String address;
        private String phoneNumber;

    }

}
