
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * This complex type identifies payment cards that are acceptable for a specific form of payment, along with the ability to provide free text information regarding payment cards.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AcceptablePaymentCardsInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="AcceptablePaymentCards" minOccurs="0">
 *       &lt;!-- Reference to inner class AcceptablePaymentCards -->
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:FormattedTextType" name="Info" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AcceptablePaymentCardsInfoType
{
    private AcceptablePaymentCards acceptablePaymentCards;
    private FormattedTextType info;

    /** 
     * Get the 'AcceptablePaymentCards' element value.
     * 
     * @return value
     */
    public AcceptablePaymentCards getAcceptablePaymentCards() {
        return acceptablePaymentCards;
    }

    /** 
     * Set the 'AcceptablePaymentCards' element value.
     * 
     * @param acceptablePaymentCards
     */
    public void setAcceptablePaymentCards(
            AcceptablePaymentCards acceptablePaymentCards) {
        this.acceptablePaymentCards = acceptablePaymentCards;
    }

    /** 
     * Get the 'Info' element value. General information regarding the use of payment cards.
     * 
     * @return value
     */
    public FormattedTextType getInfo() {
        return info;
    }

    /** 
     * Set the 'Info' element value. General information regarding the use of payment cards.
     * 
     * @param info
     */
    public void setInfo(FormattedTextType info) {
        this.info = info;
    }
    /** 
     * A collection of payment cards that are acceptable as a form of payment.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AcceptablePaymentCards" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="AcceptablePaymentCard" maxOccurs="99">
     *         &lt;xs:complexType>
     *           &lt;xs:attributeGroup ref="ns:AcceptablePaymentCardGroup"/>
     *         &lt;/xs:complexType>
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class AcceptablePaymentCards
    {
        private List<AcceptablePaymentCardGroup> acceptablePaymentCardList = new ArrayList<AcceptablePaymentCardGroup>();

        /** 
         * Get the list of 'AcceptablePaymentCard' element items. Specific information of one payment card that is acceptable as a form of payment.
         * 
         * @return list
         */
        public List<AcceptablePaymentCardGroup> getAcceptablePaymentCardList() {
            return acceptablePaymentCardList;
        }

        /** 
         * Set the list of 'AcceptablePaymentCard' element items. Specific information of one payment card that is acceptable as a form of payment.
         * 
         * @param list
         */
        public void setAcceptablePaymentCardList(
                List<AcceptablePaymentCardGroup> list) {
            acceptablePaymentCardList = list;
        }
    }
}
