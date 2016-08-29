
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Provides address information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AddressType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="StreetNmbr" minOccurs="0">
 *       &lt;!-- Reference to inner class StreetNmbr -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="BldgRoom" minOccurs="0" maxOccurs="2">
 *       &lt;!-- Reference to inner class BldgRoom -->
 *     &lt;/xs:element>
 *     &lt;xs:element type="xs:string" name="AddressLine" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="xs:string" name="CityName" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="PostalCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="County" minOccurs="0"/>
 *     &lt;xs:element type="ns:StateProvType" name="StateProv" minOccurs="0"/>
 *     &lt;xs:element type="ns:CountryNameType" name="CountryName" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:FormattedInd"/>
 *   &lt;xs:attributeGroup ref="ns:PrivacyGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Type"/>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FormattedInd">
 *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="FormattedInd"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class AddressType
{
    private StreetNmbr streetNmbr;
    private List<BldgRoom> bldgRoomList = new ArrayList<BldgRoom>();
    private List<String> addressLineList = new ArrayList<String>();
    private String cityName;
    private String postalCode;
    private String county;
    private StateProvType stateProv;
    private CountryNameType countryName;
    private Boolean formattedInd;
    private PrivacyGroup privacyGroup;
    private String type;

    /** 
     * Get the 'StreetNmbr' element value.
     * 
     * @return value
     */
    public StreetNmbr getStreetNmbr() {
        return streetNmbr;
    }

    /** 
     * Set the 'StreetNmbr' element value.
     * 
     * @param streetNmbr
     */
    public void setStreetNmbr(StreetNmbr streetNmbr) {
        this.streetNmbr = streetNmbr;
    }

    /** 
     * Get the list of 'BldgRoom' element items.
     * 
     * @return list
     */
    public List<BldgRoom> getBldgRoomList() {
        return bldgRoomList;
    }

    /** 
     * Set the list of 'BldgRoom' element items.
     * 
     * @param list
     */
    public void setBldgRoomList(List<BldgRoom> list) {
        bldgRoomList = list;
    }

    /** 
     * Get the list of 'AddressLine' element items. When the address is unformatted (FormattedInd="false") these lines will contain free form address details. When the address is formatted and street number and street name must be sent independently, the street number will be sent using StreetNmbr, and the street name will be sent in the first AddressLine occurrence.
     * 
     * @return list
     */
    public List<String> getAddressLineList() {
        return addressLineList;
    }

    /** 
     * Set the list of 'AddressLine' element items. When the address is unformatted (FormattedInd="false") these lines will contain free form address details. When the address is formatted and street number and street name must be sent independently, the street number will be sent using StreetNmbr, and the street name will be sent in the first AddressLine occurrence.
     * 
     * @param list
     */
    public void setAddressLineList(List<String> list) {
        addressLineList = list;
    }

    /** 
     * Get the 'CityName' element value. City (e.g., Dublin), town, or postal station (i.e., a postal service territory, often used in a military address).
     * 
     * @return value
     */
    public String getCityName() {
        return cityName;
    }

    /** 
     * Set the 'CityName' element value. City (e.g., Dublin), town, or postal station (i.e., a postal service territory, often used in a military address).
     * 
     * @param cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /** 
     * Get the 'PostalCode' element value. Post Office Code number.
     * 
     * @return value
     */
    public String getPostalCode() {
        return postalCode;
    }

    /** 
     * Set the 'PostalCode' element value. Post Office Code number.
     * 
     * @param postalCode
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /** 
     * Get the 'County' element value. County or Region Name (e.g., Fairfax).
     * 
     * @return value
     */
    public String getCounty() {
        return county;
    }

    /** 
     * Set the 'County' element value. County or Region Name (e.g., Fairfax).
     * 
     * @param county
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /** 
     * Get the 'StateProv' element value. State or Province name (e.g., Texas).
     * 
     * @return value
     */
    public StateProvType getStateProv() {
        return stateProv;
    }

    /** 
     * Set the 'StateProv' element value. State or Province name (e.g., Texas).
     * 
     * @param stateProv
     */
    public void setStateProv(StateProvType stateProv) {
        this.stateProv = stateProv;
    }

    /** 
     * Get the 'CountryName' element value. Country name (e.g., Ireland).
     * 
     * @return value
     */
    public CountryNameType getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. Country name (e.g., Ireland).
     * 
     * @param countryName
     */
    public void setCountryName(CountryNameType countryName) {
        this.countryName = countryName;
    }

    /** 
     * Get the 'FormattedInd' attribute value. Specifies if the associated data is formatted or not.  When true, then it is formatted; when false, then not formatted.
     * 
     * @return value
     */
    public Boolean getFormattedInd() {
        return formattedInd;
    }

    /** 
     * Set the 'FormattedInd' attribute value. Specifies if the associated data is formatted or not.  When true, then it is formatted; when false, then not formatted.
     * 
     * @param formattedInd
     */
    public void setFormattedInd(Boolean formattedInd) {
        this.formattedInd = formattedInd;
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
     * Get the 'Type' attribute value. Defines the type of address (e.g. home, business, other). Refer to OTA Code List Communication Location Type (CLT).
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' attribute value. Defines the type of address (e.g. home, business, other). Refer to OTA Code List Communication Location Type (CLT).
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
    /** 
     * May contain the street number and optionally the street name.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StreetNmbr" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:simpleContent>
     *       &lt;xs:extension base="ns:StreetNmbrType">
     *         &lt;xs:attribute type="xs:string" use="optional" name="StreetNmbrSuffix"/>
     *         &lt;xs:attribute type="xs:string" use="optional" name="StreetDirection"/>
     *         &lt;xs:attribute type="xs:string" use="optional" name="RuralRouteNmbr"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:simpleContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class StreetNmbr
    {
        private StreetNmbrType streetNmbrType;
        private String streetNmbrSuffix;
        private String streetDirection;
        private String ruralRouteNmbr;

        /** 
         * Get the extension value.
         * 
         * @return value
         */
        public StreetNmbrType getStreetNmbrType() {
            return streetNmbrType;
        }

        /** 
         * Set the extension value.
         * 
         * @param streetNmbrType
         */
        public void setStreetNmbrType(StreetNmbrType streetNmbrType) {
            this.streetNmbrType = streetNmbrType;
        }

        /** 
         * Get the 'StreetNmbrSuffix' attribute value. Usually a letter right after the street number (A in 66-A, B in 123-B etc).
         * 
         * @return value
         */
        public String getStreetNmbrSuffix() {
            return streetNmbrSuffix;
        }

        /** 
         * Set the 'StreetNmbrSuffix' attribute value. Usually a letter right after the street number (A in 66-A, B in 123-B etc).
         * 
         * @param streetNmbrSuffix
         */
        public void setStreetNmbrSuffix(String streetNmbrSuffix) {
            this.streetNmbrSuffix = streetNmbrSuffix;
        }

        /** 
         * Get the 'StreetDirection' attribute value. Street direction of an address (e.g., N, E, S, NW, SW). 


         * 
         * @return value
         */
        public String getStreetDirection() {
            return streetDirection;
        }

        /** 
         * Set the 'StreetDirection' attribute value. Street direction of an address (e.g., N, E, S, NW, SW). 


         * 
         * @param streetDirection
         */
        public void setStreetDirection(String streetDirection) {
            this.streetDirection = streetDirection;
        }

        /** 
         * Get the 'RuralRouteNmbr' attribute value. Numerical equivalent of a rural township as defined within a given area (e.g., 12, 99).
         * 
         * @return value
         */
        public String getRuralRouteNmbr() {
            return ruralRouteNmbr;
        }

        /** 
         * Set the 'RuralRouteNmbr' attribute value. Numerical equivalent of a rural township as defined within a given area (e.g., 12, 99).
         * 
         * @param ruralRouteNmbr
         */
        public void setRuralRouteNmbr(String ruralRouteNmbr) {
            this.ruralRouteNmbr = ruralRouteNmbr;
        }
    }
    /** 
     * Building name, room, apartment, or suite number.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BldgRoom" minOccurs="0" maxOccurs="2">
     *   &lt;xs:complexType>
     *     &lt;xs:simpleContent>
     *       &lt;xs:extension base="xs:string">
     *         &lt;xs:attribute type="xs:boolean" use="optional" name="BldgNameIndicator"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:simpleContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class BldgRoom
    {
        private String string;
        private Boolean bldgNameIndicator;

        /** 
         * Get the extension value.
         * 
         * @return value
         */
        public String getString() {
            return string;
        }

        /** 
         * Set the extension value.
         * 
         * @param string
         */
        public void setString(String string) {
            this.string = string;
        }

        /** 
         * Get the 'BldgNameIndicator' attribute value. When true, the information is a building name.
         * 
         * @return value
         */
        public Boolean getBldgNameIndicator() {
            return bldgNameIndicator;
        }

        /** 
         * Set the 'BldgNameIndicator' attribute value. When true, the information is a building name.
         * 
         * @param bldgNameIndicator
         */
        public void setBldgNameIndicator(Boolean bldgNameIndicator) {
            this.bldgNameIndicator = bldgNameIndicator;
        }
    }
}
