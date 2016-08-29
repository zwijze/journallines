
package org.opentravel.ota;

/** 
 * Specifies charge information by unit (e.g., room, person, item) and frequency (e.g., daily, weekly, stay).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ChargeUnitGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="ChargeUnit"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ChargeFrequency"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ChargeUnitExempt"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ChargeFrequencyExempt"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="MaxChargeUnitApplies"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="MaxChargeFrequencyApplies"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class ChargeUnitGroup
{
    private String chargeUnit;
    private String chargeFrequency;
    private String chargeUnitExempt;
    private String chargeFrequencyExempt;
    private String maxChargeUnitApplies;
    private String maxChargeFrequencyApplies;

    /** 
     * Get the 'ChargeUnit' attribute value. This is the unit for which the charge applies (e.g. room, person, seat). Refer to OTA Code List Charge Type (CHG).
     * 
     * @return value
     */
    public String getChargeUnit() {
        return chargeUnit;
    }

    /** 
     * Set the 'ChargeUnit' attribute value. This is the unit for which the charge applies (e.g. room, person, seat). Refer to OTA Code List Charge Type (CHG).
     * 
     * @param chargeUnit
     */
    public void setChargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit;
    }

    /** 
     * Get the 'ChargeFrequency' attribute value. This is the timeframe used to apply the charge during the course of the reservation (e.g. Daily, Weekly, Stay). Refer to OTA Code List Charge Type (CHG).
     * 
     * @return value
     */
    public String getChargeFrequency() {
        return chargeFrequency;
    }

    /** 
     * Set the 'ChargeFrequency' attribute value. This is the timeframe used to apply the charge during the course of the reservation (e.g. Daily, Weekly, Stay). Refer to OTA Code List Charge Type (CHG).
     * 
     * @param chargeFrequency
     */
    public void setChargeFrequency(String chargeFrequency) {
        this.chargeFrequency = chargeFrequency;
    }

    /** 
     * Get the 'ChargeUnitExempt' attribute value. Number of units permitted before charges are applied (e.g., more than 4 persons).
     * 
     * @return value
     */
    public String getChargeUnitExempt() {
        return chargeUnitExempt;
    }

    /** 
     * Set the 'ChargeUnitExempt' attribute value. Number of units permitted before charges are applied (e.g., more than 4 persons).
     * 
     * @param chargeUnitExempt
     */
    public void setChargeUnitExempt(String chargeUnitExempt) {
        this.chargeUnitExempt = chargeUnitExempt;
    }

    /** 
     * Get the 'ChargeFrequencyExempt' attribute value. ChargeFrequency exemptions before charges are applied (e.g. after 2 nights).
     * 
     * @return value
     */
    public String getChargeFrequencyExempt() {
        return chargeFrequencyExempt;
    }

    /** 
     * Set the 'ChargeFrequencyExempt' attribute value. ChargeFrequency exemptions before charges are applied (e.g. after 2 nights).
     * 
     * @param chargeFrequencyExempt
     */
    public void setChargeFrequencyExempt(String chargeFrequencyExempt) {
        this.chargeFrequencyExempt = chargeFrequencyExempt;
    }

    /** 
     * Get the 'MaxChargeUnitApplies' attribute value. Maximum number of Units for which the charge will be applied (e.g., waive charges above 10 rooms).
     * 
     * @return value
     */
    public String getMaxChargeUnitApplies() {
        return maxChargeUnitApplies;
    }

    /** 
     * Set the 'MaxChargeUnitApplies' attribute value. Maximum number of Units for which the charge will be applied (e.g., waive charges above 10 rooms).
     * 
     * @param maxChargeUnitApplies
     */
    public void setMaxChargeUnitApplies(String maxChargeUnitApplies) {
        this.maxChargeUnitApplies = maxChargeUnitApplies;
    }

    /** 
     * Get the 'MaxChargeFrequencyApplies' attribute value. Maximum number of times the charge will be applied (e.g. waive charges above 30 nights).
     * 
     * @return value
     */
    public String getMaxChargeFrequencyApplies() {
        return maxChargeFrequencyApplies;
    }

    /** 
     * Set the 'MaxChargeFrequencyApplies' attribute value. Maximum number of times the charge will be applied (e.g. waive charges above 30 nights).
     * 
     * @param maxChargeFrequencyApplies
     */
    public void setMaxChargeFrequencyApplies(String maxChargeFrequencyApplies) {
        this.maxChargeFrequencyApplies = maxChargeFrequencyApplies;
    }
}
