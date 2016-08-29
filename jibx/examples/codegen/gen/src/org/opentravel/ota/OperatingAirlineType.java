
package org.opentravel.ota;

/** 
 * This is an extension of CompanyNameType to include a FlightNumber.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OperatingAirlineType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="ns:CompanyNameType">
 *       &lt;xs:attribute type="xs:string" name="FlightNumber"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OperatingAirlineType
{
    private CompanyNameType companyNameType;
    private String flightNumber;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public CompanyNameType getCompanyNameType() {
        return companyNameType;
    }

    /** 
     * Set the extension value.
     * 
     * @param companyNameType
     */
    public void setCompanyNameType(CompanyNameType companyNameType) {
        this.companyNameType = companyNameType;
    }

    /** 
     * Get the 'FlightNumber' attribute value.
     * 
     * @return value
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'FlightNumber' attribute value.
     * 
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}
