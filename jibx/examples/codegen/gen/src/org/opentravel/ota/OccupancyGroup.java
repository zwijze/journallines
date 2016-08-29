
package org.opentravel.ota;

import java.math.BigInteger;

/** 
 * Minimum and maximum occupancy values.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OccupancyGroup">
 *   &lt;xs:attribute type="xs:integer" use="optional" name="MinOccupancy"/>
 *   &lt;xs:attribute type="xs:integer" use="optional" name="MaxOccupancy"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class OccupancyGroup
{
    private BigInteger minOccupancy;
    private BigInteger maxOccupancy;

    /** 
     * Get the 'MinOccupancy' attribute value. Minimum number of persons allowed in a unit of accommodation or place. 
     * 
     * @return value
     */
    public BigInteger getMinOccupancy() {
        return minOccupancy;
    }

    /** 
     * Set the 'MinOccupancy' attribute value. Minimum number of persons allowed in a unit of accommodation or place. 
     * 
     * @param minOccupancy
     */
    public void setMinOccupancy(BigInteger minOccupancy) {
        this.minOccupancy = minOccupancy;
    }

    /** 
     * Get the 'MaxOccupancy' attribute value. Maximum number of persons allowed in a unit of accommodation or place. 
     * 
     * @return value
     */
    public BigInteger getMaxOccupancy() {
        return maxOccupancy;
    }

    /** 
     * Set the 'MaxOccupancy' attribute value. Maximum number of persons allowed in a unit of accommodation or place. 
     * 
     * @param maxOccupancy
     */
    public void setMaxOccupancy(BigInteger maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }
}
