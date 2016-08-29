
package org.opentravel.ota;

/** 
 * An attribute group to be used when the associated item has an  optional code and an optional name.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OptionalCodeOptionalNameGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="Code"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Name"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class OptionalCodeOptionalNameGroup
{
    private String code;
    private String name;

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
}
