
package org.opentravel.ota;

/** 
 * Method by which confirmations should be delivered.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="WrittenConfInstType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:ParagraphType" name="SupplementalData" minOccurs="0"/>
 *     &lt;xs:element type="ns:EmailType" name="Email" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" use="optional" name="LanguageID"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="AddresseeName"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Address"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Telephone"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="ConfirmInd"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class WrittenConfInstType
{
    private ParagraphType supplementalData;
    private EmailType email;
    private String languageID;
    private String addresseeName;
    private String address;
    private String telephone;
    private Boolean confirmInd;

    /** 
     * Get the 'SupplementalData' element value. Additional data that will be sent with the confirmation.  This could be used to include a map, pictures, or any other information that the reservation source wishes to include with the confirmation
     * 
     * @return value
     */
    public ParagraphType getSupplementalData() {
        return supplementalData;
    }

    /** 
     * Set the 'SupplementalData' element value. Additional data that will be sent with the confirmation.  This could be used to include a map, pictures, or any other information that the reservation source wishes to include with the confirmation
     * 
     * @param supplementalData
     */
    public void setSupplementalData(ParagraphType supplementalData) {
        this.supplementalData = supplementalData;
    }

    /** 
     * Get the 'Email' element value.
     * 
     * @return value
     */
    public EmailType getEmail() {
        return email;
    }

    /** 
     * Set the 'Email' element value.
     * 
     * @param email
     */
    public void setEmail(EmailType email) {
        this.email = email;
    }

    /** 
     * Get the 'LanguageID' attribute value.
     * 
     * @return value
     */
    public String getLanguageID() {
        return languageID;
    }

    /** 
     * Set the 'LanguageID' attribute value.
     * 
     * @param languageID
     */
    public void setLanguageID(String languageID) {
        this.languageID = languageID;
    }

    /** 
     * Get the 'AddresseeName' attribute value.
     * 
     * @return value
     */
    public String getAddresseeName() {
        return addresseeName;
    }

    /** 
     * Set the 'AddresseeName' attribute value.
     * 
     * @param addresseeName
     */
    public void setAddresseeName(String addresseeName) {
        this.addresseeName = addresseeName;
    }

    /** 
     * Get the 'Address' attribute value.
     * 
     * @return value
     */
    public String getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' attribute value.
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /** 
     * Get the 'Telephone' attribute value.
     * 
     * @return value
     */
    public String getTelephone() {
        return telephone;
    }

    /** 
     * Set the 'Telephone' attribute value.
     * 
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /** 
     * Get the 'ConfirmInd' attribute value. When true a written confirmation was requested and will be sent.
     * 
     * @return value
     */
    public Boolean getConfirmInd() {
        return confirmInd;
    }

    /** 
     * Set the 'ConfirmInd' attribute value. When true a written confirmation was requested and will be sent.
     * 
     * @param confirmInd
     */
    public void setConfirmInd(Boolean confirmInd) {
        this.confirmInd = confirmInd;
    }
}
