package com.example.mgmcartofior.androiddeveloperfundamentals.week3;

public class Autenthificate {
    private String mEmail;
    private String mPhone;
    private Boolean mAccept;

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public Boolean getmAccept() {
        return mAccept;
    }

    public void setmAccept(Boolean mAccept) {
        this.mAccept = mAccept;
    }

    public Autenthificate(String mEmail, String mPhone, Boolean mAccept) {
        this.mEmail = mEmail;
        this.mPhone = mPhone;
        this.mAccept = mAccept;
    }

    @Override
    public String toString() {
        return mEmail + " " + mPhone;
    }

    public Autenthificate() {
    }
}
