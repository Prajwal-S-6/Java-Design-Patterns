package com.company.openclose.after;

import java.util.List;



public class ISPSubscriber extends Subscriber {

    private long freeUsage;

    public ISPSubscriber() {

    }

    //open for extension
    @Override
    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(getSubscriberId());
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;
        return chargeableData*getBaseRate()/100;
    }

    public long getFreeUsage() {
        return freeUsage;
    }

    public void setFreeUsage(long freeUsage) {
        this.freeUsage = freeUsage;
    }

    
}