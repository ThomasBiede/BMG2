package app.hl7_types.segment;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

import app.hl7_parser.XmlField;
import app.hl7_parser.XmlSerializeable;
import app.hl7_types.datatype.*;
import app.parsing.EncodingCharacters;

import app.parsing.Utils;

/**
 * @author Thomas Biedermann
 * @author Daniel Karner
 */
@XmlSerializeable
public class EVN {
    @XmlField
    String eventTypeCode;
    @XmlField
    LocalDateTime recordedDateTime;
    @XmlField
    LocalDateTime dateTimePlannedEvent;
    @XmlField
    String eventReasonCode;
    @XmlField
    Set<XCN> operatorID;
    @XmlField
    LocalDateTime eventOccurred;
    @XmlField
    String eventFacility;

    /**
     * @param eventTypeCode
     * @param recordedDateTime
     * @param dateTimePlannedEvent
     * @param eventReasonCode
     * @param operatorID
     * @param eventOccurred
     * @param eventFacility
     */
    public EVN(String eventTypeCode, LocalDateTime recordedDateTime, LocalDateTime dateTimePlannedEvent,
            String eventReasonCode, Set<XCN> operatorID, LocalDateTime eventOccurred, String eventFacility) {
        this.eventTypeCode = eventTypeCode;
        this.recordedDateTime = recordedDateTime;
        this.dateTimePlannedEvent = dateTimePlannedEvent;
        this.eventReasonCode = eventReasonCode;
        this.operatorID = operatorID;
        this.eventOccurred = eventOccurred;
        this.eventFacility = eventFacility;
    }

    /**
     * @param HL7String
     * @param encodingCharacters
     */
    public EVN(String HL7String, EncodingCharacters encodingCharacters) {
        String[] tokens = Utils.tokenizeHL7(HL7String, encodingCharacters.getFieldSeperator(),
                encodingCharacters.getEscapeCharacter(), 7);
        this.eventTypeCode = tokens[0];
        this.recordedDateTime = (LocalDateTime) Utils.toObject(tokens[1], LocalDateTime.class);
        this.dateTimePlannedEvent = (LocalDateTime) Utils.toObject(tokens[2], LocalDateTime.class);
        this.eventReasonCode = tokens[3];
        this.operatorID = Utils
                .toSet(tokens[4], XCN.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
                .map(temp -> {
                    return (XCN) temp;
                }).collect(Collectors.toSet());
        this.eventOccurred = (LocalDateTime) Utils.toObject(tokens[5], LocalDateTime.class);
        this.eventFacility = tokens[6];
    }

    @Override
    public String toString() {
        // TODO: Auto-generated, replace with HL7parse
        return "EVN [eventTypeCode=" + eventTypeCode + ", recordedDateTime=" + recordedDateTime
                + ", dateTimePlannedEvent=" + dateTimePlannedEvent + ", eventReasonCode=" + eventReasonCode
                + ", operatorID=" + operatorID + ", eventOccurred=" + eventOccurred + ", eventFacility=" + eventFacility
                + "]";
    }
}