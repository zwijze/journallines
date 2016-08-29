
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Name of an individual and appropriate contact information.  May be contact information for the customer or someone affiliated with the customer.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ContactPersonType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:PersonNameType" name="PersonName" minOccurs="0"/>
 *     &lt;xs:element name="Telephone" minOccurs="0" maxOccurs="5">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:TelephoneInfoGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:AddressInfoType" name="Address" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="ns:EmailType" name="Email" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="ns:URL_Type" name="URL" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="ns:CompanyNameType" name="CompanyName" minOccurs="0" maxOccurs="3"/>
 *     &lt;xs:element type="ns:EmployeeInfoType" name="EmployeeInfo" minOccurs="0" maxOccurs="3"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:PrivacyGroup"/>
 *   &lt;xs:attributeGroup ref="ns:DefaultIndGroup"/>
 *   &lt;xs:attribute type="xs:string" name="ContactType"/>
 *   &lt;xs:attribute type="xs:string" name="Relation"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="EmergencyFlag"/>
 *   &lt;xs:attribute type="xs:string" name="RPH"/>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DefaultIndGroup">
 *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="DefaultInd"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class ContactPersonType
{
    private PersonNameType personName;
    private List<TelephoneInfoGroup> telephoneList = new ArrayList<TelephoneInfoGroup>();
    private List<AddressInfoType> addressList = new ArrayList<AddressInfoType>();
    private List<EmailType> emailList = new ArrayList<EmailType>();
    private List<URLType> URLList = new ArrayList<URLType>();
    private List<CompanyNameType> companyNameList = new ArrayList<CompanyNameType>();
    private List<EmployeeInfoType> employeeInfoList = new ArrayList<EmployeeInfoType>();
    private PrivacyGroup privacyGroup;
    private Boolean defaultInd;
    private String contactType;
    private String relation;
    private Boolean emergencyFlag;
    private String RPH;

    /** 
     * Get the 'PersonName' element value. This provides name information for a person.
     * 
     * @return value
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. This provides name information for a person.
     * 
     * @param personName
     */
    public void setPersonName(PersonNameType personName) {
        this.personName = personName;
    }

    /** 
     * Get the list of 'Telephone' element items. Information about a telephone number, including the actual number and its usage
     * 
     * @return list
     */
    public List<TelephoneInfoGroup> getTelephoneList() {
        return telephoneList;
    }

    /** 
     * Set the list of 'Telephone' element items. Information about a telephone number, including the actual number and its usage
     * 
     * @param list
     */
    public void setTelephoneList(List<TelephoneInfoGroup> list) {
        telephoneList = list;
    }

    /** 
     * Get the list of 'Address' element items. Information about an address that identifies a location for a specific purposes.
     * 
     * @return list
     */
    public List<AddressInfoType> getAddressList() {
        return addressList;
    }

    /** 
     * Set the list of 'Address' element items. Information about an address that identifies a location for a specific purposes.
     * 
     * @param list
     */
    public void setAddressList(List<AddressInfoType> list) {
        addressList = list;
    }

    /** 
     * Get the list of 'Email' element items. Electronic email addresses, in IETF specified format.
     * 
     * @return list
     */
    public List<EmailType> getEmailList() {
        return emailList;
    }

    /** 
     * Set the list of 'Email' element items. Electronic email addresses, in IETF specified format.
     * 
     * @param list
     */
    public void setEmailList(List<EmailType> list) {
        emailList = list;
    }

    /** 
     * Get the list of 'URL' element items. Web site address, in IETF specified format.
     * 
     * @return list
     */
    public List<URLType> getURLList() {
        return URLList;
    }

    /** 
     * Set the list of 'URL' element items. Web site address, in IETF specified format.
     * 
     * @param list
     */
    public void setURLList(List<URLType> list) {
        URLList = list;
    }

    /** 
     * Get the list of 'CompanyName' element items. Identifies a company by name.
     * 
     * @return list
     */
    public List<CompanyNameType> getCompanyNameList() {
        return companyNameList;
    }

    /** 
     * Set the list of 'CompanyName' element items. Identifies a company by name.
     * 
     * @param list
     */
    public void setCompanyNameList(List<CompanyNameType> list) {
        companyNameList = list;
    }

    /** 
     * Get the list of 'EmployeeInfo' element items. Employment identification; using an employee ID number, title, level within the company, and an indication of their status, i.e.: active, retired, on leave, or terminated from employment.  Additional information about an employee can be entered into the element, including the name of the employee, if it differs from the person name identified as a customer or contact.
     * 
     * @return list
     */
    public List<EmployeeInfoType> getEmployeeInfoList() {
        return employeeInfoList;
    }

    /** 
     * Set the list of 'EmployeeInfo' element items. Employment identification; using an employee ID number, title, level within the company, and an indication of their status, i.e.: active, retired, on leave, or terminated from employment.  Additional information about an employee can be entered into the element, including the name of the employee, if it differs from the person name identified as a customer or contact.
     * 
     * @param list
     */
    public void setEmployeeInfoList(List<EmployeeInfoType> list) {
        employeeInfoList = list;
    }

    /** 
     * Get the 'PrivacyGroup' attributeGroup value. Allows for control of the sharing of data between parties.
     * 
     * @return value
     */
    public PrivacyGroup getPrivacyGroup() {
        return privacyGroup;
    }

    /** 
     * Set the 'PrivacyGroup' attributeGroup value. Allows for control of the sharing of data between parties.
     * 
     * @param privacyGroup
     */
    public void setPrivacyGroup(PrivacyGroup privacyGroup) {
        this.privacyGroup = privacyGroup;
    }

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
     * Get the 'ContactType' attribute value. Type of contact in the context of use for the travel experience; such as permanent, temporary, affiliation,
    travel arranger, etc.
     * 
     * @return value
     */
    public String getContactType() {
        return contactType;
    }

    /** 
     * Set the 'ContactType' attribute value. Type of contact in the context of use for the travel experience; such as permanent, temporary, affiliation,
    travel arranger, etc.
     * 
     * @param contactType
     */
    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    /** 
     * Get the 'Relation' attribute value. Indicates the type of relationship with the person or company in the profile, such as Spouse, Child, Family, Business Associate, Interest Group, Medical, Security,Other, etc.
     * 
     * @return value
     */
    public String getRelation() {
        return relation;
    }

    /** 
     * Set the 'Relation' attribute value. Indicates the type of relationship with the person or company in the profile, such as Spouse, Child, Family, Business Associate, Interest Group, Medical, Security,Other, etc.
     * 
     * @param relation
     */
    public void setRelation(String relation) {
        this.relation = relation;
    }

    /** 
     * Get the 'EmergencyFlag' attribute value. Indicates if this contact should be used in the case of an emergency.
     * 
     * @return value
     */
    public Boolean getEmergencyFlag() {
        return emergencyFlag;
    }

    /** 
     * Set the 'EmergencyFlag' attribute value. Indicates if this contact should be used in the case of an emergency.
     * 
     * @param emergencyFlag
     */
    public void setEmergencyFlag(Boolean emergencyFlag) {
        this.emergencyFlag = emergencyFlag;
    }

    /** 
     * Get the 'RPH' attribute value. Provides a unique reference to this contact person.
     * 
     * @return value
     */
    public String getRPH() {
        return RPH;
    }

    /** 
     * Set the 'RPH' attribute value. Provides a unique reference to this contact person.
     * 
     * @param RPH
     */
    public void setRPH(String RPH) {
        this.RPH = RPH;
    }
}
