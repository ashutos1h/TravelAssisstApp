package com.all.journeyplanner.travelassist.model;



public class AssistanceProviderInput {

    private AssistanceProviderInput(){
    	this.fromDate = fromDate;
        this.toDate = toDate;
        this.source = source;
        this.destination = destination;
        this.serviceType = serviceType;
        this.userType = userType;
        this.flagRange = flagRange;
    }

    public AssistanceProviderInput(String category, String item) {
        
    }

    public String getFromDate() {
        return fromDate;
    }

    public String getToDate() {
        return toDate;
    }
    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }
    
    public String getServiceType() {
        return serviceType;
    }

    public String getUserType() {
        return userType;
    }
    public String getFlagRange() {
        return flagRange;
    }
    
    private String fromDate;
    private String toDate;
    private String source;
    private String destination;
    private String serviceType;
    private String userType;
    private String flagRange;

}
