
package org.opentravel.ota;

import java.math.BigInteger;

/** 
 *  Provides information for a flight leg.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FlifoLegAttributes">
 *   &lt;xs:attribute type="xs:string" use="optional" name="FlightNumber"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="JourneyDuration"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="GroundDuration"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="AccumulatedDuration"/>
 *   &lt;xs:attribute type="xs:integer" use="optional" name="LegDistance"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class FlifoLegAttributes
{
    private String flightNumber;
    private String journeyDuration;
    private String groundDuration;
    private String accumulatedDuration;
    private BigInteger legDistance;

    /** 
     * Get the 'FlightNumber' attribute value.  The flight number of the flight.
     * 
     * @return value
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'FlightNumber' attribute value.  The flight number of the flight.
     * 
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /** 
     * Get the 'JourneyDuration' attribute value.  The duration of the flight from departure location to destination  location.
     * 
     * @return value
     */
    public String getJourneyDuration() {
        return journeyDuration;
    }

    /** 
     * Set the 'JourneyDuration' attribute value.  The duration of the flight from departure location to destination  location.
     * 
     * @param journeyDuration
     */
    public void setJourneyDuration(String journeyDuration) {
        this.journeyDuration = journeyDuration;
    }

    /** 
     * Get the 'GroundDuration' attribute value.  The duration of a ground stop.
     * 
     * @return value
     */
    public String getGroundDuration() {
        return groundDuration;
    }

    /** 
     * Set the 'GroundDuration' attribute value.  The duration of a ground stop.
     * 
     * @param groundDuration
     */
    public void setGroundDuration(String groundDuration) {
        this.groundDuration = groundDuration;
    }

    /** 
     * Get the 'AccumulatedDuration' attribute value.  The total duration time of the flight. This is the combination of both JourneyDuration and GroundDuration.
     * 
     * @return value
     */
    public String getAccumulatedDuration() {
        return accumulatedDuration;
    }

    /** 
     * Set the 'AccumulatedDuration' attribute value.  The total duration time of the flight. This is the combination of both JourneyDuration and GroundDuration.
     * 
     * @param accumulatedDuration
     */
    public void setAccumulatedDuration(String accumulatedDuration) {
        this.accumulatedDuration = accumulatedDuration;
    }

    /** 
     * Get the 'LegDistance' attribute value. 
    	Miles aquired per flight segments, usually used for earning of frequent flyer miles.
    	
     * 
     * @return value
     */
    public BigInteger getLegDistance() {
        return legDistance;
    }

    /** 
     * Set the 'LegDistance' attribute value. 
    	Miles aquired per flight segments, usually used for earning of frequent flyer miles.
    	
     * 
     * @param legDistance
     */
    public void setLegDistance(BigInteger legDistance) {
        this.legDistance = legDistance;
    }
}
