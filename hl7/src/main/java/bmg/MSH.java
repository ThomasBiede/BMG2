package main.java.bmg;

import main.java.bmg.subclasses.HD;
import main.java.bmg.subclasses.MSG;

/**
 * MSH
 */
public class MSH {
    /**
     * * Required fields
     */
    private String fieldSeperator;
    private String encodingChars;
    private String processingId;
    private String versionId;

    private DateTime messageTimestamp;
    private MSG      messageType;
    private String   messageControlId;

    /**
     * * Optional fields
     */
    private HD     sendingApp;
    private HD     sendingFac;
    private HD     recvApp;
    private HD     recvFac;
    private String security;

    /**
     * Constructor only for fields with the required tag
     * 
     * @param fieldSeperator
     * @param encodingChars
     * @param processingId
     * @param versionId
     * @param messageTimestamp
     * @param messageType
     * @param messageControlId
     */
    public MSH(
        String   fieldSeperator,
        String   encodingChars,
        String   processingId,
        String   versionId,
        DateTime messageTimestamp,
        MSG      messageType,
        String   messageControlId        
        ) {
        super();
        this.fieldSeperator   = fieldSeperator;
        this.encodingChars    = encodingChars;
        this.processingId     = processingId;
        this.versionId        = versionId;
        this.messageTimestamp = messageTimestamp;
        this.messageControlId = messageType;
        this.messageType      = messageControlId;
    }

    /**
     * Constructor  for fields with the required and the optional tag
     * 
     * @param fieldSeperator
     * @param encodingChars
     * @param processingId
     * @param versionId
     * @param messageTimestamp
     * @param messageType
     * @param messageControlId
     * @param sendingApp
     * @param sendingFac
     * @param recvApp
     * @param recvFac
     * @param security
     */
    public MSH(
        String   fieldSeperator,
        String   encodingChars,
        String   processingId,
        String   versionId,
        DateTime messageTimestamp,
        MSG      messageType,
        String   messageControlId,
        HD       sendingApp,
        HD       sendingFac,
        HD       recvApp,
        HD       recvFac,
        String   security       
        ) {
        super();
        this.fieldSeperator   = fieldSeperator;
        this.encodingChars    = encodingChars;
        this.processingId     = processingId;
        this.versionId        = versionId;
        this.messageTimestamp = messageTimestamp;
        this.messageControlId = messageType;
        this.messageType      = messageControlId;
        this.sendingApp       = sendingApp;
        this.sendingFac       = sendingFac;
        this.recvApp          = recvApp;
        this.recvFac          = recvFac;
        this.security         = security;
    }
}
