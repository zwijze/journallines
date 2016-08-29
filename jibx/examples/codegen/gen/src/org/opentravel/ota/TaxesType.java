
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * A collection of taxes.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TaxesType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:TaxType" name="Tax" minOccurs="0" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TaxesType
{
    private List<TaxType> taxList = new ArrayList<TaxType>();
    private CurrencyAmountGroup currencyAmountGroup;

    /** 
     * Get the list of 'Tax' element items. An individual tax.
     * 
     * @return list
     */
    public List<TaxType> getTaxList() {
        return taxList;
    }

    /** 
     * Set the list of 'Tax' element items. An individual tax.
     * 
     * @param list
     */
    public void setTaxList(List<TaxType> list) {
        taxList = list;
    }

    /** 
     * Get the 'CurrencyAmountGroup' attributeGroup value. Used to provide a total of all the taxes.
     * 
     * @return value
     */
    public CurrencyAmountGroup getCurrencyAmountGroup() {
        return currencyAmountGroup;
    }

    /** 
     * Set the 'CurrencyAmountGroup' attributeGroup value. Used to provide a total of all the taxes.
     * 
     * @param currencyAmountGroup
     */
    public void setCurrencyAmountGroup(CurrencyAmountGroup currencyAmountGroup) {
        this.currencyAmountGroup = currencyAmountGroup;
    }
}
