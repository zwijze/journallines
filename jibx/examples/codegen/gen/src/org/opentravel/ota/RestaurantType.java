
package org.opentravel.ota;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/** 
 * Information associated with a specific restaurant.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RestaurantType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="MultimediaDescriptions" minOccurs="0">
 *       &lt;!-- Reference to inner class MultimediaDescriptions -->
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:RelativePositionType" name="RelativePosition" minOccurs="0"/>
 *     &lt;xs:element type="ns:OperationSchedulesPlusChargeType" name="OperationSchedules" minOccurs="0"/>
 *     &lt;xs:element name="InfoCodes" minOccurs="0">
 *       &lt;!-- Reference to inner class InfoCodes -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="CuisineCodes" minOccurs="0">
 *       &lt;!-- Reference to inner class CuisineCodes -->
 *     &lt;/xs:element>
 *     &lt;xs:element type="xs:string" name="DescriptiveText" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" use="optional" name="RestaurantName"/>
 *   &lt;xs:attribute type="xs:integer" use="optional" name="MaxSeatingCapacity"/>
 *   &lt;xs:attribute type="xs:integer" use="optional" name="MaxSingleParty"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="InvCode"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="OfferBreakfast"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="OfferLunch"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="OfferDinner"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="OfferBrunch"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ProximityCode"/>
 *   &lt;xs:attributeGroup ref="ns:ID_OptionalGroup"/>
 *   &lt;xs:attribute type="xs:integer" use="optional" name="Sort"/>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ID_OptionalGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="ID"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class RestaurantType
{
    private MultimediaDescriptions multimediaDescriptions;
    private RelativePositionType relativePosition;
    private OperationSchedulesPlusChargeType operationSchedules;
    private InfoCodes infoCodes;
    private CuisineCodes cuisineCodes;
    private String descriptiveText;
    private String restaurantName;
    private BigInteger maxSeatingCapacity;
    private BigInteger maxSingleParty;
    private String invCode;
    private Boolean offerBreakfast;
    private Boolean offerLunch;
    private Boolean offerDinner;
    private Boolean offerBrunch;
    private String proximityCode;
    private String ID;
    private BigInteger sort;

    /** 
     * Get the 'MultimediaDescriptions' element value.
     * 
     * @return value
     */
    public MultimediaDescriptions getMultimediaDescriptions() {
        return multimediaDescriptions;
    }

    /** 
     * Set the 'MultimediaDescriptions' element value.
     * 
     * @param multimediaDescriptions
     */
    public void setMultimediaDescriptions(
            MultimediaDescriptions multimediaDescriptions) {
        this.multimediaDescriptions = multimediaDescriptions;
    }

    /** 
     * Get the 'RelativePosition' element value. Indicates the directions to a specific restaurant.
     * 
     * @return value
     */
    public RelativePositionType getRelativePosition() {
        return relativePosition;
    }

    /** 
     * Set the 'RelativePosition' element value. Indicates the directions to a specific restaurant.
     * 
     * @param relativePosition
     */
    public void setRelativePosition(RelativePositionType relativePosition) {
        this.relativePosition = relativePosition;
    }

    /** 
     * Get the 'OperationSchedules' element value. Collection of operating times for the restaurant including detail such as season, day of week, or a combination.
     * 
     * @return value
     */
    public OperationSchedulesPlusChargeType getOperationSchedules() {
        return operationSchedules;
    }

    /** 
     * Set the 'OperationSchedules' element value. Collection of operating times for the restaurant including detail such as season, day of week, or a combination.
     * 
     * @param operationSchedules
     */
    public void setOperationSchedules(
            OperationSchedulesPlusChargeType operationSchedules) {
        this.operationSchedules = operationSchedules;
    }

    /** 
     * Get the 'InfoCodes' element value.
     * 
     * @return value
     */
    public InfoCodes getInfoCodes() {
        return infoCodes;
    }

    /** 
     * Set the 'InfoCodes' element value.
     * 
     * @param infoCodes
     */
    public void setInfoCodes(InfoCodes infoCodes) {
        this.infoCodes = infoCodes;
    }

    /** 
     * Get the 'CuisineCodes' element value.
     * 
     * @return value
     */
    public CuisineCodes getCuisineCodes() {
        return cuisineCodes;
    }

    /** 
     * Set the 'CuisineCodes' element value.
     * 
     * @param cuisineCodes
     */
    public void setCuisineCodes(CuisineCodes cuisineCodes) {
        this.cuisineCodes = cuisineCodes;
    }

    /** 
     * Get the 'DescriptiveText' element value. Descriptive text that describes the restaurant.
     * 
     * @return value
     */
    public String getDescriptiveText() {
        return descriptiveText;
    }

    /** 
     * Set the 'DescriptiveText' element value. Descriptive text that describes the restaurant.
     * 
     * @param descriptiveText
     */
    public void setDescriptiveText(String descriptiveText) {
        this.descriptiveText = descriptiveText;
    }

    /** 
     * Get the 'RestaurantName' attribute value. The name of the restaurant at the facility. 
     * 
     * @return value
     */
    public String getRestaurantName() {
        return restaurantName;
    }

    /** 
     * Set the 'RestaurantName' attribute value. The name of the restaurant at the facility. 
     * 
     * @param restaurantName
     */
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    /** 
     * Get the 'MaxSeatingCapacity' attribute value. The total seating capacity for this restaurant. 
     * 
     * @return value
     */
    public BigInteger getMaxSeatingCapacity() {
        return maxSeatingCapacity;
    }

    /** 
     * Set the 'MaxSeatingCapacity' attribute value. The total seating capacity for this restaurant. 
     * 
     * @param maxSeatingCapacity
     */
    public void setMaxSeatingCapacity(BigInteger maxSeatingCapacity) {
        this.maxSeatingCapacity = maxSeatingCapacity;
    }

    /** 
     * Get the 'MaxSingleParty' attribute value. The maximum number of people that can be seated as a single party in this restaurant. 
     * 
     * @return value
     */
    public BigInteger getMaxSingleParty() {
        return maxSingleParty;
    }

    /** 
     * Set the 'MaxSingleParty' attribute value. The maximum number of people that can be seated as a single party in this restaurant. 
     * 
     * @param maxSingleParty
     */
    public void setMaxSingleParty(BigInteger maxSingleParty) {
        this.maxSingleParty = maxSingleParty;
    }

    /** 
     * Get the 'InvCode' attribute value. Identification code of the restaurant service or facility for inventory and booking purposes if the service is an inventoriable item.
     * 
     * @return value
     */
    public String getInvCode() {
        return invCode;
    }

    /** 
     * Set the 'InvCode' attribute value. Identification code of the restaurant service or facility for inventory and booking purposes if the service is an inventoriable item.
     * 
     * @param invCode
     */
    public void setInvCode(String invCode) {
        this.invCode = invCode;
    }

    /** 
     * Get the 'OfferBreakfast' attribute value.
     * 
     * @return value
     */
    public Boolean getOfferBreakfast() {
        return offerBreakfast;
    }

    /** 
     * Set the 'OfferBreakfast' attribute value.
     * 
     * @param offerBreakfast
     */
    public void setOfferBreakfast(Boolean offerBreakfast) {
        this.offerBreakfast = offerBreakfast;
    }

    /** 
     * Get the 'OfferLunch' attribute value.
     * 
     * @return value
     */
    public Boolean getOfferLunch() {
        return offerLunch;
    }

    /** 
     * Set the 'OfferLunch' attribute value.
     * 
     * @param offerLunch
     */
    public void setOfferLunch(Boolean offerLunch) {
        this.offerLunch = offerLunch;
    }

    /** 
     * Get the 'OfferDinner' attribute value.
     * 
     * @return value
     */
    public Boolean getOfferDinner() {
        return offerDinner;
    }

    /** 
     * Set the 'OfferDinner' attribute value.
     * 
     * @param offerDinner
     */
    public void setOfferDinner(Boolean offerDinner) {
        this.offerDinner = offerDinner;
    }

    /** 
     * Get the 'OfferBrunch' attribute value.
     * 
     * @return value
     */
    public Boolean getOfferBrunch() {
        return offerBrunch;
    }

    /** 
     * Set the 'OfferBrunch' attribute value.
     * 
     * @param offerBrunch
     */
    public void setOfferBrunch(Boolean offerBrunch) {
        this.offerBrunch = offerBrunch;
    }

    /** 
     * Get the 'ProximityCode' attribute value. Denotes whether a service is onsite, offsite or information is not available. Refer to OTA Code Table Proximity (PRX).
     * 
     * @return value
     */
    public String getProximityCode() {
        return proximityCode;
    }

    /** 
     * Set the 'ProximityCode' attribute value. Denotes whether a service is onsite, offsite or information is not available. Refer to OTA Code Table Proximity (PRX).
     * 
     * @param proximityCode
     */
    public void setProximityCode(String proximityCode) {
        this.proximityCode = proximityCode;
    }

    /** 
     * Get the 'ID' attribute value. A unique identifying value assigned by the creating system.  The ID attribute may be used to reference a primary-key value within a database or in a particular implementation.
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' attribute value. A unique identifying value assigned by the creating system.  The ID attribute may be used to reference a primary-key value within a database or in a particular implementation.
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /** 
     * Get the 'Sort' attribute value. Used to define the display order.
     * 
     * @return value
     */
    public BigInteger getSort() {
        return sort;
    }

    /** 
     * Set the 'Sort' attribute value. Used to define the display order.
     * 
     * @param sort
     */
    public void setSort(BigInteger sort) {
        this.sort = sort;
    }
    /** 
     * Multimedia information about the restaurant.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MultimediaDescriptions" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:MultimediaDescriptionsType">
     *         &lt;xs:attribute type="xs:string" use="optional" name="Attire"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class MultimediaDescriptions
            extends
                MultimediaDescriptionsType
    {
        private String attire;

        /** 
         * Get the 'Attire' attribute value. Used to pass restaurant attire information.
         * 
         * @return value
         */
        public String getAttire() {
            return attire;
        }

        /** 
         * Set the 'Attire' attribute value. Used to pass restaurant attire information.
         * 
         * @param attire
         */
        public void setAttire(String attire) {
            this.attire = attire;
        }
    }
    /** 
     * Collection of types of restaurant.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="InfoCodes" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="InfoCode" maxOccurs="unbounded">
     *         &lt;!-- Reference to inner class InfoCode -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class InfoCodes
    {
        private List<InfoCode> infoCodeList = new ArrayList<InfoCode>();

        /** 
         * Get the list of 'InfoCode' element items.
         * 
         * @return list
         */
        public List<InfoCode> getInfoCodeList() {
            return infoCodeList;
        }

        /** 
         * Set the list of 'InfoCode' element items.
         * 
         * @param list
         */
        public void setInfoCodeList(List<InfoCode> list) {
            infoCodeList = list;
        }
        /** 
         * Indicates the generic type of restaurant such as fast food, cafe, fine dining, etc.
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="InfoCode" maxOccurs="unbounded">
         *   &lt;xs:complexType>
         *     &lt;xs:attribute use="optional" name="Name">
         *       &lt;xs:simpleType>
         *         &lt;!-- Reference to inner class Name -->
         *       &lt;/xs:simpleType>
         *     &lt;/xs:attribute>
         *     &lt;xs:attribute type="xs:string" use="optional" name="Code"/>
         *     &lt;xs:attributeGroup ref="ns:CodeInfoGroup"/>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class InfoCode
        {
            private Name name;
            private String code;
            private CodeInfoGroup codeInfoGroup;

            /** 
             * Get the 'Name' attribute value. This name refers to an OTA Code List table (e.g. RestaurantCategoryCode/InfoCode). The actual code is passed in the Code attribute.
             * 
             * @return value
             */
            public Name getName() {
                return name;
            }

            /** 
             * Set the 'Name' attribute value. This name refers to an OTA Code List table (e.g. RestaurantCategoryCode/InfoCode). The actual code is passed in the Code attribute.
             * 
             * @param name
             */
            public void setName(Name name) {
                this.name = name;
            }

            /** 
             * Get the 'Code' attribute value. Refer to OTA Code List Restaurant Category (RES).
             * 
             * @return value
             */
            public String getCode() {
                return code;
            }

            /** 
             * Set the 'Code' attribute value. Refer to OTA Code List Restaurant Category (RES).
             * 
             * @param code
             */
            public void setCode(String code) {
                this.code = code;
            }

            /** 
             * Get the 'CodeInfoGroup' attributeGroup value. May be used to give further detail on the code or to remove an obsolete item.
             * 
             * @return value
             */
            public CodeInfoGroup getCodeInfoGroup() {
                return codeInfoGroup;
            }

            /** 
             * Set the 'CodeInfoGroup' attributeGroup value. May be used to give further detail on the code or to remove an obsolete item.
             * 
             * @param codeInfoGroup
             */
            public void setCodeInfoGroup(CodeInfoGroup codeInfoGroup) {
                this.codeInfoGroup = codeInfoGroup;
            }
            /** 
             * Schema fragment(s) for this class:
             * <pre>
             * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
             *   &lt;xs:restriction base="xs:string">
             *     &lt;xs:enumeration value="SrvcInfo"/>
             *     &lt;xs:enumeration value="Beverage"/>
             *     &lt;xs:enumeration value="AvailableMealCategory"/>
             *     &lt;xs:enumeration value="RestaurantCategory"/>
             *     &lt;xs:enumeration value="RestaurantPolicy"/>
             *   &lt;/xs:restriction>
             * &lt;/xs:simpleType>
             * </pre>
             */
            public static enum Name {
                /** 
                 * Refer to OTA Code List Restaurant Srvc Info (RSI).
                 */
                SRVC_INFO("SrvcInfo"), /** 
                                        * This uses OTA Code Table Beverage Code.
                                        */
                BEVERAGE("Beverage"), /** 
                                       * This uses OTA Code Table Available Meal Category Codes.
                                       */
                AVAILABLE_MEAL_CATEGORY("AvailableMealCategory"), /** 
                                                                   * This uses OTA Code Table RestaurantCategoryCode.
                                                                   */
                RESTAURANT_CATEGORY("RestaurantCategory"), /** 
                                                            * This uses OTA Code Table Restaurant Policy Code.
                                                            */
                RESTAURANT_POLICY("RestaurantPolicy");
                private final String value;

                private Name(String value) {
                    this.value = value;
                }

                public String xmlValue() {
                    return value;
                }

                public static Name convert(String value) {
                    for (Name inst : values()) {
                        if (inst.xmlValue().equals(value)) {
                            return inst;
                        }
                    }
                    return null;
                }
            }
        }
    }
    /** 
     * Collection of cuisine types of restaurant.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CuisineCodes" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="CuisineCode" maxOccurs="unbounded">
     *         &lt;!-- Reference to inner class CuisineCode -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class CuisineCodes
    {
        private List<CuisineCode> cuisineCodeList = new ArrayList<CuisineCode>();

        /** 
         * Get the list of 'CuisineCode' element items.
         * 
         * @return list
         */
        public List<CuisineCode> getCuisineCodeList() {
            return cuisineCodeList;
        }

        /** 
         * Set the list of 'CuisineCode' element items.
         * 
         * @param list
         */
        public void setCuisineCodeList(List<CuisineCode> list) {
            cuisineCodeList = list;
        }
        /** 
         * The code for the type of cuisine served at the restaurant.
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CuisineCode" maxOccurs="unbounded">
         *   &lt;xs:complexType>
         *     &lt;xs:attribute type="xs:string" use="optional" name="Code"/>
         *     &lt;xs:attributeGroup ref="ns:CodeInfoGroup"/>
         *     &lt;xs:attribute type="xs:boolean" use="optional" name="IsMain"/>
         *     &lt;xs:attribute type="xs:string" use="optional" name="ExistsCode"/>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class CuisineCode
        {
            private String code;
            private CodeInfoGroup codeInfoGroup;
            private Boolean isMain;
            private String existsCode;

            /** 
             * Get the 'Code' attribute value. Refer to OTA Code List Main Cuisine Code (CUI).
             * 
             * @return value
             */
            public String getCode() {
                return code;
            }

            /** 
             * Set the 'Code' attribute value. Refer to OTA Code List Main Cuisine Code (CUI).
             * 
             * @param code
             */
            public void setCode(String code) {
                this.code = code;
            }

            /** 
             * Get the 'CodeInfoGroup' attributeGroup value. May be used to give further detail on the code or to remove an obsolete item.
             * 
             * @return value
             */
            public CodeInfoGroup getCodeInfoGroup() {
                return codeInfoGroup;
            }

            /** 
             * Set the 'CodeInfoGroup' attributeGroup value. May be used to give further detail on the code or to remove an obsolete item.
             * 
             * @param codeInfoGroup
             */
            public void setCodeInfoGroup(CodeInfoGroup codeInfoGroup) {
                this.codeInfoGroup = codeInfoGroup;
            }

            /** 
             * Get the 'IsMain' attribute value. Indicates whether this cuisine code is the main cuisine offered by restaurant.
             * 
             * @return value
             */
            public Boolean getIsMain() {
                return isMain;
            }

            /** 
             * Set the 'IsMain' attribute value. Indicates whether this cuisine code is the main cuisine offered by restaurant.
             * 
             * @param isMain
             */
            public void setIsMain(Boolean isMain) {
                this.isMain = isMain;
            }

            /** 
             * Get the 'ExistsCode' attribute value. This attribute is used to explicitly define whether the Code applies. Refer to OTA Code list Option Type Code (OTC). This is used in conjunction with Code.
             * 
             * @return value
             */
            public String getExistsCode() {
                return existsCode;
            }

            /** 
             * Set the 'ExistsCode' attribute value. This attribute is used to explicitly define whether the Code applies. Refer to OTA Code list Option Type Code (OTC). This is used in conjunction with Code.
             * 
             * @param existsCode
             */
            public void setExistsCode(String existsCode) {
                this.existsCode = existsCode;
            }
        }
    }
}
