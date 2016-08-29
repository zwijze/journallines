
package org.opentravel.ota;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/** 
 * Rules for this priced option. 
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FareInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:dateTime" name="DepartureDate" minOccurs="0"/>
 *     &lt;xs:element name="FareReference" minOccurs="0" maxOccurs="5">
 *       &lt;!-- Reference to inner class FareReference -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="RuleInfo" minOccurs="0">
 *       &lt;!-- Reference to inner class RuleInfo -->
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:CompanyNameType" name="FilingAirline" minOccurs="0"/>
 *     &lt;xs:element type="ns:CompanyNameType" name="MarketingAirline" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:LocationType" name="DepartureAirport"/>
 *     &lt;xs:element type="ns:LocationType" name="ArrivalAirport"/>
 *     &lt;xs:element name="Date" minOccurs="0" maxOccurs="5">
 *       &lt;!-- Reference to inner class Date -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="FareInfo" minOccurs="0" maxOccurs="15">
 *       &lt;!-- Reference to inner class FareInfo -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:NegotiatedFareAttributes"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="CurrencyCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="TariffNumber"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="RuleNumber"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FareInfoType
{
    private java.util.Date departureDate;
    private List<FareReference> fareReferenceList = new ArrayList<FareReference>();
    private RuleInfo ruleInfo;
    private CompanyNameType filingAirline;
    private List<CompanyNameType> marketingAirlineList = new ArrayList<CompanyNameType>();
    private LocationType departureAirport;
    private LocationType arrivalAirport;
    private List<Date> dateList = new ArrayList<Date>();
    private List<FareInfo> fareInfoList = new ArrayList<FareInfo>();
    private NegotiatedFareAttributes negotiatedFareAttributes;
    private String currencyCode;
    private String tariffNumber;
    private String ruleNumber;

    /** 
     * Get the 'DepartureDate' element value. Departure Date for this priced fare
     * 
     * @return value
     */
    public java.util.Date getDepartureDate() {
        return departureDate;
    }

    /** 
     * Set the 'DepartureDate' element value. Departure Date for this priced fare
     * 
     * @param departureDate
     */
    public void setDepartureDate(java.util.Date departureDate) {
        this.departureDate = departureDate;
    }

    /** 
     * Get the list of 'FareReference' element items.
     * 
     * @return list
     */
    public List<FareReference> getFareReferenceList() {
        return fareReferenceList;
    }

    /** 
     * Set the list of 'FareReference' element items.
     * 
     * @param list
     */
    public void setFareReferenceList(List<FareReference> list) {
        fareReferenceList = list;
    }

    /** 
     * Get the 'RuleInfo' element value.
     * 
     * @return value
     */
    public RuleInfo getRuleInfo() {
        return ruleInfo;
    }

    /** 
     * Set the 'RuleInfo' element value.
     * 
     * @param ruleInfo
     */
    public void setRuleInfo(RuleInfo ruleInfo) {
        this.ruleInfo = ruleInfo;
    }

    /** 
     * Get the 'FilingAirline' element value. The airline that filed the fare(s).
     * 
     * @return value
     */
    public CompanyNameType getFilingAirline() {
        return filingAirline;
    }

    /** 
     * Set the 'FilingAirline' element value. The airline that filed the fare(s).
     * 
     * @param filingAirline
     */
    public void setFilingAirline(CompanyNameType filingAirline) {
        this.filingAirline = filingAirline;
    }

    /** 
     * Get the list of 'MarketingAirline' element items. The marketing airline.
     * 
     * @return list
     */
    public List<CompanyNameType> getMarketingAirlineList() {
        return marketingAirlineList;
    }

    /** 
     * Set the list of 'MarketingAirline' element items. The marketing airline.
     * 
     * @param list
     */
    public void setMarketingAirlineList(List<CompanyNameType> list) {
        marketingAirlineList = list;
    }

    /** 
     * Get the 'DepartureAirport' element value. Departure point of flight segment.
     * 
     * @return value
     */
    public LocationType getDepartureAirport() {
        return departureAirport;
    }

    /** 
     * Set the 'DepartureAirport' element value. Departure point of flight segment.
     * 
     * @param departureAirport
     */
    public void setDepartureAirport(LocationType departureAirport) {
        this.departureAirport = departureAirport;
    }

    /** 
     * Get the 'ArrivalAirport' element value. Arrival point of flight segment.
     * 
     * @return value
     */
    public LocationType getArrivalAirport() {
        return arrivalAirport;
    }

    /** 
     * Set the 'ArrivalAirport' element value. Arrival point of flight segment.
     * 
     * @param arrivalAirport
     */
    public void setArrivalAirport(LocationType arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    /** 
     * Get the list of 'Date' element items.
     * 
     * @return list
     */
    public List<Date> getDateList() {
        return dateList;
    }

    /** 
     * Set the list of 'Date' element items.
     * 
     * @param list
     */
    public void setDateList(List<Date> list) {
        dateList = list;
    }

    /** 
     * Get the list of 'FareInfo' element items.
     * 
     * @return list
     */
    public List<FareInfo> getFareInfoList() {
        return fareInfoList;
    }

    /** 
     * Set the list of 'FareInfo' element items.
     * 
     * @param list
     */
    public void setFareInfoList(List<FareInfo> list) {
        fareInfoList = list;
    }

    /** 
     * Get the 'NegotiatedFareAttributes' attributeGroup value.
     * 
     * @return value
     */
    public NegotiatedFareAttributes getNegotiatedFareAttributes() {
        return negotiatedFareAttributes;
    }

    /** 
     * Set the 'NegotiatedFareAttributes' attributeGroup value.
     * 
     * @param negotiatedFareAttributes
     */
    public void setNegotiatedFareAttributes(
            NegotiatedFareAttributes negotiatedFareAttributes) {
        this.negotiatedFareAttributes = negotiatedFareAttributes;
    }

    /** 
     * Get the 'CurrencyCode' attribute value. The ISO 4217 currency code associated with the fare rule information.

     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' attribute value. The ISO 4217 currency code associated with the fare rule information.

     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'TariffNumber' attribute value. The tariff number for the rule.
     * 
     * @return value
     */
    public String getTariffNumber() {
        return tariffNumber;
    }

    /** 
     * Set the 'TariffNumber' attribute value. The tariff number for the rule.
     * 
     * @param tariffNumber
     */
    public void setTariffNumber(String tariffNumber) {
        this.tariffNumber = tariffNumber;
    }

    /** 
     * Get the 'RuleNumber' attribute value. The number associated with the fare rule.

     * 
     * @return value
     */
    public String getRuleNumber() {
        return ruleNumber;
    }

    /** 
     * Set the 'RuleNumber' attribute value. The number associated with the fare rule.

     * 
     * @param ruleNumber
     */
    public void setRuleNumber(String ruleNumber) {
        this.ruleNumber = ruleNumber;
    }
    /** 
     * Used to provide the fare basis code, the fare class code, and/or ticket designator. 
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FareReference" minOccurs="0" maxOccurs="5">
     *   &lt;xs:complexType>
     *     &lt;xs:simpleContent>
     *       &lt;xs:extension base="xs:string">
     *         &lt;xs:attribute type="xs:string" use="optional" name="ResBookDesigCode"/>
     *         &lt;xs:attribute type="xs:string" use="optional" name="TicketDesignatorCode"/>
     *         &lt;xs:attribute type="xs:string" use="optional" name="AccountCode"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:simpleContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class FareReference
    {
        private String string;
        private String resBookDesigCode;
        private String ticketDesignatorCode;
        private String accountCode;

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
         * Get the 'ResBookDesigCode' attribute value. Identifies the class of service for the specified fare basis code.
         * 
         * @return value
         */
        public String getResBookDesigCode() {
            return resBookDesigCode;
        }

        /** 
         * Set the 'ResBookDesigCode' attribute value. Identifies the class of service for the specified fare basis code.
         * 
         * @param resBookDesigCode
         */
        public void setResBookDesigCode(String resBookDesigCode) {
            this.resBookDesigCode = resBookDesigCode;
        }

        /** 
         * Get the 'TicketDesignatorCode' attribute value. Specifies the discount code applicable to the fare that is associated with this fare basis code.
         * 
         * @return value
         */
        public String getTicketDesignatorCode() {
            return ticketDesignatorCode;
        }

        /** 
         * Set the 'TicketDesignatorCode' attribute value. Specifies the discount code applicable to the fare that is associated with this fare basis code.
         * 
         * @param ticketDesignatorCode
         */
        public void setTicketDesignatorCode(String ticketDesignatorCode) {
            this.ticketDesignatorCode = ticketDesignatorCode;
        }

        /** 
         * Get the 'AccountCode' attribute value. A code to uniquely identify a fare account.
         * 
         * @return value
         */
        public String getAccountCode() {
            return accountCode;
        }

        /** 
         * Set the 'AccountCode' attribute value. A code to uniquely identify a fare account.
         * 
         * @param accountCode
         */
        public void setAccountCode(String accountCode) {
            this.accountCode = accountCode;
        }
    }
    /** 
     * Information regarding restrictions governing use of the fare.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RuleInfo" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:RuleInfoType">
     *         &lt;xs:attribute type="ns:AirTripType" use="optional" name="TripType"/>
     *         &lt;xs:attribute type="xs:boolean" use="optional" name="MoneySaverInd"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class RuleInfo extends RuleInfoType
    {
        private AirTripType tripType;
        private Boolean moneySaverInd;

        /** 
         * Get the 'TripType' attribute value. To specify if the trip is one way or roundtrip. 

         * 
         * @return value
         */
        public AirTripType getTripType() {
            return tripType;
        }

        /** 
         * Set the 'TripType' attribute value. To specify if the trip is one way or roundtrip. 

         * 
         * @param tripType
         */
        public void setTripType(AirTripType tripType) {
            this.tripType = tripType;
        }

        /** 
         * Get the 'MoneySaverInd' attribute value. If true, the fare rule being requested is for all airline fares for the specified city pair. If false, it is not.

         * 
         * @return value
         */
        public Boolean getMoneySaverInd() {
            return moneySaverInd;
        }

        /** 
         * Set the 'MoneySaverInd' attribute value. If true, the fare rule being requested is for all airline fares for the specified city pair. If false, it is not.

         * 
         * @param moneySaverInd
         */
        public void setMoneySaverInd(Boolean moneySaverInd) {
            this.moneySaverInd = moneySaverInd;
        }
    }
    /** 
     * Date information applicable to the fare rules.

     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Date" minOccurs="0" maxOccurs="5">
     *   &lt;xs:complexType>
     *     &lt;xs:attribute type="xs:string" use="optional" name="Date"/>
     *     &lt;xs:attribute use="optional" name="Type">
     *       &lt;xs:simpleType>
     *         &lt;!-- Reference to inner class Type -->
     *       &lt;/xs:simpleType>
     *     &lt;/xs:attribute>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Date
    {
        private String date;
        private Type type;

        /** 
         * Get the 'Date' attribute value. The applicable date for the purpose specified in the Type attribute.
         * 
         * @return value
         */
        public String getDate() {
            return date;
        }

        /** 
         * Set the 'Date' attribute value. The applicable date for the purpose specified in the Type attribute.
         * 
         * @param date
         */
        public void setDate(String date) {
            this.date = date;
        }

        /** 
         * Get the 'Type' attribute value. Specifies the type of date.
         * 
         * @return value
         */
        public Type getType() {
            return type;
        }

        /** 
         * Set the 'Type' attribute value. Specifies the type of date.
         * 
         * @param type
         */
        public void setType(Type type) {
            this.type = type;
        }
        /** 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
         *   &lt;xs:restriction base="xs:string">
         *     &lt;xs:enumeration value="LastRuleChange"/>
         *     &lt;xs:enumeration value="RuleBecomesInvalid"/>
         *     &lt;xs:enumeration value="RestrictiveFareEffective"/>
         *     &lt;xs:enumeration value="RestrictiveFareDiscontinue"/>
         *   &lt;/xs:restriction>
         * &lt;/xs:simpleType>
         * </pre>
         */
        public static enum Type {
            /** 
             * The last date the rule was changed.
             */
            LAST_RULE_CHANGE("LastRuleChange"), /** 
                                                 * The date after which the rule is no longer valid.
                                                 */
            RULE_BECOMES_INVALID("RuleBecomesInvalid"), /** 
                                                         * The date on which the restrictive fare becomes effective.
                                                         */
            RESTRICTIVE_FARE_EFFECTIVE("RestrictiveFareEffective"), /** 
                                                                     * The date on which the restrictive fare is discontinued.

                                                                     */
            RESTRICTIVE_FARE_DISCONTINUE("RestrictiveFareDiscontinue");
            private final String value;

            private Type(String value) {
                this.value = value;
            }

            public String xmlValue() {
                return value;
            }

            public static Type convert(String value) {
                for (Type inst : values()) {
                    if (inst.xmlValue().equals(value)) {
                        return inst;
                    }
                }
                return null;
            }
        }
    }
    /** 
     * Fares and related information for this fare rule.

     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FareInfo" minOccurs="0" maxOccurs="15">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="Date" minOccurs="0" maxOccurs="5">
     *         &lt;!-- Reference to inner class Date -->
     *       &lt;/xs:element>
     *       &lt;xs:element name="Fare" minOccurs="0">
     *         &lt;!-- Reference to inner class Fare -->
     *       &lt;/xs:element>
     *       &lt;xs:element name="PTC" minOccurs="0" maxOccurs="5">
     *         &lt;!-- Reference to inner class PTC -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *     &lt;xs:attribute type="xs:string" use="optional" name="FareBasisCode"/>
     *     &lt;xs:attribute type="ns:GlobalIndicatorType" use="optional" name="GlobalIndicatorCode"/>
     *     &lt;xs:attribute type="xs:integer" use="optional" name="MaximumPermittedMileage"/>
     *     &lt;xs:attribute type="ns:AirTripType" use="optional" name="TripType"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="FareType"/>
     *     &lt;xs:attribute type="ns:FareStatusType" use="optional" name="FareStatus"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class FareInfo
    {
        private List<Date> dateList = new ArrayList<Date>();
        private Fare fare;
        private List<PTC> PTCList = new ArrayList<PTC>();
        private String fareBasisCode;
        private GlobalIndicatorType globalIndicatorCode;
        private BigInteger maximumPermittedMileage;
        private AirTripType tripType;
        private String fareType;
        private FareStatusType fareStatus;

        /** 
         * Get the list of 'Date' element items.
         * 
         * @return list
         */
        public List<Date> getDateList() {
            return dateList;
        }

        /** 
         * Set the list of 'Date' element items.
         * 
         * @param list
         */
        public void setDateList(List<Date> list) {
            dateList = list;
        }

        /** 
         * Get the 'Fare' element value.
         * 
         * @return value
         */
        public Fare getFare() {
            return fare;
        }

        /** 
         * Set the 'Fare' element value.
         * 
         * @param fare
         */
        public void setFare(Fare fare) {
            this.fare = fare;
        }

        /** 
         * Get the list of 'PTC' element items.
         * 
         * @return list
         */
        public List<PTC> getPTCList() {
            return PTCList;
        }

        /** 
         * Set the list of 'PTC' element items.
         * 
         * @param list
         */
        public void setPTCList(List<PTC> list) {
            PTCList = list;
        }

        /** 
         * Get the 'FareBasisCode' attribute value. The fare basis code for the fare for this rule.

         * 
         * @return value
         */
        public String getFareBasisCode() {
            return fareBasisCode;
        }

        /** 
         * Set the 'FareBasisCode' attribute value. The fare basis code for the fare for this rule.

         * 
         * @param fareBasisCode
         */
        public void setFareBasisCode(String fareBasisCode) {
            this.fareBasisCode = fareBasisCode;
        }

        /** 
         * Get the 'GlobalIndicatorCode' attribute value. The global direction for this fare rule.

         * 
         * @return value
         */
        public GlobalIndicatorType getGlobalIndicatorCode() {
            return globalIndicatorCode;
        }

        /** 
         * Set the 'GlobalIndicatorCode' attribute value. The global direction for this fare rule.

         * 
         * @param globalIndicatorCode
         */
        public void setGlobalIndicatorCode(
                GlobalIndicatorType globalIndicatorCode) {
            this.globalIndicatorCode = globalIndicatorCode;
        }

        /** 
         * Get the 'MaximumPermittedMileage' attribute value. The maximum mileage (in miles) that can be travelled under this fare
        .
         * 
         * @return value
         */
        public BigInteger getMaximumPermittedMileage() {
            return maximumPermittedMileage;
        }

        /** 
         * Set the 'MaximumPermittedMileage' attribute value. The maximum mileage (in miles) that can be travelled under this fare
        .
         * 
         * @param maximumPermittedMileage
         */
        public void setMaximumPermittedMileage(
                BigInteger maximumPermittedMileage) {
            this.maximumPermittedMileage = maximumPermittedMileage;
        }

        /** 
         * Get the 'TripType' attribute value. Tthe type of trip associated with the rule.
         * 
         * @return value
         */
        public AirTripType getTripType() {
            return tripType;
        }

        /** 
         * Set the 'TripType' attribute value. Tthe type of trip associated with the rule.
         * 
         * @param tripType
         */
        public void setTripType(AirTripType tripType) {
            this.tripType = tripType;
        }

        /** 
         * Get the 'FareType' attribute value. Specifies the fare type for this fare.
         * 
         * @return value
         */
        public String getFareType() {
            return fareType;
        }

        /** 
         * Set the 'FareType' attribute value. Specifies the fare type for this fare.
         * 
         * @param fareType
         */
        public void setFareType(String fareType) {
            this.fareType = fareType;
        }

        /** 
         * Get the 'FareStatus' attribute value. Identifies whether the fare was constructed, published, created, etc.
         * 
         * @return value
         */
        public FareStatusType getFareStatus() {
            return fareStatus;
        }

        /** 
         * Set the 'FareStatus' attribute value. Identifies whether the fare was constructed, published, created, etc.
         * 
         * @param fareStatus
         */
        public void setFareStatus(FareStatusType fareStatus) {
            this.fareStatus = fareStatus;
        }
        /** 
         * Date information applicable to the fare.
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Date" minOccurs="0" maxOccurs="5">
         *   &lt;xs:complexType>
         *     &lt;xs:attribute type="xs:string" use="optional" name="Date"/>
         *     &lt;xs:attribute use="optional" name="Type">
         *       &lt;xs:simpleType>
         *         &lt;!-- Reference to inner class Type -->
         *       &lt;/xs:simpleType>
         *     &lt;/xs:attribute>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class Date
        {
            private String date;
            private Type type;

            /** 
             * Get the 'Date' attribute value. The applicable date for the purpose specified in the 
            Type attribute.
             * 
             * @return value
             */
            public String getDate() {
                return date;
            }

            /** 
             * Set the 'Date' attribute value. The applicable date for the purpose specified in the 
            Type attribute.
             * 
             * @param date
             */
            public void setDate(String date) {
                this.date = date;
            }

            /** 
             * Get the 'Type' attribute value.
             * 
             * @return value
             */
            public Type getType() {
                return type;
            }

            /** 
             * Set the 'Type' attribute value.
             * 
             * @param type
             */
            public void setType(Type type) {
                this.type = type;
            }
            /** 
             * Schema fragment(s) for this class:
             * <pre>
             * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
             *   &lt;xs:restriction base="xs:string">
             *     &lt;xs:enumeration value="EffectiveTravel"/>
             *     &lt;xs:enumeration value="DiscontinueTravel"/>
             *     &lt;xs:enumeration value="FirstTicketing"/>
             *     &lt;xs:enumeration value="LastTicketing"/>
             *     &lt;xs:enumeration value="TravelCompletion"/>
             *   &lt;/xs:restriction>
             * &lt;/xs:simpleType>
             * </pre>
             */
            public static enum Type {
                /** 
                 * The first travel date for this fare.
                 */
                EFFECTIVE_TRAVEL("EffectiveTravel"), /** 
                                                      * The last travel date for this fare.
                                                      */
                DISCONTINUE_TRAVEL("DiscontinueTravel"), /** 
                                                          * The first date for ticketing.
                                                          */
                FIRST_TICKETING("FirstTicketing"), /** 
                                                    * The last date for ticketing.
                                                    */
                LAST_TICKETING("LastTicketing"), /** 
                                                  * The date by which travel must be completed.

                                                  */
                TRAVEL_COMPLETION("TravelCompletion");
                private final String value;

                private Type(String value) {
                    this.value = value;
                }

                public String xmlValue() {
                    return value;
                }

                public static Type convert(String value) {
                    for (Type inst : values()) {
                        if (inst.xmlValue().equals(value)) {
                            return inst;
                        }
                    }
                    return null;
                }
            }
        }
        /** 
         * The base and total fare and tax amounts associated with the rule.
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Fare" minOccurs="0">
         *   &lt;xs:complexType>
         *     &lt;xs:attribute type="xs:decimal" use="optional" name="BaseAmount"/>
         *     &lt;xs:attribute type="xs:decimal" use="optional" name="BaseNUC_Amount"/>
         *     &lt;xs:attribute type="xs:decimal" use="optional" name="TaxAmount"/>
         *     &lt;xs:attribute type="xs:decimal" use="optional" name="TotalFare"/>
         *     &lt;xs:attribute type="xs:string" use="optional" name="FareDescription"/>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class Fare
        {
            private BigDecimal baseAmount;
            private BigDecimal baseNUCAmount;
            private BigDecimal taxAmount;
            private BigDecimal totalFare;
            private String fareDescription;

            /** 
             * Get the 'BaseAmount' attribute value. The base amount of the fare.

             * 
             * @return value
             */
            public BigDecimal getBaseAmount() {
                return baseAmount;
            }

            /** 
             * Set the 'BaseAmount' attribute value. The base amount of the fare.

             * 
             * @param baseAmount
             */
            public void setBaseAmount(BigDecimal baseAmount) {
                this.baseAmount = baseAmount;
            }

            /** 
             * Get the 'BaseNUC_Amount' attribute value. The base neutral unit of construction amount.

             * 
             * @return value
             */
            public BigDecimal getBaseNUCAmount() {
                return baseNUCAmount;
            }

            /** 
             * Set the 'BaseNUC_Amount' attribute value. The base neutral unit of construction amount.

             * 
             * @param baseNUCAmount
             */
            public void setBaseNUCAmount(BigDecimal baseNUCAmount) {
                this.baseNUCAmount = baseNUCAmount;
            }

            /** 
             * Get the 'TaxAmount' attribute value. The tax amount for the fare associated to the rule.

             * 
             * @return value
             */
            public BigDecimal getTaxAmount() {
                return taxAmount;
            }

            /** 
             * Set the 'TaxAmount' attribute value. The tax amount for the fare associated to the rule.

             * 
             * @param taxAmount
             */
            public void setTaxAmount(BigDecimal taxAmount) {
                this.taxAmount = taxAmount;
            }

            /** 
             * Get the 'TotalFare' attribute value. The total fare associated to the rule.

             * 
             * @return value
             */
            public BigDecimal getTotalFare() {
                return totalFare;
            }

            /** 
             * Set the 'TotalFare' attribute value. The total fare associated to the rule.

             * 
             * @param totalFare
             */
            public void setTotalFare(BigDecimal totalFare) {
                this.totalFare = totalFare;
            }

            /** 
             * Get the 'FareDescription' attribute value. A description of the fare.

             * 
             * @return value
             */
            public String getFareDescription() {
                return fareDescription;
            }

            /** 
             * Set the 'FareDescription' attribute value. A description of the fare.

             * 
             * @param fareDescription
             */
            public void setFareDescription(String fareDescription) {
                this.fareDescription = fareDescription;
            }
        }
        /** 
         * The passenger types for which the fare is applicable.

         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PTC" minOccurs="0" maxOccurs="5">
         *   &lt;xs:complexType>
         *     &lt;xs:attribute type="xs:string" use="optional" name="PassengerTypeCode"/>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class PTC
        {
            private String passengerTypeCode;

            /** 
             * Get the 'PassengerTypeCode' attribute value. The passenger type code for this fare.

             * 
             * @return value
             */
            public String getPassengerTypeCode() {
                return passengerTypeCode;
            }

            /** 
             * Set the 'PassengerTypeCode' attribute value. The passenger type code for this fare.

             * 
             * @param passengerTypeCode
             */
            public void setPassengerTypeCode(String passengerTypeCode) {
                this.passengerTypeCode = passengerTypeCode;
            }
        }
    }
}
