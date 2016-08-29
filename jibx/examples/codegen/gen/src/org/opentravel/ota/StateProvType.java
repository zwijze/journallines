
package org.opentravel.ota;

/** 
 * State, province, or region name or code needed to identify location.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StateProvType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:string">
 *       &lt;xs:attribute type="xs:string" name="StateCode"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StateProvType
{
    private String string;
    private String stateCode;

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
     * Get the 'StateCode' attribute value. The standard code or abbreviation for the state, province, or region.
     * 
     * @return value
     */
    public String getStateCode() {
        return stateCode;
    }

    /** 
     * Set the 'StateCode' attribute value. The standard code or abbreviation for the state, province, or region.
     * 
     * @param stateCode
     */
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }
}
