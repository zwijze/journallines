
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Applicable tax element.  This element allows for both percentages and flat amounts. If one field is used, the other should be zero since logically, taxes should be calculated in only one of the two ways.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TaxType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:ParagraphType" name="TaxDescription" minOccurs="0" maxOccurs="5"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:FeeTaxGroup"/>
 *   &lt;xs:attributeGroup ref="ns:EffectiveExpireOptionalDateGroup"/>
 *   &lt;xs:attributeGroup ref="ns:ChargeUnitGroup"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TaxType
{
    private List<ParagraphType> taxDescriptionList = new ArrayList<ParagraphType>();
    private FeeTaxGroup feeTaxGroup;
    private EffectiveExpireOptionalDateGroup effectiveExpireOptionalDateGroup;
    private ChargeUnitGroup chargeUnitGroup;

    /** 
     * Get the list of 'TaxDescription' element items. Text description of the taxes in a given language.
     * 
     * @return list
     */
    public List<ParagraphType> getTaxDescriptionList() {
        return taxDescriptionList;
    }

    /** 
     * Set the list of 'TaxDescription' element items. Text description of the taxes in a given language.
     * 
     * @param list
     */
    public void setTaxDescriptionList(List<ParagraphType> list) {
        taxDescriptionList = list;
    }

    /** 
     * Get the 'FeeTaxGroup' attributeGroup value.
     * 
     * @return value
     */
    public FeeTaxGroup getFeeTaxGroup() {
        return feeTaxGroup;
    }

    /** 
     * Set the 'FeeTaxGroup' attributeGroup value.
     * 
     * @param feeTaxGroup
     */
    public void setFeeTaxGroup(FeeTaxGroup feeTaxGroup) {
        this.feeTaxGroup = feeTaxGroup;
    }

    /** 
     * Get the 'EffectiveExpireOptionalDateGroup' attributeGroup value.
     * 
     * @return value
     */
    public EffectiveExpireOptionalDateGroup getEffectiveExpireOptionalDateGroup() {
        return effectiveExpireOptionalDateGroup;
    }

    /** 
     * Set the 'EffectiveExpireOptionalDateGroup' attributeGroup value.
     * 
     * @param effectiveExpireOptionalDateGroup
     */
    public void setEffectiveExpireOptionalDateGroup(
            EffectiveExpireOptionalDateGroup effectiveExpireOptionalDateGroup) {
        this.effectiveExpireOptionalDateGroup = effectiveExpireOptionalDateGroup;
    }

    /** 
     * Get the 'ChargeUnitGroup' attributeGroup value. Specifies charge information by unit (e.g., room, person, item) and frequency (e.g., daily, weekly, stay).
     * 
     * @return value
     */
    public ChargeUnitGroup getChargeUnitGroup() {
        return chargeUnitGroup;
    }

    /** 
     * Set the 'ChargeUnitGroup' attributeGroup value. Specifies charge information by unit (e.g., room, person, item) and frequency (e.g., daily, weekly, stay).
     * 
     * @param chargeUnitGroup
     */
    public void setChargeUnitGroup(ChargeUnitGroup chargeUnitGroup) {
        this.chargeUnitGroup = chargeUnitGroup;
    }
}
