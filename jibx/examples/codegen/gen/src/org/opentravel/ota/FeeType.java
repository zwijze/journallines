
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Used for non-tax fees and charges (e.g. service charges) .
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FeeType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:TaxesType" name="Taxes" minOccurs="0"/>
 *     &lt;xs:element type="ns:ParagraphType" name="Description" minOccurs="0" maxOccurs="5"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:boolean" name="TaxInclusive"/>
 *   &lt;xs:attributeGroup ref="ns:FeeTaxGroup"/>
 *   &lt;xs:attributeGroup ref="ns:EffectiveExpireOptionalDateGroup"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="MandatoryIndicator"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="RPH"/>
 *   &lt;xs:attributeGroup ref="ns:ChargeUnitGroup"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="TaxableIndicator"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FeeType
{
    private TaxesType taxes;
    private List<ParagraphType> descriptionList = new ArrayList<ParagraphType>();
    private Boolean taxInclusive;
    private FeeTaxGroup feeTaxGroup;
    private EffectiveExpireOptionalDateGroup effectiveExpireOptionalDateGroup;
    private Boolean mandatoryIndicator;
    private String RPH;
    private ChargeUnitGroup chargeUnitGroup;
    private Boolean taxableIndicator;

    /** 
     * Get the 'Taxes' element value. Used for taxes on the associated fee.
     * 
     * @return value
     */
    public TaxesType getTaxes() {
        return taxes;
    }

    /** 
     * Set the 'Taxes' element value. Used for taxes on the associated fee.
     * 
     * @param taxes
     */
    public void setTaxes(TaxesType taxes) {
        this.taxes = taxes;
    }

    /** 
     * Get the list of 'Description' element items. Text description of the fees  in a given language.
     * 
     * @return list
     */
    public List<ParagraphType> getDescriptionList() {
        return descriptionList;
    }

    /** 
     * Set the list of 'Description' element items. Text description of the fees  in a given language.
     * 
     * @param list
     */
    public void setDescriptionList(List<ParagraphType> list) {
        descriptionList = list;
    }

    /** 
     * Get the 'TaxInclusive' attribute value. Indicates whether taxes are included when figuring the fees.	
     * 
     * @return value
     */
    public Boolean getTaxInclusive() {
        return taxInclusive;
    }

    /** 
     * Set the 'TaxInclusive' attribute value. Indicates whether taxes are included when figuring the fees.	
     * 
     * @param taxInclusive
     */
    public void setTaxInclusive(Boolean taxInclusive) {
        this.taxInclusive = taxInclusive;
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
     * Get the 'MandatoryIndicator' attribute value. When true, indicates the fee is mandatory. When false, the fee is not mandatory.
     * 
     * @return value
     */
    public Boolean getMandatoryIndicator() {
        return mandatoryIndicator;
    }

    /** 
     * Set the 'MandatoryIndicator' attribute value. When true, indicates the fee is mandatory. When false, the fee is not mandatory.
     * 
     * @param mandatoryIndicator
     */
    public void setMandatoryIndicator(Boolean mandatoryIndicator) {
        this.mandatoryIndicator = mandatoryIndicator;
    }

    /** 
     * Get the 'RPH' attribute value. An index code to identify an instance in a collection of like items.
     * 
     * @return value
     */
    public String getRPH() {
        return RPH;
    }

    /** 
     * Set the 'RPH' attribute value. An index code to identify an instance in a collection of like items.
     * 
     * @param RPH
     */
    public void setRPH(String RPH) {
        this.RPH = RPH;
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

    /** 
     * Get the 'TaxableIndicator' attribute value. When true, indicates that the fee is subject to tax.
     * 
     * @return value
     */
    public Boolean getTaxableIndicator() {
        return taxableIndicator;
    }

    /** 
     * Set the 'TaxableIndicator' attribute value. When true, indicates that the fee is subject to tax.
     * 
     * @param taxableIndicator
     */
    public void setTaxableIndicator(Boolean taxableIndicator) {
        this.taxableIndicator = taxableIndicator;
    }
}
