
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Details of an operating schedule (e.g. a golf tee time may be more expensive during peak hours v. off peak hours).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OperationScheduleType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="OperationTimes" minOccurs="0">
 *       &lt;!-- Reference to inner class OperationTimes -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:DateTimeSpanGroup"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OperationScheduleType
{
    private OperationTimes operationTimes;
    private DateTimeSpanGroup dateTimeSpanGroup;

    /** 
     * Get the 'OperationTimes' element value.
     * 
     * @return value
     */
    public OperationTimes getOperationTimes() {
        return operationTimes;
    }

    /** 
     * Set the 'OperationTimes' element value.
     * 
     * @param operationTimes
     */
    public void setOperationTimes(OperationTimes operationTimes) {
        this.operationTimes = operationTimes;
    }

    /** 
     * Get the 'DateTimeSpanGroup' attributeGroup value.
     * 
     * @return value
     */
    public DateTimeSpanGroup getDateTimeSpanGroup() {
        return dateTimeSpanGroup;
    }

    /** 
     * Set the 'DateTimeSpanGroup' attributeGroup value.
     * 
     * @param dateTimeSpanGroup
     */
    public void setDateTimeSpanGroup(DateTimeSpanGroup dateTimeSpanGroup) {
        this.dateTimeSpanGroup = dateTimeSpanGroup;
    }
    /** 
     * A collection of OperationTimes.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OperationTimes" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="OperationTime" maxOccurs="999">
     *         &lt;!-- Reference to inner class OperationTime -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class OperationTimes
    {
        private List<OperationTime> operationTimeList = new ArrayList<OperationTime>();

        /** 
         * Get the list of 'OperationTime' element items.
         * 
         * @return list
         */
        public List<OperationTime> getOperationTimeList() {
            return operationTimeList;
        }

        /** 
         * Set the list of 'OperationTime' element items.
         * 
         * @param list
         */
        public void setOperationTimeList(List<OperationTime> list) {
            operationTimeList = list;
        }
        /** 
         * Provides operating times of a facility.
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OperationTime" maxOccurs="999">
         *   &lt;xs:complexType>
         *     &lt;xs:attributeGroup ref="ns:DOW_PatternGroup"/>
         *     &lt;xs:attributeGroup ref="ns:DateTimeSpanGroup"/>
         *     &lt;xs:attribute type="xs:string" use="optional" name="AdditionalOperationInfoCode"/>
         *     &lt;xs:attribute type="xs:string" use="optional" name="Frequency"/>
         *     &lt;xs:attribute type="xs:string" use="optional" name="Text"/>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class OperationTime
        {
            private DOWPatternGroup DOWPatternGroup;
            private DateTimeSpanGroup dateTimeSpanGroup;
            private String additionalOperationInfoCode;
            private String frequency;
            private String text;

            /** 
             * Get the 'DOW_PatternGroup' attributeGroup value.
             * 
             * @return value
             */
            public DOWPatternGroup getDOWPatternGroup() {
                return DOWPatternGroup;
            }

            /** 
             * Set the 'DOW_PatternGroup' attributeGroup value.
             * 
             * @param DOWPatternGroup
             */
            public void setDOWPatternGroup(DOWPatternGroup DOWPatternGroup) {
                this.DOWPatternGroup = DOWPatternGroup;
            }

            /** 
             * Get the 'DateTimeSpanGroup' attributeGroup value.
             * 
             * @return value
             */
            public DateTimeSpanGroup getDateTimeSpanGroup() {
                return dateTimeSpanGroup;
            }

            /** 
             * Set the 'DateTimeSpanGroup' attributeGroup value.
             * 
             * @param dateTimeSpanGroup
             */
            public void setDateTimeSpanGroup(DateTimeSpanGroup dateTimeSpanGroup) {
                this.dateTimeSpanGroup = dateTimeSpanGroup;
            }

            /** 
             * Get the 'AdditionalOperationInfoCode' attribute value. Used to provide additional information regarding operation times (e.g., after hours operations, restricted times). Refer to OTA Codelist Additional Operation Info (OPR).
             * 
             * @return value
             */
            public String getAdditionalOperationInfoCode() {
                return additionalOperationInfoCode;
            }

            /** 
             * Set the 'AdditionalOperationInfoCode' attribute value. Used to provide additional information regarding operation times (e.g., after hours operations, restricted times). Refer to OTA Codelist Additional Operation Info (OPR).
             * 
             * @param additionalOperationInfoCode
             */
            public void setAdditionalOperationInfoCode(
                    String additionalOperationInfoCode) {
                this.additionalOperationInfoCode = additionalOperationInfoCode;
            }

            /** 
             * Get the 'Frequency' attribute value. The frequency with which this operation occurs (e.g., 'on the hour', 'on the half hour').
             * 
             * @return value
             */
            public String getFrequency() {
                return frequency;
            }

            /** 
             * Set the 'Frequency' attribute value. The frequency with which this operation occurs (e.g., 'on the hour', 'on the half hour').
             * 
             * @param frequency
             */
            public void setFrequency(String frequency) {
                this.frequency = frequency;
            }

            /** 
             * Get the 'Text' attribute value. Textual information for this period of operation.
             * 
             * @return value
             */
            public String getText() {
                return text;
            }

            /** 
             * Set the 'Text' attribute value. Textual information for this period of operation.
             * 
             * @param text
             */
            public void setText(String text) {
                this.text = text;
            }
        }
    }
}
