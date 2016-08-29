
package org.opentravel.ota;

/** 
 * An identifier used to uniquely reference an object in a system (e.g. an airline reservation reference, customer profile reference, booking confirmation number, or a reference to a previous availability quote). 
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UniqueID_Type">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:CompanyNameType" name="CompanyName" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:UniqueID_Group"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class UniqueIDType
{
    private CompanyNameType companyName;
    private UniqueIDGroup uniqueIDGroup;

    /** 
     * Get the 'CompanyName' element value. Identifies the company that is associated with the UniqueID.
     * 
     * @return value
     */
    public CompanyNameType getCompanyName() {
        return companyName;
    }

    /** 
     * Set the 'CompanyName' element value. Identifies the company that is associated with the UniqueID.
     * 
     * @param companyName
     */
    public void setCompanyName(CompanyNameType companyName) {
        this.companyName = companyName;
    }

    /** 
     * Get the 'UniqueID_Group' attributeGroup value.
     * 
     * @return value
     */
    public UniqueIDGroup getUniqueIDGroup() {
        return uniqueIDGroup;
    }

    /** 
     * Set the 'UniqueID_Group' attributeGroup value.
     * 
     * @param uniqueIDGroup
     */
    public void setUniqueIDGroup(UniqueIDGroup uniqueIDGroup) {
        this.uniqueIDGroup = uniqueIDGroup;
    }
}
