package com.pk.zpi.cashflow.model.request;

public class EditMoneyAccountRequest extends NewMoneyAccountRequest{
    public int moneyAccountId = -1;

    public boolean isAllData() {
        return accountName.length() > 0 && id_user != -1 && moneyAccountId != -1;
    }
}
