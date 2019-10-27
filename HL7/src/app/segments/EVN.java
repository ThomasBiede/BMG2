package app.segments;

import java.time.LocalDateTime;
import java.util.Set;

import app.datatypes.XCN;

/**
 * EVN
 */
public class EVN {
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
     */
    public EVN(String eventTypeCode,  LocalDateTime recordedDateTime, LocalDateTime dateTimePlannedEvent,
            String eventReasonCode, Set<XCN> operatorID, LocalDateTime eventOccurred, String eventFacility) {

        this.eventTypeCode = eventTypeCode;
        this.recordedDateTime = recordedDateTime;
        this.dateTimePlannedEvent = dateTimePlannedEvent;
        this.eventReasonCode = eventReasonCode;
        this.operatorID = operatorID;
        this.eventOccurred = eventOccurred;
        this.eventFacility = eventFacility;
    }
}