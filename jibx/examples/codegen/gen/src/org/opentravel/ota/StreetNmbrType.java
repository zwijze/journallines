
package org.opentravel.ota;

/** 
 * Street name; number on street.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StreetNmbrType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:string">
 *       &lt;xs:attribute type="xs:string" name="PO_Box"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StreetNmbrType
{
    private String string;
    private String POBox;

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
     * Get the 'PO_Box' attribute value. Defines a Post Office Box number.
     * 
     * @return value
     */
    public String getPOBox() {
        return POBox;
    }

    /** 
     * Set the 'PO_Box' attribute value. Defines a Post Office Box number.
     * 
     * @param POBox
     */
    public void setPOBox(String POBox) {
        this.POBox = POBox;
    }
}
