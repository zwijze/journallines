
package org.opentravel.ota;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 
 * Defines user preferences to be used in conducting a search.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AirSearchPrefsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:CompanyNamePrefType" name="VendorPref" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element name="FlightTypePref" minOccurs="0" maxOccurs="3">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:FlightTypePrefGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element name="FareRestrictPref" minOccurs="0" maxOccurs="4">
 *       &lt;!-- Reference to inner class FareRestrictPref -->
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:EquipmentTypePref" name="EquipPref" minOccurs="0" maxOccurs="9"/>
 *     &lt;xs:element name="CabinPref" minOccurs="0" maxOccurs="3">
 *       &lt;!-- Reference to inner class CabinPref -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="TicketDistribPref" minOccurs="0" maxOccurs="3">
 *       &lt;!-- Reference to inner class TicketDistribPref -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:SmokingIndicatorGroup"/>
 *   &lt;xs:attribute type="xs:decimal" use="optional" name="OnTimeRate"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="ETicketDesired"/>
 *   &lt;xs:attribute type="xs:integer" use="optional" name="MaxStopsQuantity"/>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SmokingIndicatorGroup">
 *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="SmokingAllowed"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class AirSearchPrefsType
{
    private List<CompanyNamePrefType> vendorPrefList = new ArrayList<CompanyNamePrefType>();
    private List<FlightTypePrefGroup> flightTypePrefList = new ArrayList<FlightTypePrefGroup>();
    private List<FareRestrictPref> fareRestrictPrefList = new ArrayList<FareRestrictPref>();
    private List<EquipmentTypePref> equipPrefList = new ArrayList<EquipmentTypePref>();
    private List<CabinPref> cabinPrefList = new ArrayList<CabinPref>();
    private List<TicketDistribPref> ticketDistribPrefList = new ArrayList<TicketDistribPref>();
    private Boolean smokingAllowed;
    private BigDecimal onTimeRate;
    private Boolean ETicketDesired;
    private BigInteger maxStopsQuantity;

    /** 
     * Get the list of 'VendorPref' element items. Specify vendors to include and exclude from the response.
     * 
     * @return list
     */
    public List<CompanyNamePrefType> getVendorPrefList() {
        return vendorPrefList;
    }

    /** 
     * Set the list of 'VendorPref' element items. Specify vendors to include and exclude from the response.
     * 
     * @param list
     */
    public void setVendorPrefList(List<CompanyNamePrefType> list) {
        vendorPrefList = list;
    }

    /** 
     * Get the list of 'FlightTypePref' element items. Defines preferred flight characteristics to be used in a search.
     * 
     * @return list
     */
    public List<FlightTypePrefGroup> getFlightTypePrefList() {
        return flightTypePrefList;
    }

    /** 
     * Set the list of 'FlightTypePref' element items. Defines preferred flight characteristics to be used in a search.
     * 
     * @param list
     */
    public void setFlightTypePrefList(List<FlightTypePrefGroup> list) {
        flightTypePrefList = list;
    }

    /** 
     * Get the list of 'FareRestrictPref' element items.
     * 
     * @return list
     */
    public List<FareRestrictPref> getFareRestrictPrefList() {
        return fareRestrictPrefList;
    }

    /** 
     * Set the list of 'FareRestrictPref' element items.
     * 
     * @param list
     */
    public void setFareRestrictPrefList(List<FareRestrictPref> list) {
        fareRestrictPrefList = list;
    }

    /** 
     * Get the list of 'EquipPref' element items. Defines preferred equipment profile(s) to be used in a search.
     * 
     * @return list
     */
    public List<EquipmentTypePref> getEquipPrefList() {
        return equipPrefList;
    }

    /** 
     * Set the list of 'EquipPref' element items. Defines preferred equipment profile(s) to be used in a search.
     * 
     * @param list
     */
    public void setEquipPrefList(List<EquipmentTypePref> list) {
        equipPrefList = list;
    }

    /** 
     * Get the list of 'CabinPref' element items.
     * 
     * @return list
     */
    public List<CabinPref> getCabinPrefList() {
        return cabinPrefList;
    }

    /** 
     * Set the list of 'CabinPref' element items.
     * 
     * @param list
     */
    public void setCabinPrefList(List<CabinPref> list) {
        cabinPrefList = list;
    }

    /** 
     * Get the list of 'TicketDistribPref' element items.
     * 
     * @return list
     */
    public List<TicketDistribPref> getTicketDistribPrefList() {
        return ticketDistribPrefList;
    }

    /** 
     * Set the list of 'TicketDistribPref' element items.
     * 
     * @param list
     */
    public void setTicketDistribPrefList(List<TicketDistribPref> list) {
        ticketDistribPrefList = list;
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
     * Get the 'OnTimeRate' attribute value.  Request for flights in response that meet the given Department of Transport on-time rate. This is a number between 0 and 100.
     * 
     * @return value
     */
    public BigDecimal getOnTimeRate() {
        return onTimeRate;
    }

    /** 
     * Set the 'OnTimeRate' attribute value.  Request for flights in response that meet the given Department of Transport on-time rate. This is a number between 0 and 100.
     * 
     * @param onTimeRate
     */
    public void setOnTimeRate(BigDecimal onTimeRate) {
        this.onTimeRate = onTimeRate;
    }

    /** 
     * Get the 'ETicketDesired' attribute value.  Request flights that are e-ticketable in the response.
     * 
     * @return value
     */
    public Boolean getETicketDesired() {
        return ETicketDesired;
    }

    /** 
     * Set the 'ETicketDesired' attribute value.  Request flights that are e-ticketable in the response.
     * 
     * @param ETicketDesired
     */
    public void setETicketDesired(Boolean ETicketDesired) {
        this.ETicketDesired = ETicketDesired;
    }

    /** 
     * Get the 'MaxStopsQuantity' attribute value.  Request flights that have no more than the requested number of stops. 
     * 
     * @return value
     */
    public BigInteger getMaxStopsQuantity() {
        return maxStopsQuantity;
    }

    /** 
     * Set the 'MaxStopsQuantity' attribute value.  Request flights that have no more than the requested number of stops. 
     * 
     * @param maxStopsQuantity
     */
    public void setMaxStopsQuantity(BigInteger maxStopsQuantity) {
        this.maxStopsQuantity = maxStopsQuantity;
    }
    /** 
     * Constrains a fare search to those with restrictions that satisfy user-imposed limitations.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FareRestrictPref" minOccurs="0" maxOccurs="4">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="ns:AdvResTicketingType" name="AdvResTicketing" minOccurs="0"/>
     *       &lt;xs:element type="ns:StayRestrictionsType" name="StayRestrictions" minOccurs="0"/>
     *       &lt;xs:element type="ns:VoluntaryChangesType" name="VoluntaryChanges" minOccurs="0"/>
     *     &lt;/xs:sequence>
     *     &lt;xs:attributeGroup ref="ns:FareRestrictPrefGroup"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="FareDisplayCurrency"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="CurrencyOverride"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class FareRestrictPref
    {
        private AdvResTicketingType advResTicketing;
        private StayRestrictionsType stayRestrictions;
        private VoluntaryChangesType voluntaryChanges;
        private FareRestrictPrefGroup fareRestrictPrefGroup;
        private String fareDisplayCurrency;
        private String currencyOverride;

        /** 
         * Get the 'AdvResTicketing' element value. Identifies whether advance reservation or ticketing restrictions are acceptable in the search results
         * 
         * @return value
         */
        public AdvResTicketingType getAdvResTicketing() {
            return advResTicketing;
        }

        /** 
         * Set the 'AdvResTicketing' element value. Identifies whether advance reservation or ticketing restrictions are acceptable in the search results
         * 
         * @param advResTicketing
         */
        public void setAdvResTicketing(AdvResTicketingType advResTicketing) {
            this.advResTicketing = advResTicketing;
        }

        /** 
         * Get the 'StayRestrictions' element value. Identifies whether restrictions on minimum or maximum stays should be included in the search results
         * 
         * @return value
         */
        public StayRestrictionsType getStayRestrictions() {
            return stayRestrictions;
        }

        /** 
         * Set the 'StayRestrictions' element value. Identifies whether restrictions on minimum or maximum stays should be included in the search results
         * 
         * @param stayRestrictions
         */
        public void setStayRestrictions(StayRestrictionsType stayRestrictions) {
            this.stayRestrictions = stayRestrictions;
        }

        /** 
         * Get the 'VoluntaryChanges' element value. Identifies whether penalties associated with voluntary changes should be included in the search results
         * 
         * @return value
         */
        public VoluntaryChangesType getVoluntaryChanges() {
            return voluntaryChanges;
        }

        /** 
         * Set the 'VoluntaryChanges' element value. Identifies whether penalties associated with voluntary changes should be included in the search results
         * 
         * @param voluntaryChanges
         */
        public void setVoluntaryChanges(VoluntaryChangesType voluntaryChanges) {
            this.voluntaryChanges = voluntaryChanges;
        }

        /** 
         * Get the 'FareRestrictPrefGroup' attributeGroup value.
         * 
         * @return value
         */
        public FareRestrictPrefGroup getFareRestrictPrefGroup() {
            return fareRestrictPrefGroup;
        }

        /** 
         * Set the 'FareRestrictPrefGroup' attributeGroup value.
         * 
         * @param fareRestrictPrefGroup
         */
        public void setFareRestrictPrefGroup(
                FareRestrictPrefGroup fareRestrictPrefGroup) {
            this.fareRestrictPrefGroup = fareRestrictPrefGroup;
        }

        /** 
         * Get the 'FareDisplayCurrency' attribute value. Currency in which fare display is requested
         * 
         * @return value
         */
        public String getFareDisplayCurrency() {
            return fareDisplayCurrency;
        }

        /** 
         * Set the 'FareDisplayCurrency' attribute value. Currency in which fare display is requested
         * 
         * @param fareDisplayCurrency
         */
        public void setFareDisplayCurrency(String fareDisplayCurrency) {
            this.fareDisplayCurrency = fareDisplayCurrency;
        }

        /** 
         * Get the 'CurrencyOverride' attribute value. Display fare published in other than local selling currency only.
         * 
         * @return value
         */
        public String getCurrencyOverride() {
            return currencyOverride;
        }

        /** 
         * Set the 'CurrencyOverride' attribute value. Display fare published in other than local selling currency only.
         * 
         * @param currencyOverride
         */
        public void setCurrencyOverride(String currencyOverride) {
            this.currencyOverride = currencyOverride;
        }
    }
    /** 
     * Defines preferred  cabin(s) to be used in a search.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CabinPref" minOccurs="0" maxOccurs="3">
     *   &lt;xs:complexType>
     *     &lt;xs:attributeGroup ref="ns:CabinPrefGroup"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="CabinSubtype"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class CabinPref
    {
        private CabinPrefGroup cabinPrefGroup;
        private String cabinSubtype;

        /** 
         * Get the 'CabinPrefGroup' attributeGroup value.
         * 
         * @return value
         */
        public CabinPrefGroup getCabinPrefGroup() {
            return cabinPrefGroup;
        }

        /** 
         * Set the 'CabinPrefGroup' attributeGroup value.
         * 
         * @param cabinPrefGroup
         */
        public void setCabinPrefGroup(CabinPrefGroup cabinPrefGroup) {
            this.cabinPrefGroup = cabinPrefGroup;
        }

        /** 
         * Get the 'CabinSubtype' attribute value. Defines a specific cabin sub type within the cabin type (i.e., first, business, economy.)  For example, 'Premium'.
         * 
         * @return value
         */
        public String getCabinSubtype() {
            return cabinSubtype;
        }

        /** 
         * Set the 'CabinSubtype' attribute value. Defines a specific cabin sub type within the cabin type (i.e., first, business, economy.)  For example, 'Premium'.
         * 
         * @param cabinSubtype
         */
        public void setCabinSubtype(String cabinSubtype) {
            this.cabinSubtype = cabinSubtype;
        }
    }
    /** 
     * Defines Distribution prefernces.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketDistribPref" minOccurs="0" maxOccurs="3">
     *   &lt;xs:complexType>
     *     &lt;xs:simpleContent>
     *       &lt;xs:extension base="ns:TicketDistribPrefType">
     *         &lt;xs:attribute type="xs:dateTime" use="optional" name="LastTicketDate"/>
     *         &lt;xs:attribute type="xs:dateTime" use="optional" name="FirstTicketDate"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:simpleContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class TicketDistribPref
    {
        private TicketDistribPrefType ticketDistribPrefType;
        private Date lastTicketDate;
        private Date firstTicketDate;

        /** 
         * Get the extension value.
         * 
         * @return value
         */
        public TicketDistribPrefType getTicketDistribPrefType() {
            return ticketDistribPrefType;
        }

        /** 
         * Set the extension value.
         * 
         * @param ticketDistribPrefType
         */
        public void setTicketDistribPrefType(
                TicketDistribPrefType ticketDistribPrefType) {
            this.ticketDistribPrefType = ticketDistribPrefType;
        }

        /** 
         * Get the 'LastTicketDate' attribute value.
         * 
         * @return value
         */
        public Date getLastTicketDate() {
            return lastTicketDate;
        }

        /** 
         * Set the 'LastTicketDate' attribute value.
         * 
         * @param lastTicketDate
         */
        public void setLastTicketDate(Date lastTicketDate) {
            this.lastTicketDate = lastTicketDate;
        }

        /** 
         * Get the 'FirstTicketDate' attribute value.
         * 
         * @return value
         */
        public Date getFirstTicketDate() {
            return firstTicketDate;
        }

        /** 
         * Set the 'FirstTicketDate' attribute value.
         * 
         * @param firstTicketDate
         */
        public void setFirstTicketDate(Date firstTicketDate) {
            this.firstTicketDate = firstTicketDate;
        }
    }
}
