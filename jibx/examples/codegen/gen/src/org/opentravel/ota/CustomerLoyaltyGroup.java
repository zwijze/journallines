
package org.opentravel.ota;

import java.sql.Date;

/** 
 * Program rewarding frequent use by accumulating credits for services provided by vendors.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CustomerLoyaltyGroup">
 *   &lt;xs:attributeGroup ref="ns:PrivacyGroup"/>
 *   &lt;xs:attribute type="xs:string" name="ProgramID"/>
 *   &lt;xs:attribute type="xs:string" name="MembershipID"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="TravelSector"/>
 *   &lt;xs:attributeGroup ref="ns:LoyalLevelGroup"/>
 *   &lt;xs:attributeGroup ref="ns:SingleVendorIndGroup"/>
 *   &lt;xs:attributeGroup ref="ns:SignupDateGroup"/>
 *   &lt;xs:attributeGroup ref="ns:EffectiveExpireOptionalDateGroup"/>
 *   &lt;xs:attribute type="xs:string" name="RPH"/>
 *   &lt;xs:attribute type="ns:ListOfStringLength1to8" use="optional" name="VendorCode"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LoyalLevelGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="LoyalLevel"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SignupDateGroup">
 *   &lt;xs:attribute type="xs:date" use="optional" name="SignupDate"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ListOfStringLength1to8">
 *   &lt;xs:list itemType="xs:string"/>
 * &lt;/xs:simpleType>
 * </pre>
 */
public class CustomerLoyaltyGroup
{
    private PrivacyGroup privacyGroup;
    private String programID;
    private String membershipID;
    private String travelSector;
    private String loyalLevel;
    private SingleVendorIndGroup singleVendorIndGroup;
    private Date signupDate;
    private EffectiveExpireOptionalDateGroup effectiveExpireOptionalDateGroup;
    private String RPH;
    private java.util.List<String> vendorCodes = new java.util.ArrayList<String>();

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
     * Get the 'ProgramID' attribute value. Identifier to indicate the company owner of the loyalty program.
     * 
     * @return value
     */
    public String getProgramID() {
        return programID;
    }

    /** 
     * Set the 'ProgramID' attribute value. Identifier to indicate the company owner of the loyalty program.
     * 
     * @param programID
     */
    public void setProgramID(String programID) {
        this.programID = programID;
    }

    /** 
     * Get the 'MembershipID' attribute value. Unique identifier of the member in the program (membership number, account number, etc.).
     * 
     * @return value
     */
    public String getMembershipID() {
        return membershipID;
    }

    /** 
     * Set the 'MembershipID' attribute value. Unique identifier of the member in the program (membership number, account number, etc.).
     * 
     * @param membershipID
     */
    public void setMembershipID(String membershipID) {
        this.membershipID = membershipID;
    }

    /** 
     * Get the 'TravelSector' attribute value. Identifies the travel sector. Refer to OTA Code List Travel Sector (TVS).
     * 
     * @return value
     */
    public String getTravelSector() {
        return travelSector;
    }

    /** 
     * Set the 'TravelSector' attribute value. Identifies the travel sector. Refer to OTA Code List Travel Sector (TVS).
     * 
     * @param travelSector
     */
    public void setTravelSector(String travelSector) {
        this.travelSector = travelSector;
    }

    /** 
     * Get the 'LoyalLevel' attribute value. Indicates special privileges in program assigned to individual.
     * 
     * @return value
     */
    public String getLoyalLevel() {
        return loyalLevel;
    }

    /** 
     * Set the 'LoyalLevel' attribute value. Indicates special privileges in program assigned to individual.
     * 
     * @param loyalLevel
     */
    public void setLoyalLevel(String loyalLevel) {
        this.loyalLevel = loyalLevel;
    }

    /** 
     * Get the 'SingleVendorIndGroup' attributeGroup value.
     * 
     * @return value
     */
    public SingleVendorIndGroup getSingleVendorIndGroup() {
        return singleVendorIndGroup;
    }

    /** 
     * Set the 'SingleVendorIndGroup' attributeGroup value.
     * 
     * @param singleVendorIndGroup
     */
    public void setSingleVendorIndGroup(
            SingleVendorIndGroup singleVendorIndGroup) {
        this.singleVendorIndGroup = singleVendorIndGroup;
    }

    /** 
     * Get the 'SignupDate' attribute value. Indicates when the member signed up for the loyalty program.
     * 
     * @return value
     */
    public Date getSignupDate() {
        return signupDate;
    }

    /** 
     * Set the 'SignupDate' attribute value. Indicates when the member signed up for the loyalty program.
     * 
     * @param signupDate
     */
    public void setSignupDate(Date signupDate) {
        this.signupDate = signupDate;
    }

    /** 
     * Get the 'EffectiveExpireOptionalDateGroup' attributeGroup value.
     * 
     * @return value
     */
    public EffectiveExpireOptionalDateGroup getEffectiveExpireOptionalDateGroup() {
        return effectiveExpireOptionalDateGroup;
    }

    /** 
     * Set the 'EffectiveExpireOptionalDateGroup' attributeGroup value.
     * 
     * @param effectiveExpireOptionalDateGroup
     */
    public void setEffectiveExpireOptionalDateGroup(
            EffectiveExpireOptionalDateGroup effectiveExpireOptionalDateGroup) {
        this.effectiveExpireOptionalDateGroup = effectiveExpireOptionalDateGroup;
    }

    /** 
     * Get the 'RPH' attribute value. A reference placeholder for this loyalty membership.
     * 
     * @return value
     */
    public String getRPH() {
        return RPH;
    }

    /** 
     * Set the 'RPH' attribute value. A reference placeholder for this loyalty membership.
     * 
     * @param RPH
     */
    public void setRPH(String RPH) {
        this.RPH = RPH;
    }

    /** 
     * Get the list of 'VendorCode' attribute items. Indicate the partner(s)/vendor(s) for which the customer loyalty number is valid.  
     * 
     * @return list
     */
    public java.util.List<String> getVendorCodes() {
        return vendorCodes;
    }

    /** 
     * Set the list of 'VendorCode' attribute items. Indicate the partner(s)/vendor(s) for which the customer loyalty number is valid.  
     * 
     * @param list
     */
    public void setVendorCodes(java.util.List<String> list) {
        vendorCodes = list;
    }

    /** 
     * Serializer for 'VendorCode' attribute list.
     * 
     * @param values
     * @return text
     */
    public static String serializeVendorCodes(java.util.List<String> values) {
        if (values == null) {
            return null;
        } else {
            java.lang.StringBuffer buff = new java.lang.StringBuffer();
            for (java.util.Iterator<String> iter = values.iterator(); iter
                    .hasNext();) {
                if (buff.length() > 0) {
                    buff.append(' ');
                }
                String value = iter.next();
                buff.append(value);
            }
            return buff.toString();
        }
    }

    /** 
     * Deserializer for 'VendorCode' attribute list.
     * 
     * @param text
     * @return values
     * @throws org.jibx.runtime.JiBXException on conversion error
     */
    public static java.util.List<String> deserializeVendorCodes(String text)
            throws org.jibx.runtime.JiBXException {
        org.jibx.runtime.IListItemDeserializer ldser = new org.jibx.runtime.IListItemDeserializer() {
            public java.lang.Object deserialize(String text) {
                return text;
            }
        };
        return (java.util.List<String>) org.jibx.runtime.Utility
                .deserializeList(text, ldser);
    }
}
