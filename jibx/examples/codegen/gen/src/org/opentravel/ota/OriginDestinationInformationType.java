
package org.opentravel.ota;

/** 
 * Origin and Destination location, and time information for the request. Also includes the ability to specify a connection location for the search.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OriginDestinationInformationType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:TravelDateTimeType">
 *       &lt;xs:sequence>
 *         &lt;xs:element name="OriginLocation">
 *           &lt;xs:complexType>
 *             &lt;xs:simpleContent>
 *               &lt;xs:extension base="ns:LocationType">
 *                 &lt;xs:attribute type="xs:boolean" use="optional" name="MultiAirportCityInd"/>
 *                 &lt;xs:attribute type="xs:boolean" use="optional" name="AlternateLocationInd"/>
 *               &lt;/xs:extension>
 *             &lt;/xs:simpleContent>
 *           &lt;/xs:complexType>
 *         &lt;/xs:element>
 *         &lt;xs:element name="DestinationLocation">
 *           &lt;xs:complexType>
 *             &lt;xs:simpleContent>
 *               &lt;xs:extension base="ns:LocationType">
 *                 &lt;xs:attribute type="xs:boolean" use="optional" name="MultiAirportCityInd"/>
 *                 &lt;xs:attribute type="xs:boolean" use="optional" name="AlternateLocationInd"/>
 *               &lt;/xs:extension>
 *             &lt;/xs:simpleContent>
 *           &lt;/xs:complexType>
 *         &lt;/xs:element>
 *         &lt;xs:element type="ns:ConnectionType" name="ConnectionLocations" minOccurs="0"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OriginDestinationInformationType extends TravelDateTimeType
{
    private LocationType originLocationLocationType;
    private Boolean originLocationMultiAirportCityInd;
    private Boolean originLocationAlternateLocationInd;
    private LocationType destinationLocationLocationType;
    private Boolean destinationLocationMultiAirportCityInd;
    private Boolean destinationLocationAlternateLocationInd;
    private ConnectionType connectionLocations;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public LocationType getOriginLocationLocationType() {
        return originLocationLocationType;
    }

    /** 
     * Set the extension value.
     * 
     * @param originLocationLocationType
     */
    public void setOriginLocationLocationType(
            LocationType originLocationLocationType) {
        this.originLocationLocationType = originLocationLocationType;
    }

    /** 
     * Get the 'MultiAirportCityInd' attribute value. If true, other airports within this city may be considered (i.e., EWR, JFK when origin location is LGA.)
     * 
     * @return value
     */
    public Boolean getOriginLocationMultiAirportCityInd() {
        return originLocationMultiAirportCityInd;
    }

    /** 
     * Set the 'MultiAirportCityInd' attribute value. If true, other airports within this city may be considered (i.e., EWR, JFK when origin location is LGA.)
     * 
     * @param originLocationMultiAirportCityInd
     */
    public void setOriginLocationMultiAirportCityInd(
            Boolean originLocationMultiAirportCityInd) {
        this.originLocationMultiAirportCityInd = originLocationMultiAirportCityInd;
    }

    /** 
     * Get the 'AlternateLocationInd' attribute value. If true, alternate locations may be considered.
     * 
     * @return value
     */
    public Boolean getOriginLocationAlternateLocationInd() {
        return originLocationAlternateLocationInd;
    }

    /** 
     * Set the 'AlternateLocationInd' attribute value. If true, alternate locations may be considered.
     * 
     * @param originLocationAlternateLocationInd
     */
    public void setOriginLocationAlternateLocationInd(
            Boolean originLocationAlternateLocationInd) {
        this.originLocationAlternateLocationInd = originLocationAlternateLocationInd;
    }

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public LocationType getDestinationLocationLocationType() {
        return destinationLocationLocationType;
    }

    /** 
     * Set the extension value.
     * 
     * @param destinationLocationLocationType
     */
    public void setDestinationLocationLocationType(
            LocationType destinationLocationLocationType) {
        this.destinationLocationLocationType = destinationLocationLocationType;
    }

    /** 
     * Get the 'MultiAirportCityInd' attribute value. If true, other airports within this city may be considered (i.e., EWR, JFK when origin location is LGA.)
     * 
     * @return value
     */
    public Boolean getDestinationLocationMultiAirportCityInd() {
        return destinationLocationMultiAirportCityInd;
    }

    /** 
     * Set the 'MultiAirportCityInd' attribute value. If true, other airports within this city may be considered (i.e., EWR, JFK when origin location is LGA.)
     * 
     * @param destinationLocationMultiAirportCityInd
     */
    public void setDestinationLocationMultiAirportCityInd(
            Boolean destinationLocationMultiAirportCityInd) {
        this.destinationLocationMultiAirportCityInd = destinationLocationMultiAirportCityInd;
    }

    /** 
     * Get the 'AlternateLocationInd' attribute value. If true, alternate locations may be considered.
     * 
     * @return value
     */
    public Boolean getDestinationLocationAlternateLocationInd() {
        return destinationLocationAlternateLocationInd;
    }

    /** 
     * Set the 'AlternateLocationInd' attribute value. If true, alternate locations may be considered.
     * 
     * @param destinationLocationAlternateLocationInd
     */
    public void setDestinationLocationAlternateLocationInd(
            Boolean destinationLocationAlternateLocationInd) {
        this.destinationLocationAlternateLocationInd = destinationLocationAlternateLocationInd;
    }

    /** 
     * Get the 'ConnectionLocations' element value. Travel Connection Location - for example, air uses the IATA 3 letter code.
     * 
     * @return value
     */
    public ConnectionType getConnectionLocations() {
        return connectionLocations;
    }

    /** 
     * Set the 'ConnectionLocations' element value. Travel Connection Location - for example, air uses the IATA 3 letter code.
     * 
     * @param connectionLocations
     */
    public void setConnectionLocations(ConnectionType connectionLocations) {
        this.connectionLocations = connectionLocations;
    }
}
