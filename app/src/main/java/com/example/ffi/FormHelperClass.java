package com.example.ffi;

public class FormHelperClass {
    String patientName, relativeName, phoneno, volunteerName, bldgroup, message;

    public FormHelperClass() {

    }

    public FormHelperClass(String patientName, String relativeName, String phoneno, String volunteerName, String bldgroup, String message) {
        this.patientName = patientName;
        this.relativeName = relativeName;
        this.phoneno = phoneno;
        this.volunteerName = volunteerName;
        this.bldgroup = bldgroup;
        this.message = message;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getRelativeName() {
        return relativeName;
    }

    public void setRelativeName(String relativeName) {
        this.relativeName = relativeName;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }

    public String getBldgroup() {
        return bldgroup;
    }

    public void setBldgroup(String bldgroup) {
        this.bldgroup = bldgroup;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}