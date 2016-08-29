
package org.opentravel.ota;

/** 
 * Provides information on the source of a request.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SourceType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="RequestorID" minOccurs="0">
 *       &lt;!-- Reference to inner class RequestorID -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="Position" minOccurs="0">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:PositionGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element name="BookingChannel" minOccurs="0">
 *       &lt;!-- Reference to inner class BookingChannel -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" use="optional" name="AgentSine"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="PseudoCityCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ISOCountry"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ISOCurrency"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="AgentDutyCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="AirlineVendorID"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="AirportCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="FirstDepartPoint"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ERSP_UserID"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="TerminalID"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SourceType
{
    private RequestorID requestorID;
    private PositionGroup position;
    private BookingChannel bookingChannel;
    private String agentSine;
    private String pseudoCityCode;
    private String ISOCountry;
    private String ISOCurrency;
    private String agentDutyCode;
    private String airlineVendorID;
    private String airportCode;
    private String firstDepartPoint;
    private String ERSPUserID;
    private String terminalID;

    /** 
     * Get the 'RequestorID' element value.
     * 
     * @return value
     */
    public RequestorID getRequestorID() {
        return requestorID;
    }

    /** 
     * Set the 'RequestorID' element value.
     * 
     * @param requestorID
     */
    public void setRequestorID(RequestorID requestorID) {
        this.requestorID = requestorID;
    }

    /** 
     * Get the 'PositionGroup' attributeGroup value.
     * 
     * @return value
     */
    public PositionGroup getPosition() {
        return position;
    }

    /** 
     * Set the 'PositionGroup' attributeGroup value.
     * 
     * @param position
     */
    public void setPosition(PositionGroup position) {
        this.position = position;
    }

    /** 
     * Get the 'BookingChannel' element value.
     * 
     * @return value
     */
    public BookingChannel getBookingChannel() {
        return bookingChannel;
    }

    /** 
     * Set the 'BookingChannel' element value.
     * 
     * @param bookingChannel
     */
    public void setBookingChannel(BookingChannel bookingChannel) {
        this.bookingChannel = bookingChannel;
    }

    /** 
     * Get the 'AgentSine' attribute value. Identifies the party within the requesting entity.
     * 
     * @return value
     */
    public String getAgentSine() {
        return agentSine;
    }

    /** 
     * Set the 'AgentSine' attribute value. Identifies the party within the requesting entity.
     * 
     * @param agentSine
     */
    public void setAgentSine(String agentSine) {
        this.agentSine = agentSine;
    }

    /** 
     * Get the 'PseudoCityCode' attribute value. An identification code assigned to an office/agency by a reservation system.
     * 
     * @return value
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /** 
     * Set the 'PseudoCityCode' attribute value. An identification code assigned to an office/agency by a reservation system.
     * 
     * @param pseudoCityCode
     */
    public void setPseudoCityCode(String pseudoCityCode) {
        this.pseudoCityCode = pseudoCityCode;
    }

    /** 
     * Get the 'ISOCountry' attribute value. The country code of the requesting party.
     * 
     * @return value
     */
    public String getISOCountry() {
        return ISOCountry;
    }

    /** 
     * Set the 'ISOCountry' attribute value. The country code of the requesting party.
     * 
     * @param ISOCountry
     */
    public void setISOCountry(String ISOCountry) {
        this.ISOCountry = ISOCountry;
    }

    /** 
     * Get the 'ISOCurrency' attribute value. The currency code in which the reservation will be ticketed.
     * 
     * @return value
     */
    public String getISOCurrency() {
        return ISOCurrency;
    }

    /** 
     * Set the 'ISOCurrency' attribute value. The currency code in which the reservation will be ticketed.
     * 
     * @param ISOCurrency
     */
    public void setISOCurrency(String ISOCurrency) {
        this.ISOCurrency = ISOCurrency;
    }

    /** 
     * Get the 'AgentDutyCode' attribute value. An authority code assigned to a requestor.
     * 
     * @return value
     */
    public String getAgentDutyCode() {
        return agentDutyCode;
    }

    /** 
     * Set the 'AgentDutyCode' attribute value. An authority code assigned to a requestor.
     * 
     * @param agentDutyCode
     */
    public void setAgentDutyCode(String agentDutyCode) {
        this.agentDutyCode = agentDutyCode;
    }

    /** 
     * Get the 'AirlineVendorID' attribute value. The IATA assigned airline code.
     * 
     * @return value
     */
    public String getAirlineVendorID() {
        return airlineVendorID;
    }

    /** 
     * Set the 'AirlineVendorID' attribute value. The IATA assigned airline code.
     * 
     * @param airlineVendorID
     */
    public void setAirlineVendorID(String airlineVendorID) {
        this.airlineVendorID = airlineVendorID;
    }

    /** 
     * Get the 'AirportCode' attribute value. The IATA assigned airport code.
     * 
     * @return value
     */
    public String getAirportCode() {
        return airportCode;
    }

    /** 
     * Set the 'AirportCode' attribute value. The IATA assigned airport code.
     * 
     * @param airportCode
     */
    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    /** 
     * Get the 'FirstDepartPoint' attribute value. The point of first departure in a trip.
     * 
     * @return value
     */
    public String getFirstDepartPoint() {
        return firstDepartPoint;
    }

    /** 
     * Set the 'FirstDepartPoint' attribute value. The point of first departure in a trip.
     * 
     * @param firstDepartPoint
     */
    public void setFirstDepartPoint(String firstDepartPoint) {
        this.firstDepartPoint = firstDepartPoint;
    }

    /** 
     * Get the 'ERSP_UserID' attribute value. Electronic Reservation Service Provider (ERSP) assigned identifier used to identify the individual using the ERSP system.
     * 
     * @return value
     */
    public String getERSPUserID() {
        return ERSPUserID;
    }

    /** 
     * Set the 'ERSP_UserID' attribute value. Electronic Reservation Service Provider (ERSP) assigned identifier used to identify the individual using the ERSP system.
     * 
     * @param ERSPUserID
     */
    public void setERSPUserID(String ERSPUserID) {
        this.ERSPUserID = ERSPUserID;
    }

    /** 
     * Get the 'TerminalID' attribute value. This is the electronic address of the device from which information is entered.
     * 
     * @return value
     */
    public String getTerminalID() {
        return terminalID;
    }

    /** 
     * Set the 'TerminalID' attribute value. This is the electronic address of the device from which information is entered.
     * 
     * @param terminalID
     */
    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }
    /** 
     * An identifier of the entity making the request  (e.g. ATA/IATA/ID number, Electronic Reservation Service Provider (ERSP), Association of British Travel Agents (ABTA)). 
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RequestorID" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:UniqueID_Type">
     *         &lt;xs:attribute type="xs:string" use="optional" name="MessagePassword"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class RequestorID extends UniqueIDType
    {
        private String messagePassword;

        /** 
         * Get the 'MessagePassword' attribute value. This password provides an additional level of security that the recipient can use to validate the sending party's authority to use the message.
         * 
         * @return value
         */
        public String getMessagePassword() {
            return messagePassword;
        }

        /** 
         * Set the 'MessagePassword' attribute value. This password provides an additional level of security that the recipient can use to validate the sending party's authority to use the message.
         * 
         * @param messagePassword
         */
        public void setMessagePassword(String messagePassword) {
            this.messagePassword = messagePassword;
        }
    }
    /** 
     * Specifies the booking channel type and whether it is the primary means of connectivity of the source.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BookingChannel" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="ns:CompanyNameType" name="CompanyName" minOccurs="0"/>
     *     &lt;/xs:sequence>
     *     &lt;xs:attributeGroup ref="ns:BookingChannelGroup"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class BookingChannel
    {
        private CompanyNameType companyName;
        private BookingChannelGroup bookingChannelGroup;

        /** 
         * Get the 'CompanyName' element value. Identifies the company that is associated with the booking channel.
         * 
         * @return value
         */
        public CompanyNameType getCompanyName() {
            return companyName;
        }

        /** 
         * Set the 'CompanyName' element value. Identifies the company that is associated with the booking channel.
         * 
         * @param companyName
         */
        public void setCompanyName(CompanyNameType companyName) {
            this.companyName = companyName;
        }

        /** 
         * Get the 'BookingChannelGroup' attributeGroup value.
         * 
         * @return value
         */
        public BookingChannelGroup getBookingChannelGroup() {
            return bookingChannelGroup;
        }

        /** 
         * Set the 'BookingChannelGroup' attributeGroup value.
         * 
         * @param bookingChannelGroup
         */
        public void setBookingChannelGroup(
                BookingChannelGroup bookingChannelGroup) {
            this.bookingChannelGroup = bookingChannelGroup;
        }
    }
}
