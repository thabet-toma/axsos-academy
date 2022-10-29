package com.caresoft.clinicapp;

public interface HIPAACompliantUser {
    abstract boolean assignPin(int pi);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
}
