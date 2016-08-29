
package org.opentravel.ota;

import java.math.BigDecimal;

/** 
 * Contains details pertaining to commissions.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CommissionType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:UniqueID_Type" name="UniqueID" minOccurs="0"/>
 *     &lt;xs:element name="CommissionableAmount" minOccurs="0">
 *       &lt;!-- Reference to inner class CommissionableAmount -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="PrepaidAmount" minOccurs="0">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element name="FlatCommission" minOccurs="0">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element name="CommissionPayableAmount" minOccurs="0">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:ParagraphType" name="Comment" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute use="optional" name="StatusType">
 *     &lt;xs:simpleType>
 *       &lt;!-- Reference to inner class StatusType -->
 *     &lt;/xs:simpleType>
 *   &lt;/xs:attribute>
 *   &lt;xs:attribute type="xs:decimal" use="optional" name="Percent"/>
 *   &lt;xs:attributeGroup ref="ns:CurrencyCodeGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ReasonCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="BillToID"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Frequency"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="MaxCommissionUnitApplies"/>
 *   &lt;xs:attribute type="xs:decimal" use="optional" name="CapAmount"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CommissionType
{
    private UniqueIDType uniqueID;
    private CommissionableAmount commissionableAmount;
    private CurrencyAmountGroup prepaidAmount;
    private CurrencyAmountGroup flatCommission;
    private CurrencyAmountGroup commissionPayableAmount;
    private ParagraphType comment;
    private StatusType statusType;
    private BigDecimal percent;
    private CurrencyCodeGroup currencyCodeGroup;
    private String reasonCode;
    private String billToID;
    private String frequency;
    private String maxCommissionUnitApplies;
    private BigDecimal capAmount;

    /** 
     * Get the 'UniqueID' element value. Identifies the recipient of the commission.
     * 
     * @return value
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /** 
     * Set the 'UniqueID' element value. Identifies the recipient of the commission.
     * 
     * @param uniqueID
     */
    public void setUniqueID(UniqueIDType uniqueID) {
        this.uniqueID = uniqueID;
    }

    /** 
     * Get the 'CommissionableAmount' element value.
     * 
     * @return value
     */
    public CommissionableAmount getCommissionableAmount() {
        return commissionableAmount;
    }

    /** 
     * Set the 'CommissionableAmount' element value.
     * 
     * @param commissionableAmount
     */
    public void setCommissionableAmount(
            CommissionableAmount commissionableAmount) {
        this.commissionableAmount = commissionableAmount;
    }

    /** 
     * Get the 'CurrencyAmountGroup' attributeGroup value. The amount of commission paid to the agency prior to the service being rendered.
     * 
     * @return value
     */
    public CurrencyAmountGroup getPrepaidAmount() {
        return prepaidAmount;
    }

    /** 
     * Set the 'CurrencyAmountGroup' attributeGroup value. The amount of commission paid to the agency prior to the service being rendered.
     * 
     * @param prepaidAmount
     */
    public void setPrepaidAmount(CurrencyAmountGroup prepaidAmount) {
        this.prepaidAmount = prepaidAmount;
    }

    /** 
     * Get the 'CurrencyAmountGroup' attributeGroup value. A fixed commission amount.  
     * 
     * @return value
     */
    public CurrencyAmountGroup getFlatCommission() {
        return flatCommission;
    }

    /** 
     * Set the 'CurrencyAmountGroup' attributeGroup value. A fixed commission amount.  
     * 
     * @param flatCommission
     */
    public void setFlatCommission(CurrencyAmountGroup flatCommission) {
        this.flatCommission = flatCommission;
    }

    /** 
     * Get the 'CurrencyAmountGroup' attributeGroup value. The amount of commission to be paid.
     * 
     * @return value
     */
    public CurrencyAmountGroup getCommissionPayableAmount() {
        return commissionPayableAmount;
    }

    /** 
     * Set the 'CurrencyAmountGroup' attributeGroup value. The amount of commission to be paid.
     * 
     * @param commissionPayableAmount
     */
    public void setCommissionPayableAmount(
            CurrencyAmountGroup commissionPayableAmount) {
        this.commissionPayableAmount = commissionPayableAmount;
    }

    /** 
     * Get the 'Comment' element value. Text related to the commission.
     * 
     * @return value
     */
    public ParagraphType getComment() {
        return comment;
    }

    /** 
     * Set the 'Comment' element value. Text related to the commission.
     * 
     * @param comment
     */
    public void setComment(ParagraphType comment) {
        this.comment = comment;
    }

    /** 
     * Get the 'StatusType' attribute value. Indicates the status of the commission payment itself (e.g. no-show indicates that a different commission may be applied if the reservation is not fulfilled).
     * 
     * @return value
     */
    public StatusType getStatusType() {
        return statusType;
    }

    /** 
     * Set the 'StatusType' attribute value. Indicates the status of the commission payment itself (e.g. no-show indicates that a different commission may be applied if the reservation is not fulfilled).
     * 
     * @param statusType
     */
    public void setStatusType(StatusType statusType) {
        this.statusType = statusType;
    }

    /** 
     * Get the 'Percent' attribute value. The percent applied to the commissionable amount to determine the commission payable amount.
     * 
     * @return value
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /** 
     * Set the 'Percent' attribute value. The percent applied to the commissionable amount to determine the commission payable amount.
     * 
     * @param percent
     */
    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    /** 
     * Get the 'CurrencyCodeGroup' attributeGroup value. Indicates the currency to be applied to the amounts located in the child elements.
     * 
     * @return value
     */
    public CurrencyCodeGroup getCurrencyCodeGroup() {
        return currencyCodeGroup;
    }

    /** 
     * Set the 'CurrencyCodeGroup' attributeGroup value. Indicates the currency to be applied to the amounts located in the child elements.
     * 
     * @param currencyCodeGroup
     */
    public void setCurrencyCodeGroup(CurrencyCodeGroup currencyCodeGroup) {
        this.currencyCodeGroup = currencyCodeGroup;
    }

    /** 
     * Get the 'ReasonCode' attribute value. Identifies the reason why a commission is not paid or not paid in full.
     * 
     * @return value
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /** 
     * Set the 'ReasonCode' attribute value. Identifies the reason why a commission is not paid or not paid in full.
     * 
     * @param reasonCode
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /** 
     * Get the 'BillToID' attribute value. Identifies who should be billed for the commission amount.
     * 
     * @return value
     */
    public String getBillToID() {
        return billToID;
    }

    /** 
     * Set the 'BillToID' attribute value. Identifies who should be billed for the commission amount.
     * 
     * @param billToID
     */
    public void setBillToID(String billToID) {
        this.billToID = billToID;
    }

    /** 
     * Get the 'Frequency' attribute value. This is the frequency at which the commission is applied (e.g. per stay, daily). Refer to OTA Code List Charge Type (CHG).
     * 
     * @return value
     */
    public String getFrequency() {
        return frequency;
    }

    /** 
     * Set the 'Frequency' attribute value. This is the frequency at which the commission is applied (e.g. per stay, daily). Refer to OTA Code List Charge Type (CHG).
     * 
     * @param frequency
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /** 
     * Get the 'MaxCommissionUnitApplies' attribute value. Maximum number of units for which the commission will be applied. This may be used in conjunction with the frequency attribute.
     * 
     * @return value
     */
    public String getMaxCommissionUnitApplies() {
        return maxCommissionUnitApplies;
    }

    /** 
     * Set the 'MaxCommissionUnitApplies' attribute value. Maximum number of units for which the commission will be applied. This may be used in conjunction with the frequency attribute.
     * 
     * @param maxCommissionUnitApplies
     */
    public void setMaxCommissionUnitApplies(String maxCommissionUnitApplies) {
        this.maxCommissionUnitApplies = maxCommissionUnitApplies;
    }

    /** 
     * Get the 'CapAmount' attribute value. The highest monetary value that may be paid for the commission.
     * 
     * @return value
     */
    public BigDecimal getCapAmount() {
        return capAmount;
    }

    /** 
     * Set the 'CapAmount' attribute value. The highest monetary value that may be paid for the commission.
     * 
     * @param capAmount
     */
    public void setCapAmount(BigDecimal capAmount) {
        this.capAmount = capAmount;
    }
    /** 
     * The amount on which commission is calculated.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CommissionableAmount" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
     *     &lt;xs:attribute type="xs:boolean" use="optional" name="TaxInclusiveIndicator"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class CommissionableAmount
    {
        private CurrencyAmountGroup currencyAmountGroup;
        private Boolean taxInclusiveIndicator;

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
         * Get the 'TaxInclusiveIndicator' attribute value. When true, indicates that the commission is calculated using the rate including tax. When false, indicates that the commission is calculated using the net rate.
         * 
         * @return value
         */
        public Boolean getTaxInclusiveIndicator() {
            return taxInclusiveIndicator;
        }

        /** 
         * Set the 'TaxInclusiveIndicator' attribute value. When true, indicates that the commission is calculated using the rate including tax. When false, indicates that the commission is calculated using the net rate.
         * 
         * @param taxInclusiveIndicator
         */
        public void setTaxInclusiveIndicator(Boolean taxInclusiveIndicator) {
            this.taxInclusiveIndicator = taxInclusiveIndicator;
        }
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:restriction base="xs:string">
     *     &lt;xs:enumeration value="Full"/>
     *     &lt;xs:enumeration value="Partial"/>
     *     &lt;xs:enumeration value="Non-paying"/>
     *     &lt;xs:enumeration value="No-show"/>
     *     &lt;xs:enumeration value="Adjustment"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum StatusType {
        /** 
         * Indicates full commission.
         */
        FULL("Full"), /** 
                       * Indicates partial commission.
                       */
        PARTIAL("Partial"), /** 
                             * Indicates no commission.
                             */
        NONPAYING("Non-paying"), /** 
                                  * Indicates customer did not use the reserved product or service and did not cancel. This "no show" may impact commission.
                                  */
        NOSHOW("No-show"), /** 
                            * Indicates the commission is being adjusted.
                            */
        ADJUSTMENT("Adjustment");
        private final String value;

        private StatusType(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static StatusType convert(String value) {
            for (StatusType inst : values()) {
                if (inst.xmlValue().equals(value)) {
                    return inst;
                }
            }
            return null;
        }
    }
}
