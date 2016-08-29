
package org.opentravel.ota;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 
 * Construct for holding a flight segment availability object.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FlightSegmentBaseType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="DepartureAirport">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:AirportLocationGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element name="ArrivalAirport">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:AirportLocationGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:OperatingAirlineType" name="OperatingAirline" minOccurs="0"/>
 *     &lt;xs:element type="ns:EquipmentType" name="Equipment" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:dateTime" use="optional" name="DepartureDateTime"/>
 *   &lt;xs:attribute type="xs:dateTime" use="optional" name="ArrivalDateTime"/>
 *   &lt;xs:attribute type="xs:integer" use="optional" name="StopQuantity"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="RPH"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="InfoSource"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FlightSegmentBaseType
{
    private AirportLocationGroup departureAirport;
    private AirportLocationGroup arrivalAirport;
    private OperatingAirlineType operatingAirline;
    private List<EquipmentType> equipmentList = new ArrayList<EquipmentType>();
    private Date departureDateTime;
    private Date arrivalDateTime;
    private BigInteger stopQuantity;
    private String RPH;
    private String infoSource;

    /** 
     * Get the 'AirportLocationGroup' attributeGroup value. Departure point of flight segment.
     * 
     * @return value
     */
    public AirportLocationGroup getDepartureAirport() {
        return departureAirport;
    }

    /** 
     * Set the 'AirportLocationGroup' attributeGroup value. Departure point of flight segment.
     * 
     * @param departureAirport
     */
    public void setDepartureAirport(AirportLocationGroup departureAirport) {
        this.departureAirport = departureAirport;
    }

    /** 
     * Get the 'AirportLocationGroup' attributeGroup value. Arrival point of flight segment.
     * 
     * @return value
     */
    public AirportLocationGroup getArrivalAirport() {
        return arrivalAirport;
    }

    /** 
     * Set the 'AirportLocationGroup' attributeGroup value. Arrival point of flight segment.
     * 
     * @param arrivalAirport
     */
    public void setArrivalAirport(AirportLocationGroup arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    /** 
     * Get the 'OperatingAirline' element value.  The operating airline of the flight if it is a codeshare  flight.
     * 
     * @return value
     */
    public OperatingAirlineType getOperatingAirline() {
        return operatingAirline;
    }

    /** 
     * Set the 'OperatingAirline' element value.  The operating airline of the flight if it is a codeshare  flight.
     * 
     * @param operatingAirline
     */
    public void setOperatingAirline(OperatingAirlineType operatingAirline) {
        this.operatingAirline = operatingAirline;
    }

    /** 
     * Get the list of 'Equipment' element items.  The type of equipment  used for the  flight..
     * 
     * @return list
     */
    public List<EquipmentType> getEquipmentList() {
        return equipmentList;
    }

    /** 
     * Set the list of 'Equipment' element items.  The type of equipment  used for the  flight..
     * 
     * @param list
     */
    public void setEquipmentList(List<EquipmentType> list) {
        equipmentList = list;
    }

    /** 
     * Get the 'DepartureDateTime' attribute value. The date and time of the flight segment departure.
     * 
     * @return value
     */
    public Date getDepartureDateTime() {
        return departureDateTime;
    }

    /** 
     * Set the 'DepartureDateTime' attribute value. The date and time of the flight segment departure.
     * 
     * @param departureDateTime
     */
    public void setDepartureDateTime(Date departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    /** 
     * Get the 'ArrivalDateTime' attribute value.
     * 
     * @return value
     */
    public Date getArrivalDateTime() {
        return arrivalDateTime;
    }

    /** 
     * Set the 'ArrivalDateTime' attribute value.
     * 
     * @param arrivalDateTime
     */
    public void setArrivalDateTime(Date arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    /** 
     * Get the 'StopQuantity' attribute value.  The number of stops the flight makes
     * 
     * @return value
     */
    public BigInteger getStopQuantity() {
        return stopQuantity;
    }

    /** 
     * Set the 'StopQuantity' attribute value.  The number of stops the flight makes
     * 
     * @param stopQuantity
     */
    public void setStopQuantity(BigInteger stopQuantity) {
        this.stopQuantity = stopQuantity;
    }

    /** 
     * Get the 'RPH' attribute value.
     * 
     * @return value
     */
    public String getRPH() {
        return RPH;
    }

    /** 
     * Set the 'RPH' attribute value.
     * 
     * @param RPH
     */
    public void setRPH(String RPH) {
        this.RPH = RPH;
    }

    /** 
     * Get the 'InfoSource' attribute value. Used to specify the source of the data being exchanged as determined by trading partners. 
     * 
     * @return value
     */
    public String getInfoSource() {
        return infoSource;
    }

    /** 
     * Set the 'InfoSource' attribute value. Used to specify the source of the data being exchanged as determined by trading partners. 
     * 
     * @param infoSource
     */
    public void setInfoSource(String infoSource) {
        this.infoSource = infoSource;
    }
}
