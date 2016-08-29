
package org.opentravel.ota;

/** 
 * Provides formatted textual information that a vendor wishes to make known.  The type of information is indicated
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="VendorMessageType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:FormattedTextType">
 *       &lt;xs:attribute type="xs:string" use="required" name="InfoType"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class VendorMessageType extends FormattedTextType
{
    private String infoType;

    /** 
     * Get the 'InfoType' attribute value. To define the type of information such as Description, Policy, Marketing, etc. Refer to OTA Code List Information Type (INF).
     * 
     * @return value
     */
    public String getInfoType() {
        return infoType;
    }

    /** 
     * Set the 'InfoType' attribute value. To define the type of information such as Description, Policy, Marketing, etc. Refer to OTA Code List Information Type (INF).
     * 
     * @param infoType
     */
    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }
}
