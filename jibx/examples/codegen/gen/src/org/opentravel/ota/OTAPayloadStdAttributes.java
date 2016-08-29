
package org.opentravel.ota;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/** 
 * The OTA_PayloadStdAttributes defines the standard attributes that appear on the root element for all OTA payloads.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OTA_PayloadStdAttributes">
 *   &lt;xs:attribute type="xs:string" use="optional" name="EchoToken"/>
 *   &lt;xs:attribute type="xs:dateTime" use="optional" name="TimeStamp"/>
 *   &lt;xs:attribute use="optional" default="Production" name="Target">
 *     &lt;xs:simpleType>
 *       &lt;!-- Reference to inner class Target -->
 *     &lt;/xs:simpleType>
 *   &lt;/xs:attribute>
 *   &lt;xs:attribute type="xs:decimal" use="required" name="Version"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="TransactionIdentifier"/>
 *   &lt;xs:attribute type="xs:integer" use="optional" name="SequenceNmbr"/>
 *   &lt;xs:attribute use="optional" name="TransactionStatusCode">
 *     &lt;xs:simpleType>
 *       &lt;!-- Reference to inner class TransactionStatusCode -->
 *     &lt;/xs:simpleType>
 *   &lt;/xs:attribute>
 *   &lt;xs:attributeGroup ref="ns:PrimaryLangID_Group"/>
 *   &lt;xs:attributeGroup ref="ns:AltLangID_Group"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="RetransmissionIndicator"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PrimaryLangID_Group">
 *   &lt;xs:attribute type="xs:string" use="optional" name="PrimaryLangID"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AltLangID_Group">
 *   &lt;xs:attribute type="xs:string" use="optional" name="AltLangID"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class OTAPayloadStdAttributes
{
    private String echoToken;
    private Date timeStamp;
    private Target target;
    private BigDecimal version;
    private String transactionIdentifier;
    private BigInteger sequenceNmbr;
    private TransactionStatusCode transactionStatusCode;
    private String primaryLangID;
    private String altLangID;
    private Boolean retransmissionIndicator;

    /** 
     * Get the 'EchoToken' attribute value. A reference for additional message identification, assigned by the requesting host system. When a request message includes an echo token the corresponding response message MUST include an echo token with an identical value.
     * 
     * @return value
     */
    public String getEchoToken() {
        return echoToken;
    }

    /** 
     * Set the 'EchoToken' attribute value. A reference for additional message identification, assigned by the requesting host system. When a request message includes an echo token the corresponding response message MUST include an echo token with an identical value.
     * 
     * @param echoToken
     */
    public void setEchoToken(String echoToken) {
        this.echoToken = echoToken;
    }

    /** 
     * Get the 'TimeStamp' attribute value. Indicates the creation date and time of the message in UTC using the following format specified by ISO 8601; YYYY-MM-DDThh:mm:ssZ with time values using the 24 hour clock (e.g. 20 November 2003, 1:59:38 pm UTC becomes 2003-11-20T13:59:38Z).
     * 
     * @return value
     */
    public Date getTimeStamp() {
        return timeStamp;
    }

    /** 
     * Set the 'TimeStamp' attribute value. Indicates the creation date and time of the message in UTC using the following format specified by ISO 8601; YYYY-MM-DDThh:mm:ssZ with time values using the 24 hour clock (e.g. 20 November 2003, 1:59:38 pm UTC becomes 2003-11-20T13:59:38Z).
     * 
     * @param timeStamp
     */
    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    /** 
     * Get the 'Target' attribute value. Used to indicate whether the request is for the Test or Production system.
     * 
     * @return value
     */
    public Target getTarget() {
        return target;
    }

    /** 
     * Set the 'Target' attribute value. Used to indicate whether the request is for the Test or Production system.
     * 
     * @param target
     */
    public void setTarget(Target target) {
        this.target = target;
    }

    /** 
     * Get the 'Version' attribute value. For all OTA versioned messages, the version of the message is indicated by a decimal value.
     * 
     * @return value
     */
    public BigDecimal getVersion() {
        return version;
    }

    /** 
     * Set the 'Version' attribute value. For all OTA versioned messages, the version of the message is indicated by a decimal value.
     * 
     * @param version
     */
    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    /** 
     * Get the 'TransactionIdentifier' attribute value. A unique identifier to relate all messages within a transaction (e.g. this would be sent in all request and response messages that are part of an on-going transaction).
     * 
     * @return value
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /** 
     * Set the 'TransactionIdentifier' attribute value. A unique identifier to relate all messages within a transaction (e.g. this would be sent in all request and response messages that are part of an on-going transaction).
     * 
     * @param transactionIdentifier
     */
    public void setTransactionIdentifier(String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
    }

    /** 
     * Get the 'SequenceNmbr' attribute value. Used to identify the sequence number of the transaction as assigned by the sending system; allows for an application to process messages in a certain order or to request a resynchronization of messages in the event that a system has been off-line and needs to retrieve messages that were missed. 
     * 
     * @return value
     */
    public BigInteger getSequenceNmbr() {
        return sequenceNmbr;
    }

    /** 
     * Set the 'SequenceNmbr' attribute value. Used to identify the sequence number of the transaction as assigned by the sending system; allows for an application to process messages in a certain order or to request a resynchronization of messages in the event that a system has been off-line and needs to retrieve messages that were missed. 
     * 
     * @param sequenceNmbr
     */
    public void setSequenceNmbr(BigInteger sequenceNmbr) {
        this.sequenceNmbr = sequenceNmbr;
    }

    /** 
     * Get the 'TransactionStatusCode' attribute value. This indicates where this message falls within a sequence of messages. 
     * 
     * @return value
     */
    public TransactionStatusCode getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /** 
     * Set the 'TransactionStatusCode' attribute value. This indicates where this message falls within a sequence of messages. 
     * 
     * @param transactionStatusCode
     */
    public void setTransactionStatusCode(
            TransactionStatusCode transactionStatusCode) {
        this.transactionStatusCode = transactionStatusCode;
    }

    /** 
     * Get the 'PrimaryLangID' attribute value. Identifes the primary language preference for the message.  The human language is identified by ISO 639 codes.
     * 
     * @return value
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /** 
     * Set the 'PrimaryLangID' attribute value. Identifes the primary language preference for the message.  The human language is identified by ISO 639 codes.
     * 
     * @param primaryLangID
     */
    public void setPrimaryLangID(String primaryLangID) {
        this.primaryLangID = primaryLangID;
    }

    /** 
     * Get the 'AltLangID' attribute value. Identifies the alternate language for a customer or message. The human language is identified by ISO 639 codes.
     * 
     * @return value
     */
    public String getAltLangID() {
        return altLangID;
    }

    /** 
     * Set the 'AltLangID' attribute value. Identifies the alternate language for a customer or message. The human language is identified by ISO 639 codes.
     * 
     * @param altLangID
     */
    public void setAltLangID(String altLangID) {
        this.altLangID = altLangID;
    }

    /** 
     * Get the 'RetransmissionIndicator' attribute value. When true, indicates the message is being re-sent after a failure. It is recommended that this attribute is used (i.e., set to TRUE) only when a message is retransmitted.
     * 
     * @return value
     */
    public Boolean getRetransmissionIndicator() {
        return retransmissionIndicator;
    }

    /** 
     * Set the 'RetransmissionIndicator' attribute value. When true, indicates the message is being re-sent after a failure. It is recommended that this attribute is used (i.e., set to TRUE) only when a message is retransmitted.
     * 
     * @param retransmissionIndicator
     */
    public void setRetransmissionIndicator(Boolean retransmissionIndicator) {
        this.retransmissionIndicator = retransmissionIndicator;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:restriction base="xs:string">
     *     &lt;xs:enumeration value="Test"/>
     *     &lt;xs:enumeration value="Production"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum Target {
        TEST("Test"), PRODUCTION("Production");
        private final String value;

        private Target(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static Target convert(String value) {
            for (Target inst : values()) {
                if (inst.xmlValue().equals(value)) {
                    return inst;
                }
            }
            return null;
        }
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:restriction base="xs:string">
     *     &lt;xs:enumeration value="Start"/>
     *     &lt;xs:enumeration value="End"/>
     *     &lt;xs:enumeration value="Rollback"/>
     *     &lt;xs:enumeration value="InSeries"/>
     *     &lt;xs:enumeration value="Continuation"/>
     *     &lt;xs:enumeration value="Subsequent"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum TransactionStatusCode {
        /** 
         * This is the first message within a transaction.
         */
        START("Start"), /** 
                         * This is the last message within a transaction.
                         */
        END("End"), /** 
                     * This indicates that all messages within the current transaction must be ignored.
                     */
        ROLLBACK("Rollback"), /** 
                               * This is any message that is not the first or last message within a transaction.
                               */
        IN_SERIES("InSeries"), /** 
                                * Specifies that this is a followup request asking for more of what was requested in the previous request.
                                */
        CONTINUATION("Continuation"), /** 
                                       * This request message is a subsequent request based on the previous message sent in this transaction.

                                       */
        SUBSEQUENT("Subsequent");
        private final String value;

        private TransactionStatusCode(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static TransactionStatusCode convert(String value) {
            for (TransactionStatusCode inst : values()) {
                if (inst.xmlValue().equals(value)) {
                    return inst;
                }
            }
            return null;
        }
    }
}
