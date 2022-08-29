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
    //create a no args constructor

    public Bank() {
    }
    // create a parameterised args constructor

    public Bank(String accountNumber, String accountType, String accountName, String bankName, String branchName, String address, String IFSC_Code, String city, String accountOpenDate, String modeOfOperation, String bankCode, String bankCountry, String bankState, String bankCountryCode, String bankCountryName, String bankStateCode, String bankStateName) {
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
    }
}
