
package org.opentravel.ota;

/** 
 * Provides telephone information details.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TelephoneAttributesGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="PhoneLocationType"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="PhoneTechType"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="PhoneUseType"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="CountryAccessCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="AreaCityCode"/>
 *   &lt;xs:attribute type="xs:string" use="required" name="PhoneNumber"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Extension"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="PIN"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Remark"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class TelephoneAttributesGroup
{
    private String phoneLocationType;
    private String phoneTechType;
    private String phoneUseType;
    private String countryAccessCode;
    private String areaCityCode;
    private String phoneNumber;
    private String extension;
    private String PIN;
    private String remark;

    /** 
     * Get the 'PhoneLocationType' attribute value. Refer to OTA Code List Phone Location Type (PLT).
    	
     * 
     * @return value
     */
    public String getPhoneLocationType() {
        return phoneLocationType;
    }

    /** 
     * Set the 'PhoneLocationType' attribute value. Refer to OTA Code List Phone Location Type (PLT).
    	
     * 
     * @param phoneLocationType
     */
    public void setPhoneLocationType(String phoneLocationType) {
        this.phoneLocationType = phoneLocationType;
    }

    /** 
     * Get the 'PhoneTechType' attribute value. Indicates type of technology associated with this telephone number, such as Voice, Data, Fax, Pager, Mobile, TTY, etc. Refer to OTA Code List Phone Technology Type (PTT).
     * 
     * @return value
     */
    public String getPhoneTechType() {
        return phoneTechType;
    }

    /** 
     * Set the 'PhoneTechType' attribute value. Indicates type of technology associated with this telephone number, such as Voice, Data, Fax, Pager, Mobile, TTY, etc. Refer to OTA Code List Phone Technology Type (PTT).
     * 
     * @param phoneTechType
     */
    public void setPhoneTechType(String phoneTechType) {
        this.phoneTechType = phoneTechType;
    }

    /** 
     * Get the 'PhoneUseType' attribute value. Describes the type of telephone number, in the context of its general use (e.g. Home, Business, Emergency Contact, Travel Arranger, Day, Evening). Refer to OTA Code List Phone Use Type (PUT).
     * 
     * @return value
     */
    public String getPhoneUseType() {
        return phoneUseType;
    }

    /** 
     * Set the 'PhoneUseType' attribute value. Describes the type of telephone number, in the context of its general use (e.g. Home, Business, Emergency Contact, Travel Arranger, Day, Evening). Refer to OTA Code List Phone Use Type (PUT).
     * 
     * @param phoneUseType
     */
    public void setPhoneUseType(String phoneUseType) {
        this.phoneUseType = phoneUseType;
    }

    /** 
     * Get the 'CountryAccessCode' attribute value. Code assigned by telecommunications authorities for international country access identifier.
     * 
     * @return value
     */
    public String getCountryAccessCode() {
        return countryAccessCode;
    }

    /** 
     * Set the 'CountryAccessCode' attribute value. Code assigned by telecommunications authorities for international country access identifier.
     * 
     * @param countryAccessCode
     */
    public void setCountryAccessCode(String countryAccessCode) {
        this.countryAccessCode = countryAccessCode;
    }

    /** 
     * Get the 'AreaCityCode' attribute value. Code assigned for telephones in a specific region, city, or area.
     * 
     * @return value
     */
    public String getAreaCityCode() {
        return areaCityCode;
    }

    /** 
     * Set the 'AreaCityCode' attribute value. Code assigned for telephones in a specific region, city, or area.
     * 
     * @param areaCityCode
     */
    public void setAreaCityCode(String areaCityCode) {
        this.areaCityCode = areaCityCode;
    }

    /** 
     * Get the 'PhoneNumber' attribute value. Telephone number assigned to a single location.
     * 
     * @return value
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /** 
     * Set the 'PhoneNumber' attribute value. Telephone number assigned to a single location.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /** 
     * Get the 'Extension' attribute value. Extension to reach a specific party at the phone number.
     * 
     * @return value
     */
    public String getExtension() {
        return extension;
    }

    /** 
     * Set the 'Extension' attribute value. Extension to reach a specific party at the phone number.
     * 
     * @param extension
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /** 
     * Get the 'PIN' attribute value. Additional codes used for pager or telephone access rights.
     * 
     * @return value
     */
    public String getPIN() {
        return PIN;
    }

    /** 
     * Set the 'PIN' attribute value. Additional codes used for pager or telephone access rights.
     * 
     * @param PIN
     */
    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    /** 
     * Get the 'Remark' attribute value. A remark associated with the telephone number.
     * 
     * @return value
     */
    public String getRemark() {
        return remark;
    }

    /** 
     * Set the 'Remark' attribute value. A remark associated with the telephone number.
     * 
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
