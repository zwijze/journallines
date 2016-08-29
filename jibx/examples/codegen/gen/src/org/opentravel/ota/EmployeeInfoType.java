
package org.opentravel.ota;

/** 
 * Employment identification; using an employee ID number, title, level within the company, and an indication of their status, i.e.: active, retired, on leave, or terminated from employment.  Additional information about an employee can be entered into the element, including the name of the employee, if it differs from the person name identified as a customer or contact.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="EmployeeInfoType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:string">
 *       &lt;xs:attribute type="xs:string" name="EmployeeId"/>
 *       &lt;xs:attribute type="xs:string" name="EmployeeLevel"/>
 *       &lt;xs:attribute type="xs:string" name="EmployeeTitle"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="EmployeeStatus"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class EmployeeInfoType
{
    private String string;
    private String employeeId;
    private String employeeLevel;
    private String employeeTitle;
    private String employeeStatus;

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
     * Get the 'EmployeeId' attribute value. Identifier assigned to the employee.
     * 
     * @return value
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /** 
     * Set the 'EmployeeId' attribute value. Identifier assigned to the employee.
     * 
     * @param employeeId
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /** 
     * Get the 'EmployeeLevel' attribute value. Level in employer organization (e.g. seniority) that coveys privileges.
     * 
     * @return value
     */
    public String getEmployeeLevel() {
        return employeeLevel;
    }

    /** 
     * Set the 'EmployeeLevel' attribute value. Level in employer organization (e.g. seniority) that coveys privileges.
     * 
     * @param employeeLevel
     */
    public void setEmployeeLevel(String employeeLevel) {
        this.employeeLevel = employeeLevel;
    }

    /** 
     * Get the 'EmployeeTitle' attribute value. Title of employee in the employer company that conveys rank or privileges.
     * 
     * @return value
     */
    public String getEmployeeTitle() {
        return employeeTitle;
    }

    /** 
     * Set the 'EmployeeTitle' attribute value. Title of employee in the employer company that conveys rank or privileges.
     * 
     * @param employeeTitle
     */
    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }

    /** 
     * Get the 'EmployeeStatus' attribute value. Status of employment. Refer to OTA Code List Employee Status (EMP).
     * 
     * @return value
     */
    public String getEmployeeStatus() {
        return employeeStatus;
    }

    /** 
     * Set the 'EmployeeStatus' attribute value. Status of employment. Refer to OTA Code List Employee Status (EMP).
     * 
     * @param employeeStatus
     */
    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }
}
