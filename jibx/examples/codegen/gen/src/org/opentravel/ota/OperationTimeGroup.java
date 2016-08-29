
package org.opentravel.ota;

/** 
 * Provides information for operational events for a flight leg (e.g., off-ground)
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OperationTimeGroup">
 *   &lt;xs:attribute type="xs:string" use="required" name="Time"/>
 *   &lt;xs:attribute type="xs:string" use="required" name="OperationType"/>
 *   &lt;xs:attribute use="required" name="TimeType">
 *     &lt;xs:simpleType>
 *       &lt;!-- Reference to inner class TimeType -->
 *     &lt;/xs:simpleType>
 *   &lt;/xs:attribute>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ReasonCode"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class OperationTimeGroup
{
    private String time;
    private String operationType;
    private TimeType timeType;
    private String reasonCode;

    /** 
     * Get the 'Time' attribute value.  Time or date/time an operational event happened.
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'Time' attribute value.  Time or date/time an operational event happened.
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /** 
     * Get the 'OperationType' attribute value. Type of operational event (e.g., off-ground). References the OTA Code Table OTT.
     * 
     * @return value
     */
    public String getOperationType() {
        return operationType;
    }

    /** 
     * Set the 'OperationType' attribute value. Type of operational event (e.g., off-ground). References the OTA Code Table OTT.
     * 
     * @param operationType
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /** 
     * Get the 'TimeType' attribute value.  Describes whether the operational event time is scheduled, estimated or actual.
     * 
     * @return value
     */
    public TimeType getTimeType() {
        return timeType;
    }

    /** 
     * Set the 'TimeType' attribute value.  Describes whether the operational event time is scheduled, estimated or actual.
     * 
     * @param timeType
     */
    public void setTimeType(TimeType timeType) {
        this.timeType = timeType;
    }

    /** 
     * Get the 'ReasonCode' attribute value. The reason attributed to a delay or cancellation.  
    Refers to  OTA Code Table FDC.
     * 
     * @return value
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /** 
     * Set the 'ReasonCode' attribute value. The reason attributed to a delay or cancellation.  
    Refers to  OTA Code Table FDC.
     * 
     * @param reasonCode
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:restriction base="xs:string">
     *     &lt;xs:enumeration value="Actual"/>
     *     &lt;xs:enumeration value="Scheduled"/>
     *     &lt;xs:enumeration value="Estimated"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum TimeType {
        /** 
         *  The actual operation time.
         */
        ACTUAL("Actual"), /** 
                           *  The scheduled time.
                           */
        SCHEDULED("Scheduled"), /** 
                                 *  The estimated time.
                                 */
        ESTIMATED("Estimated");
        private final String value;

        private TimeType(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static TimeType convert(String value) {
            for (TimeType inst : values()) {
                if (inst.xmlValue().equals(value)) {
                    return inst;
                }
            }
            return null;
        }
    }
}
