
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Collection of payment rules.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PaymentRulesType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:MonetaryRuleType" name="PaymentRule" maxOccurs="9"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PaymentRulesType
{
    private List<MonetaryRuleType> paymentRuleList = new ArrayList<MonetaryRuleType>();

    /** 
     * Get the list of 'PaymentRule' element items. One specific payment rule associated with this reservation.  For example, a date by which a deposit must be received.
     * 
     * @return list
     */
    public List<MonetaryRuleType> getPaymentRuleList() {
        return paymentRuleList;
    }

    /** 
     * Set the list of 'PaymentRule' element items. One specific payment rule associated with this reservation.  For example, a date by which a deposit must be received.
     * 
     * @param list
     */
    public void setPaymentRuleList(List<MonetaryRuleType> list) {
        paymentRuleList = list;
    }
}
