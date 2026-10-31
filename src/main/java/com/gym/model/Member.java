package com.gym.model;

import jakarta.persistence.*;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String plan;
    private String joinDate;
    private String feesStatus;
    private String trainingType;

    public Member() {}

    public Member(String name, String email, String phone, String plan, String joinDate) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.plan = plan;
        this.joinDate = joinDate;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getPlan() { return plan; }
    public String getJoinDate() { return joinDate; }
    public String getFeesStatus() { return feesStatus; }
    public String getTrainingType() { return trainingType; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setPlan(String plan) { this.plan = plan; }
    public void setJoinDate(String joinDate) { this.joinDate = joinDate; }
    public void setFeesStatus(String feesStatus) { this.feesStatus = feesStatus; }
    public void setTrainingType(String trainingType) { this.trainingType = trainingType; }
}
