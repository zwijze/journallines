
package org.opentravel.ota;

/** 
 * An attribute group to be used when the associated item has a required name and an optional code. If the length of the name could exceed 64 characters the complexType LongNameoptionalCodeType should be used.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NameOptionalCodeGroup">
 *   &lt;xs:attribute type="xs:string" use="required" name="Name"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Code"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class NameOptionalCodeGroup
{
    private String name;
    private String code;

    /** 
     * Get the 'Name' attribute value. The name of an item.
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' attribute value. The name of an item.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Code' attribute value. Provides the code identifying the item.
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' attribute value. Provides the code identifying the item.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }
}
