
package org.opentravel.ota;

/** 
 * Defines the position of an entity in relation to another entity (e.g. from an airport to a hotel, the relationship is dependant on use). 
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RelativePositionGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="Direction"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Distance"/>
 *   &lt;xs:attribute type="ns:DistanceUnitNameType" use="optional" name="DistanceUnitName"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="UnitOfMeasureCode"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class RelativePositionGroup
{
    private String direction;
    private String distance;
    private DistanceUnitNameType distanceUnitName;
    private String unitOfMeasureCode;

    /** 
     * Get the 'Direction' attribute value. Defines the cardinal direction (e.g., north, south, southwest).
     * 
     * @return value
     */
    public String getDirection() {
        return direction;
    }

    /** 
     * Set the 'Direction' attribute value. Defines the cardinal direction (e.g., north, south, southwest).
     * 
     * @param direction
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /** 
     * Get the 'Distance' attribute value. Defines the distance between two points.
     * 
     * @return value
     */
    public String getDistance() {
        return distance;
    }

    /** 
     * Set the 'Distance' attribute value. Defines the distance between two points.
     * 
     * @param distance
     */
    public void setDistance(String distance) {
        this.distance = distance;
    }

    /** 
     * Get the 'DistanceUnitName' attribute value. 
    				<DeprecationWarning>Candidate for potential removal, usage is not recommended. Deprecation Warning added in 2006A.
    </DeprecationWarning>
    			Provides the ability to specify the unit of measure to which the "Distance" attribute is referring.
     * 
     * @return value
     */
    public DistanceUnitNameType getDistanceUnitName() {
        return distanceUnitName;
    }

    /** 
     * Set the 'DistanceUnitName' attribute value. 
    				<DeprecationWarning>Candidate for potential removal, usage is not recommended. Deprecation Warning added in 2006A.
    </DeprecationWarning>
    			Provides the ability to specify the unit of measure to which the "Distance" attribute is referring.
     * 
     * @param distanceUnitName
     */
    public void setDistanceUnitName(DistanceUnitNameType distanceUnitName) {
        this.distanceUnitName = distanceUnitName;
    }

    /** 
     * Get the 'UnitOfMeasureCode' attribute value. The unit of measure in a code format. Refer to OTA Code List Unit of Measure Code (UOM).
     * 
     * @return value
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /** 
     * Set the 'UnitOfMeasureCode' attribute value. The unit of measure in a code format. Refer to OTA Code List Unit of Measure Code (UOM).
     * 
     * @param unitOfMeasureCode
     */
    public void setUnitOfMeasureCode(String unitOfMeasureCode) {
        this.unitOfMeasureCode = unitOfMeasureCode;
    }
}
