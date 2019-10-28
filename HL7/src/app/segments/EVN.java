package app.segments;

import java.time.LocalDateTime;
import java.util.Set;

import app.datatypes.XCN;

/**
 * Java representation of segment "EVN" from HL7 protocol. Visit <a href=
 * "http://hl7-definition.caristix.com:9010/Default.aspx?version=HL7+v2.5.1&segment=EVN">HL7
 * documentation</a> for more info.
 * 
 * @author Thomas Biedermann
 * @author Daniel Karner
 * @version 1.1
 * @since 2019-10-27
 */

public class EVN 
{  
    private String eventTypeCode;
    private LocalDateTime recordedDateTime;
    private LocalDateTime dateTimePlannedEvent;
    private String eventReasonCode;
    private Set<XCN> operatorID;
    private LocalDateTime eventOccurred;
    private String eventFacility;

    /**
     * @param eventTypeCode
     * @param recordedDateTime
     * @param dateTimePlannedEvent
     * @param eventReasonCode
     * @param operatorID
     * @param eventOccurred
     * @param eventFacility
     * @return EVN instance
     */

    public EVN(
        String eventTypeCode,  
        LocalDateTime recordedDateTime, 
        LocalDateTime dateTimePlannedEvent,
        String eventReasonCode, 
        Set<XCN> operatorID, 
        LocalDateTime eventOccurred, 
        String eventFacility) 
        {

        this.eventTypeCode = eventTypeCode;
        this.recordedDateTime = recordedDateTime;
        this.dateTimePlannedEvent = dateTimePlannedEvent;
        this.eventReasonCode = eventReasonCode;
        this.operatorID = operatorID;
        this.eventOccurred = eventOccurred;
        this.eventFacility = eventFacility;
    }
}