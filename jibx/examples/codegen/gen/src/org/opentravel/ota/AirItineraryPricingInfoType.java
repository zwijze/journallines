
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Pricing Information for an Air Itinerary
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AirItineraryPricingInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:FareType" name="ItinTotalFare" minOccurs="0"/>
 *     &lt;xs:element name="PTC_FareBreakdowns" minOccurs="0">
 *       &lt;!-- Reference to inner class PTCFareBreakdowns -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="FareInfos" minOccurs="0">
 *       &lt;!-- Reference to inner class FareInfos -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="ns:PricingSourceType" use="optional" name="PricingSource"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AirItineraryPricingInfoType
{
    private FareType itinTotalFare;
    private PTCFareBreakdowns PTCFareBreakdowns1;
    private FareInfos fareInfos;
    private PricingSourceType pricingSource;

    /** 
     * Get the 'ItinTotalFare' element value. Total price of the itinerary
     * 
     * @return value
     */
    public FareType getItinTotalFare() {
        return itinTotalFare;
    }

    /** 
     * Set the 'ItinTotalFare' element value. Total price of the itinerary
     * 
     * @param itinTotalFare
     */
    public void setItinTotalFare(FareType itinTotalFare) {
        this.itinTotalFare = itinTotalFare;
    }

    /** 
     * Get the 'PTC_FareBreakdowns' element value.
     * 
     * @return value
     */
    public PTCFareBreakdowns getPTCFareBreakdowns1() {
        return PTCFareBreakdowns1;
    }

    /** 
     * Set the 'PTC_FareBreakdowns' element value.
     * 
     * @param PTCFareBreakdowns1
     */
    public void setPTCFareBreakdowns1(PTCFareBreakdowns PTCFareBreakdowns1) {
        this.PTCFareBreakdowns1 = PTCFareBreakdowns1;
    }

    /** 
     * Get the 'FareInfos' element value.
     * 
     * @return value
     */
    public FareInfos getFareInfos() {
        return fareInfos;
    }

    /** 
     * Set the 'FareInfos' element value.
     * 
     * @param fareInfos
     */
    public void setFareInfos(FareInfos fareInfos) {
        this.fareInfos = fareInfos;
    }

    /** 
     * Get the 'PricingSource' attribute value. Used to indicate whether the pricing is public or private
     * 
     * @return value
     */
    public PricingSourceType getPricingSource() {
        return pricingSource;
    }

    /** 
     * Set the 'PricingSource' attribute value. Used to indicate whether the pricing is public or private
     * 
     * @param pricingSource
     */
    public void setPricingSource(PricingSourceType pricingSource) {
        this.pricingSource = pricingSource;
    }
    /** 
     * This is a collection of PTC Fare Breakdowns
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PTC_FareBreakdowns" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="ns:PTCFareBreakdownType" name="PTC_FareBreakdown" maxOccurs="20"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class PTCFareBreakdowns
    {
        private List<PTCFareBreakdownType> PTCFareBreakdownList = new ArrayList<PTCFareBreakdownType>();

        /** 
         * Get the list of 'PTC_FareBreakdown' element items.  Per passenger type code pricing for a travel itinerary. 
         * 
         * @return list
         */
        public List<PTCFareBreakdownType> getPTCFareBreakdownList() {
            return PTCFareBreakdownList;
        }

        /** 
         * Set the list of 'PTC_FareBreakdown' element items.  Per passenger type code pricing for a travel itinerary. 
         * 
         * @param list
         */
        public void setPTCFareBreakdownList(List<PTCFareBreakdownType> list) {
            PTCFareBreakdownList = list;
        }
    }
    /** 
     * This is a collection of FareInfo
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FareInfos" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="FareInfo" maxOccurs="10">
     *         &lt;!-- Reference to inner class FareInfo -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class FareInfos
    {
        private List<FareInfo> fareInfoList = new ArrayList<FareInfo>();

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
         * Detailed information on individual priced fares
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FareInfo" maxOccurs="10">
         *   &lt;xs:complexType>
         *     &lt;xs:complexContent>
         *       &lt;xs:extension base="ns:FareInfoType">
         *         &lt;xs:sequence>
         *           &lt;xs:element ref="ns:TPA_Extensions" minOccurs="0"/>
         *         &lt;/xs:sequence>
         *       &lt;/xs:extension>
         *     &lt;/xs:complexContent>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class FareInfo extends FareInfoType
        {
            private TPAExtensionsType TPAExtensions;

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
        }
    }
}
