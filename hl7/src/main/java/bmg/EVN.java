package main.java.bmg;

/**
 * EVN
 */
public class EVN {
    /**
     * ! Withdrawn fields
     */
    private String   eventTypeCode;
    
    /**
     * *Required fields
     */
    private DateTime recordedTimestamp;        
    
    /**
     * * Optional fields
     */
    private DateTime plannedEventTimestamp;
    private String   eventReasonCode;
    private String   operatorId;
    private DateTime eventOccuredTimestamp;
    private HD       eventFacility;
}