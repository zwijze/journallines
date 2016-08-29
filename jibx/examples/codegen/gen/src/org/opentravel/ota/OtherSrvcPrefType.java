
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Other travel service preferences.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OtherSrvcPrefType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="OtherSrvcName"/>
 *     &lt;xs:element type="ns:CompanyNamePrefType" name="VendorPref" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="ns:LoyaltyPrefType" name="LoyaltyPref" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="ns:PaymentFormPrefType" name="PaymentFormPref" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="ns:SpecRequestPrefType" name="SpecRequestPref" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element ref="ns:TPA_Extensions" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:PreferLevelGroup"/>
 *   &lt;xs:attributeGroup ref="ns:PrivacyGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="TravelPurpose"/>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PreferLevelGroup">
 *   &lt;xs:attribute type="ns:PreferLevelType" use="optional" default="Preferred" name="PreferLevel"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class OtherSrvcPrefType
{
    private String otherSrvcName;
    private List<CompanyNamePrefType> vendorPrefList = new ArrayList<CompanyNamePrefType>();
    private List<LoyaltyPrefType> loyaltyPrefList = new ArrayList<LoyaltyPrefType>();
    private List<PaymentFormPrefType> paymentFormPrefList = new ArrayList<PaymentFormPrefType>();
    private List<SpecRequestPrefType> specRequestPrefList = new ArrayList<SpecRequestPrefType>();
    private TPAExtensionsType TPAExtensions;
    private PreferLevelType preferLevel;
    private PrivacyGroup privacyGroup;
    private String travelPurpose;

    /** 
     * Get the 'OtherSrvcName' element value. Name of other travel services identified in this collection of preferences.
     * 
     * @return value
     */
    public String getOtherSrvcName() {
        return otherSrvcName;
    }

    /** 
     * Set the 'OtherSrvcName' element value. Name of other travel services identified in this collection of preferences.
     * 
     * @param otherSrvcName
     */
    public void setOtherSrvcName(String otherSrvcName) {
        this.otherSrvcName = otherSrvcName;
    }

    /** 
     * Get the list of 'VendorPref' element items.
     * 
     * @return list
     */
    public List<CompanyNamePrefType> getVendorPrefList() {
        return vendorPrefList;
    }

    /** 
     * Set the list of 'VendorPref' element items.
     * 
     * @param list
     */
    public void setVendorPrefList(List<CompanyNamePrefType> list) {
        vendorPrefList = list;
    }

    /** 
     * Get the list of 'LoyaltyPref' element items.
     * 
     * @return list
     */
    public List<LoyaltyPrefType> getLoyaltyPrefList() {
        return loyaltyPrefList;
    }

    /** 
     * Set the list of 'LoyaltyPref' element items.
     * 
     * @param list
     */
    public void setLoyaltyPrefList(List<LoyaltyPrefType> list) {
        loyaltyPrefList = list;
    }

    /** 
     * Get the list of 'PaymentFormPref' element items.
     * 
     * @return list
     */
    public List<PaymentFormPrefType> getPaymentFormPrefList() {
        return paymentFormPrefList;
    }

    /** 
     * Set the list of 'PaymentFormPref' element items.
     * 
     * @param list
     */
    public void setPaymentFormPrefList(List<PaymentFormPrefType> list) {
        paymentFormPrefList = list;
    }

    /** 
     * Get the list of 'SpecRequestPref' element items.
     * 
     * @return list
     */
    public List<SpecRequestPrefType> getSpecRequestPrefList() {
        return specRequestPrefList;
    }

    /** 
     * Set the list of 'SpecRequestPref' element items.
     * 
     * @param list
     */
    public void setSpecRequestPrefList(List<SpecRequestPrefType> list) {
        specRequestPrefList = list;
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
     * Get the 'PreferLevel' attribute value. Used to indicate a level of preference for an associated item.
     * 
     * @return value
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /** 
     * Set the 'PreferLevel' attribute value. Used to indicate a level of preference for an associated item.
     * 
     * @param preferLevel
     */
    public void setPreferLevel(PreferLevelType preferLevel) {
        this.preferLevel = preferLevel;
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
     * Get the 'TravelPurpose' attribute value. Refer to OTA Code List Travel Purpose (TVP).
    	
     * 
     * @return value
     */
    public String getTravelPurpose() {
        return travelPurpose;
    }

    /** 
     * Set the 'TravelPurpose' attribute value. Refer to OTA Code List Travel Purpose (TVP).
    	
     * 
     * @param travelPurpose
     */
    public void setTravelPurpose(String travelPurpose) {
        this.travelPurpose = travelPurpose;
    }
}
