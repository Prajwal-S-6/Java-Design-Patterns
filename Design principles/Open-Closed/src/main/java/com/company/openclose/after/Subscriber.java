package com.company.openclose.after;


// base class-- closed for modification
public abstract class Subscriber {

    private Long subscriberId;

    private String address;

    private Long phoneNumber;

    private int baseRate;


    public abstract double calculateBill();

    /**
     * @return the subscriberId
     */
    public Long getSubscriberId() {
        return subscriberId;
    }

    /**
     * @param subscriberId the subscriberId to set
     */
    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phoneNumber
     */
    public Long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the baseRate
     */
    public int getBaseRate() {
        return baseRate;
    }

    /**
     * @param baseRate the baseRate to set
     */
    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }
}
