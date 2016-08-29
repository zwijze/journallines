
package org.opentravel.ota;

import java.math.BigInteger;

/** 
 * The global direction and maximum permitted miles for the fare.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GlobalDirectionGroup">
 *   &lt;xs:attribute type="ns:GlobalIndicatorType" use="optional" name="GlobalIndicatorCode"/>
 *   &lt;xs:attribute type="xs:integer" use="optional" name="MaximumPermittedMileage"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="IncludeIndicator"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class GlobalDirectionGroup
{
    private GlobalIndicatorType globalIndicatorCode;
    private BigInteger maximumPermittedMileage;
    private Boolean includeIndicator;

    /** 
     * Get the 'GlobalIndicatorCode' attribute value. Indicates the global direction.
     * 
     * @return value
     */
    public GlobalIndicatorType getGlobalIndicatorCode() {
        return globalIndicatorCode;
    }

    /** 
     * Set the 'GlobalIndicatorCode' attribute value. Indicates the global direction.
     * 
     * @param globalIndicatorCode
     */
    public void setGlobalIndicatorCode(GlobalIndicatorType globalIndicatorCode) {
        this.globalIndicatorCode = globalIndicatorCode;
    }

    /** 
     * Get the 'MaximumPermittedMileage' attribute value. The maximum mileage (in miles) that can be travelled under this contract.
     * 
     * @return value
     */
    public BigInteger getMaximumPermittedMileage() {
        return maximumPermittedMileage;
    }

    /** 
     * Set the 'MaximumPermittedMileage' attribute value. The maximum mileage (in miles) that can be travelled under this contract.
     * 
     * @param maximumPermittedMileage
     */
    public void setMaximumPermittedMileage(BigInteger maximumPermittedMileage) {
        this.maximumPermittedMileage = maximumPermittedMileage;
    }

    /** 
     * Get the 'IncludeIndicator' attribute value. When true, the global direction can be used for travel. When false, the global direction cannot be used for travel.
     * 
     * @return value
     */
    public Boolean getIncludeIndicator() {
        return includeIndicator;
    }

    /** 
     * Set the 'IncludeIndicator' attribute value. When true, the global direction can be used for travel. When false, the global direction cannot be used for travel.
     * 
     * @param includeIndicator
     */
    public void setIncludeIndicator(Boolean includeIndicator) {
        this.includeIndicator = includeIndicator;
    }
}
