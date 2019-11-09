package app.hl7_types.segment;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;
import app.hl7_parser.Hl7Field;
import app.hl7_parser.Hl7Serializeable;
import app.parsing.EncodingCharacters;

import app.parsing.Utils;

/**
 * @author Thomas Biedermann
 * @author Daniel Karner
 *
 */
@Hl7Serializeable
public class MSH {
    @Hl7Field
    String fieldSeparator;
    @Hl7Field
    String encodingChars;
    @Hl7Field
    String sendingApplication;
    @Hl7Field
    String sendingFacility;
    @Hl7Field
    String receivingApplication;
    @Hl7Field
    String receivingFacility;
    @Hl7Field
    LocalDateTime dateTimeOfMessage;
    @Hl7Field
    String security;
    @Hl7Field
    String messageType;
    @Hl7Field
    String messageControlID;
    @Hl7Field
    String processingID;
    @Hl7Field
    String versionID;
    @Hl7Field
    long sequenceNumber;
    @Hl7Field
    String continuationPointer;
    @Hl7Field
    String acceptAcknowledgmentType;
    @Hl7Field
    String applicationAcknowledgmentType;
    @Hl7Field
    String countryCode;
    @Hl7Field
    Set<String> characterSet;
    @Hl7Field
    String principalLanguageOfMessage;
    @Hl7Field
    String alternateCharacterSetHandlingScheme;
    @Hl7Field
    Set<String> messageProfileIdentifier;

    /**
     * @param fieldSeparator
     * @param encodingChars
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
    MSH(String fieldSeparator, String encodingChars, String sendingApplication, String sendingFacility,
            String receivingApplication, String receivingFacility, LocalDateTime dateTimeOfMessage, String security,
            String messageType, String messageControlID, String processingID, String versionID, long sequenceNumber,
            String continuationPointer, String acceptAcknowledgmentType, String applicationAcknowledgmentType,
            String countryCode, Set<String> characterSet, String principalLanguageOfMessage,
            String alternateCharacterSetHandlingScheme, Set<String> messageProfileIdentifier) {
        this.fieldSeparator = fieldSeparator;
        this.encodingChars = encodingChars;
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

    /**
     * @param HL7String
     * @param encodingCharacters
     */
    public MSH(String HL7String, EncodingCharacters encodingCharacters) {
        String[] tokens = Utils.tokenizeHL7(HL7String, encodingCharacters.getFieldSeperator(),
                encodingCharacters.getEscapeCharacter(), 21);
        this.fieldSeparator = tokens[0];
        this.encodingChars = tokens[1];
        this.sendingApplication = tokens[2];
        this.sendingFacility = tokens[3];
        this.receivingApplication = tokens[4];
        this.receivingFacility = tokens[5];
        this.dateTimeOfMessage = (LocalDateTime) Utils.toObject(tokens[6], LocalDateTime.class);
        this.security = tokens[7];
        this.messageType = tokens[8];
        this.messageControlID = tokens[9];
        this.processingID = tokens[10];
        this.versionID = tokens[11];
        this.sequenceNumber = (long) Utils.toObject(tokens[12], Long.class);
        this.continuationPointer = tokens[13];
        this.acceptAcknowledgmentType = tokens[14];
        this.applicationAcknowledgmentType = tokens[15];
        this.countryCode = tokens[16];
        this.characterSet = Utils
                .toSet(tokens[17], String.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters)
                .stream().map(String::valueOf).collect(Collectors.toSet());
        this.principalLanguageOfMessage = tokens[18];
        this.alternateCharacterSetHandlingScheme = tokens[19];
        this.messageProfileIdentifier = Utils
                .toSet(tokens[20], String.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters)
                .stream().map(String::valueOf).collect(Collectors.toSet());
    }

    @Override
    public String toString() {
        // TODO: Auto-generated, replace with HL7parse
        return "MSH [fieldSeparator=" + fieldSeparator + ", encodingChars=" + encodingChars + ", sendingApplication="
                + sendingApplication + ", sendingFacility=" + sendingFacility + ", receivingApplication="
                + receivingApplication + ", receivingFacility=" + receivingFacility + ", dateTimeOfMessage="
                + dateTimeOfMessage + ", security=" + security + ", messageType=" + messageType + ", messageControlID="
                + messageControlID + ", processingID=" + processingID + ", versionID=" + versionID + ", sequenceNumber="
                + sequenceNumber + ", continuationPointer=" + continuationPointer + ", acceptAcknowledgmentType="
                + acceptAcknowledgmentType + ", applicationAcknowledgmentType=" + applicationAcknowledgmentType
                + ", countryCode=" + countryCode + ", characterSet=" + characterSet + ", principalLanguageOfMessage="
                + principalLanguageOfMessage + ", alternateCharacterSetHandlingScheme="
                + alternateCharacterSetHandlingScheme + ", messageProfileIdentifier=" + messageProfileIdentifier + "]";
    }
}