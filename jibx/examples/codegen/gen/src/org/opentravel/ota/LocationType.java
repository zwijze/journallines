
package org.opentravel.ota;

/** 
 * Code and optional string to describe a location point.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LocationType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:string">
 *       &lt;xs:attributeGroup ref="ns:LocationGroup"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class LocationType
{
    private String string;
    private LocationGroup locationGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public String getString() {
        return string;
    }

    /** 
     * Set the extension value.
     * 
     * @param string
     */
    public void setString(String string) {
        this.string = string;
    }

    /** 
     * Get the 'LocationGroup' attributeGroup value.
     * 
     * @return value
     */
    public LocationGroup getLocationGroup() {
        return locationGroup;
    }

    /** 
     * Set the 'LocationGroup' attributeGroup value.
     * 
     * @param locationGroup
     */
    public void setLocationGroup(LocationGroup locationGroup) {
        this.locationGroup = locationGroup;
    }
}
