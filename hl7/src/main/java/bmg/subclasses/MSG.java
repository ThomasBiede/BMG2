package main.java.bmg.subclasses;

/**
 * MSG
 */
public class MSG {

    private String messageCode;
    private String triggerEvent;
    private String messageStruct;

    /**
     * Constructor for the MSG class
     * 
     * @param messageCode
     * @param triggerEvent
     * @param messageStruct
     */
    public MSG(String messageCode, String triggerEvent, String messageStruct) {
        super();
        this.messageCode   = messageCode;
        this.triggerEvent  = triggerEvent;
        this.messageStruct = messageStruct;
    }

    /**
     * @param messageCode the messageCode to set
     */
    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    /**
     * @param triggerEvent the triggerEvent to set
     */
    public void setTriggerEvent(String triggerEvent) {
        this.triggerEvent = triggerEvent;
    }

    /**
     * @param messageStruct the messageStruct to set
     */
    public void setMessageStruct(String messageStruct) {
        this.messageStruct = messageStruct;
    }

    /**
     * @return the messageCode
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * @return the triggerEvent
     */
    public String getTriggerEvent() {
        return triggerEvent;
    }

    /**
     * @return the messageStruct
     */
    public String getMessageStruct() {
        return messageStruct;
    }
}