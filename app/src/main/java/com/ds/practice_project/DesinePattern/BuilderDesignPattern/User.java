package com.ds.practice_project.DesinePattern.BuilderDesignPattern;

import androidx.annotation.NonNull;

public class User {
    private final String name;
    private final String lastName;
    private final int age;
    private final String address;

    public User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.lastName = userBuilder.lastName;
        this.address = userBuilder.address;
        this.age = userBuilder.age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @NonNull
    @Override
    public String toString() {
        return "name = "+name+" , "+" LastName = "+lastName+" , "+" Address = "+address;
    }

    static class UserBuilder{
        private String name;
        private String lastName;
        private int age;
        private String address;

        public UserBuilder name(String name){
            this.name = name;
            return this;
        }
        public UserBuilder lastName(String Lname){
            this.lastName = Lname;
            return this;
        }
        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        User build(){
            User user = new User(this);
            return user;
        }
    }
}
