
package org.opentravel.ota;

/** 
 * Provides information concerning flight  times and mileage.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AirDetailsRSAttributes">
 *   &lt;xs:attribute type="xs:string" use="optional" name="TotalFlightTime"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="TotalGroundTime"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="TotalTripTime"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="TotalMiles"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class AirDetailsRSAttributes
{
    private String totalFlightTime;
    private String totalGroundTime;
    private String totalTripTime;
    private String totalMiles;

    /** 
     * Get the 'TotalFlightTime' attribute value.  The total duration of time a flight is airborne.
     * 
     * @return value
     */
    public String getTotalFlightTime() {
        return totalFlightTime;
    }

    /** 
     * Set the 'TotalFlightTime' attribute value.  The total duration of time a flight is airborne.
     * 
     * @param totalFlightTime
     */
    public void setTotalFlightTime(String totalFlightTime) {
        this.totalFlightTime = totalFlightTime;
    }

    /** 
     * Get the 'TotalGroundTime' attribute value.  The total duration of time a flight is on the ground.
     * 
     * @return value
     */
    public String getTotalGroundTime() {
        return totalGroundTime;
    }

    /** 
     * Set the 'TotalGroundTime' attribute value.  The total duration of time a flight is on the ground.
     * 
     * @param totalGroundTime
     */
    public void setTotalGroundTime(String totalGroundTime) {
        this.totalGroundTime = totalGroundTime;
    }

    /** 
     * Get the 'TotalTripTime' attribute value.  The total duration of time required for a flight operation (ground and air).
     * 
     * @return value
     */
    public String getTotalTripTime() {
        return totalTripTime;
    }

    /** 
     * Set the 'TotalTripTime' attribute value.  The total duration of time required for a flight operation (ground and air).
     * 
     * @param totalTripTime
     */
    public void setTotalTripTime(String totalTripTime) {
        this.totalTripTime = totalTripTime;
    }

    /** 
     * Get the 'TotalMiles' attribute value.  Total miles for a flight segment.
     * 
     * @return value
     */
    public String getTotalMiles() {
        return totalMiles;
    }

    /** 
     * Set the 'TotalMiles' attribute value.  Total miles for a flight segment.
     * 
     * @param totalMiles
     */
    public void setTotalMiles(String totalMiles) {
        this.totalMiles = totalMiles;
    }
}
