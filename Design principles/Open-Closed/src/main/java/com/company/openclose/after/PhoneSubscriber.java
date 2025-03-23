package com.company.openclose.after;

import java.util.List;


public class PhoneSubscriber extends Subscriber{

    //open for extension
    @Override
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(getSubscriberId());
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*getBaseRate()/100;
    }



}