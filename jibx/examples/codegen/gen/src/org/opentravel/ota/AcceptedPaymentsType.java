
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Used to define the types of payments accepted.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AcceptedPaymentsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:PaymentFormType" name="AcceptedPayment" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AcceptedPaymentsType
{
    private List<PaymentFormType> acceptedPaymentList = new ArrayList<PaymentFormType>();

    /** 
     * Get the list of 'AcceptedPayment' element items.
     * 
     * @return list
     */
    public List<PaymentFormType> getAcceptedPaymentList() {
        return acceptedPaymentList;
    }

    /** 
     * Set the list of 'AcceptedPayment' element items.
     * 
     * @param list
     */
    public void setAcceptedPaymentList(List<PaymentFormType> list) {
        acceptedPaymentList = list;
    }
}
