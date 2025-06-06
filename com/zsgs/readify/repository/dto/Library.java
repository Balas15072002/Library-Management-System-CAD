package com.zsgs.readify.repository.dto;

public class Library {
    private Integer id;
    private String name;
    private String incharge;
    private int capacity;
    private StorageStructure storageStructure;
    private String address;
    private String phoneNo;
    private String wifiPassword;
    private String emailId;
    private long openingTime;
    private long closingTime;
    private int noAvailableDays;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIncharge() {
        return incharge;
    }

    public void setIncharge(String incharge) {
        this.incharge = incharge;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public StorageStructure getStorageStructure() {
        return storageStructure;
    }

    public void setStorageStructure(StorageStructure storageStructure) {
        this.storageStructure = storageStructure;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getWifiPassword() {
        return wifiPassword;
    }

    public void setWifiPassword(String wifiPassword) {
        this.wifiPassword = wifiPassword;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(long openingTime) {
        this.openingTime = openingTime;
    }

    public long getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(long closingTime) {
        this.closingTime = closingTime;
    }

    public int getNoAvailableDays() {
        return noAvailableDays;
    }

    public void setNoAvailableDays(int noAvailableDays) {
        this.noAvailableDays = noAvailableDays;
    }
}
