/*
 * Author Name: Revathi
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.niit.jdp;

public abstract class Bank {
    // define the fields of the Bank object
    private String accountNumber;
    private String accountType;
    private String accountName;
    private String bankName;
    private String branchName;
    private String address;
    private String IFSC_Code;
    private String city;
    private String accountOpenDate;
    private String modeOfOperation;
    private String bankCode;
    private String bankCountry;
    private String bankState;
    private String bankCountryCode;
    private String bankCountryName;
    private String bankStateCode;
    private String bankStateName;
    private String accountBalance;
    private String accountStatus;
    private Boolean isMobileBankingEnabled;
    //create a no args constructor

    public Bank() {
    }
    // create a parameterised args constructor

    public Bank(String accountNumber, String accountType, String accountName, String bankName, String branchName, String address, String IFSC_Code, String city, String accountOpenDate, String modeOfOperation, String bankCode, String bankCountry, String bankState, String bankCountryCode, String bankCountryName, String bankStateCode, String bankStateName, String accountBalance, String accountStatus, Boolean isMobileBankingEnabled) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountName = accountName;
        this.bankName = bankName;
        this.branchName = branchName;
        this.address = address;
        this.IFSC_Code = IFSC_Code;
        this.city = city;
        this.accountOpenDate = accountOpenDate;
        this.modeOfOperation = modeOfOperation;
        this.bankCode = bankCode;
        this.bankCountry = bankCountry;
        this.bankState = bankState;
        this.bankCountryCode = bankCountryCode;
        this.bankCountryName = bankCountryName;
        this.bankStateCode = bankStateCode;
        this.bankStateName = bankStateName;
        this.accountBalance = accountBalance;
        this.accountStatus = accountStatus;
        this.isMobileBankingEnabled = isMobileBankingEnabled;
    }


    // create a getters and setters

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIFSC_Code() {
        return IFSC_Code;
    }

    public void setIFSC_Code(String IFSC_Code) {
        this.IFSC_Code = IFSC_Code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAccountOpenDate() {
        return accountOpenDate;
    }

    public void setAccountOpenDate(String accountOpenDate) {
        this.accountOpenDate = accountOpenDate;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public String getBankState() {
        return bankState;
    }

    public void setBankState(String bankState) {
        this.bankState = bankState;
    }

    public String getBankCountryCode() {
        return bankCountryCode;
    }

    public void setBankCountryCode(String bankCountryCode) {
        this.bankCountryCode = bankCountryCode;
    }

    public String getBankCountryName() {
        return bankCountryName;
    }

    public void setBankCountryName(String bankCountryName) {
        this.bankCountryName = bankCountryName;
    }

    public String getBankStateCode() {
        return bankStateCode;
    }

    public void setBankStateCode(String bankStateCode) {
        this.bankStateCode = bankStateCode;
    }

    public String getBankStateName() {
        return bankStateName;
    }

    public void setBankStateName(String bankStateName) {
        this.bankStateName = bankStateName;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Boolean getMobileBankingEnabled() {
        return isMobileBankingEnabled;
    }

    public void setMobileBankingEnabled(Boolean mobileBankingEnabled) {
        isMobileBankingEnabled = mobileBankingEnabled;
    }
}
