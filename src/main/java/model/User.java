package model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_ID")
    private Long userId;

    private String login;
    private String password;
    private String name;
    private String surname;
    private String adres;
    private String status;
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    private Float hourlyCost;

    public User() {
    }

    public User(String login, String password, String name, String surname, String adres, String status, String phoneNumber, Role role, Float hourlyCost) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.adres = adres;
        this.status = status;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.hourlyCost = hourlyCost;
    }


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Float getHourlyCost() {
        return hourlyCost;
    }

    public void setHourlyCost(Float hourlyCost) {
        this.hourlyCost = hourlyCost;
    }
}


