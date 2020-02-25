package cput.ac.za;

import java.util.concurrent.TimeUnit;

public class TimeOut
{

    private double cash;
    private int account;

    public TimeOut(double cash, int accounts) {
        this.cash = cash;
        this.account = accounts;
    }

    public double getCash() throws InterruptedException {
        double cash = 0.0;
        for (int index = 0; index < 5; index++) {
            cash += index;
            TimeUnit.SECONDS.sleep(1);
        }
        return cash;
    }

    public int getAccount() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(500);
        return account;
    }

    @Override
    public String toString() {
        return "Bank [cash=" + cash + ", accounts=" + account + "]";
    }
}
