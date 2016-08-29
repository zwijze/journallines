
package org.opentravel.ota;

/** 
 * Used to specify a code and the context of the code.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CodeGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="Code"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="CodeContext"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class CodeGroup
{
    private String code;
    private String codeContext;

    /** 
     * Get the 'Code' attribute value. Any code used to specify an item, for example, type of traveler, service code, room amenity, etc.
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' attribute value. Any code used to specify an item, for example, type of traveler, service code, room amenity, etc.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'CodeContext' attribute value. Identifies the source authority for the code. 
     * 
     * @return value
     */
    public String getCodeContext() {
        return codeContext;
    }

    /** 
     * Set the 'CodeContext' attribute value. Identifies the source authority for the code. 
     * 
     * @param codeContext
     */
    public void setCodeContext(String codeContext) {
        this.codeContext = codeContext;
    }
}
