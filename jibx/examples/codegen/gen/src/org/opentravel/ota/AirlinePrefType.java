
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Identifies a collection of preferences for airline travel.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AirlinePrefType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:LoyaltyPrefType" name="LoyaltyPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:CompanyNamePrefType" name="VendorPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:PaymentFormPrefType" name="PaymentFormPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:AirportPrefType" name="AirportOriginPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:AirportPrefType" name="AirportRoutePref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element name="FareRestrictPref" minOccurs="0" maxOccurs="unbounded">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:FareRestrictPrefGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element name="FlightTypePref" minOccurs="0" maxOccurs="unbounded">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:FlightTypePrefGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:EquipmentTypePref" name="EquipPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element name="CabinPref" minOccurs="0" maxOccurs="unbounded">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:CabinPrefGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element name="SeatPref" minOccurs="0" maxOccurs="unbounded">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:SeatPrefGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:TicketDistribPrefType" name="TicketDistribPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:MealPrefType" name="MealPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:SpecRequestPrefType" name="SpecRequestPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element name="SSR_Pref" minOccurs="0" maxOccurs="unbounded">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:SSR_PrefGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element ref="ns:TPA_Extensions" minOccurs="0"/>
 *     &lt;xs:element type="ns:MediaEntertainPrefType" name="MediaEntertainPref" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:PetInfoPrefType" name="PetInfoPref" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:PrivacyGroup"/>
 *   &lt;xs:attributeGroup ref="ns:PreferLevelGroup"/>
 *   &lt;xs:attributeGroup ref="ns:SmokingIndicatorGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="PassengerTypeCode"/>
 *   &lt;xs:attribute type="ns:TicketType" use="optional" name="AirTicketType"/>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PreferLevelGroup">
 *   &lt;xs:attribute type="ns:PreferLevelType" use="optional" default="Preferred" name="PreferLevel"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SmokingIndicatorGroup">
 *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="SmokingAllowed"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class AirlinePrefType
{
    private List<LoyaltyPrefType> loyaltyPrefList = new ArrayList<LoyaltyPrefType>();
    private List<CompanyNamePrefType> vendorPrefList = new ArrayList<CompanyNamePrefType>();
    private List<PaymentFormPrefType> paymentFormPrefList = new ArrayList<PaymentFormPrefType>();
    private List<AirportPrefType> airportOriginPrefList = new ArrayList<AirportPrefType>();
    private List<AirportPrefType> airportRoutePrefList = new ArrayList<AirportPrefType>();
    private List<FareRestrictPrefGroup> fareRestrictPrefList = new ArrayList<FareRestrictPrefGroup>();
    private List<FlightTypePrefGroup> flightTypePrefList = new ArrayList<FlightTypePrefGroup>();
    private List<EquipmentTypePref> equipPrefList = new ArrayList<EquipmentTypePref>();
    private List<CabinPrefGroup> cabinPrefList = new ArrayList<CabinPrefGroup>();
    private List<SeatPrefGroup> seatPrefList = new ArrayList<SeatPrefGroup>();
    private List<TicketDistribPrefType> ticketDistribPrefList = new ArrayList<TicketDistribPrefType>();
    private List<MealPrefType> mealPrefList = new ArrayList<MealPrefType>();
    private List<SpecRequestPrefType> specRequestPrefList = new ArrayList<SpecRequestPrefType>();
    private List<SSRPrefGroup> SSRPrefList = new ArrayList<SSRPrefGroup>();
    private TPAExtensionsType TPAExtensions;
    private List<MediaEntertainPrefType> mediaEntertainPrefList = new ArrayList<MediaEntertainPrefType>();
    private List<PetInfoPrefType> petInfoPrefList = new ArrayList<PetInfoPrefType>();
    private PrivacyGroup privacyGroup;
    private PreferLevelType preferLevel;
    private Boolean smokingAllowed;
    private String passengerTypeCode;
    private TicketType airTicketType;

    /** 
     * Get the list of 'LoyaltyPref' element items.  Identifies the preferred loyalty program(s).
     * 
     * @return list
     */
    public List<LoyaltyPrefType> getLoyaltyPrefList() {
        return loyaltyPrefList;
    }

    /** 
     * Set the list of 'LoyaltyPref' element items.  Identifies the preferred loyalty program(s).
     * 
     * @param list
     */
    public void setLoyaltyPrefList(List<LoyaltyPrefType> list) {
        loyaltyPrefList = list;
    }

    /** 
     * Get the list of 'VendorPref' element items.  Identifies the preferred airline carrier(s) by name.
     * 
     * @return list
     */
    public List<CompanyNamePrefType> getVendorPrefList() {
        return vendorPrefList;
    }

    /** 
     * Set the list of 'VendorPref' element items.  Identifies the preferred airline carrier(s) by name.
     * 
     * @param list
     */
    public void setVendorPrefList(List<CompanyNamePrefType> list) {
        vendorPrefList = list;
    }

    /** 
     * Get the list of 'PaymentFormPref' element items.  Preferred form(s) of payment.
     * 
     * @return list
     */
    public List<PaymentFormPrefType> getPaymentFormPrefList() {
        return paymentFormPrefList;
    }

    /** 
     * Set the list of 'PaymentFormPref' element items.  Preferred form(s) of payment.
     * 
     * @param list
     */
    public void setPaymentFormPrefList(List<PaymentFormPrefType> list) {
        paymentFormPrefList = list;
    }

    /** 
     * Get the list of 'AirportOriginPref' element items.  Identifies the preferred origination airport for travel (using IATA airport codes).
     * 
     * @return list
     */
    public List<AirportPrefType> getAirportOriginPrefList() {
        return airportOriginPrefList;
    }

    /** 
     * Set the list of 'AirportOriginPref' element items.  Identifies the preferred origination airport for travel (using IATA airport codes).
     * 
     * @param list
     */
    public void setAirportOriginPrefList(List<AirportPrefType> list) {
        airportOriginPrefList = list;
    }

    /** 
     * Get the list of 'AirportRoutePref' element items.  Indicates the preferred connection airport(s) (using IATA airport codes)..
     * 
     * @return list
     */
    public List<AirportPrefType> getAirportRoutePrefList() {
        return airportRoutePrefList;
    }

    /** 
     * Set the list of 'AirportRoutePref' element items.  Indicates the preferred connection airport(s) (using IATA airport codes)..
     * 
     * @param list
     */
    public void setAirportRoutePrefList(List<AirportPrefType> list) {
        airportRoutePrefList = list;
    }

    /** 
     * Get the list of 'FareRestrictPref' element items.  Indicates preferred fare restrictions to be used in search.
     * 
     * @return list
     */
    public List<FareRestrictPrefGroup> getFareRestrictPrefList() {
        return fareRestrictPrefList;
    }

    /** 
     * Set the list of 'FareRestrictPref' element items.  Indicates preferred fare restrictions to be used in search.
     * 
     * @param list
     */
    public void setFareRestrictPrefList(List<FareRestrictPrefGroup> list) {
        fareRestrictPrefList = list;
    }

    /** 
     * Get the list of 'FlightTypePref' element items.  Indicates preferred flight characteristics to be used in a search (e.g., connections, stopovers).
     * 
     * @return list
     */
    public List<FlightTypePrefGroup> getFlightTypePrefList() {
        return flightTypePrefList;
    }

    /** 
     * Set the list of 'FlightTypePref' element items.  Indicates preferred flight characteristics to be used in a search (e.g., connections, stopovers).
     * 
     * @param list
     */
    public void setFlightTypePrefList(List<FlightTypePrefGroup> list) {
        flightTypePrefList = list;
    }

    /** 
     * Get the list of 'EquipPref' element items.  Indicates preferred equipment type(s) to be used in a search.
     * 
     * @return list
     */
    public List<EquipmentTypePref> getEquipPrefList() {
        return equipPrefList;
    }

    /** 
     * Set the list of 'EquipPref' element items.  Indicates preferred equipment type(s) to be used in a search.
     * 
     * @param list
     */
    public void setEquipPrefList(List<EquipmentTypePref> list) {
        equipPrefList = list;
    }

    /** 
     * Get the list of 'CabinPref' element items.  Indicates preferred cabin(s) to be used in a search.
     * 
     * @return list
     */
    public List<CabinPrefGroup> getCabinPrefList() {
        return cabinPrefList;
    }

    /** 
     * Set the list of 'CabinPref' element items.  Indicates preferred cabin(s) to be used in a search.
     * 
     * @param list
     */
    public void setCabinPrefList(List<CabinPrefGroup> list) {
        cabinPrefList = list;
    }

    /** 
     * Get the list of 'SeatPref' element items.  Indicates preferred seat characteristics.  Refer to OTA Code List Seat Preference (STP) for codes.
     * 
     * @return list
     */
    public List<SeatPrefGroup> getSeatPrefList() {
        return seatPrefList;
    }

    /** 
     * Set the list of 'SeatPref' element items.  Indicates preferred seat characteristics.  Refer to OTA Code List Seat Preference (STP) for codes.
     * 
     * @param list
     */
    public void setSeatPrefList(List<SeatPrefGroup> list) {
        seatPrefList = list;
    }

    /** 
     * Get the list of 'TicketDistribPref' element items.  Indicates preferred ticket distribution method (e.g., fax, eMail, courier, mail, airport pickup)
     * 
     * @return list
     */
    public List<TicketDistribPrefType> getTicketDistribPrefList() {
        return ticketDistribPrefList;
    }

    /** 
     * Set the list of 'TicketDistribPref' element items.  Indicates preferred ticket distribution method (e.g., fax, eMail, courier, mail, airport pickup)
     * 
     * @param list
     */
    public void setTicketDistribPrefList(List<TicketDistribPrefType> list) {
        ticketDistribPrefList = list;
    }

    /** 
     * Get the list of 'MealPref' element items.  Indicates preferred meal type (e.g., vegetarian, Kosher, low fat)
     * 
     * @return list
     */
    public List<MealPrefType> getMealPrefList() {
        return mealPrefList;
    }

    /** 
     * Set the list of 'MealPref' element items.  Indicates preferred meal type (e.g., vegetarian, Kosher, low fat)
     * 
     * @param list
     */
    public void setMealPrefList(List<MealPrefType> list) {
        mealPrefList = list;
    }

    /** 
     * Get the list of 'SpecRequestPref' element items.  Indicates preferred special request(s) to be used with this collection of preferences.
     * 
     * @return list
     */
    public List<SpecRequestPrefType> getSpecRequestPrefList() {
        return specRequestPrefList;
    }

    /** 
     * Set the list of 'SpecRequestPref' element items.  Indicates preferred special request(s) to be used with this collection of preferences.
     * 
     * @param list
     */
    public void setSpecRequestPrefList(List<SpecRequestPrefType> list) {
        specRequestPrefList = list;
    }

    /** 
     * Get the list of 'SSR_Pref' element items.  Indicates Special Service Request preference type.
     * 
     * @return list
     */
    public List<SSRPrefGroup> getSSRPrefList() {
        return SSRPrefList;
    }

    /** 
     * Set the list of 'SSR_Pref' element items.  Indicates Special Service Request preference type.
     * 
     * @param list
     */
    public void setSSRPrefList(List<SSRPrefGroup> list) {
        SSRPrefList = list;
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
     * Get the list of 'MediaEntertainPref' element items.  Media and entertainment preferences.
     * 
     * @return list
     */
    public List<MediaEntertainPrefType> getMediaEntertainPrefList() {
        return mediaEntertainPrefList;
    }

    /** 
     * Set the list of 'MediaEntertainPref' element items.  Media and entertainment preferences.
     * 
     * @param list
     */
    public void setMediaEntertainPrefList(List<MediaEntertainPrefType> list) {
        mediaEntertainPrefList = list;
    }

    /** 
     * Get the list of 'PetInfoPref' element items.  Indicates preferred information for pet accompanying traveler.
     * 
     * @return list
     */
    public List<PetInfoPrefType> getPetInfoPrefList() {
        return petInfoPrefList;
    }

    /** 
     * Set the list of 'PetInfoPref' element items.  Indicates preferred information for pet accompanying traveler.
     * 
     * @param list
     */
    public void setPetInfoPrefList(List<PetInfoPrefType> list) {
        petInfoPrefList = list;
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
     * Get the 'PassengerTypeCode' attribute value. Category of airline passenger, using standard ATPCO codes.
     * 
     * @return value
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /** 
     * Set the 'PassengerTypeCode' attribute value. Category of airline passenger, using standard ATPCO codes.
     * 
     * @param passengerTypeCode
     */
    public void setPassengerTypeCode(String passengerTypeCode) {
        this.passengerTypeCode = passengerTypeCode;
    }

    /** 
     * Get the 'AirTicketType' attribute value. Type of airline ticket preferred for this collection.
     * 
     * @return value
     */
    public TicketType getAirTicketType() {
        return airTicketType;
    }

    /** 
     * Set the 'AirTicketType' attribute value. Type of airline ticket preferred for this collection.
     * 
     * @param airTicketType
     */
    public void setAirTicketType(TicketType airTicketType) {
        this.airTicketType = airTicketType;
    }
}
