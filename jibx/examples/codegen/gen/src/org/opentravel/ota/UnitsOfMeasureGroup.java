
package org.opentravel.ota;

import java.math.BigDecimal;

/** 
 * Provides measurement information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UnitsOfMeasureGroup">
 *   &lt;xs:attribute type="xs:decimal" use="optional" name="UnitOfMeasureQuantity"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="UnitOfMeasure"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="UnitOfMeasureCode"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class UnitsOfMeasureGroup
{
    private BigDecimal unitOfMeasureQuantity;
    private String unitOfMeasure;
    private String unitOfMeasureCode;

    /** 
     * Get the 'UnitOfMeasureQuantity' attribute value. This is the numeric value associated with the measurement.
     * 
     * @return value
     */
    public BigDecimal getUnitOfMeasureQuantity() {
        return unitOfMeasureQuantity;
    }

    /** 
     * Set the 'UnitOfMeasureQuantity' attribute value. This is the numeric value associated with the measurement.
     * 
     * @param unitOfMeasureQuantity
     */
    public void setUnitOfMeasureQuantity(BigDecimal unitOfMeasureQuantity) {
        this.unitOfMeasureQuantity = unitOfMeasureQuantity;
    }

    /** 
     * Get the 'UnitOfMeasure' attribute value. This is the standard unit of measure name (e.g., it could be generic such as metric or imperial or specific such as inches, feet, yards, miles, millimeters, centimeters, meters, kilometers- according to usage). 
     * 
     * @return value
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /** 
     * Set the 'UnitOfMeasure' attribute value. This is the standard unit of measure name (e.g., it could be generic such as metric or imperial or specific such as inches, feet, yards, miles, millimeters, centimeters, meters, kilometers- according to usage). 
     * 
     * @param unitOfMeasure
     */
    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    /** 
     * Get the 'UnitOfMeasureCode' attribute value. The unit of measure in a code format (e.g., inches, pixels, centimeters). Refer to OTA Code List Unit of Measure Code (UOM).
     * 
     * @return value
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /** 
     * Set the 'UnitOfMeasureCode' attribute value. The unit of measure in a code format (e.g., inches, pixels, centimeters). Refer to OTA Code List Unit of Measure Code (UOM).
     * 
     * @param unitOfMeasureCode
     */
    public void setUnitOfMeasureCode(String unitOfMeasureCode) {
        this.unitOfMeasureCode = unitOfMeasureCode;
    }
}
