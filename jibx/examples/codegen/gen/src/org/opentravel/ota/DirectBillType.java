
package org.opentravel.ota;

/** 
 * Company name and location for sending invoice for remittances for travel services.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DirectBillType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="CompanyName" minOccurs="0">
 *       &lt;!-- Reference to inner class CompanyName -->
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:AddressInfoType" name="Address" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:PrivacyGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="DirectBill_ID"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="BillingNumber"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DirectBillType
{
    private CompanyName companyName;
    private AddressInfoType address;
    private PrivacyGroup privacyGroup;
    private String directBillID;
    private String billingNumber;

    /** 
     * Get the 'CompanyName' element value.
     * 
     * @return value
     */
    public CompanyName getCompanyName() {
        return companyName;
    }

    /** 
     * Set the 'CompanyName' element value.
     * 
     * @param companyName
     */
    public void setCompanyName(CompanyName companyName) {
        this.companyName = companyName;
    }

    /** 
     * Get the 'Address' element value. Address where remittance should be directed.
     * 
     * @return value
     */
    public AddressInfoType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Address where remittance should be directed.
     * 
     * @param address
     */
    public void setAddress(AddressInfoType address) {
        this.address = address;
    }

    /** 
     * Get the 'PrivacyGroup' attributeGroup value.
     * 
     * @return value
     */
    public PrivacyGroup getPrivacyGroup() {
        return privacyGroup;
    }

    /** 
     * Set the 'PrivacyGroup' attributeGroup value.
     * 
     * @param privacyGroup
     */
    public void setPrivacyGroup(PrivacyGroup privacyGroup) {
        this.privacyGroup = privacyGroup;
    }

    /** 
     * Get the 'DirectBill_ID' attribute value. Identifier for the organization to be billed directly for travel services.
     * 
     * @return value
     */
    public String getDirectBillID() {
        return directBillID;
    }

    /** 
     * Set the 'DirectBill_ID' attribute value. Identifier for the organization to be billed directly for travel services.
     * 
     * @param directBillID
     */
    public void setDirectBillID(String directBillID) {
        this.directBillID = directBillID;
    }

    /** 
     * Get the 'BillingNumber' attribute value. The number assigned by the subscriber for billing reconciliation of a corporate account.
     * 
     * @return value
     */
    public String getBillingNumber() {
        return billingNumber;
    }

    /** 
     * Set the 'BillingNumber' attribute value. The number assigned by the subscriber for billing reconciliation of a corporate account.
     * 
     * @param billingNumber
     */
    public void setBillingNumber(String billingNumber) {
        this.billingNumber = billingNumber;
    }
    /** 
     * Company name to whom remittance should be directed.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompanyName" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:simpleContent>
     *       &lt;xs:extension base="ns:CompanyNameType">
     *         &lt;xs:attribute type="xs:string" use="optional" name="ContactName"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:simpleContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class CompanyName
    {
        private CompanyNameType companyNameType;
        private String contactName;

        /** 
         * Get the extension value.
         * 
         * @return value
         */
        public CompanyNameType getCompanyNameType() {
            return companyNameType;
        }

        /** 
         * Set the extension value.
         * 
         * @param companyNameType
         */
        public void setCompanyNameType(CompanyNameType companyNameType) {
            this.companyNameType = companyNameType;
        }

        /** 
         * Get the 'ContactName' attribute value. This may be used to pass the name of the contact at the company for which the direct bill applies.
         * 
         * @return value
         */
        public String getContactName() {
            return contactName;
        }

        /** 
         * Set the 'ContactName' attribute value. This may be used to pass the name of the contact at the company for which the direct bill applies.
         * 
         * @param contactName
         */
        public void setContactName(String contactName) {
            this.contactName = contactName;
        }
    }
}
