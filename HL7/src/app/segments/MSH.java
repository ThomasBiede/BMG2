package app.segments;

import java.time.LocalDateTime;
import java.util.Set;

/**
 * Java representation of segment "MSH" from HL7 protocol. Visit <a href=
 * "http://hl7-definition.caristix.com:9010/Default.aspx?version=HL7+v2.5.1&segment=MSH">HL7
 * documentation</a> for more info.
 * 
 * @author Thomas Biedermann
 * @author Daniel Karner
 * @version 1.1
 * @since 2019-10-27
 */

public class MSH extends Segments
{
    private String fieldSeparator;
    private String encodingCharacters;
    private String sendingApplication;
    private String sendingFacility;
    private String receivingApplication;
    private String receivingFacility;
    private LocalDateTime dateTimeOfMessage;
    private String security;
    private String messageType;
    private String messageControlID;
    private long processingID;
    private long versionID;
    private double sequenceNumber;
    private String continuationPointer;
    private String acceptAcknowledgmentType;
    private String applicationAcknowledgmentType;
    private String countryCode;
    private Set<String> characterSet;
    private String principalLanguageOfMessage;
    private String alternateCharacterSetHandlingScheme;
    private Set<String> messageProfileIdentifier;

    /**
     * @param fieldSeparator
     * @param encodingCharacters
     * @param sendingApplication
     * @param sendingFacility
     * @param receivingApplication
     * @param receivingFacility
     * @param dateTimeOfMessage
     * @param security
     * @param messageType
     * @param messageControlID
     * @param processingID
     * @param versionID
     * @param sequenceNumber
     * @param continuationPointer
     * @param acceptAcknowledgmentType
     * @param applicationAcknowledgmentType
     * @param countryCode
     * @param characterSet
     * @param principalLanguageOfMessage
     * @param alternateCharacterSetHandlingScheme
     * @param messageProfileIdentifier
     */

    public MSH(
        String fieldSeparator, 
        String encodingCharacters, 
        String sendingApplication, 
        String sendingFacility,
        String receivingApplication, 
        String receivingFacility, 
        LocalDateTime dateTimeOfMessage,
        String security, 
        String messageType, 
        String messageControlID, 
        long processingID, 
        long versionID,
        double sequenceNumber, 
        String continuationPointer, 
        String acceptAcknowledgmentType,
        String applicationAcknowledgmentType, 
        String countryCode, 
        Set<String> characterSet,
        String principalLanguageOfMessage, 
        String alternateCharacterSetHandlingScheme,
        Set<String> messageProfileIdentifier) 
        {

        this.fieldSeparator = fieldSeparator;
        this.encodingCharacters = encodingCharacters;
        this.sendingApplication = sendingApplication;
        this.sendingFacility = sendingFacility;
        this.receivingApplication = receivingApplication;
        this.receivingFacility = receivingFacility;
        this.dateTimeOfMessage = dateTimeOfMessage;
        this.security = security;
        this.messageType = messageType;
        this.messageControlID = messageControlID;
        this.processingID = processingID;
        this.versionID = versionID;
        this.sequenceNumber = sequenceNumber;
        this.continuationPointer = continuationPointer;
        this.acceptAcknowledgmentType = acceptAcknowledgmentType;
        this.applicationAcknowledgmentType = applicationAcknowledgmentType;
        this.countryCode = countryCode;
        this.characterSet = characterSet;
        this.principalLanguageOfMessage = principalLanguageOfMessage;
        this.alternateCharacterSetHandlingScheme = alternateCharacterSetHandlingScheme;
        this.messageProfileIdentifier = messageProfileIdentifier;
    }    
}
