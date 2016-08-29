
package org.opentravel.ota;

/** 
 * Specify actual airline, flight number, or booking class
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecificFlightInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="FlightNumber" minOccurs="0"/>
 *     &lt;xs:element type="ns:CompanyNameType" name="Airline" minOccurs="0"/>
 *     &lt;xs:element name="BookingClassPref" minOccurs="0">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:BookingClassPrefGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecificFlightInfoType
{
    private String flightNumber;
    private CompanyNameType airline;
    private BookingClassPrefGroup bookingClassPref;

    /** 
     * Get the 'FlightNumber' element value. Specific flight number to request availability for. Requires that Airline is also supplied.
     * 
     * @return value
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'FlightNumber' element value. Specific flight number to request availability for. Requires that Airline is also supplied.
     * 
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /** 
     * Get the 'Airline' element value. Specify airline to request availability for.
     * 
     * @return value
     */
    public CompanyNameType getAirline() {
        return airline;
    }

    /** 
     * Set the 'Airline' element value. Specify airline to request availability for.
     * 
     * @param airline
     */
    public void setAirline(CompanyNameType airline) {
        this.airline = airline;
    }

    /** 
     * Get the 'BookingClassPrefGroup' attributeGroup value. Specify specific booking classes to include and exclude in the response
     * 
     * @return value
     */
    public BookingClassPrefGroup getBookingClassPref() {
        return bookingClassPref;
    }

    /** 
     * Set the 'BookingClassPrefGroup' attributeGroup value. Specify specific booking classes to include and exclude in the response
     * 
     * @param bookingClassPref
     */
    public void setBookingClassPref(BookingClassPrefGroup bookingClassPref) {
        this.bookingClassPref = bookingClassPref;
    }
}
