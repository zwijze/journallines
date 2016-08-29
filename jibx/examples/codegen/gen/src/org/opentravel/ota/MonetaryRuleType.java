
package org.opentravel.ota;

import java.math.BigDecimal;
import java.util.Date;

/** 
 * This defines the information pertaining to rules and amounts associated with these rules.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MonetaryRuleType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:string">
 *       &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
 *       &lt;xs:attribute type="xs:string" use="required" name="RuleType"/>
 *       &lt;xs:attribute type="xs:decimal" use="optional" name="Percent"/>
 *       &lt;xs:attribute type="xs:dateTime" use="optional" name="DateTime"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="PaymentType"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MonetaryRuleType
{
    private String string;
    private CurrencyAmountGroup currencyAmountGroup;
    private String ruleType;
    private BigDecimal percent;
    private Date dateTime;
    private String paymentType;

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
    public void setCurrencyAmountGroup(CurrencyAmountGroup currencyAmountGroup) {
        this.currencyAmountGroup = currencyAmountGroup;
    }

    /** 
     * Get the 'RuleType' attribute value. 
    			Refer to OTA Code List Rule Type (RUL).
    			
     * 
     * @return value
     */
    public String getRuleType() {
        return ruleType;
    }

    /** 
     * Set the 'RuleType' attribute value. 
    			Refer to OTA Code List Rule Type (RUL).
    			
     * 
     * @param ruleType
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    /** 
     * Get the 'Percent' attribute value.
     * 
     * @return value
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /** 
     * Set the 'Percent' attribute value.
     * 
     * @param percent
     */
    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    /** 
     * Get the 'DateTime' attribute value.
     * 
     * @return value
     */
    public Date getDateTime() {
        return dateTime;
    }

    /** 
     * Set the 'DateTime' attribute value.
     * 
     * @param dateTime
     */
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    /** 
     * Get the 'PaymentType' attribute value. 
    			Refer to OTA Code List Payment Type (PMT).
    			
     * 
     * @return value
     */
    public String getPaymentType() {
        return paymentType;
    }

    /** 
     * Set the 'PaymentType' attribute value. 
    			Refer to OTA Code List Payment Type (PMT).
    			
     * 
     * @param paymentType
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}
