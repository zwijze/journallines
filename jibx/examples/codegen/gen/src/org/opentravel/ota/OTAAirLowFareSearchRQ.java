
package org.opentravel.ota;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/** 
 * 
 The Low Fare Search Request message requests priced itinerary options for flights between specific city pairs on specific dates for specific 	numbers and types of passengers. Optional request information can include:
 - Time / Time Window
 - Connecting cities.
 - Client Preferences (airlines, cabin, flight types etc.)
 The Low Fare Search request contains similar information to a Low Fare Search entry on an airline CRS or GDS.

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OTA_AirLowFareSearchRQ">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:POS_Type" name="POS"/>
 *       &lt;xs:element name="ProcessingInfo" minOccurs="0">
 *         &lt;xs:complexType>
 *           &lt;xs:attributeGroup ref="ns:AirProcessingInfoGroup"/>
 *         &lt;/xs:complexType>
 *       &lt;/xs:element>
 *       &lt;xs:element name="OriginDestinationInformation" maxOccurs="10">
 *         &lt;!-- Reference to inner class OriginDestinationInformation -->
 *       &lt;/xs:element>
 *       &lt;xs:element type="ns:SpecificFlightInfoType" name="SpecificFlightInfo" minOccurs="0"/>
 *       &lt;xs:element name="TravelPreferences" minOccurs="0" maxOccurs="10">
 *         &lt;!-- Reference to inner class TravelPreferences -->
 *       &lt;/xs:element>
 *       &lt;xs:element name="TravelerInfoSummary">
 *         &lt;xs:complexType>
 *           &lt;xs:complexContent>
 *             &lt;xs:extension base="ns:TravelerInfoSummaryType">
 *               &lt;xs:attribute type="xs:string" use="optional" name="TicketingCountryCode"/>
 *               &lt;xs:attribute type="xs:boolean" use="optional" name="SpecificPTC_Indicator"/>
 *             &lt;/xs:extension>
 *           &lt;/xs:complexContent>
 *         &lt;/xs:complexType>
 *       &lt;/xs:element>
 *     &lt;/xs:sequence>
 *     &lt;xs:attributeGroup ref="ns:OTA_PayloadStdAttributes"/>
 *     &lt;xs:attributeGroup ref="ns:MaxResponsesGroup"/>
 *     &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="DirectFlightsOnly"/>
 *     &lt;xs:attribute type="xs:boolean" use="optional" name="AvailableFlightsOnly"/>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MaxResponsesGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="MaxResponses"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class OTAAirLowFareSearchRQ
{
    private POSType POS;
    private AirProcessingInfoGroup processingInfo;
    private List<OriginDestinationInformation> originDestinationInformationList = new ArrayList<OriginDestinationInformation>();
    private SpecificFlightInfoType specificFlightInfo;
    private List<TravelPreferences> travelPreferenceList = new ArrayList<TravelPreferences>();
    private TravelerInfoSummaryType travelerInfoSummaryTravelerInfoSummaryType;
    private String travelerInfoSummaryTicketingCountryCode;
    private Boolean travelerInfoSummarySpecificPTCIndicator;
    private OTAPayloadStdAttributes OTAPayloadStdAttributes;
    private String maxResponses;
    private Boolean directFlightsOnly;
    private Boolean availableFlightsOnly;

    /** 
     * Get the 'POS' element value. Point of sale object. 
     * 
     * @return value
     */
    public POSType getPOS() {
        return POS;
    }

    /** 
     * Set the 'POS' element value. Point of sale object. 
     * 
     * @param POS
     */
    public void setPOS(POSType POS) {
        this.POS = POS;
    }

    /** 
     * Get the 'AirProcessingInfoGroup' attributeGroup value. A collection of information that specifies how the message processing should occur or how the data should be returned.
     * 
     * @return value
     */
    public AirProcessingInfoGroup getProcessingInfo() {
        return processingInfo;
    }

    /** 
     * Set the 'AirProcessingInfoGroup' attributeGroup value. A collection of information that specifies how the message processing should occur or how the data should be returned.
     * 
     * @param processingInfo
     */
    public void setProcessingInfo(AirProcessingInfoGroup processingInfo) {
        this.processingInfo = processingInfo;
    }

    /** 
     * Get the list of 'OriginDestinationInformation' element items.
     * 
     * @return list
     */
    public List<OriginDestinationInformation> getOriginDestinationInformationList() {
        return originDestinationInformationList;
    }

    /** 
     * Set the list of 'OriginDestinationInformation' element items.
     * 
     * @param list
     */
    public void setOriginDestinationInformationList(
            List<OriginDestinationInformation> list) {
        originDestinationInformationList = list;
    }

    /** 
     * Get the 'SpecificFlightInfo' element value. Specify actual airline, flight number, or booking class to qualify the low fare search
     * 
     * @return value
     */
    public SpecificFlightInfoType getSpecificFlightInfo() {
        return specificFlightInfo;
    }

    /** 
     * Set the 'SpecificFlightInfo' element value. Specify actual airline, flight number, or booking class to qualify the low fare search
     * 
     * @param specificFlightInfo
     */
    public void setSpecificFlightInfo(SpecificFlightInfoType specificFlightInfo) {
        this.specificFlightInfo = specificFlightInfo;
    }

    /** 
     * Get the list of 'TravelPreferences' element items.
     * 
     * @return list
     */
    public List<TravelPreferences> getTravelPreferenceList() {
        return travelPreferenceList;
    }

    /** 
     * Set the list of 'TravelPreferences' element items.
     * 
     * @param list
     */
    public void setTravelPreferenceList(List<TravelPreferences> list) {
        travelPreferenceList = list;
    }

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public TravelerInfoSummaryType getTravelerInfoSummaryTravelerInfoSummaryType() {
        return travelerInfoSummaryTravelerInfoSummaryType;
    }

    /** 
     * Set the extension value.
     * 
     * @param travelerInfoSummaryTravelerInfoSummaryType
     */
    public void setTravelerInfoSummaryTravelerInfoSummaryType(
            TravelerInfoSummaryType travelerInfoSummaryTravelerInfoSummaryType) {
        this.travelerInfoSummaryTravelerInfoSummaryType = travelerInfoSummaryTravelerInfoSummaryType;
    }

    /** 
     * Get the 'TicketingCountryCode' attribute value. To specify the country code where ticketing of the reservation will take place.
     * 
     * @return value
     */
    public String getTravelerInfoSummaryTicketingCountryCode() {
        return travelerInfoSummaryTicketingCountryCode;
    }

    /** 
     * Set the 'TicketingCountryCode' attribute value. To specify the country code where ticketing of the reservation will take place.
     * 
     * @param travelerInfoSummaryTicketingCountryCode
     */
    public void setTravelerInfoSummaryTicketingCountryCode(
            String travelerInfoSummaryTicketingCountryCode) {
        this.travelerInfoSummaryTicketingCountryCode = travelerInfoSummaryTicketingCountryCode;
    }

    /** 
     * Get the 'SpecificPTC_Indicator' attribute value. If true, this request is for a specific PTC and only fares applicable to that PTC will be checked and returned.
     * 
     * @return value
     */
    public Boolean getTravelerInfoSummarySpecificPTCIndicator() {
        return travelerInfoSummarySpecificPTCIndicator;
    }

    /** 
     * Set the 'SpecificPTC_Indicator' attribute value. If true, this request is for a specific PTC and only fares applicable to that PTC will be checked and returned.
     * 
     * @param travelerInfoSummarySpecificPTCIndicator
     */
    public void setTravelerInfoSummarySpecificPTCIndicator(
            Boolean travelerInfoSummarySpecificPTCIndicator) {
        this.travelerInfoSummarySpecificPTCIndicator = travelerInfoSummarySpecificPTCIndicator;
    }

    /** 
     * Get the 'OTA_PayloadStdAttributes' attributeGroup value.
     * 
     * @return value
     */
    public OTAPayloadStdAttributes getOTAPayloadStdAttributes() {
        return OTAPayloadStdAttributes;
    }

    /** 
     * Set the 'OTA_PayloadStdAttributes' attributeGroup value.
     * 
     * @param OTAPayloadStdAttributes
     */
    public void setOTAPayloadStdAttributes(
            OTAPayloadStdAttributes OTAPayloadStdAttributes) {
        this.OTAPayloadStdAttributes = OTAPayloadStdAttributes;
    }

    /** 
     * Get the 'MaxResponses' attribute value. A positive integer value that indicates the maximum number of responses desired in the return.
     * 
     * @return value
     */
    public String getMaxResponses() {
        return maxResponses;
    }

    /** 
     * Set the 'MaxResponses' attribute value. A positive integer value that indicates the maximum number of responses desired in the return.
     * 
     * @param maxResponses
     */
    public void setMaxResponses(String maxResponses) {
        this.maxResponses = maxResponses;
    }

    /** 
     * Get the 'DirectFlightsOnly' attribute value.  Request direct flights on between the given locations.This defaults to false.
     * 
     * @return value
     */
    public Boolean getDirectFlightsOnly() {
        return directFlightsOnly;
    }

    /** 
     * Set the 'DirectFlightsOnly' attribute value.  Request direct flights on between the given locations.This defaults to false.
     * 
     * @param directFlightsOnly
     */
    public void setDirectFlightsOnly(Boolean directFlightsOnly) {
        this.directFlightsOnly = directFlightsOnly;
    }

    /** 
     * Get the 'AvailableFlightsOnly' attribute value. Include only flights with available booking codes (when True or when attribute not present).
     * 
     * @return value
     */
    public Boolean getAvailableFlightsOnly() {
        return availableFlightsOnly;
    }

    /** 
     * Set the 'AvailableFlightsOnly' attribute value. Include only flights with available booking codes (when True or when attribute not present).
     * 
     * @param availableFlightsOnly
     */
    public void setAvailableFlightsOnly(Boolean availableFlightsOnly) {
        this.availableFlightsOnly = availableFlightsOnly;
    }
    /** 
     * Origin and Destination location, and time information for the Air Low Fare Search request. 
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OriginDestinationInformation" maxOccurs="10">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:OriginDestinationInformationType">
     *         &lt;xs:sequence>
     *           &lt;xs:element name="AlternateLocationInfo" minOccurs="0">
     *             &lt;!-- Reference to inner class AlternateLocationInfo -->
     *           &lt;/xs:element>
     *           &lt;xs:element ref="ns:TPA_Extensions" minOccurs="0"/>
     *         &lt;/xs:sequence>
     *         &lt;xs:attribute type="xs:string" use="optional" name="RPH"/>
     *         &lt;xs:attribute type="xs:integer" use="optional" name="RefNumber"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class OriginDestinationInformation
            extends
                OriginDestinationInformationType
    {
        private AlternateLocationInfo alternateLocationInfo;
        private TPAExtensionsType TPAExtensions;
        private String RPH;
        private BigInteger refNumber;

        /** 
         * Get the 'AlternateLocationInfo' element value.
         * 
         * @return value
         */
        public AlternateLocationInfo getAlternateLocationInfo() {
            return alternateLocationInfo;
        }

        /** 
         * Set the 'AlternateLocationInfo' element value.
         * 
         * @param alternateLocationInfo
         */
        public void setAlternateLocationInfo(
                AlternateLocationInfo alternateLocationInfo) {
            this.alternateLocationInfo = alternateLocationInfo;
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
         * Get the 'RPH' attribute value. A unique reference to this origin destination information.
         * 
         * @return value
         */
        public String getRPH() {
            return RPH;
        }

        /** 
         * Set the 'RPH' attribute value. A unique reference to this origin destination information.
         * 
         * @param RPH
         */
        public void setRPH(String RPH) {
            this.RPH = RPH;
        }

        /** 
         * Get the 'RefNumber' attribute value. A unique reference to this origin destination information to be referenced wihin the OTA_AirLowFareSearchRS message.
         * 
         * @return value
         */
        public BigInteger getRefNumber() {
            return refNumber;
        }

        /** 
         * Set the 'RefNumber' attribute value. A unique reference to this origin destination information to be referenced wihin the OTA_AirLowFareSearchRS message.
         * 
         * @param refNumber
         */
        public void setRefNumber(BigInteger refNumber) {
            this.refNumber = refNumber;
        }
        /** 
         * Specifies alternate location(s) for the origin and/or destination. 
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AlternateLocationInfo" minOccurs="0">
         *   &lt;xs:complexType>
         *     &lt;xs:attribute type="ns:ListOfStringLength1to8" use="optional" name="OriginLocation"/>
         *     &lt;xs:attribute type="ns:ListOfStringLength1to8" use="optional" name="DestinationLocation"/>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * 
         * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ListOfStringLength1to8">
         *   &lt;xs:list itemType="xs:string"/>
         * &lt;/xs:simpleType>
         * </pre>
         */
        public static class AlternateLocationInfo
        {
            private List<String> originLocations = new ArrayList<String>();
            private List<String> destinationLocations = new ArrayList<String>();

            /** 
             * Get the list of 'OriginLocation' attribute items. Specifies alternate airport/city codes for the origin location.
             * 
             * @return list
             */
            public List<String> getOriginLocations() {
                return originLocations;
            }

            /** 
             * Set the list of 'OriginLocation' attribute items. Specifies alternate airport/city codes for the origin location.
             * 
             * @param list
             */
            public void setOriginLocations(List<String> list) {
                originLocations = list;
            }

            /** 
             * Serializer for 'OriginLocation' attribute list.
             * 
             * @param values
             * @return text
             */
            public static String serializeOriginLocations(List<String> values) {
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
             * Deserializer for 'OriginLocation' attribute list.
             * 
             * @param text
             * @return values
             * @throws org.jibx.runtime.JiBXException on conversion error
             */
            public static List<String> deserializeOriginLocations(String text)
                    throws org.jibx.runtime.JiBXException {
                org.jibx.runtime.IListItemDeserializer ldser = new org.jibx.runtime.IListItemDeserializer() {
                    public java.lang.Object deserialize(String text) {
                        return text;
                    }
                };
                return (List<String>) org.jibx.runtime.Utility.deserializeList(
                        text, ldser);
            }

            /** 
             * Get the list of 'DestinationLocation' attribute items. Specifies alternate airport/city codes for the destination location.
             * 
             * @return list
             */
            public List<String> getDestinationLocations() {
                return destinationLocations;
            }

            /** 
             * Set the list of 'DestinationLocation' attribute items. Specifies alternate airport/city codes for the destination location.
             * 
             * @param list
             */
            public void setDestinationLocations(List<String> list) {
                destinationLocations = list;
            }

            /** 
             * Serializer for 'DestinationLocation' attribute list.
             * 
             * @param values
             * @return text
             */
            public static String serializeDestinationLocations(
                    List<String> values) {
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
             * Deserializer for 'DestinationLocation' attribute list.
             * 
             * @param text
             * @return values
             * @throws org.jibx.runtime.JiBXException on conversion error
             */
            public static List<String> deserializeDestinationLocations(
                    String text) throws org.jibx.runtime.JiBXException {
                org.jibx.runtime.IListItemDeserializer ldser = new org.jibx.runtime.IListItemDeserializer() {
                    public java.lang.Object deserialize(String text) {
                        return text;
                    }
                };
                return (List<String>) org.jibx.runtime.Utility.deserializeList(
                        text, ldser);
            }
        }
    }
    /** 
     * Air Low Fare Search Request preference information.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelPreferences" minOccurs="0" maxOccurs="10">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:AirSearchPrefsType">
     *         &lt;xs:attribute use="optional" name="FlexDatePref">
     *           &lt;xs:simpleType>
     *             &lt;!-- Reference to inner class FlexDatePref -->
     *           &lt;/xs:simpleType>
     *         &lt;/xs:attribute>
     *         &lt;xs:attribute type="xs:boolean" use="optional" name="FlexWeekendIndicator"/>
     *         &lt;xs:attribute type="xs:boolean" use="optional" name="FlexLevelIndicator"/>
     *         &lt;xs:attribute type="xs:boolean" use="optional" name="NoFareBreakIndicator"/>
     *         &lt;xs:attribute type="ns:ListOfRPH" use="optional" name="OriginDestinationRPHs"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * 
     * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ListOfRPH">
     *   &lt;xs:list itemType="xs:string"/>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static class TravelPreferences extends AirSearchPrefsType
    {
        private FlexDatePref flexDatePref;
        private Boolean flexWeekendIndicator;
        private Boolean flexLevelIndicator;
        private Boolean noFareBreakIndicator;
        private List<String> originDestinationRPHs = new ArrayList<String>();

        /** 
         * Get the 'FlexDatePref' attribute value. To specify which portions of the journey the date is flexible.
         * 
         * @return value
         */
        public FlexDatePref getFlexDatePref() {
            return flexDatePref;
        }

        /** 
         * Set the 'FlexDatePref' attribute value. To specify which portions of the journey the date is flexible.
         * 
         * @param flexDatePref
         */
        public void setFlexDatePref(FlexDatePref flexDatePref) {
            this.flexDatePref = flexDatePref;
        }

        /** 
         * Get the 'FlexWeekendIndicator' attribute value. If true, days before or after the weekend day should be searched.
         * 
         * @return value
         */
        public Boolean getFlexWeekendIndicator() {
            return flexWeekendIndicator;
        }

        /** 
         * Set the 'FlexWeekendIndicator' attribute value. If true, days before or after the weekend day should be searched.
         * 
         * @param flexWeekendIndicator
         */
        public void setFlexWeekendIndicator(Boolean flexWeekendIndicator) {
            this.flexWeekendIndicator = flexWeekendIndicator;
        }

        /** 
         * Get the 'FlexLevelIndicator' attribute value. If true, eligible for widest flex searches.
         * 
         * @return value
         */
        public Boolean getFlexLevelIndicator() {
            return flexLevelIndicator;
        }

        /** 
         * Set the 'FlexLevelIndicator' attribute value. If true, eligible for widest flex searches.
         * 
         * @param flexLevelIndicator
         */
        public void setFlexLevelIndicator(Boolean flexLevelIndicator) {
            this.flexLevelIndicator = flexLevelIndicator;
        }

        /** 
         * Get the 'NoFareBreakIndicator' attribute value. If true, no fare breaks in the itinerary apart from the turn point should be considered.
         * 
         * @return value
         */
        public Boolean getNoFareBreakIndicator() {
            return noFareBreakIndicator;
        }

        /** 
         * Set the 'NoFareBreakIndicator' attribute value. If true, no fare breaks in the itinerary apart from the turn point should be considered.
         * 
         * @param noFareBreakIndicator
         */
        public void setNoFareBreakIndicator(Boolean noFareBreakIndicator) {
            this.noFareBreakIndicator = noFareBreakIndicator;
        }

        /** 
         * Get the list of 'OriginDestinationRPHs' attribute items. Refers to specific origin destination information within this request message.
         * 
         * @return list
         */
        public List<String> getOriginDestinationRPHs() {
            return originDestinationRPHs;
        }

        /** 
         * Set the list of 'OriginDestinationRPHs' attribute items. Refers to specific origin destination information within this request message.
         * 
         * @param list
         */
        public void setOriginDestinationRPHs(List<String> list) {
            originDestinationRPHs = list;
        }

        /** 
         * Serializer for 'OriginDestinationRPHs' attribute list.
         * 
         * @param values
         * @return text
         */
        public static String serializeOriginDestinationRPHs(List<String> values) {
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
         * Deserializer for 'OriginDestinationRPHs' attribute list.
         * 
         * @param text
         * @return values
         * @throws org.jibx.runtime.JiBXException on conversion error
         */
        public static List<String> deserializeOriginDestinationRPHs(String text)
                throws org.jibx.runtime.JiBXException {
            org.jibx.runtime.IListItemDeserializer ldser = new org.jibx.runtime.IListItemDeserializer() {
                public java.lang.Object deserialize(String text) {
                    return text;
                }
            };
            return (List<String>) org.jibx.runtime.Utility.deserializeList(
                    text, ldser);
        }
        /** 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
         *   &lt;xs:restriction base="xs:string">
         *     &lt;xs:enumeration value="Outbound"/>
         *     &lt;xs:enumeration value="Return"/>
         *     &lt;xs:enumeration value="Both"/>
         *   &lt;/xs:restriction>
         * &lt;/xs:simpleType>
         * </pre>
         */
        public static enum FlexDatePref {
            /** 
             * Date is flexible on the outbound portion.
             */
            OUTBOUND("Outbound"), /** 
                                   * Date is flexible on the return portion.
                                   */
            RETURN("Return"), /** 
                               * Date is flexible on the entire journey.
                               */
            BOTH("Both");
            private final String value;

            private FlexDatePref(String value) {
                this.value = value;
            }

            public String xmlValue() {
                return value;
            }

            public static FlexDatePref convert(String value) {
                for (FlexDatePref inst : values()) {
                    if (inst.xmlValue().equals(value)) {
                        return inst;
                    }
                }
                return null;
            }
        }
    }
}
