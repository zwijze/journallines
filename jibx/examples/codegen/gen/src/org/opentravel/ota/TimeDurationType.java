
package org.opentravel.ota;

/** 
 * Used to specify a time period, which may additionally include a minimum and/or maximum duration. 
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TimeDurationType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:string">
 *       &lt;xs:attribute type="xs:string" use="optional" name="Minimum"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="Maximum"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TimeDurationType
{
    private String string;
    private String minimum;
    private String maximum;

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
     * Get the 'Minimum' attribute value.
     * 
     * @return value
     */
    public String getMinimum() {
        return minimum;
    }

    /** 
     * Set the 'Minimum' attribute value.
     * 
     * @param minimum
     */
    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    /** 
     * Get the 'Maximum' attribute value.
     * 
     * @return value
     */
    public String getMaximum() {
        return maximum;
    }

    /** 
     * Set the 'Maximum' attribute value.
     * 
     * @param maximum
     */
    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }
}
