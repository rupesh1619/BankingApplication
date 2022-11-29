package com.bankapplication.pack;

public class UserDetails {
    private String userName;
    private int account_balance = 0;
    private int deposit = 0;
    private int withdraw = 0;

    public UserDetails() {

    }

    public UserDetails(String userName, int account_balance, int deposit, int withdraw) {
        this.userName = userName;
        this.account_balance = account_balance;
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(int account_balance) {
        this.account_balance = account_balance;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    @Override
    public String toString() {
        return "UserName: " + userName + " AccountBalance: " + account_balance + " Deposit: " + deposit + " WithdrawalAmount: " + withdraw;
    }
}

