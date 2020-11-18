package com.example.jobhunting;

public class AppliedJobs {
    private String title;
    private String company;
    private String email;
    private String approval;

    public AppliedJobs(){};

    public AppliedJobs(String title, String company, String email, String approval) {
        this.title = title;
        this.company = company;
        this.email = email;
        this.approval = approval;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }
}
