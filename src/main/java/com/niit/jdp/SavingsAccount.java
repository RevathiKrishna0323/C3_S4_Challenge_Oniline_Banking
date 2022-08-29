/*
 * Author Name: Revathi
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.niit.jdp;

public class SavingsAccount extends Bank {
    //created a no args constructor

    public SavingsAccount() {
    }
    // created a parameterised constructor


    public SavingsAccount(String accountNumber, String accountType, String accountName, String bankName, String branchName, String address, String IFSC_Code, String city, String accountOpenDate, String modeOfOperation, String bankCode, String bankCountry, String bankState, String bankCountryCode, String bankCountryName, String bankStateCode, String bankStateName, String accountBalance, String accountStatus, Boolean isMobileBankingEnabled) {
        super(accountNumber, accountType, accountName, bankName, branchName, address, IFSC_Code, city, accountOpenDate, modeOfOperation, bankCode, bankCountry, bankState, bankCountryCode, bankCountryName, bankStateCode, bankStateName, accountBalance, accountStatus, isMobileBankingEnabled);
    }


    }
