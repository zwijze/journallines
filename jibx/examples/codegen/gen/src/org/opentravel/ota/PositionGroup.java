
package org.opentravel.ota;

/** 
 * Used to specify the geographic coordinates of a location.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PositionGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="Latitude"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Longitude"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Altitude"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="AltitudeUnitOfMeasureCode"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class PositionGroup
{
    private String latitude;
    private String longitude;
    private String altitude;
    private String altitudeUnitOfMeasureCode;

    /** 
     * Get the 'Latitude' attribute value. The measure of the angular distance on a meridian north or south of the equator.
     * 
     * @return value
     */
    public String getLatitude() {
        return latitude;
    }

    /** 
     * Set the 'Latitude' attribute value. The measure of the angular distance on a meridian north or south of the equator.
     * 
     * @param latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /** 
     * Get the 'Longitude' attribute value. The measure of the angular distance on a meridian east or west of the prime meridian.
     * 
     * @return value
     */
    public String getLongitude() {
        return longitude;
    }

    /** 
     * Set the 'Longitude' attribute value. The measure of the angular distance on a meridian east or west of the prime meridian.
     * 
     * @param longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /** 
     * Get the 'Altitude' attribute value. The height of an item, typically above sea level.
     * 
     * @return value
     */
    public String getAltitude() {
        return altitude;
    }

    /** 
     * Set the 'Altitude' attribute value. The height of an item, typically above sea level.
     * 
     * @param altitude
     */
    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    /** 
     * Get the 'AltitudeUnitOfMeasureCode' attribute value. Provides the unit of measure for the altitude (e.g., feet, meters, miles, kilometers). Refer to OTA Code List Unit of Measure Code (UOM).
     * 
     * @return value
     */
    public String getAltitudeUnitOfMeasureCode() {
        return altitudeUnitOfMeasureCode;
    }

    /** 
     * Set the 'AltitudeUnitOfMeasureCode' attribute value. Provides the unit of measure for the altitude (e.g., feet, meters, miles, kilometers). Refer to OTA Code List Unit of Measure Code (UOM).
     * 
     * @param altitudeUnitOfMeasureCode
     */
    public void setAltitudeUnitOfMeasureCode(String altitudeUnitOfMeasureCode) {
        this.altitudeUnitOfMeasureCode = altitudeUnitOfMeasureCode;
    }
}
