
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Per passenger type code pricing for this itinerary. Set if fareBreakdown was requested.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PTCFareBreakdownType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:PassengerTypeQuantityType" name="PassengerTypeQuantity"/>
 *     &lt;xs:element name="FareBasisCodes">
 *       &lt;xs:complexType>
 *         &lt;xs:sequence>
 *           &lt;xs:element type="xs:string" name="FareBasisCode" maxOccurs="10"/>
 *         &lt;/xs:sequence>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:FareType" name="PassengerFare"/>
 *     &lt;xs:element name="TravelerRefNumber" minOccurs="0" maxOccurs="99">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:TravelerRefNumberGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element name="TicketDesignators" minOccurs="0">
 *       &lt;!-- Reference to inner class TicketDesignators -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="Endorsements" minOccurs="0">
 *       &lt;!-- Reference to inner class Endorsements -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="FareInfo" minOccurs="0" maxOccurs="99">
 *       &lt;!-- Reference to inner class FareInfo -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="ns:PricingSourceType" use="optional" name="PricingSource"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PTCFareBreakdownType
{
    private PassengerTypeQuantityType passengerTypeQuantity;
    private List<String> fareBasisCodeList = new ArrayList<String>();
    private FareType passengerFare;
    private List<TravelerRefNumberGroup> travelerRefNumberList = new ArrayList<TravelerRefNumberGroup>();
    private TicketDesignators ticketDesignators;
    private Endorsements endorsements;
    private List<FareInfo> fareInfoList = new ArrayList<FareInfo>();
    private PricingSourceType pricingSource;

    /** 
     * Get the 'PassengerTypeQuantity' element value. Number of individuals traveling under this PTC
     * 
     * @return value
     */
    public PassengerTypeQuantityType getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    /** 
     * Set the 'PassengerTypeQuantity' element value. Number of individuals traveling under this PTC
     * 
     * @param passengerTypeQuantity
     */
    public void setPassengerTypeQuantity(
            PassengerTypeQuantityType passengerTypeQuantity) {
        this.passengerTypeQuantity = passengerTypeQuantity;
    }

    /** 
     * Get the list of 'FareBasisCode' element items. This is a collection of Fare Basis Codes
     * 
     * @return list
     */
    public List<String> getFareBasisCodeList() {
        return fareBasisCodeList;
    }

    /** 
     * Set the list of 'FareBasisCode' element items. This is a collection of Fare Basis Codes
     * 
     * @param list
     */
    public void setFareBasisCodeList(List<String> list) {
        fareBasisCodeList = list;
    }

    /** 
     * Get the 'PassengerFare' element value. The total passenger fare with cost breakdown.
     * 
     * @return value
     */
    public FareType getPassengerFare() {
        return passengerFare;
    }

    /** 
     * Set the 'PassengerFare' element value. The total passenger fare with cost breakdown.
     * 
     * @param passengerFare
     */
    public void setPassengerFare(FareType passengerFare) {
        this.passengerFare = passengerFare;
    }

    /** 
     * Get the list of 'TravelerRefNumber' element items. Contains the RPH reference to the traveler.
     * 
     * @return list
     */
    public List<TravelerRefNumberGroup> getTravelerRefNumberList() {
        return travelerRefNumberList;
    }

    /** 
     * Set the list of 'TravelerRefNumber' element items. Contains the RPH reference to the traveler.
     * 
     * @param list
     */
    public void setTravelerRefNumberList(List<TravelerRefNumberGroup> list) {
        travelerRefNumberList = list;
    }

    /** 
     * Get the 'TicketDesignators' element value.
     * 
     * @return value
     */
    public TicketDesignators getTicketDesignators() {
        return ticketDesignators;
    }

    /** 
     * Set the 'TicketDesignators' element value.
     * 
     * @param ticketDesignators
     */
    public void setTicketDesignators(TicketDesignators ticketDesignators) {
        this.ticketDesignators = ticketDesignators;
    }

    /** 
     * Get the 'Endorsements' element value.
     * 
     * @return value
     */
    public Endorsements getEndorsements() {
        return endorsements;
    }

    /** 
     * Set the 'Endorsements' element value.
     * 
     * @param endorsements
     */
    public void setEndorsements(Endorsements endorsements) {
        this.endorsements = endorsements;
    }

    /** 
     * Get the list of 'FareInfo' element items.
     * 
     * @return list
     */
    public List<FareInfo> getFareInfoList() {
        return fareInfoList;
    }

    /** 
     * Set the list of 'FareInfo' element items.
     * 
     * @param list
     */
    public void setFareInfoList(List<FareInfo> list) {
        fareInfoList = list;
    }

    /** 
     * Get the 'PricingSource' attribute value.  Indicates whether the fare is public, private or both.
     * 
     * @return value
     */
    public PricingSourceType getPricingSource() {
        return pricingSource;
    }

    /** 
     * Set the 'PricingSource' attribute value.  Indicates whether the fare is public, private or both.
     * 
     * @param pricingSource
     */
    public void setPricingSource(PricingSourceType pricingSource) {
        this.pricingSource = pricingSource;
    }
    /** 
     * This is a collection of ticket designator elements.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketDesignators" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="TicketDesignator" maxOccurs="10">
     *         &lt;!-- Reference to inner class TicketDesignator -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class TicketDesignators
    {
        private List<TicketDesignator> ticketDesignatorList = new ArrayList<TicketDesignator>();

        /** 
         * Get the list of 'TicketDesignator' element items.
         * 
         * @return list
         */
        public List<TicketDesignator> getTicketDesignatorList() {
            return ticketDesignatorList;
        }

        /** 
         * Set the list of 'TicketDesignator' element items.
         * 
         * @param list
         */
        public void setTicketDesignatorList(List<TicketDesignator> list) {
            ticketDesignatorList = list;
        }
        /** 
         * Contains the discount code and a flight reference applicable to the fare.
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketDesignator" maxOccurs="10">
         *   &lt;xs:complexType>
         *     &lt;xs:attribute type="xs:string" use="optional" name="FlightRefRPH"/>
         *     &lt;xs:attribute type="xs:string" use="optional" name="TicketDesignatorCode"/>
         *     &lt;xs:attribute type="xs:string" use="optional" name="TicketDesignatorExtension"/>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class TicketDesignator
        {
            private String flightRefRPH;
            private String ticketDesignatorCode;
            private String ticketDesignatorExtension;

            /** 
             * Get the 'FlightRefRPH' attribute value.
             * 
             * @return value
             */
            public String getFlightRefRPH() {
                return flightRefRPH;
            }

            /** 
             * Set the 'FlightRefRPH' attribute value.
             * 
             * @param flightRefRPH
             */
            public void setFlightRefRPH(String flightRefRPH) {
                this.flightRefRPH = flightRefRPH;
            }

            /** 
             * Get the 'TicketDesignatorCode' attribute value. Specifies a discount code applicable to the fare.
             * 
             * @return value
             */
            public String getTicketDesignatorCode() {
                return ticketDesignatorCode;
            }

            /** 
             * Set the 'TicketDesignatorCode' attribute value. Specifies a discount code applicable to the fare.
             * 
             * @param ticketDesignatorCode
             */
            public void setTicketDesignatorCode(String ticketDesignatorCode) {
                this.ticketDesignatorCode = ticketDesignatorCode;
            }

            /** 
             * Get the 'TicketDesignatorExtension' attribute value. Specifies an extension that a carrier may apply to a  ticket designator.
             * 
             * @return value
             */
            public String getTicketDesignatorExtension() {
                return ticketDesignatorExtension;
            }

            /** 
             * Set the 'TicketDesignatorExtension' attribute value. Specifies an extension that a carrier may apply to a  ticket designator.
             * 
             * @param ticketDesignatorExtension
             */
            public void setTicketDesignatorExtension(
                    String ticketDesignatorExtension) {
                this.ticketDesignatorExtension = ticketDesignatorExtension;
            }
        }
    }
    /** 
     * Container for endorsements.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Endorsements" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="ns:FreeTextType" name="Endorsement" maxOccurs="9"/>
     *     &lt;/xs:sequence>
     *     &lt;xs:attribute type="xs:boolean" use="optional" name="NonRefundableIndicator"/>
     *     &lt;xs:attribute type="xs:boolean" use="optional" name="NonEndorsableIndicator"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Endorsements
    {
        private List<FreeTextType> endorsementList = new ArrayList<FreeTextType>();
        private Boolean nonRefundableIndicator;
        private Boolean nonEndorsableIndicator;

        /** 
         * Get the list of 'Endorsement' element items. Specifies ticket endorsement information.
         * 
         * @return list
         */
        public List<FreeTextType> getEndorsementList() {
            return endorsementList;
        }

        /** 
         * Set the list of 'Endorsement' element items. Specifies ticket endorsement information.
         * 
         * @param list
         */
        public void setEndorsementList(List<FreeTextType> list) {
            endorsementList = list;
        }

        /** 
         * Get the 'NonRefundableIndicator' attribute value. Indicates whether the ticket is refundable. If true, the ticket is NOT refundable.
         * 
         * @return value
         */
        public Boolean getNonRefundableIndicator() {
            return nonRefundableIndicator;
        }

        /** 
         * Set the 'NonRefundableIndicator' attribute value. Indicates whether the ticket is refundable. If true, the ticket is NOT refundable.
         * 
         * @param nonRefundableIndicator
         */
        public void setNonRefundableIndicator(Boolean nonRefundableIndicator) {
            this.nonRefundableIndicator = nonRefundableIndicator;
        }

        /** 
         * Get the 'NonEndorsableIndicator' attribute value. Indicates whether the ticket is endorsable. If true, the ticket is NOT endorsable.
         * 
         * @return value
         */
        public Boolean getNonEndorsableIndicator() {
            return nonEndorsableIndicator;
        }

        /** 
         * Set the 'NonEndorsableIndicator' attribute value. Indicates whether the ticket is endorsable. If true, the ticket is NOT endorsable.
         * 
         * @param nonEndorsableIndicator
         */
        public void setNonEndorsableIndicator(Boolean nonEndorsableIndicator) {
            this.nonEndorsableIndicator = nonEndorsableIndicator;
        }
    }
    /** 
     * Detailed information on individual priced fares. 
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FareInfo" minOccurs="0" maxOccurs="99">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:FareInfoType">
     *         &lt;xs:sequence>
     *           &lt;xs:element type="ns:FareType" name="PassengerFare"/>
     *         &lt;/xs:sequence>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class FareInfo extends FareInfoType
    {
        private FareType passengerFare;

        /** 
         * Get the 'PassengerFare' element value. The fare with cost breakdown. 
         * 
         * @return value
         */
        public FareType getPassengerFare() {
            return passengerFare;
        }

        /** 
         * Set the 'PassengerFare' element value. The fare with cost breakdown. 
         * 
         * @param passengerFare
         */
        public void setPassengerFare(FareType passengerFare) {
            this.passengerFare = passengerFare;
        }
    }
}
