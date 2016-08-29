
package org.opentravel.ota;

/** 
 * Object to hold a passengers' seat request
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatRequestType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:LocationType" name="DepartureAirport" minOccurs="0"/>
 *     &lt;xs:element type="ns:LocationType" name="ArrivalAirport" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:SeatRequestAttributes"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="DepartureDate"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="FlightNumber"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Status"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SeatRequestType
{
    private LocationType departureAirport;
    private LocationType arrivalAirport;
    private SeatRequestAttributes seatRequestAttributes;
    private String departureDate;
    private String flightNumber;
    private String status;

    /** 
     * Get the 'DepartureAirport' element value. Departure point of flight segment.
     * 
     * @return value
     */
    public LocationType getDepartureAirport() {
        return departureAirport;
    }

    /** 
     * Set the 'DepartureAirport' element value. Departure point of flight segment.
     * 
     * @param departureAirport
     */
    public void setDepartureAirport(LocationType departureAirport) {
        this.departureAirport = departureAirport;
    }

    /** 
     * Get the 'ArrivalAirport' element value. Arrival point of flight segment.
     * 
     * @return value
     */
    public LocationType getArrivalAirport() {
        return arrivalAirport;
    }

    /** 
     * Set the 'ArrivalAirport' element value. Arrival point of flight segment.
     * 
     * @param arrivalAirport
     */
    public void setArrivalAirport(LocationType arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    /** 
     * Get the 'SeatRequestAttributes' attributeGroup value. Attributes for seat request. Note: you can choose a specific seat or just a general preference
     * 
     * @return value
     */
    public SeatRequestAttributes getSeatRequestAttributes() {
        return seatRequestAttributes;
    }

    /** 
     * Set the 'SeatRequestAttributes' attributeGroup value. Attributes for seat request. Note: you can choose a specific seat or just a general preference
     * 
     * @param seatRequestAttributes
     */
    public void setSeatRequestAttributes(
            SeatRequestAttributes seatRequestAttributes) {
        this.seatRequestAttributes = seatRequestAttributes;
    }

    /** 
     * Get the 'DepartureDate' attribute value. The departure date of the flight for the seat requested.
     * 
     * @return value
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /** 
     * Set the 'DepartureDate' attribute value. The departure date of the flight for the seat requested.
     * 
     * @param departureDate
     */
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    /** 
     * Get the 'FlightNumber' attribute value. The number of the flight for which this seat is requested.
     * 
     * @return value
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'FlightNumber' attribute value. The number of the flight for which this seat is requested.
     * 
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /** 
     * Get the 'Status' attribute value. Code providing status information for this seat request. Refer to OTA Code List 'Status' (STS).
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' attribute value. Code providing status information for this seat request. Refer to OTA Code List 'Status' (STS).
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
