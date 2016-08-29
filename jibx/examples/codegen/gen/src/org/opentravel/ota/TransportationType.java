
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Defines the type of transportation offered.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TransportationType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="Transportation" maxOccurs="unbounded">
 *       &lt;!-- Reference to inner class Transportation -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TransportationType
{
    private List<Transportation> transportationList = new ArrayList<Transportation>();

    /** 
     * Get the list of 'Transportation' element items.
     * 
     * @return list
     */
    public List<Transportation> getTransportationList() {
        return transportationList;
    }

    /** 
     * Set the list of 'Transportation' element items.
     * 
     * @param list
     */
    public void setTransportationList(List<Transportation> list) {
        transportationList = list;
    }
    /** 
     * Contains the directions to/from a specific location for a mode of travel.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Transportation" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="ns:MultimediaDescriptionsType" name="MultimediaDescriptions" minOccurs="0"/>
     *       &lt;xs:element type="ns:OperationSchedulesType" name="OperationSchedules" minOccurs="0"/>
     *       &lt;xs:element type="xs:string" name="DescriptiveText" minOccurs="0"/>
     *     &lt;/xs:sequence>
     *     &lt;xs:attribute type="xs:string" use="optional" name="NotificationRequired"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="TransportationCode"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="ChargeUnit"/>
     *     &lt;xs:attribute type="xs:boolean" use="optional" name="Included"/>
     *     &lt;xs:attributeGroup ref="ns:CodeInfoGroup"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="Description"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="TypicalTravelTime"/>
     *     &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="ExistsCode"/>
     *     &lt;xs:attributeGroup ref="ns:ID_OptionalGroup"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * 
     * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ID_OptionalGroup">
     *   &lt;xs:attribute type="xs:string" use="optional" name="ID"/>
     * &lt;/xs:attributeGroup>
     * </pre>
     */
    public static class Transportation
    {
        private MultimediaDescriptionsType multimediaDescriptions;
        private OperationSchedulesType operationSchedules;
        private String descriptiveText;
        private String notificationRequired;
        private String transportationCode;
        private String chargeUnit;
        private Boolean included;
        private CodeInfoGroup codeInfoGroup;
        private String description;
        private String typicalTravelTime;
        private CurrencyAmountGroup currencyAmountGroup;
        private String existsCode;
        private String ID;

        /** 
         * Get the 'MultimediaDescriptions' element value. Multimedia information about the transportation.
         * 
         * @return value
         */
        public MultimediaDescriptionsType getMultimediaDescriptions() {
            return multimediaDescriptions;
        }

        /** 
         * Set the 'MultimediaDescriptions' element value. Multimedia information about the transportation.
         * 
         * @param multimediaDescriptions
         */
        public void setMultimediaDescriptions(
                MultimediaDescriptionsType multimediaDescriptions) {
            this.multimediaDescriptions = multimediaDescriptions;
        }

        /** 
         * Get the 'OperationSchedules' element value. Collection of operation schedules for the transportation.
         * 
         * @return value
         */
        public OperationSchedulesType getOperationSchedules() {
            return operationSchedules;
        }

        /** 
         * Set the 'OperationSchedules' element value. Collection of operation schedules for the transportation.
         * 
         * @param operationSchedules
         */
        public void setOperationSchedules(
                OperationSchedulesType operationSchedules) {
            this.operationSchedules = operationSchedules;
        }

        /** 
         * Get the 'DescriptiveText' element value. Descriptive text that describes the transportation.
         * 
         * @return value
         */
        public String getDescriptiveText() {
            return descriptiveText;
        }

        /** 
         * Set the 'DescriptiveText' element value. Descriptive text that describes the transportation.
         * 
         * @param descriptiveText
         */
        public void setDescriptiveText(String descriptiveText) {
            this.descriptiveText = descriptiveText;
        }

        /** 
         * Get the 'NotificationRequired' attribute value. This would be used for information such as a shuttle needs to be requested or a reservation is required.
         * 
         * @return value
         */
        public String getNotificationRequired() {
            return notificationRequired;
        }

        /** 
         * Set the 'NotificationRequired' attribute value. This would be used for information such as a shuttle needs to be requested or a reservation is required.
         * 
         * @param notificationRequired
         */
        public void setNotificationRequired(String notificationRequired) {
            this.notificationRequired = notificationRequired;
        }

        /** 
         * Get the 'TransportationCode' attribute value. The mode of transportation. Refer to OTA Code List Transportation Code (TRP).
         * 
         * @return value
         */
        public String getTransportationCode() {
            return transportationCode;
        }

        /** 
         * Set the 'TransportationCode' attribute value. The mode of transportation. Refer to OTA Code List Transportation Code (TRP).
         * 
         * @param transportationCode
         */
        public void setTransportationCode(String transportationCode) {
            this.transportationCode = transportationCode;
        }

        /** 
         * Get the 'ChargeUnit' attribute value. Refer to OTA Codelist Charge Type (CHG).
         * 
         * @return value
         */
        public String getChargeUnit() {
            return chargeUnit;
        }

        /** 
         * Set the 'ChargeUnit' attribute value. Refer to OTA Codelist Charge Type (CHG).
         * 
         * @param chargeUnit
         */
        public void setChargeUnit(String chargeUnit) {
            this.chargeUnit = chargeUnit;
        }

        /** 
         * Get the 'Included' attribute value.
         * 
         * @return value
         */
        public Boolean getIncluded() {
            return included;
        }

        /** 
         * Set the 'Included' attribute value.
         * 
         * @param included
         */
        public void setIncluded(Boolean included) {
            this.included = included;
        }

        /** 
         * Get the 'CodeInfoGroup' attributeGroup value. May be used to give further detail on the code (e.g. if a trolley is chosen, the trolley name could be added here) or to remove an obsolete item.								
         * 
         * @return value
         */
        public CodeInfoGroup getCodeInfoGroup() {
            return codeInfoGroup;
        }

        /** 
         * Set the 'CodeInfoGroup' attributeGroup value. May be used to give further detail on the code (e.g. if a trolley is chosen, the trolley name could be added here) or to remove an obsolete item.								
         * 
         * @param codeInfoGroup
         */
        public void setCodeInfoGroup(CodeInfoGroup codeInfoGroup) {
            this.codeInfoGroup = codeInfoGroup;
        }

        /** 
         * Get the 'Description' attribute value. Descriptive information about the mode of transportation.
         * 
         * @return value
         */
        public String getDescription() {
            return description;
        }

        /** 
         * Set the 'Description' attribute value. Descriptive information about the mode of transportation.
         * 
         * @param description
         */
        public void setDescription(String description) {
            this.description = description;
        }

        /** 
         * Get the 'TypicalTravelTime' attribute value. The normal (average) travel time required to get to or from the location, measured in minutes. 
         * 
         * @return value
         */
        public String getTypicalTravelTime() {
            return typicalTravelTime;
        }

        /** 
         * Set the 'TypicalTravelTime' attribute value. The normal (average) travel time required to get to or from the location, measured in minutes. 
         * 
         * @param typicalTravelTime
         */
        public void setTypicalTravelTime(String typicalTravelTime) {
            this.typicalTravelTime = typicalTravelTime;
        }

        /** 
         * Get the 'CurrencyAmountGroup' attributeGroup value.
         * 
         * @return value
         */
        public CurrencyAmountGroup getCurrencyAmountGroup() {
            return currencyAmountGroup;
        }

        /** 
         * Set the 'CurrencyAmountGroup' attributeGroup value.
         * 
         * @param currencyAmountGroup
         */
        public void setCurrencyAmountGroup(
                CurrencyAmountGroup currencyAmountGroup) {
            this.currencyAmountGroup = currencyAmountGroup;
        }

        /** 
         * Get the 'ExistsCode' attribute value. This attribute is used to explicitly define whether the type of transportation applies. Refer to OTA Code list Option Type Code (OTC). This is used in conjunction with TransportationCode.
         * 
         * @return value
         */
        public String getExistsCode() {
            return existsCode;
        }

        /** 
         * Set the 'ExistsCode' attribute value. This attribute is used to explicitly define whether the type of transportation applies. Refer to OTA Code list Option Type Code (OTC). This is used in conjunction with TransportationCode.
         * 
         * @param existsCode
         */
        public void setExistsCode(String existsCode) {
            this.existsCode = existsCode;
        }

        /** 
         * Get the 'ID' attribute value. A unique identifying value assigned by the creating system.  The ID attribute may be used to reference a primary-key value within a database or in a particular implementation.
         * 
         * @return value
         */
        public String getID() {
            return ID;
        }

        /** 
         * Set the 'ID' attribute value. A unique identifying value assigned by the creating system.  The ID attribute may be used to reference a primary-key value within a database or in a particular implementation.
         * 
         * @param ID
         */
        public void setID(String ID) {
            this.ID = ID;
        }
    }
}
