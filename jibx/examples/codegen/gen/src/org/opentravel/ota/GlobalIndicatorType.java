
package org.opentravel.ota;

/** 
 * Specifies the global travel area.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GlobalIndicatorType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="AP"/>
 *     &lt;xs:enumeration value="AT"/>
 *     &lt;xs:enumeration value="CT"/>
 *     &lt;xs:enumeration value="DO"/>
 *     &lt;xs:enumeration value="EH"/>
 *     &lt;xs:enumeration value="FE"/>
 *     &lt;xs:enumeration value="PA"/>
 *     &lt;xs:enumeration value="PN"/>
 *     &lt;xs:enumeration value="PO"/>
 *     &lt;xs:enumeration value="RU"/>
 *     &lt;xs:enumeration value="RW"/>
 *     &lt;xs:enumeration value="SA"/>
 *     &lt;xs:enumeration value="TS"/>
 *     &lt;xs:enumeration value="WH"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum GlobalIndicatorType {
    /** 
     * Atlantic/Pacific Round-the-World
     */
    AP, /** 
         * Atlantic Ocean
         */
    AT, /** 
         * Circle trip


         */
    CT, /** 
         * Domestic


         */
    DO, /** 
         * Eastern Hemisphere
         */
    EH, /** 
         * Within the Far East


         */
    FE, /** 
         * Pacific Ocean
         */
    PA, /** 
         * TC1-TC3 via Pacific/N. America


         */
    PN, /** 
         * Polar Route
         */
    PO, /** 
         * Russia Area 3


         */
    RU, /** 
         * Round the world


         */
    RW, /** 
         * South Atlantic only
         */
    SA, /** 
         * Trans Siberia Route
         */
    TS, /** 
         * Western Hemisphere
         */
    WH
}
