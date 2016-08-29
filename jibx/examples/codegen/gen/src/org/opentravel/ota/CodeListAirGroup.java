
package org.opentravel.ota;

/** 
 *  Used to specify a code and its associated attributes; meaning is derived from actual use (plus SecondaryCode and SupplierCode).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CodeListAirGroup">
 *   &lt;xs:attributeGroup ref="ns:CodeListGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="SecondaryCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="SupplierCode"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class CodeListAirGroup
{
    private CodeListGroup codeListGroup;
    private String secondaryCode;
    private String supplierCode;

    /** 
     * Get the 'CodeListGroup' attributeGroup value.
     * 
     * @return value
     */
    public CodeListGroup getCodeListGroup() {
        return codeListGroup;
    }

    /** 
     * Set the 'CodeListGroup' attributeGroup value.
     * 
     * @param codeListGroup
     */
    public void setCodeListGroup(CodeListGroup codeListGroup) {
        this.codeListGroup = codeListGroup;
    }

    /** 
     * Get the 'SecondaryCode' attribute value. An additional attribute to allow flexibility for particular organizations who require an additional code.
     * 
     * @return value
     */
    public String getSecondaryCode() {
        return secondaryCode;
    }

    /** 
     * Set the 'SecondaryCode' attribute value. An additional attribute to allow flexibility for particular organizations who require an additional code.
     * 
     * @param secondaryCode
     */
    public void setSecondaryCode(String secondaryCode) {
        this.secondaryCode = secondaryCode;
    }

    /** 
     * Get the 'SupplierCode' attribute value. An additional attribute to allow flexibility for particular organizations who require an additional supplier code.
     * 
     * @return value
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /** 
     * Set the 'SupplierCode' attribute value. An additional attribute to allow flexibility for particular organizations who require an additional supplier code.
     * 
     * @param supplierCode
     */
    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }
}
