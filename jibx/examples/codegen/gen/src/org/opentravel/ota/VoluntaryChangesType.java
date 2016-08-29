
package org.opentravel.ota;

import java.math.BigDecimal;

/** 
 * Specifies charges and/or penalties associated with making ticket changes after purchase.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="VoluntaryChangesType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="Penalty" minOccurs="0">
 *       &lt;!-- Reference to inner class Penalty -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="VolChangeInd"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class VoluntaryChangesType
{
    private Penalty penalty;
    private Boolean volChangeInd;

    /** 
     * Get the 'Penalty' element value.
     * 
     * @return value
     */
    public Penalty getPenalty() {
        return penalty;
    }

    /** 
     * Set the 'Penalty' element value.
     * 
     * @param penalty
     */
    public void setPenalty(Penalty penalty) {
        this.penalty = penalty;
    }

    /** 
     * Get the 'VolChangeInd' attribute value. Indicator used to specify whether voluntary change and other penalties are involved in the search or response.
     * 
     * @return value
     */
    public Boolean getVolChangeInd() {
        return volChangeInd;
    }

    /** 
     * Set the 'VolChangeInd' attribute value. Indicator used to specify whether voluntary change and other penalties are involved in the search or response.
     * 
     * @param volChangeInd
     */
    public void setVolChangeInd(Boolean volChangeInd) {
        this.volChangeInd = volChangeInd;
    }
    /** 
     * Specifies penalty charges as either a currency amount or a percentage of the fare
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Penalty" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:attribute type="xs:string" use="optional" name="PenaltyType"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="DepartureStatus"/>
     *     &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
     *     &lt;xs:attribute type="xs:decimal" name="Percent"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Penalty
    {
        private String penaltyType;
        private String departureStatus;
        private CurrencyAmountGroup currencyAmountGroup;
        private BigDecimal percent;

        /** 
         * Get the 'PenaltyType' attribute value.  Indicates the type of penalty involved in the search or response.
         * 
         * @return value
         */
        public String getPenaltyType() {
            return penaltyType;
        }

        /** 
         * Set the 'PenaltyType' attribute value.  Indicates the type of penalty involved in the search or response.
         * 
         * @param penaltyType
         */
        public void setPenaltyType(String penaltyType) {
            this.penaltyType = penaltyType;
        }

        /** 
         * Get the 'DepartureStatus' attribute value. Identifier used to indicate whether the change occurs before or after departure from the origin city.
         * 
         * @return value
         */
        public String getDepartureStatus() {
            return departureStatus;
        }

        /** 
         * Set the 'DepartureStatus' attribute value. Identifier used to indicate whether the change occurs before or after departure from the origin city.
         * 
         * @param departureStatus
         */
        public void setDepartureStatus(String departureStatus) {
            this.departureStatus = departureStatus;
        }

        /** 
         * Get the 'CurrencyAmountGroup' attributeGroup value. The penalty charge defined a fee in terms of its amount, currency and decimal laces.
         * 
         * @return value
         */
        public CurrencyAmountGroup getCurrencyAmountGroup() {
            return currencyAmountGroup;
        }

        /** 
         * Set the 'CurrencyAmountGroup' attributeGroup value. The penalty charge defined a fee in terms of its amount, currency and decimal laces.
         * 
         * @param currencyAmountGroup
         */
        public void setCurrencyAmountGroup(
                CurrencyAmountGroup currencyAmountGroup) {
            this.currencyAmountGroup = currencyAmountGroup;
        }

        /** 
         * Get the 'Percent' attribute value. The penalty charge conveyed as a percent of the total fare. 
         * 
         * @return value
         */
        public BigDecimal getPercent() {
            return percent;
        }

        /** 
         * Set the 'Percent' attribute value. The penalty charge conveyed as a percent of the total fare. 
         * 
         * @param percent
         */
        public void setPercent(BigDecimal percent) {
            this.percent = percent;
        }
    }
}
