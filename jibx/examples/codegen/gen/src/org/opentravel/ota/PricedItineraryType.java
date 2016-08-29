
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Itinerary with pricing information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PricedItineraryType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:AirItineraryType" name="AirItinerary" minOccurs="0"/>
 *     &lt;xs:element type="ns:AirItineraryPricingInfoType" name="AirItineraryPricingInfo" minOccurs="0"/>
 *     &lt;xs:element type="ns:FreeTextType" name="Notes" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element name="TicketingInfo" minOccurs="0">
 *       &lt;!-- Reference to inner class TicketingInfo -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" use="required" name="SequenceNumber"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PricedItineraryType
{
    private AirItineraryType airItinerary;
    private AirItineraryPricingInfoType airItineraryPricingInfo;
    private List<FreeTextType> noteList = new ArrayList<FreeTextType>();
    private TicketingInfo ticketingInfo;
    private String sequenceNumber;

    /** 
     * Get the 'AirItinerary' element value.  Specifies the origin and destination of the traveler. Attributes: DirectionInd - A directional indicator that identifies a type of air booking, either one-way, round-trip, or open-jaw with the enumeration of (OneWay | RT | OpenJaw) respectively. ActionCode - Indicates the status of the booking, such as OK or Wait-List. NumberInParty - Indicates the traveler count. 
     * 
     * @return value
     */
    public AirItineraryType getAirItinerary() {
        return airItinerary;
    }

    /** 
     * Set the 'AirItinerary' element value.  Specifies the origin and destination of the traveler. Attributes: DirectionInd - A directional indicator that identifies a type of air booking, either one-way, round-trip, or open-jaw with the enumeration of (OneWay | RT | OpenJaw) respectively. ActionCode - Indicates the status of the booking, such as OK or Wait-List. NumberInParty - Indicates the traveler count. 
     * 
     * @param airItinerary
     */
    public void setAirItinerary(AirItineraryType airItinerary) {
        this.airItinerary = airItinerary;
    }

    /** 
     * Get the 'AirItineraryPricingInfo' element value.  Pricing Information for an Air Itinerary.
     * 
     * @return value
     */
    public AirItineraryPricingInfoType getAirItineraryPricingInfo() {
        return airItineraryPricingInfo;
    }

    /** 
     * Set the 'AirItineraryPricingInfo' element value.  Pricing Information for an Air Itinerary.
     * 
     * @param airItineraryPricingInfo
     */
    public void setAirItineraryPricingInfo(
            AirItineraryPricingInfoType airItineraryPricingInfo) {
        this.airItineraryPricingInfo = airItineraryPricingInfo;
    }

    /** 
     * Get the list of 'Notes' element items. Provides for free form descriptive information for the priced itinerary.
     * 
     * @return list
     */
    public List<FreeTextType> getNoteList() {
        return noteList;
    }

    /** 
     * Set the list of 'Notes' element items. Provides for free form descriptive information for the priced itinerary.
     * 
     * @param list
     */
    public void setNoteList(List<FreeTextType> list) {
        noteList = list;
    }

    /** 
     * Get the 'TicketingInfo' element value.
     * 
     * @return value
     */
    public TicketingInfo getTicketingInfo() {
        return ticketingInfo;
    }

    /** 
     * Set the 'TicketingInfo' element value.
     * 
     * @param ticketingInfo
     */
    public void setTicketingInfo(TicketingInfo ticketingInfo) {
        this.ticketingInfo = ticketingInfo;
    }

    /** 
     * Get the 'SequenceNumber' attribute value. Assigns a number to priced itineraries.
     * 
     * @return value
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /** 
     * Set the 'SequenceNumber' attribute value. Assigns a number to priced itineraries.
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
    /** 
     * Container for TicketingInfoRS_Type.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketingInfo" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:TicketingInfoRS_Type">
     *         &lt;xs:sequence>
     *           &lt;xs:element name="DeliveryInfo" minOccurs="0" maxOccurs="5">
     *             &lt;!-- Reference to inner class DeliveryInfo -->
     *           &lt;/xs:element>
     *         &lt;/xs:sequence>
     *         &lt;xs:attribute type="ns:ListOfOTA_CodeType" use="optional" name="PaymentType"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * 
     * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ListOfOTA_CodeType">
     *   &lt;xs:list itemType="xs:string"/>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static class TicketingInfo extends TicketingInfoRSType
    {
        private List<DeliveryInfo> deliveryInfoList = new ArrayList<DeliveryInfo>();
        private List<String> paymentTypes = new ArrayList<String>();

        /** 
         * Get the list of 'DeliveryInfo' element items.
         * 
         * @return list
         */
        public List<DeliveryInfo> getDeliveryInfoList() {
            return deliveryInfoList;
        }

        /** 
         * Set the list of 'DeliveryInfo' element items.
         * 
         * @param list
         */
        public void setDeliveryInfoList(List<DeliveryInfo> list) {
            deliveryInfoList = list;
        }

        /** 
         * Get the list of 'PaymentType' attribute items. Specifies the allowable forms of payment (i.e., check, cash, credit card).  Refer to OTA Code List Payment Type (PMT).
         * 
         * @return list
         */
        public List<String> getPaymentTypes() {
            return paymentTypes;
        }

        /** 
         * Set the list of 'PaymentType' attribute items. Specifies the allowable forms of payment (i.e., check, cash, credit card).  Refer to OTA Code List Payment Type (PMT).
         * 
         * @param list
         */
        public void setPaymentTypes(List<String> list) {
            paymentTypes = list;
        }

        /** 
         * Serializer for 'PaymentType' attribute list.
         * 
         * @param values
         * @return text
         */
        public static String serializePaymentTypes(List<String> values) {
            if (values == null) {
                return null;
            } else {
                java.lang.StringBuffer buff = new java.lang.StringBuffer();
                for (java.util.Iterator<String> iter = values.iterator(); iter
                        .hasNext();) {
                    if (buff.length() > 0) {
                        buff.append(' ');
                    }
                    String value = iter.next();
                    buff.append(value);
                }
                return buff.toString();
            }
        }

        /** 
         * Deserializer for 'PaymentType' attribute list.
         * 
         * @param text
         * @return values
         * @throws org.jibx.runtime.JiBXException on conversion error
         */
        public static List<String> deserializePaymentTypes(String text)
                throws org.jibx.runtime.JiBXException {
            org.jibx.runtime.IListItemDeserializer ldser = new org.jibx.runtime.IListItemDeserializer() {
                public java.lang.Object deserialize(String text) {
                    return text;
                }
            };
            return (List<String>) org.jibx.runtime.Utility.deserializeList(
                    text, ldser);
        }
        /** 
         * Shipping information for the ticket.
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DeliveryInfo" minOccurs="0" maxOccurs="5">
         *   &lt;xs:complexType>
         *     &lt;xs:attribute type="xs:string" use="optional" name="DistribType"/>
         *     &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class DeliveryInfo
        {
            private String distribType;
            private CurrencyAmountGroup currencyAmountGroup;

            /** 
             * Get the 'DistribType' attribute value. Specifies the manner in which a ticket will be sent to the traveler. Refer to OTA Code List Distribution Type (DTB).
            			
             * 
             * @return value
             */
            public String getDistribType() {
                return distribType;
            }

            /** 
             * Set the 'DistribType' attribute value. Specifies the manner in which a ticket will be sent to the traveler. Refer to OTA Code List Distribution Type (DTB).
            			
             * 
             * @param distribType
             */
            public void setDistribType(String distribType) {
                this.distribType = distribType;
            }

            /** 
             * Get the 'CurrencyAmountGroup' attributeGroup value. Specifies the cost of the ticket delivery option.
             * 
             * @return value
             */
            public CurrencyAmountGroup getCurrencyAmountGroup() {
                return currencyAmountGroup;
            }

            /** 
             * Set the 'CurrencyAmountGroup' attributeGroup value. Specifies the cost of the ticket delivery option.
             * 
             * @param currencyAmountGroup
             */
            public void setCurrencyAmountGroup(
                    CurrencyAmountGroup currencyAmountGroup) {
                this.currencyAmountGroup = currencyAmountGroup;
            }
        }
    }
}
