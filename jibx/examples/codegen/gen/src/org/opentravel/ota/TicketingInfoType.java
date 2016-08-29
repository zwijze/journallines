
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 
 * Minimum information about ticketing required to complete the booking transaction.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketingInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:FreeTextType" name="TicketAdvisory" minOccurs="0" maxOccurs="10"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:dateTime" use="optional" name="TicketTimeLimit"/>
 *   &lt;xs:attribute type="ns:TicketType" use="optional" name="TicketType"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="TicketingStatus"/>
 *   &lt;xs:attribute type="ns:ListOfRPH" use="optional" name="FlightSegmentRefNumber"/>
 *   &lt;xs:attribute type="ns:ListOfRPH" use="optional" name="TravelerRefNumber"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="ReverseTktgSegmentsInd"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="PseudoCityCode"/>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ListOfRPH">
 *   &lt;xs:list itemType="xs:string"/>
 * &lt;/xs:simpleType>
 * </pre>
 */
public class TicketingInfoType
{
    private List<FreeTextType> ticketAdvisoryList = new ArrayList<FreeTextType>();
    private Date ticketTimeLimit;
    private TicketType ticketType;
    private String ticketingStatus;
    private List<String> flightSegmentRefNumbers = new ArrayList<String>();
    private List<String> travelerRefNumbers = new ArrayList<String>();
    private Boolean reverseTktgSegmentsInd;
    private String pseudoCityCode;

    /** 
     * Get the list of 'TicketAdvisory' element items. Open text field available for additional ticket information. 		
     * 
     * @return list
     */
    public List<FreeTextType> getTicketAdvisoryList() {
        return ticketAdvisoryList;
    }

    /** 
     * Set the list of 'TicketAdvisory' element items. Open text field available for additional ticket information. 		
     * 
     * @param list
     */
    public void setTicketAdvisoryList(List<FreeTextType> list) {
        ticketAdvisoryList = list;
    }

    /** 
     * Get the 'TicketTimeLimit' attribute value. TicketTimeLimit - Indicates the ticketing arrangement, and allows for the requirement that an itinerary must be ticketed by a certain date and time.
     * 
     * @return value
     */
    public Date getTicketTimeLimit() {
        return ticketTimeLimit;
    }

    /** 
     * Set the 'TicketTimeLimit' attribute value. TicketTimeLimit - Indicates the ticketing arrangement, and allows for the requirement that an itinerary must be ticketed by a certain date and time.
     * 
     * @param ticketTimeLimit
     */
    public void setTicketTimeLimit(Date ticketTimeLimit) {
        this.ticketTimeLimit = ticketTimeLimit;
    }

    /** 
     * Get the 'TicketType' attribute value. TicketType - Indicates the type of ticket (Paper, eTicket)
     * 
     * @return value
     */
    public TicketType getTicketType() {
        return ticketType;
    }

    /** 
     * Set the 'TicketType' attribute value. TicketType - Indicates the type of ticket (Paper, eTicket)
     * 
     * @param ticketType
     */
    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    /** 
     * Get the 'TicketingStatus' attribute value. Code for setting and displaying detailed ticketing information. Refer to OTA Code List Ticketing Status (TST).
     * 
     * @return value
     */
    public String getTicketingStatus() {
        return ticketingStatus;
    }

    /** 
     * Set the 'TicketingStatus' attribute value. Code for setting and displaying detailed ticketing information. Refer to OTA Code List Ticketing Status (TST).
     * 
     * @param ticketingStatus
     */
    public void setTicketingStatus(String ticketingStatus) {
        this.ticketingStatus = ticketingStatus;
    }

    /** 
     * Get the list of 'FlightSegmentRefNumber' attribute items. Specifies one or more segment numbers for ticketing purposes. This RPH is associated with the RPH contained in the FlightSegment element in AirBookRQ.
     * 
     * @return list
     */
    public List<String> getFlightSegmentRefNumbers() {
        return flightSegmentRefNumbers;
    }

    /** 
     * Set the list of 'FlightSegmentRefNumber' attribute items. Specifies one or more segment numbers for ticketing purposes. This RPH is associated with the RPH contained in the FlightSegment element in AirBookRQ.
     * 
     * @param list
     */
    public void setFlightSegmentRefNumbers(List<String> list) {
        flightSegmentRefNumbers = list;
    }

    /** 
     * Serializer for 'FlightSegmentRefNumber' attribute list.
     * 
     * @param values
     * @return text
     */
    public static String serializeFlightSegmentRefNumbers(List<String> values) {
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
     * Deserializer for 'FlightSegmentRefNumber' attribute list.
     * 
     * @param text
     * @return values
     * @throws org.jibx.runtime.JiBXException on conversion error
     */
    public static List<String> deserializeFlightSegmentRefNumbers(String text)
            throws org.jibx.runtime.JiBXException {
        org.jibx.runtime.IListItemDeserializer ldser = new org.jibx.runtime.IListItemDeserializer() {
            public java.lang.Object deserialize(String text) {
                return text;
            }
        };
        return (List<String>) org.jibx.runtime.Utility.deserializeList(text,
                ldser);
    }

    /** 
     * Get the list of 'TravelerRefNumber' attribute items. Specifies one or more traveler names for ticketing purposes. This RPH is associated with the RPH contained in the TravelerRefNumber element in AirBookRQ.
     * 
     * @return list
     */
    public List<String> getTravelerRefNumbers() {
        return travelerRefNumbers;
    }

    /** 
     * Set the list of 'TravelerRefNumber' attribute items. Specifies one or more traveler names for ticketing purposes. This RPH is associated with the RPH contained in the TravelerRefNumber element in AirBookRQ.
     * 
     * @param list
     */
    public void setTravelerRefNumbers(List<String> list) {
        travelerRefNumbers = list;
    }

    /** 
     * Serializer for 'TravelerRefNumber' attribute list.
     * 
     * @param values
     * @return text
     */
    public static String serializeTravelerRefNumbers(List<String> values) {
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
     * Deserializer for 'TravelerRefNumber' attribute list.
     * 
     * @param text
     * @return values
     * @throws org.jibx.runtime.JiBXException on conversion error
     */
    public static List<String> deserializeTravelerRefNumbers(String text)
            throws org.jibx.runtime.JiBXException {
        org.jibx.runtime.IListItemDeserializer ldser = new org.jibx.runtime.IListItemDeserializer() {
            public java.lang.Object deserialize(String text) {
                return text;
            }
        };
        return (List<String>) org.jibx.runtime.Utility.deserializeList(text,
                ldser);
    }

    /** 
     * Get the 'ReverseTktgSegmentsInd' attribute value. Applies a reverse sequence of the outbound travel to the inbound travel. 
     * 
     * @return value
     */
    public Boolean getReverseTktgSegmentsInd() {
        return reverseTktgSegmentsInd;
    }

    /** 
     * Set the 'ReverseTktgSegmentsInd' attribute value. Applies a reverse sequence of the outbound travel to the inbound travel. 
     * 
     * @param reverseTktgSegmentsInd
     */
    public void setReverseTktgSegmentsInd(Boolean reverseTktgSegmentsInd) {
        this.reverseTktgSegmentsInd = reverseTktgSegmentsInd;
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
}
