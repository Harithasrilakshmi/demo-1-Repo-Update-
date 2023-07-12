package com.example.demo.api;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String designation;

        // Constructors, getters, and setters

        public Employee(Long id) {
                this.id = id;
        }

        public Employee(String name) {
                this.name = name;
        }


// ...

        public Long id() {
                return id;
        }

        public Employee setId(Long id) {
                this.id = id;
                return this;
        }

        public String getName() {
                return name;
        }

        public Employee setName(String name) {
                this.name = name;
                return this;
        }

        public String getDesignation() {
                return designation;
        }

        public Employee setDesignation(String designation) {
                this.designation = designation;
                return this;
        }
}


