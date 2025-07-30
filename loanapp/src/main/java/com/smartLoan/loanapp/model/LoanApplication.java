package com.smartLoan.loanapp.model;

public class LoanApplication {
    public int Loan_ID;
    public int Gender;
    public int Married;
    public int Dependents;
    public int Education;
    public int Self_Employed;
    public int ApplicantIncome;
    public int CoapplicantIncome;
    public int LoanAmount;
    public int Loan_Amount_Term;
    public int Credit_History;
    public int Property_Area;

    public int getLoan_ID() {
        return Loan_ID;
    }

    public void setLoan_ID(int loan_ID) {
        this.Loan_ID = loan_ID;
    }

    public int getGender() {
        return Gender;
    }

    public void setGender(int gender) {
        this.Gender = gender;
    }

    public int getMarried() {
        return Married;
    }

    public void setMarried(int married) {
        this.Married = married;
    }

    public int getDependents() {
        return Dependents;
    }

    public void setDependents(int dependents) {
        this.Dependents = dependents;
    }

    public int getEducation() {
        return Education;
    }

    public void setEducation(int education) {
        this.Education = education;
    }

    public int getSelf_Employed() {
        return Self_Employed;
    }

    public void setSelf_Employed(int self_Employed) {
        this.Self_Employed = self_Employed;
    }

    public int getApplicantIncome() {
        return ApplicantIncome;
    }

    public void setApplicantIncome(int applicantIncome) {
        this.ApplicantIncome = applicantIncome;
    }

    public int getCoapplicantIncome() {
        return CoapplicantIncome;
    }

    public void setCoapplicantIncome(int coapplicantIncome) {
        this.CoapplicantIncome = coapplicantIncome;
    }

    public int getLoanAmount() {
        return LoanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.LoanAmount = loanAmount;
    }

    public int getLoan_Amount_Term() {
        return Loan_Amount_Term;
    }

    public void setLoan_Amount_Term(int loan_Amount_Term) {
        this.Loan_Amount_Term = loan_Amount_Term;
    }

    public int getCredit_History() {
        return Credit_History;
    }

    public void setCredit_History(int credit_History) {
        this.Credit_History = credit_History;
    }

    public int getProperty_Area() {
        return Property_Area;
    }

    public void setProperty_Area(int property_Area) {
        this.Property_Area = property_Area;
    }
}
