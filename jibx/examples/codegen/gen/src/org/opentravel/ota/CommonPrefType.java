
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Travel needs associated with a collection but independent of specific travel services.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CommonPrefType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:NamePrefType" name="NamePref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:PhonePrefType" name="PhonePref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:AddressPrefType" name="AddressPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:PaymentFormPrefType" name="PaymentFormPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:InterestPrefType" name="InterestPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:InsurancePrefType" name="InsurancePref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:SeatingPrefType" name="SeatingPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:TicketDistribPrefType" name="TicketDistribPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:MediaEntertainPrefType" name="MediaEntertainPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:PetInfoPrefType" name="PetInfoPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:MealPrefType" name="MealPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:LoyaltyPrefType" name="LoyaltyPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:SpecRequestPrefType" name="SpecRequestPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:RelatedTravelerPrefType" name="RelatedTravelerPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element ref="ns:TPA_Extensions" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:PrivacyGroup"/>
 *   &lt;xs:attributeGroup ref="ns:SmokingIndicatorGroup"/>
 *   &lt;xs:attributeGroup ref="ns:PrimaryLangID_Group"/>
 *   &lt;xs:attributeGroup ref="ns:AltLangID_Group"/>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SmokingIndicatorGroup">
 *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="SmokingAllowed"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PrimaryLangID_Group">
 *   &lt;xs:attribute type="xs:string" use="optional" name="PrimaryLangID"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AltLangID_Group">
 *   &lt;xs:attribute type="xs:string" use="optional" name="AltLangID"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class CommonPrefType
{
    private List<NamePrefType> namePrefList = new ArrayList<NamePrefType>();
    private List<PhonePrefType> phonePrefList = new ArrayList<PhonePrefType>();
    private List<AddressPrefType> addressPrefList = new ArrayList<AddressPrefType>();
    private List<PaymentFormPrefType> paymentFormPrefList = new ArrayList<PaymentFormPrefType>();
    private List<InterestPrefType> interestPrefList = new ArrayList<InterestPrefType>();
    private List<InsurancePrefType> insurancePrefList = new ArrayList<InsurancePrefType>();
    private List<SeatingPrefType> seatingPrefList = new ArrayList<SeatingPrefType>();
    private List<TicketDistribPrefType> ticketDistribPrefList = new ArrayList<TicketDistribPrefType>();
    private List<MediaEntertainPrefType> mediaEntertainPrefList = new ArrayList<MediaEntertainPrefType>();
    private List<PetInfoPrefType> petInfoPrefList = new ArrayList<PetInfoPrefType>();
    private List<MealPrefType> mealPrefList = new ArrayList<MealPrefType>();
    private List<LoyaltyPrefType> loyaltyPrefList = new ArrayList<LoyaltyPrefType>();
    private List<SpecRequestPrefType> specRequestPrefList = new ArrayList<SpecRequestPrefType>();
    private List<RelatedTravelerPrefType> relatedTravelerPrefList = new ArrayList<RelatedTravelerPrefType>();
    private TPAExtensionsType TPAExtensions;
    private PrivacyGroup privacyGroup;
    private Boolean smokingAllowed;
    private String primaryLangID;
    private String altLangID;

    /** 
     * Get the list of 'NamePref' element items.
     * 
     * @return list
     */
    public List<NamePrefType> getNamePrefList() {
        return namePrefList;
    }

    /** 
     * Set the list of 'NamePref' element items.
     * 
     * @param list
     */
    public void setNamePrefList(List<NamePrefType> list) {
        namePrefList = list;
    }

    /** 
     * Get the list of 'PhonePref' element items.
     * 
     * @return list
     */
    public List<PhonePrefType> getPhonePrefList() {
        return phonePrefList;
    }

    /** 
     * Set the list of 'PhonePref' element items.
     * 
     * @param list
     */
    public void setPhonePrefList(List<PhonePrefType> list) {
        phonePrefList = list;
    }

    /** 
     * Get the list of 'AddressPref' element items.
     * 
     * @return list
     */
    public List<AddressPrefType> getAddressPrefList() {
        return addressPrefList;
    }

    /** 
     * Set the list of 'AddressPref' element items.
     * 
     * @param list
     */
    public void setAddressPrefList(List<AddressPrefType> list) {
        addressPrefList = list;
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
     * Get the list of 'InterestPref' element items.
     * 
     * @return list
     */
    public List<InterestPrefType> getInterestPrefList() {
        return interestPrefList;
    }

    /** 
     * Set the list of 'InterestPref' element items.
     * 
     * @param list
     */
    public void setInterestPrefList(List<InterestPrefType> list) {
        interestPrefList = list;
    }

    /** 
     * Get the list of 'InsurancePref' element items.
     * 
     * @return list
     */
    public List<InsurancePrefType> getInsurancePrefList() {
        return insurancePrefList;
    }

    /** 
     * Set the list of 'InsurancePref' element items.
     * 
     * @param list
     */
    public void setInsurancePrefList(List<InsurancePrefType> list) {
        insurancePrefList = list;
    }

    /** 
     * Get the list of 'SeatingPref' element items.
     * 
     * @return list
     */
    public List<SeatingPrefType> getSeatingPrefList() {
        return seatingPrefList;
    }

    /** 
     * Set the list of 'SeatingPref' element items.
     * 
     * @param list
     */
    public void setSeatingPrefList(List<SeatingPrefType> list) {
        seatingPrefList = list;
    }

    /** 
     * Get the list of 'TicketDistribPref' element items.
     * 
     * @return list
     */
    public List<TicketDistribPrefType> getTicketDistribPrefList() {
        return ticketDistribPrefList;
    }

    /** 
     * Set the list of 'TicketDistribPref' element items.
     * 
     * @param list
     */
    public void setTicketDistribPrefList(List<TicketDistribPrefType> list) {
        ticketDistribPrefList = list;
    }

    /** 
     * Get the list of 'MediaEntertainPref' element items.
     * 
     * @return list
     */
    public List<MediaEntertainPrefType> getMediaEntertainPrefList() {
        return mediaEntertainPrefList;
    }

    /** 
     * Set the list of 'MediaEntertainPref' element items.
     * 
     * @param list
     */
    public void setMediaEntertainPrefList(List<MediaEntertainPrefType> list) {
        mediaEntertainPrefList = list;
    }

    /** 
     * Get the list of 'PetInfoPref' element items.
     * 
     * @return list
     */
    public List<PetInfoPrefType> getPetInfoPrefList() {
        return petInfoPrefList;
    }

    /** 
     * Set the list of 'PetInfoPref' element items.
     * 
     * @param list
     */
    public void setPetInfoPrefList(List<PetInfoPrefType> list) {
        petInfoPrefList = list;
    }

    /** 
     * Get the list of 'MealPref' element items.
     * 
     * @return list
     */
    public List<MealPrefType> getMealPrefList() {
        return mealPrefList;
    }

    /** 
     * Set the list of 'MealPref' element items.
     * 
     * @param list
     */
    public void setMealPrefList(List<MealPrefType> list) {
        mealPrefList = list;
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
     * Get the list of 'RelatedTravelerPref' element items.
     * 
     * @return list
     */
    public List<RelatedTravelerPrefType> getRelatedTravelerPrefList() {
        return relatedTravelerPrefList;
    }

    /** 
     * Set the list of 'RelatedTravelerPref' element items.
     * 
     * @param list
     */
    public void setRelatedTravelerPrefList(List<RelatedTravelerPrefType> list) {
        relatedTravelerPrefList = list;
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
     * Get the 'SmokingAllowed' attribute value. Indicates smoking is allowed when true and is not allowed when false.
     * 
     * @return value
     */
    public Boolean getSmokingAllowed() {
        return smokingAllowed;
    }

    /** 
     * Set the 'SmokingAllowed' attribute value. Indicates smoking is allowed when true and is not allowed when false.
     * 
     * @param smokingAllowed
     */
    public void setSmokingAllowed(Boolean smokingAllowed) {
        this.smokingAllowed = smokingAllowed;
    }

    /** 
     * Get the 'PrimaryLangID' attribute value. Identifes the primary language preference for the message.  The human language is identified by ISO 639 codes.
     * 
     * @return value
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /** 
     * Set the 'PrimaryLangID' attribute value. Identifes the primary language preference for the message.  The human language is identified by ISO 639 codes.
     * 
     * @param primaryLangID
     */
    public void setPrimaryLangID(String primaryLangID) {
        this.primaryLangID = primaryLangID;
    }

    /** 
     * Get the 'AltLangID' attribute value. Identifies the alternate language for a customer or message. The human language is identified by ISO 639 codes.
     * 
     * @return value
     */
    public String getAltLangID() {
        return altLangID;
    }

    /** 
     * Set the 'AltLangID' attribute value. Identifies the alternate language for a customer or message. The human language is identified by ISO 639 codes.
     * 
     * @param altLangID
     */
    public void setAltLangID(String altLangID) {
        this.altLangID = altLangID;
    }
}
