
package org.opentravel.ota;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/** 
 * Identifies the criterion for a search.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ItemSearchCriterionType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="Position" minOccurs="0">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:PositionGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element name="Address" minOccurs="0">
 *       &lt;!-- Reference to inner class Address -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="Telephone" minOccurs="0">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:TelephoneGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element name="RefPoint" minOccurs="0" maxOccurs="999">
 *       &lt;!-- Reference to inner class RefPoint -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="CodeRef" minOccurs="0">
 *       &lt;!-- Reference to inner class CodeRef -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="HotelRef" minOccurs="0">
 *       &lt;!-- Reference to inner class HotelRef -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="Radius" minOccurs="0">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:DistanceAttributesGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="ExactMatch"/>
 *   &lt;xs:attribute use="optional" name="ImportanceType">
 *     &lt;xs:simpleType>
 *       &lt;!-- Reference to inner class ImportanceType -->
 *     &lt;/xs:simpleType>
 *   &lt;/xs:attribute>
 *   &lt;xs:attribute type="xs:integer" use="optional" name="Ranking"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ItemSearchCriterionType
{
    private PositionGroup position;
    private Address address;
    private TelephoneGroup telephone;
    private List<RefPoint> refPointList = new ArrayList<RefPoint>();
    private CodeRef codeRef;
    private HotelRef hotelRef;
    private DistanceAttributesGroup radius;
    private Boolean exactMatch;
    private ImportanceType importanceType;
    private BigInteger ranking;

    /** 
     * Get the 'PositionGroup' attributeGroup value. The Position element contains three attributes, Latitude, Longitude, and Altitude, used to indicate the geographic location(s) requested by the search, expressed in notation specified by ISO standard 6709.  It is likely that only the first two attributes, Latitude and Longitude, would be needed to define a geographic area.
     * 
     * @return value
     */
    public PositionGroup getPosition() {
        return position;
    }

    /** 
     * Set the 'PositionGroup' attributeGroup value. The Position element contains three attributes, Latitude, Longitude, and Altitude, used to indicate the geographic location(s) requested by the search, expressed in notation specified by ISO standard 6709.  It is likely that only the first two attributes, Latitude and Longitude, would be needed to define a geographic area.
     * 
     * @param position
     */
    public void setPosition(PositionGroup position) {
        this.position = position;
    }

    /** 
     * Get the 'Address' element value.
     * 
     * @return value
     */
    public Address getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value.
     * 
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /** 
     * Get the 'TelephoneGroup' attributeGroup value. Telephone number(s) used in the search.
     * 
     * @return value
     */
    public TelephoneGroup getTelephone() {
        return telephone;
    }

    /** 
     * Set the 'TelephoneGroup' attributeGroup value. Telephone number(s) used in the search.
     * 
     * @param telephone
     */
    public void setTelephone(TelephoneGroup telephone) {
        this.telephone = telephone;
    }

    /** 
     * Get the list of 'RefPoint' element items.
     * 
     * @return list
     */
    public List<RefPoint> getRefPointList() {
        return refPointList;
    }

    /** 
     * Set the list of 'RefPoint' element items.
     * 
     * @param list
     */
    public void setRefPointList(List<RefPoint> list) {
        refPointList = list;
    }

    /** 
     * Get the 'CodeRef' element value.
     * 
     * @return value
     */
    public CodeRef getCodeRef() {
        return codeRef;
    }

    /** 
     * Set the 'CodeRef' element value.
     * 
     * @param codeRef
     */
    public void setCodeRef(CodeRef codeRef) {
        this.codeRef = codeRef;
    }

    /** 
     * Get the 'HotelRef' element value.
     * 
     * @return value
     */
    public HotelRef getHotelRef() {
        return hotelRef;
    }

    /** 
     * Set the 'HotelRef' element value.
     * 
     * @param hotelRef
     */
    public void setHotelRef(HotelRef hotelRef) {
        this.hotelRef = hotelRef;
    }

    /** 
     * Get the 'DistanceAttributesGroup' attributeGroup value. Used to provide distance and direction information from the referenced location.

     * 
     * @return value
     */
    public DistanceAttributesGroup getRadius() {
        return radius;
    }

    /** 
     * Set the 'DistanceAttributesGroup' attributeGroup value. Used to provide distance and direction information from the referenced location.

     * 
     * @param radius
     */
    public void setRadius(DistanceAttributesGroup radius) {
        this.radius = radius;
    }

    /** 
     * Get the 'ExactMatch' attribute value. Values of "true" or "false", indicating whether the string of the search value must be an exact match.
     * 
     * @return value
     */
    public Boolean getExactMatch() {
        return exactMatch;
    }

    /** 
     * Set the 'ExactMatch' attribute value. Values of "true" or "false", indicating whether the string of the search value must be an exact match.
     * 
     * @param exactMatch
     */
    public void setExactMatch(Boolean exactMatch) {
        this.exactMatch = exactMatch;
    }

    /** 
     * Get the 'ImportanceType' attribute value. An enumerated list, indicating the level of importance of the search criterion. Acceptable values are "Mandatory", "High", "Medium", or "Low."
     * 
     * @return value
     */
    public ImportanceType getImportanceType() {
        return importanceType;
    }

    /** 
     * Set the 'ImportanceType' attribute value. An enumerated list, indicating the level of importance of the search criterion. Acceptable values are "Mandatory", "High", "Medium", or "Low."
     * 
     * @param importanceType
     */
    public void setImportanceType(ImportanceType importanceType) {
        this.importanceType = importanceType;
    }

    /** 
     * Get the 'Ranking' attribute value. Defines a ranking scale expressed as integers; meaning and scale are based on individual implementations.
     * 
     * @return value
     */
    public BigInteger getRanking() {
        return ranking;
    }

    /** 
     * Set the 'Ranking' attribute value. Defines a ranking scale expressed as integers; meaning and scale are based on individual implementations.
     * 
     * @param ranking
     */
    public void setRanking(BigInteger ranking) {
        this.ranking = ranking;
    }
    /** 
     * Uses any part of address information, such as street name, postal code, or country code.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Address" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:AddressType">
     *         &lt;xs:attribute type="xs:boolean" use="optional" name="SameCountryInd"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Address extends AddressType
    {
        private Boolean sameCountryInd;

        /** 
         * Get the 'SameCountryInd' attribute value. When true, only locations in the same country as the specified city's country should be selected.
         * 
         * @return value
         */
        public Boolean getSameCountryInd() {
            return sameCountryInd;
        }

        /** 
         * Set the 'SameCountryInd' attribute value. When true, only locations in the same country as the specified city's country should be selected.
         * 
         * @param sameCountryInd
         */
        public void setSameCountryInd(Boolean sameCountryInd) {
            this.sameCountryInd = sameCountryInd;
        }
    }
    /** 
     * The Reference Point element allows for a search by proximity to a designated reference point by name. 
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RefPoint" minOccurs="0" maxOccurs="999">
     *   &lt;xs:complexType>
     *     &lt;xs:simpleContent>
     *       &lt;xs:extension base="xs:string">
     *         &lt;xs:attribute type="xs:string" use="optional" name="StateProv"/>
     *         &lt;xs:attribute type="xs:string" use="optional" name="CountryCode"/>
     *         &lt;xs:attributeGroup ref="ns:CodeListGroup"/>
     *         &lt;xs:attribute type="xs:string" use="optional" name="RefPointType"/>
     *         &lt;xs:attribute type="xs:string" use="optional" name="Name"/>
     *         &lt;xs:attribute type="xs:string" use="optional" name="CityName"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:simpleContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class RefPoint
    {
        private String string;
        private String stateProv;
        private String countryCode;
        private CodeListGroup codeListGroup;
        private String refPointType;
        private String name;
        private String cityName;

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
         * Get the 'StateProv' attribute value. The state or province in which the reference point is located.

         * 
         * @return value
         */
        public String getStateProv() {
            return stateProv;
        }

        /** 
         * Set the 'StateProv' attribute value. The state or province in which the reference point is located.

         * 
         * @param stateProv
         */
        public void setStateProv(String stateProv) {
            this.stateProv = stateProv;
        }

        /** 
         * Get the 'CountryCode' attribute value. The country in which the reference point is located.
         * 
         * @return value
         */
        public String getCountryCode() {
            return countryCode;
        }

        /** 
         * Set the 'CountryCode' attribute value. The country in which the reference point is located.
         * 
         * @param countryCode
         */
        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        /** 
         * Get the 'CodeListGroup' attributeGroup value. Used to specify a reference point by a code.
         * 
         * @return value
         */
        public CodeListGroup getCodeListGroup() {
            return codeListGroup;
        }

        /** 
         * Set the 'CodeListGroup' attributeGroup value. Used to specify a reference point by a code.
         * 
         * @param codeListGroup
         */
        public void setCodeListGroup(CodeListGroup codeListGroup) {
            this.codeListGroup = codeListGroup;
        }

        /** 
         * Get the 'RefPointType' attribute value. Indicates the type of location being referenced (e.g., Airport, Hotel). Refer to the OTA code table Index Point Code (IPC).
         * 
         * @return value
         */
        public String getRefPointType() {
            return refPointType;
        }

        /** 
         * Set the 'RefPointType' attribute value. Indicates the type of location being referenced (e.g., Airport, Hotel). Refer to the OTA code table Index Point Code (IPC).
         * 
         * @param refPointType
         */
        public void setRefPointType(String refPointType) {
            this.refPointType = refPointType;
        }

        /** 
         * Get the 'Name' attribute value. The name of the reference point.
         * 
         * @return value
         */
        public String getName() {
            return name;
        }

        /** 
         * Set the 'Name' attribute value. The name of the reference point.
         * 
         * @param name
         */
        public void setName(String name) {
            this.name = name;
        }

        /** 
         * Get the 'CityName' attribute value. The name of the city associated with this reference point.
         * 
         * @return value
         */
        public String getCityName() {
            return cityName;
        }

        /** 
         * Set the 'CityName' attribute value. The name of the city associated with this reference point.
         * 
         * @param cityName
         */
        public void setCityName(String cityName) {
            this.cityName = cityName;
        }
    }
    /** 
     * Indicates the location of points of interest.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CodeRef" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:simpleContent>
     *       &lt;xs:extension base="ns:LocationType">
     *         &lt;xs:attribute type="xs:string" use="optional" name="VicinityCode"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:simpleContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class CodeRef
    {
        private LocationType locationType;
        private String vicinityCode;

        /** 
         * Get the extension value.
         * 
         * @return value
         */
        public LocationType getLocationType() {
            return locationType;
        }

        /** 
         * Set the extension value.
         * 
         * @param locationType
         */
        public void setLocationType(LocationType locationType) {
            this.locationType = locationType;
        }

        /** 
         * Get the 'VicinityCode' attribute value. Used to identify the vicinity of the location.  Refer to OTA Codelist Vehicle Where at Facility (VWF).
         * 
         * @return value
         */
        public String getVicinityCode() {
            return vicinityCode;
        }

        /** 
         * Set the 'VicinityCode' attribute value. Used to identify the vicinity of the location.  Refer to OTA Codelist Vehicle Where at Facility (VWF).
         * 
         * @param vicinityCode
         */
        public void setVicinityCode(String vicinityCode) {
            this.vicinityCode = vicinityCode;
        }
    }
    /** 
     * Indicates the detail of hotel reference information.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="HotelRef" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:attributeGroup ref="ns:HotelReferenceGroup"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="SegmentCategoryCode"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="PropertyClassCode"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="ArchitecturalStyleCode"/>
     *     &lt;xs:attribute type="xs:integer" use="optional" name="SupplierIntegrationLevel"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class HotelRef
    {
        private HotelReferenceGroup hotelReferenceGroup;
        private String segmentCategoryCode;
        private String propertyClassCode;
        private String architecturalStyleCode;
        private BigInteger supplierIntegrationLevel;

        /** 
         * Get the 'HotelReferenceGroup' attributeGroup value.
         * 
         * @return value
         */
        public HotelReferenceGroup getHotelReferenceGroup() {
            return hotelReferenceGroup;
        }

        /** 
         * Set the 'HotelReferenceGroup' attributeGroup value.
         * 
         * @param hotelReferenceGroup
         */
        public void setHotelReferenceGroup(
                HotelReferenceGroup hotelReferenceGroup) {
            this.hotelReferenceGroup = hotelReferenceGroup;
        }

        /** 
         * Get the 'SegmentCategoryCode' attribute value. Used to search for hotels within a particular market segment.  Refer to OTA Code Segment Category Code Type (SEG).
        						
         * 
         * @return value
         */
        public String getSegmentCategoryCode() {
            return segmentCategoryCode;
        }

        /** 
         * Set the 'SegmentCategoryCode' attribute value. Used to search for hotels within a particular market segment.  Refer to OTA Code Segment Category Code Type (SEG).
        						
         * 
         * @param segmentCategoryCode
         */
        public void setSegmentCategoryCode(String segmentCategoryCode) {
            this.segmentCategoryCode = segmentCategoryCode;
        }

        /** 
         * Get the 'PropertyClassCode' attribute value. Refer to OTA Code list OTA Code List Property Class Type (PCT).
         * 
         * @return value
         */
        public String getPropertyClassCode() {
            return propertyClassCode;
        }

        /** 
         * Set the 'PropertyClassCode' attribute value. Refer to OTA Code list OTA Code List Property Class Type (PCT).
         * 
         * @param propertyClassCode
         */
        public void setPropertyClassCode(String propertyClassCode) {
            this.propertyClassCode = propertyClassCode;
        }

        /** 
         * Get the 'ArchitecturalStyleCode' attribute value. Refer to OTA Code List Architectural Style Code (ARC).
         * 
         * @return value
         */
        public String getArchitecturalStyleCode() {
            return architecturalStyleCode;
        }

        /** 
         * Set the 'ArchitecturalStyleCode' attribute value. Refer to OTA Code List Architectural Style Code (ARC).
         * 
         * @param architecturalStyleCode
         */
        public void setArchitecturalStyleCode(String architecturalStyleCode) {
            this.architecturalStyleCode = architecturalStyleCode;
        }

        /** 
         * Get the 'SupplierIntegrationLevel' attribute value. The level of integration of a property to provide automated transaction information. The lower the number, the higher the integration (e.g., a 1 means the supplier has the highest level of integration automation).
         * 
         * @return value
         */
        public BigInteger getSupplierIntegrationLevel() {
            return supplierIntegrationLevel;
        }

        /** 
         * Set the 'SupplierIntegrationLevel' attribute value. The level of integration of a property to provide automated transaction information. The lower the number, the higher the integration (e.g., a 1 means the supplier has the highest level of integration automation).
         * 
         * @param supplierIntegrationLevel
         */
        public void setSupplierIntegrationLevel(
                BigInteger supplierIntegrationLevel) {
            this.supplierIntegrationLevel = supplierIntegrationLevel;
        }
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:restriction base="xs:string">
     *     &lt;xs:enumeration value="Mandatory"/>
     *     &lt;xs:enumeration value="High"/>
     *     &lt;xs:enumeration value="Medium"/>
     *     &lt;xs:enumeration value="Low"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum ImportanceType {
        /** 
         * Indicates the item is required.
         */
        MANDATORY("Mandatory"), /** 
                                 * Indicates a high level of importance.
                                 */
        HIGH("High"), /** 
                       * Indicates a medium level of importance.
                       */
        MEDIUM("Medium"), /** 
                           * Indicates a low level of importance.
                           */
        LOW("Low");
        private final String value;

        private ImportanceType(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static ImportanceType convert(String value) {
            for (ImportanceType inst : values()) {
                if (inst.xmlValue().equals(value)) {
                    return inst;
                }
            }
            return null;
        }
    }
}
