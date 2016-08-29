
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Holds a base fare, tax, total and currency information on a price
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FareType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="BaseFare" minOccurs="0">
 *       &lt;!-- Reference to inner class BaseFare -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="EquivFare" minOccurs="0">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element name="Taxes" minOccurs="0">
 *       &lt;!-- Reference to inner class Taxes -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="Fees" minOccurs="0">
 *       &lt;!-- Reference to inner class Fees -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="TotalFare" minOccurs="0">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element name="FareConstruction" minOccurs="0">
 *       &lt;!-- Reference to inner class FareConstruction -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="UnstructuredFareCalc" minOccurs="0">
 *       &lt;!-- Reference to inner class UnstructuredFareCalc -->
 *     &lt;/xs:element>
 *     &lt;xs:element ref="ns:TPA_Extensions" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:NegotiatedFareAttributes"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="TicketDesignatorCode"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FareType
{
    private BaseFare baseFare;
    private CurrencyAmountGroup equivFare;
    private Taxes taxes;
    private Fees fees;
    private CurrencyAmountGroup totalFare;
    private FareConstruction fareConstruction;
    private UnstructuredFareCalc unstructuredFareCalc;
    private TPAExtensionsType TPAExtensions;
    private NegotiatedFareAttributes negotiatedFareAttributes;
    private String ticketDesignatorCode;

    /** 
     * Get the 'BaseFare' element value.
     * 
     * @return value
     */
    public BaseFare getBaseFare() {
        return baseFare;
    }

    /** 
     * Set the 'BaseFare' element value.
     * 
     * @param baseFare
     */
    public void setBaseFare(BaseFare baseFare) {
        this.baseFare = baseFare;
    }

    /** 
     * Get the 'CurrencyAmountGroup' attributeGroup value. Price of the inventory excluding taxes and fees in the payable currency.
     * 
     * @return value
     */
    public CurrencyAmountGroup getEquivFare() {
        return equivFare;
    }

    /** 
     * Set the 'CurrencyAmountGroup' attributeGroup value. Price of the inventory excluding taxes and fees in the payable currency.
     * 
     * @param equivFare
     */
    public void setEquivFare(CurrencyAmountGroup equivFare) {
        this.equivFare = equivFare;
    }

    /** 
     * Get the 'Taxes' element value.
     * 
     * @return value
     */
    public Taxes getTaxes() {
        return taxes;
    }

    /** 
     * Set the 'Taxes' element value.
     * 
     * @param taxes
     */
    public void setTaxes(Taxes taxes) {
        this.taxes = taxes;
    }

    /** 
     * Get the 'Fees' element value.
     * 
     * @return value
     */
    public Fees getFees() {
        return fees;
    }

    /** 
     * Set the 'Fees' element value.
     * 
     * @param fees
     */
    public void setFees(Fees fees) {
        this.fees = fees;
    }

    /** 
     * Get the 'CurrencyAmountGroup' attributeGroup value. The total price that the passenger would pay (includes fare, taxes, fees)  
     * 
     * @return value
     */
    public CurrencyAmountGroup getTotalFare() {
        return totalFare;
    }

    /** 
     * Set the 'CurrencyAmountGroup' attributeGroup value. The total price that the passenger would pay (includes fare, taxes, fees)  
     * 
     * @param totalFare
     */
    public void setTotalFare(CurrencyAmountGroup totalFare) {
        this.totalFare = totalFare;
    }

    /** 
     * Get the 'FareConstruction' element value.
     * 
     * @return value
     */
    public FareConstruction getFareConstruction() {
        return fareConstruction;
    }

    /** 
     * Set the 'FareConstruction' element value.
     * 
     * @param fareConstruction
     */
    public void setFareConstruction(FareConstruction fareConstruction) {
        this.fareConstruction = fareConstruction;
    }

    /** 
     * Get the 'UnstructuredFareCalc' element value.
     * 
     * @return value
     */
    public UnstructuredFareCalc getUnstructuredFareCalc() {
        return unstructuredFareCalc;
    }

    /** 
     * Set the 'UnstructuredFareCalc' element value.
     * 
     * @param unstructuredFareCalc
     */
    public void setUnstructuredFareCalc(
            UnstructuredFareCalc unstructuredFareCalc) {
        this.unstructuredFareCalc = unstructuredFareCalc;
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
     * Get the 'NegotiatedFareAttributes' attributeGroup value.  Used to indicate a negotiated fare and, if so, the fare code.
     * 
     * @return value
     */
    public NegotiatedFareAttributes getNegotiatedFareAttributes() {
        return negotiatedFareAttributes;
    }

    /** 
     * Set the 'NegotiatedFareAttributes' attributeGroup value.  Used to indicate a negotiated fare and, if so, the fare code.
     * 
     * @param negotiatedFareAttributes
     */
    public void setNegotiatedFareAttributes(
            NegotiatedFareAttributes negotiatedFareAttributes) {
        this.negotiatedFareAttributes = negotiatedFareAttributes;
    }

    /** 
     * Get the 'TicketDesignatorCode' attribute value. Specifies a discount code applicable to the fare.
     * 
     * @return value
     */
    public String getTicketDesignatorCode() {
        return ticketDesignatorCode;
    }

    /** 
     * Set the 'TicketDesignatorCode' attribute value. Specifies a discount code applicable to the fare.
     * 
     * @param ticketDesignatorCode
     */
    public void setTicketDesignatorCode(String ticketDesignatorCode) {
        this.ticketDesignatorCode = ticketDesignatorCode;
    }
    /** 
     * Price of the inventory excluding taxes and fees.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BaseFare" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
     *     &lt;xs:attributeGroup ref="ns:ExchangeRateGroup"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class BaseFare
    {
        private CurrencyAmountGroup currencyAmountGroup;
        private ExchangeRateGroup exchangeRateGroup;

        /** 
         * Get the 'CurrencyAmountGroup' attributeGroup value.
         * 
         * @return value
         */
        public CurrencyAmountGroup getCurrencyAmountGroup() {
            return currencyAmountGroup;
        }

        /** 
         * Set the 'CurrencyAmountGroup' attributeGroup value.
         * 
         * @param currencyAmountGroup
         */
        public void setCurrencyAmountGroup(
                CurrencyAmountGroup currencyAmountGroup) {
            this.currencyAmountGroup = currencyAmountGroup;
        }

        /** 
         * Get the 'ExchangeRateGroup' attributeGroup value.
         * 
         * @return value
         */
        public ExchangeRateGroup getExchangeRateGroup() {
            return exchangeRateGroup;
        }

        /** 
         * Set the 'ExchangeRateGroup' attributeGroup value.
         * 
         * @param exchangeRateGroup
         */
        public void setExchangeRateGroup(ExchangeRateGroup exchangeRateGroup) {
            this.exchangeRateGroup = exchangeRateGroup;
        }
    }
    /** 
     * This is a collection of Taxes
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Taxes" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="ns:AirTaxType" name="Tax" maxOccurs="99"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Taxes
    {
        private List<AirTaxType> taxList = new ArrayList<AirTaxType>();

        /** 
         * Get the list of 'Tax' element items. Any individual tax applied to the fare
         * 
         * @return list
         */
        public List<AirTaxType> getTaxList() {
            return taxList;
        }

        /** 
         * Set the list of 'Tax' element items. Any individual tax applied to the fare
         * 
         * @param list
         */
        public void setTaxList(List<AirTaxType> list) {
            taxList = list;
        }
    }
    /** 
     * This is a collection of Fees
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Fees" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="ns:AirFeeType" name="Fee" maxOccurs="9"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Fees
    {
        private List<AirFeeType> feeList = new ArrayList<AirFeeType>();

        /** 
         * Get the list of 'Fee' element items. Any additional fee incurred by the passenger but not shown on the ticket.  
         * 
         * @return list
         */
        public List<AirFeeType> getFeeList() {
            return feeList;
        }

        /** 
         * Set the list of 'Fee' element items. Any additional fee incurred by the passenger but not shown on the ticket.  
         * 
         * @param list
         */
        public void setFeeList(List<AirFeeType> list) {
            feeList = list;
        }
    }
    /** 
     * Should not contain unstructured FareCalc data.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FareConstruction" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:attribute type="xs:boolean" use="optional" name="FormattedIndicator"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="Language"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="OriginCityCode"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="OriginCodeContext"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="DestinationCityCode"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="DestinationCodeContext"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class FareConstruction
    {
        private Boolean formattedIndicator;
        private String language;
        private String originCityCode;
        private String originCodeContext;
        private String destinationCityCode;
        private String destinationCodeContext;

        /** 
         * Get the 'FormattedIndicator' attribute value.
         * 
         * @return value
         */
        public Boolean getFormattedIndicator() {
            return formattedIndicator;
        }

        /** 
         * Set the 'FormattedIndicator' attribute value.
         * 
         * @param formattedIndicator
         */
        public void setFormattedIndicator(Boolean formattedIndicator) {
            this.formattedIndicator = formattedIndicator;
        }

        /** 
         * Get the 'Language' attribute value.
         * 
         * @return value
         */
        public String getLanguage() {
            return language;
        }

        /** 
         * Set the 'Language' attribute value.
         * 
         * @param language
         */
        public void setLanguage(String language) {
            this.language = language;
        }

        /** 
         * Get the 'OriginCityCode' attribute value.
         * 
         * @return value
         */
        public String getOriginCityCode() {
            return originCityCode;
        }

        /** 
         * Set the 'OriginCityCode' attribute value.
         * 
         * @param originCityCode
         */
        public void setOriginCityCode(String originCityCode) {
            this.originCityCode = originCityCode;
        }

        /** 
         * Get the 'OriginCodeContext' attribute value.
         * 
         * @return value
         */
        public String getOriginCodeContext() {
            return originCodeContext;
        }

        /** 
         * Set the 'OriginCodeContext' attribute value.
         * 
         * @param originCodeContext
         */
        public void setOriginCodeContext(String originCodeContext) {
            this.originCodeContext = originCodeContext;
        }

        /** 
         * Get the 'DestinationCityCode' attribute value.
         * 
         * @return value
         */
        public String getDestinationCityCode() {
            return destinationCityCode;
        }

        /** 
         * Set the 'DestinationCityCode' attribute value.
         * 
         * @param destinationCityCode
         */
        public void setDestinationCityCode(String destinationCityCode) {
            this.destinationCityCode = destinationCityCode;
        }

        /** 
         * Get the 'DestinationCodeContext' attribute value.
         * 
         * @return value
         */
        public String getDestinationCodeContext() {
            return destinationCodeContext;
        }

        /** 
         * Set the 'DestinationCodeContext' attribute value.
         * 
         * @param destinationCodeContext
         */
        public void setDestinationCodeContext(String destinationCodeContext) {
            this.destinationCodeContext = destinationCodeContext;
        }
    }
    /** 
     * Contains the fare calc information for the stored fare for the passenger. This field should not exceed 87 characters, 
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UnstructuredFareCalc" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:simpleContent>
     *       &lt;xs:extension base="xs:string">
     *         &lt;xs:attribute type="xs:string" use="optional" name="FareCalcMode"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:simpleContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class UnstructuredFareCalc
    {
        private String string;
        private String fareCalcMode;

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
         * Get the 'FareCalcMode' attribute value. Used to identify the method of pricing for this transaction (e.g., manual,  automated pricing). Should be 1 character in length.
         * 
         * @return value
         */
        public String getFareCalcMode() {
            return fareCalcMode;
        }

        /** 
         * Set the 'FareCalcMode' attribute value. Used to identify the method of pricing for this transaction (e.g., manual,  automated pricing). Should be 1 character in length.
         * 
         * @param fareCalcMode
         */
        public void setFareCalcMode(String fareCalcMode) {
            this.fareCalcMode = fareCalcMode;
        }
    }
}
