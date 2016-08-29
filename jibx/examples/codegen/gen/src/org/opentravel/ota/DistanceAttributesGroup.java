
package org.opentravel.ota;

/** 
 * Used to provide distance and direction information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DistanceAttributesGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="Distance"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="DistanceMeasure"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Direction"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="DistanceMax"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class DistanceAttributesGroup
{
    private String distance;
    private String distanceMeasure;
    private String direction;
    private String distanceMax;

    /** 
     * Get the 'Distance' attribute value. An optional attribute indicating the distance to/from a reference point. When used in conjunction with DistanceMax, this represents the minimum distance.
     * 
     * @return value
     */
    public String getDistance() {
        return distance;
    }

    /** 
     * Set the 'Distance' attribute value. An optional attribute indicating the distance to/from a reference point. When used in conjunction with DistanceMax, this represents the minimum distance.
     * 
     * @param distance
     */
    public void setDistance(String distance) {
        this.distance = distance;
    }

    /** 
     * Get the 'DistanceMeasure' attribute value. When the Distance attribute contains a value, (presumably a numerical value), the unit of measure is a string value that indicate what units are used for the value.
     * 
     * @return value
     */
    public String getDistanceMeasure() {
        return distanceMeasure;
    }

    /** 
     * Set the 'DistanceMeasure' attribute value. When the Distance attribute contains a value, (presumably a numerical value), the unit of measure is a string value that indicate what units are used for the value.
     * 
     * @param distanceMeasure
     */
    public void setDistanceMeasure(String distanceMeasure) {
        this.distanceMeasure = distanceMeasure;
    }

    /** 
     * Get the 'Direction' attribute value. An optional string value used to indicate the compass point(s) direction, e.g.: S, SE (South, Southeast), FROM the Reference Point TO the hotel location if the search is not a full circumference from the reference point.
     * 
     * @return value
     */
    public String getDirection() {
        return direction;
    }

    /** 
     * Set the 'Direction' attribute value. An optional string value used to indicate the compass point(s) direction, e.g.: S, SE (South, Southeast), FROM the Reference Point TO the hotel location if the search is not a full circumference from the reference point.
     * 
     * @param direction
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /** 
     * Get the 'DistanceMax' attribute value. An optional attribute indicating the maximum distance to/from a reference point.
     * 
     * @return value
     */
    public String getDistanceMax() {
        return distanceMax;
    }

    /** 
     * Set the 'DistanceMax' attribute value. An optional attribute indicating the maximum distance to/from a reference point.
     * 
     * @param distanceMax
     */
    public void setDistanceMax(String distanceMax) {
        this.distanceMax = distanceMax;
    }
}
