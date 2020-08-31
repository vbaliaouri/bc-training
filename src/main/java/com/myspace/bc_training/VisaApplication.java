package com.myspace.bc_training;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class VisaApplication implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private int applicationId;
	private java.lang.String passportNumber;
	private java.time.LocalDate visitStartDate;
	private java.time.LocalDate visitEndDate;

	public VisaApplication() {
	}

	public int getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public java.lang.String getPassportNumber() {
		return this.passportNumber;
	}

	public void setPassportNumber(java.lang.String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public java.time.LocalDate getVisitStartDate() {
		return this.visitStartDate;
	}

	public void setVisitStartDate(java.time.LocalDate visitStartDate) {
		this.visitStartDate = visitStartDate;
	}

	public java.time.LocalDate getVisitEndDate() {
		return this.visitEndDate;
	}

	public void setVisitEndDate(java.time.LocalDate visitEndDate) {
		this.visitEndDate = visitEndDate;
	}

	public VisaApplication(int applicationId, java.lang.String passportNumber,
			java.time.LocalDate visitStartDate, java.time.LocalDate visitEndDate) {
		this.applicationId = applicationId;
		this.passportNumber = passportNumber;
		this.visitStartDate = visitStartDate;
		this.visitEndDate = visitEndDate;
	}
	
    @Override
    public java.lang.String toString() {
       return "VisaApplication(#" + applicationId + ", pass:" + passportNumber + ")";
    }

}