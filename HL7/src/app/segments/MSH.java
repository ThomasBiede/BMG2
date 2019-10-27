package app.segments;

import java.time.LocalDateTime;
import java.util.Set;

/**
 * MSH
 */
public class MSH {
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
    MSH(String fieldSeparator, String encodingCharacters, String sendingApplication, String sendingFacility,
            String receivingApplication, String receivingFacility, LocalDateTime dateTimeOfMessage,
            String security, String messageType, String messageControlID, long processingID, long versionID,
            double sequenceNumber, String continuationPointer, String acceptAcknowledgmentType,
            String applicationAcknowledgmentType, String countryCode, Set<String> characterSet,
            String principalLanguageOfMessage, String alternateCharacterSetHandlingScheme,
            Set<String> messageProfileIdentifier) {

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
