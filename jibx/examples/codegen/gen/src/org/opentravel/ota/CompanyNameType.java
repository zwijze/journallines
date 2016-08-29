
package org.opentravel.ota;

/** 
 * Identifies a company by name.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompanyNameType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:string">
 *       &lt;xs:attributeGroup ref="ns:CompanyID_AttributesGroup"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="Division"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="Department"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CompanyNameType
{
    private String string;
    private CompanyIDAttributesGroup companyIDAttributesGroup;
    private String division;
    private String department;

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
     * Get the 'CompanyID_AttributesGroup' attributeGroup value.
     * 
     * @return value
     */
    public CompanyIDAttributesGroup getCompanyIDAttributesGroup() {
        return companyIDAttributesGroup;
    }

    /** 
     * Set the 'CompanyID_AttributesGroup' attributeGroup value.
     * 
     * @param companyIDAttributesGroup
     */
    public void setCompanyIDAttributesGroup(
            CompanyIDAttributesGroup companyIDAttributesGroup) {
        this.companyIDAttributesGroup = companyIDAttributesGroup;
    }

    /** 
     * Get the 'Division' attribute value. The division name or ID with which the contact is associated.
     * 
     * @return value
     */
    public String getDivision() {
        return division;
    }

    /** 
     * Set the 'Division' attribute value. The division name or ID with which the contact is associated.
     * 
     * @param division
     */
    public void setDivision(String division) {
        this.division = division;
    }

    /** 
     * Get the 'Department' attribute value. The department name or ID with which the contact is associated.
     * 
     * @return value
     */
    public String getDepartment() {
        return department;
    }

    /** 
     * Set the 'Department' attribute value. The department name or ID with which the contact is associated.
     * 
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }
}
