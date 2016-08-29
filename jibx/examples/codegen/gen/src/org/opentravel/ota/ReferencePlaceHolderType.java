
package org.opentravel.ota;

/** 
 * Used to provide a reference to an object that is stored elsewhere in a collection of the same objects.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferencePlaceHolderType">
 *   &lt;xs:attribute type="xs:string" name="RPH"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferencePlaceHolderType
{
    private String RPH;

    /** 
     * Get the 'RPH' attribute value.
     * 
     * @return value
     */
    public String getRPH() {
        return RPH;
    }

    /** 
     * Set the 'RPH' attribute value.
     * 
     * @param RPH
     */
    public void setRPH(String RPH) {
        this.RPH = RPH;
    }
}
