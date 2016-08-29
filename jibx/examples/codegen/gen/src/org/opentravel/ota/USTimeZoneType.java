
package org.opentravel.ota;

/** 
 * Identifies a time zone within the United States
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="USTimeZoneType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="P"/>
 *     &lt;xs:enumeration value="M"/>
 *     &lt;xs:enumeration value="C"/>
 *     &lt;xs:enumeration value="E"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum USTimeZoneType {
    P, M, C, E
}
