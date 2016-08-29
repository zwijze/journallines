
package org.opentravel.ota;

/** 
 * Name of the (self-professed) country that is claimed for citizenship
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CitizenCountryNameGroup">
 *   &lt;xs:attributeGroup ref="ns:DefaultIndGroup"/>
 *   &lt;xs:attribute type="xs:string" name="Code"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DefaultIndGroup">
 *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="DefaultInd"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class CitizenCountryNameGroup
{
    private Boolean defaultInd;
    private String code;

    /** 
     * Get the 'DefaultInd' attribute value. Indicates that the receiving system should assume the default value if the user specifies no overriding value or action.
     * 
     * @return value
     */
    public Boolean getDefaultInd() {
        return defaultInd;
    }

    /** 
     * Set the 'DefaultInd' attribute value. Indicates that the receiving system should assume the default value if the user specifies no overriding value or action.
     * 
     * @param defaultInd
     */
    public void setDefaultInd(Boolean defaultInd) {
        this.defaultInd = defaultInd;
    }

    /** 
     * Get the 'Code' attribute value.
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' attribute value.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }
}
