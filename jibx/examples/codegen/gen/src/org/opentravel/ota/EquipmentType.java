
package org.opentravel.ota;

/** 
 * Specifies the aircraft equipment type.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="EquipmentType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:string">
 *       &lt;xs:attribute type="xs:string" use="required" name="AirEquipType"/>
 *       &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="ChangeofGauge"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class EquipmentType
{
    private String string;
    private String airEquipType;
    private Boolean changeofGauge;

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
     * Get the 'AirEquipType' attribute value. This is the 3 character IATA code.
     * 
     * @return value
     */
    public String getAirEquipType() {
        return airEquipType;
    }

    /** 
     * Set the 'AirEquipType' attribute value. This is the 3 character IATA code.
     * 
     * @param airEquipType
     */
    public void setAirEquipType(String airEquipType) {
        this.airEquipType = airEquipType;
    }

    /** 
     * Get the 'ChangeofGauge' attribute value. Indicates there is an equipment change.
     * 
     * @return value
     */
    public Boolean getChangeofGauge() {
        return changeofGauge;
    }

    /** 
     * Set the 'ChangeofGauge' attribute value. Indicates there is an equipment change.
     * 
     * @param changeofGauge
     */
    public void setChangeofGauge(Boolean changeofGauge) {
        this.changeofGauge = changeofGauge;
    }
}
