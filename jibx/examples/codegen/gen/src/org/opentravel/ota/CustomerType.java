
package org.opentravel.ota;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/** 
 * Contains basic data on the customer's identity, location, relationships, finances, memberships, etc.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CustomerType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:PersonNameType" name="PersonName" minOccurs="0"/>
 *     &lt;xs:element name="Telephone" minOccurs="0" maxOccurs="5">
 *       &lt;!-- Reference to inner class Telephone -->
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:EmailType" name="Email" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element name="Address" minOccurs="0" maxOccurs="5">
 *       &lt;!-- Reference to inner class Address -->
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:URL_Type" name="URL" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element name="CitizenCountryName" minOccurs="0" maxOccurs="2">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:CitizenCountryNameGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element type="xs:string" name="PhysChallName" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="xs:string" name="PetInfo" minOccurs="0" maxOccurs="3"/>
 *     &lt;xs:element type="ns:PaymentFormType" name="PaymentForm" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="ns:RelatedTravelerType" name="RelatedTraveler" minOccurs="0" maxOccurs="9"/>
 *     &lt;xs:element type="ns:ContactPersonType" name="ContactPerson" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="ns:DocumentType" name="Document" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element name="CustLoyalty" minOccurs="0" maxOccurs="5">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:CustomerLoyaltyGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:EmployeeInfoType" name="EmployeeInfo" minOccurs="0" maxOccurs="3"/>
 *     &lt;xs:element type="ns:CompanyNameType" name="EmployerInfo" minOccurs="0"/>
 *     &lt;xs:element ref="ns:TPA_Extensions" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:GenderGroup"/>
 *   &lt;xs:attribute type="xs:boolean" name="Deceased"/>
 *   &lt;xs:attribute type="xs:string" name="LockoutType"/>
 *   &lt;xs:attributeGroup ref="ns:BirthDateGroup"/>
 *   &lt;xs:attributeGroup ref="ns:CurrencyCodeGroup"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="VIP_Indicator"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Text"/>
 *   &lt;xs:attributeGroup ref="ns:LanguageGroup"/>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BirthDateGroup">
 *   &lt;xs:attribute type="xs:date" use="optional" name="BirthDate"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LanguageGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="Language"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class CustomerType
{
    private PersonNameType personName;
    private List<Telephone> telephoneList = new ArrayList<Telephone>();
    private List<EmailType> emailList = new ArrayList<EmailType>();
    private List<Address> addressList = new ArrayList<Address>();
    private List<URLType> URLList = new ArrayList<URLType>();
    private List<CitizenCountryNameGroup> citizenCountryNameList = new ArrayList<CitizenCountryNameGroup>();
    private List<String> physChallNameList = new ArrayList<String>();
    private List<String> petInfoList = new ArrayList<String>();
    private List<PaymentFormType> paymentFormList = new ArrayList<PaymentFormType>();
    private List<RelatedTravelerType> relatedTravelerList = new ArrayList<RelatedTravelerType>();
    private List<ContactPersonType> contactPersonList = new ArrayList<ContactPersonType>();
    private List<DocumentType> documentList = new ArrayList<DocumentType>();
    private List<CustomerLoyaltyGroup> custLoyaltyList = new ArrayList<CustomerLoyaltyGroup>();
    private List<EmployeeInfoType> employeeInfoList = new ArrayList<EmployeeInfoType>();
    private CompanyNameType employerInfo;
    private TPAExtensionsType TPAExtensions;
    private GenderGroup genderGroup;
    private Boolean deceased;
    private String lockoutType;
    private Date birthDate;
    private CurrencyCodeGroup currencyCodeGroup;
    private Boolean VIPIndicator;
    private String text;
    private String language;

    /** 
     * Get the 'PersonName' element value.
     * 
     * @return value
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value.
     * 
     * @param personName
     */
    public void setPersonName(PersonNameType personName) {
        this.personName = personName;
    }

    /** 
     * Get the list of 'Telephone' element items.
     * 
     * @return list
     */
    public List<Telephone> getTelephoneList() {
        return telephoneList;
    }

    /** 
     * Set the list of 'Telephone' element items.
     * 
     * @param list
     */
    public void setTelephoneList(List<Telephone> list) {
        telephoneList = list;
    }

    /** 
     * Get the list of 'Email' element items.
     * 
     * @return list
     */
    public List<EmailType> getEmailList() {
        return emailList;
    }

    /** 
     * Set the list of 'Email' element items.
     * 
     * @param list
     */
    public void setEmailList(List<EmailType> list) {
        emailList = list;
    }

    /** 
     * Get the list of 'Address' element items.
     * 
     * @return list
     */
    public List<Address> getAddressList() {
        return addressList;
    }

    /** 
     * Set the list of 'Address' element items.
     * 
     * @param list
     */
    public void setAddressList(List<Address> list) {
        addressList = list;
    }

    /** 
     * Get the list of 'URL' element items.
     * 
     * @return list
     */
    public List<URLType> getURLList() {
        return URLList;
    }

    /** 
     * Set the list of 'URL' element items.
     * 
     * @param list
     */
    public void setURLList(List<URLType> list) {
        URLList = list;
    }

    /** 
     * Get the list of 'CitizenCountryName' element items.
     * 
     * @return list
     */
    public List<CitizenCountryNameGroup> getCitizenCountryNameList() {
        return citizenCountryNameList;
    }

    /** 
     * Set the list of 'CitizenCountryName' element items.
     * 
     * @param list
     */
    public void setCitizenCountryNameList(List<CitizenCountryNameGroup> list) {
        citizenCountryNameList = list;
    }

    /** 
     * Get the list of 'PhysChallName' element items.
     * 
     * @return list
     */
    public List<String> getPhysChallNameList() {
        return physChallNameList;
    }

    /** 
     * Set the list of 'PhysChallName' element items.
     * 
     * @param list
     */
    public void setPhysChallNameList(List<String> list) {
        physChallNameList = list;
    }

    /** 
     * Get the list of 'PetInfo' element items.
     * 
     * @return list
     */
    public List<String> getPetInfoList() {
        return petInfoList;
    }

    /** 
     * Set the list of 'PetInfo' element items.
     * 
     * @param list
     */
    public void setPetInfoList(List<String> list) {
        petInfoList = list;
    }

    /** 
     * Get the list of 'PaymentForm' element items.
     * 
     * @return list
     */
    public List<PaymentFormType> getPaymentFormList() {
        return paymentFormList;
    }

    /** 
     * Set the list of 'PaymentForm' element items.
     * 
     * @param list
     */
    public void setPaymentFormList(List<PaymentFormType> list) {
        paymentFormList = list;
    }

    /** 
     * Get the list of 'RelatedTraveler' element items.
     * 
     * @return list
     */
    public List<RelatedTravelerType> getRelatedTravelerList() {
        return relatedTravelerList;
    }

    /** 
     * Set the list of 'RelatedTraveler' element items.
     * 
     * @param list
     */
    public void setRelatedTravelerList(List<RelatedTravelerType> list) {
        relatedTravelerList = list;
    }

    /** 
     * Get the list of 'ContactPerson' element items.
     * 
     * @return list
     */
    public List<ContactPersonType> getContactPersonList() {
        return contactPersonList;
    }

    /** 
     * Set the list of 'ContactPerson' element items.
     * 
     * @param list
     */
    public void setContactPersonList(List<ContactPersonType> list) {
        contactPersonList = list;
    }

    /** 
     * Get the list of 'Document' element items.
     * 
     * @return list
     */
    public List<DocumentType> getDocumentList() {
        return documentList;
    }

    /** 
     * Set the list of 'Document' element items.
     * 
     * @param list
     */
    public void setDocumentList(List<DocumentType> list) {
        documentList = list;
    }

    /** 
     * Get the list of 'CustLoyalty' element items.
     * 
     * @return list
     */
    public List<CustomerLoyaltyGroup> getCustLoyaltyList() {
        return custLoyaltyList;
    }

    /** 
     * Set the list of 'CustLoyalty' element items.
     * 
     * @param list
     */
    public void setCustLoyaltyList(List<CustomerLoyaltyGroup> list) {
        custLoyaltyList = list;
    }

    /** 
     * Get the list of 'EmployeeInfo' element items.
     * 
     * @return list
     */
    public List<EmployeeInfoType> getEmployeeInfoList() {
        return employeeInfoList;
    }

    /** 
     * Set the list of 'EmployeeInfo' element items.
     * 
     * @param list
     */
    public void setEmployeeInfoList(List<EmployeeInfoType> list) {
        employeeInfoList = list;
    }

    /** 
     * Get the 'EmployerInfo' element value. Identifies the customer's employer.
     * 
     * @return value
     */
    public CompanyNameType getEmployerInfo() {
        return employerInfo;
    }

    /** 
     * Set the 'EmployerInfo' element value. Identifies the customer's employer.
     * 
     * @param employerInfo
     */
    public void setEmployerInfo(CompanyNameType employerInfo) {
        this.employerInfo = employerInfo;
    }

    /** 
     * Get the 'TPA_Extensions' element value.
     * 
     * @return value
     */
    public TPAExtensionsType getTPAExtensions() {
        return TPAExtensions;
    }

    /** 
     * Set the 'TPA_Extensions' element value.
     * 
     * @param TPAExtensions
     */
    public void setTPAExtensions(TPAExtensionsType TPAExtensions) {
        this.TPAExtensions = TPAExtensions;
    }

    /** 
     * Get the 'GenderGroup' attributeGroup value.
     * 
     * @return value
     */
    public GenderGroup getGenderGroup() {
        return genderGroup;
    }

    /** 
     * Set the 'GenderGroup' attributeGroup value.
     * 
     * @param genderGroup
     */
    public void setGenderGroup(GenderGroup genderGroup) {
        this.genderGroup = genderGroup;
    }

    /** 
     * Get the 'Deceased' attribute value.
     * 
     * @return value
     */
    public Boolean getDeceased() {
        return deceased;
    }

    /** 
     * Set the 'Deceased' attribute value.
     * 
     * @param deceased
     */
    public void setDeceased(Boolean deceased) {
        this.deceased = deceased;
    }

    /** 
     * Get the 'LockoutType' attribute value. Indicates reason for locking out record, such as Emergency, Incident, etc. 
     * 
     * @return value
     */
    public String getLockoutType() {
        return lockoutType;
    }

    /** 
     * Set the 'LockoutType' attribute value. Indicates reason for locking out record, such as Emergency, Incident, etc. 
     * 
     * @param lockoutType
     */
    public void setLockoutType(String lockoutType) {
        this.lockoutType = lockoutType;
    }

    /** 
     * Get the 'BirthDate' attribute value. Indicates the date of birth as indicated in the document, in ISO 8601 prescribed format.
     * 
     * @return value
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /** 
     * Set the 'BirthDate' attribute value. Indicates the date of birth as indicated in the document, in ISO 8601 prescribed format.
     * 
     * @param birthDate
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /** 
     * Get the 'CurrencyCodeGroup' attributeGroup value. Type of funds preferred for reviewing monetary values, in ISO 4217 codes.
     * 
     * @return value
     */
    public CurrencyCodeGroup getCurrencyCodeGroup() {
        return currencyCodeGroup;
    }

    /** 
     * Set the 'CurrencyCodeGroup' attributeGroup value. Type of funds preferred for reviewing monetary values, in ISO 4217 codes.
     * 
     * @param currencyCodeGroup
     */
    public void setCurrencyCodeGroup(CurrencyCodeGroup currencyCodeGroup) {
        this.currencyCodeGroup = currencyCodeGroup;
    }

    /** 
     * Get the 'VIP_Indicator' attribute value. If true, indicates a very important person.
     * 
     * @return value
     */
    public Boolean getVIPIndicator() {
        return VIPIndicator;
    }

    /** 
     * Set the 'VIP_Indicator' attribute value. If true, indicates a very important person.
     * 
     * @param VIPIndicator
     */
    public void setVIPIndicator(Boolean VIPIndicator) {
        this.VIPIndicator = VIPIndicator;
    }

    /** 
     * Get the 'Text' attribute value. Used to specify textual information about the customer.
     * 
     * @return value
     */
    public String getText() {
        return text;
    }

    /** 
     * Set the 'Text' attribute value. Used to specify textual information about the customer.
     * 
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /** 
     * Get the 'Language' attribute value. Language identification.
     * 
     * @return value
     */
    public String getLanguage() {
        return language;
    }

    /** 
     * Set the 'Language' attribute value. Language identification.
     * 
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Telephone" minOccurs="0" maxOccurs="5">
     *   &lt;xs:complexType>
     *     &lt;xs:attributeGroup ref="ns:EffectiveExpireOptionalDateGroup"/>
     *     &lt;xs:attributeGroup ref="ns:TelephoneInfoGroup"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Telephone
    {
        private EffectiveExpireOptionalDateGroup effectiveExpireOptionalDateGroup;
        private TelephoneInfoGroup telephoneInfoGroup;

        /** 
         * Get the 'EffectiveExpireOptionalDateGroup' attributeGroup value. The first and last dates between which this telephone number is in effect.
         * 
         * @return value
         */
        public EffectiveExpireOptionalDateGroup getEffectiveExpireOptionalDateGroup() {
            return effectiveExpireOptionalDateGroup;
        }

        /** 
         * Set the 'EffectiveExpireOptionalDateGroup' attributeGroup value. The first and last dates between which this telephone number is in effect.
         * 
         * @param effectiveExpireOptionalDateGroup
         */
        public void setEffectiveExpireOptionalDateGroup(
                EffectiveExpireOptionalDateGroup effectiveExpireOptionalDateGroup) {
            this.effectiveExpireOptionalDateGroup = effectiveExpireOptionalDateGroup;
        }

        /** 
         * Get the 'TelephoneInfoGroup' attributeGroup value.
         * 
         * @return value
         */
        public TelephoneInfoGroup getTelephoneInfoGroup() {
            return telephoneInfoGroup;
        }

        /** 
         * Set the 'TelephoneInfoGroup' attributeGroup value.
         * 
         * @param telephoneInfoGroup
         */
        public void setTelephoneInfoGroup(TelephoneInfoGroup telephoneInfoGroup) {
            this.telephoneInfoGroup = telephoneInfoGroup;
        }
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Address" minOccurs="0" maxOccurs="5">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:AddressInfoType">
     *         &lt;xs:sequence>
     *           &lt;xs:element type="ns:CompanyNameType" name="CompanyName" minOccurs="0"/>
     *         &lt;/xs:sequence>
     *         &lt;xs:attributeGroup ref="ns:EffectiveExpireOptionalDateGroup"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Address extends AddressInfoType
    {
        private CompanyNameType companyName;
        private EffectiveExpireOptionalDateGroup effectiveExpireOptionalDateGroup;

        /** 
         * Get the 'CompanyName' element value.
         * 
         * @return value
         */
        public CompanyNameType getCompanyName() {
            return companyName;
        }

        /** 
         * Set the 'CompanyName' element value.
         * 
         * @param companyName
         */
        public void setCompanyName(CompanyNameType companyName) {
            this.companyName = companyName;
        }

        /** 
         * Get the 'EffectiveExpireOptionalDateGroup' attributeGroup value. The first and last dates between which this address is in effect.
         * 
         * @return value
         */
        public EffectiveExpireOptionalDateGroup getEffectiveExpireOptionalDateGroup() {
            return effectiveExpireOptionalDateGroup;
        }

        /** 
         * Set the 'EffectiveExpireOptionalDateGroup' attributeGroup value. The first and last dates between which this address is in effect.
         * 
         * @param effectiveExpireOptionalDateGroup
         */
        public void setEffectiveExpireOptionalDateGroup(
                EffectiveExpireOptionalDateGroup effectiveExpireOptionalDateGroup) {
            this.effectiveExpireOptionalDateGroup = effectiveExpireOptionalDateGroup;
        }
    }
}
