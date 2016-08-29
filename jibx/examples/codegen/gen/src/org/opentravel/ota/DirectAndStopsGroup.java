
package org.opentravel.ota;

import java.math.BigInteger;

/** 
 * Attribute collection providing information on direct flight categorization and the number of stops made.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DirectAndStopsGroup">
 *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="DirectFlightsOnly"/>
 *   &lt;xs:attribute type="xs:integer" use="optional" name="NumberStops"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class DirectAndStopsGroup
{
    private Boolean directFlightsOnly;
    private BigInteger numberStops;

    /** 
     * Get the 'DirectFlightsOnly' attribute value. Indicates the same flight number on the same airline regardless of number of stops in most cases.
     * 
     * @return value
     */
    public Boolean getDirectFlightsOnly() {
        return directFlightsOnly;
    }

    /** 
     * Set the 'DirectFlightsOnly' attribute value. Indicates the same flight number on the same airline regardless of number of stops in most cases.
     * 
     * @param directFlightsOnly
     */
    public void setDirectFlightsOnly(Boolean directFlightsOnly) {
        this.directFlightsOnly = directFlightsOnly;
    }

    /** 
     * Get the 'NumberStops' attribute value.  Information regarding the number of stops made.
     * 
     * @return value
     */
    public BigInteger getNumberStops() {
        return numberStops;
    }

    /** 
     * Set the 'NumberStops' attribute value.  Information regarding the number of stops made.
     * 
     * @param numberStops
     */
    public void setNumberStops(BigInteger numberStops) {
        this.numberStops = numberStops;
    }
}
