
package org.opentravel.ota;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/** 
 * To specify connection locations, preference level for each, min connection time, and whether location is specified for stopping or changing.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConnectionType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="ConnectionLocation" maxOccurs="9">
 *       &lt;!-- Reference to inner class ConnectionLocation -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ConnectionType
{
    private List<ConnectionLocation> connectionLocationList = new ArrayList<ConnectionLocation>();

    /** 
     * Get the list of 'ConnectionLocation' element items.
     * 
     * @return list
     */
    public List<ConnectionLocation> getConnectionLocationList() {
        return connectionLocationList;
    }

    /** 
     * Set the list of 'ConnectionLocation' element items.
     * 
     * @param list
     */
    public void setConnectionLocationList(List<ConnectionLocation> list) {
        connectionLocationList = list;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConnectionLocation" maxOccurs="9">
     *   &lt;xs:complexType>
     *     &lt;xs:simpleContent>
     *       &lt;xs:extension base="ns:LocationType">
     *         &lt;xs:attribute type="xs:boolean" use="optional" default="true" name="Inclusive"/>
     *         &lt;xs:attributeGroup ref="ns:PreferLevelGroup"/>
     *         &lt;xs:attribute type="xs:integer" use="optional" name="MinChangeTime"/>
     *         &lt;xs:attribute use="optional" name="ConnectionInfo">
     *           &lt;xs:simpleType>
     *             &lt;!-- Reference to inner class ConnectionInfo -->
     *           &lt;/xs:simpleType>
     *         &lt;/xs:attribute>
     *       &lt;/xs:extension>
     *     &lt;/xs:simpleContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * 
     * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PreferLevelGroup">
     *   &lt;xs:attribute type="ns:PreferLevelType" use="optional" default="Preferred" name="PreferLevel"/>
     * &lt;/xs:attributeGroup>
     * </pre>
     */
    public static class ConnectionLocation
    {
        private LocationType locationType;
        private Boolean inclusive;
        private PreferLevelType preferLevel;
        private BigInteger minChangeTime;
        private ConnectionInfo connectionInfo;

        /** 
         * Get the extension value.
         * 
         * @return value
         */
        public LocationType getLocationType() {
            return locationType;
        }

        /** 
         * Set the extension value.
         * 
         * @param locationType
         */
        public void setLocationType(LocationType locationType) {
            this.locationType = locationType;
        }

        /** 
         * Get the 'Inclusive' attribute value.
         * 
         * @return value
         */
        public Boolean getInclusive() {
            return inclusive;
        }

        /** 
         * Set the 'Inclusive' attribute value.
         * 
         * @param inclusive
         */
        public void setInclusive(Boolean inclusive) {
            this.inclusive = inclusive;
        }

        /** 
         * Get the 'PreferLevel' attribute value. Used to indicate a level of preference for an associated item.
         * 
         * @return value
         */
        public PreferLevelType getPreferLevel() {
            return preferLevel;
        }

        /** 
         * Set the 'PreferLevel' attribute value. Used to indicate a level of preference for an associated item.
         * 
         * @param preferLevel
         */
        public void setPreferLevel(PreferLevelType preferLevel) {
            this.preferLevel = preferLevel;
        }

        /** 
         * Get the 'MinChangeTime' attribute value. Number of minutes between connections.
         * 
         * @return value
         */
        public BigInteger getMinChangeTime() {
            return minChangeTime;
        }

        /** 
         * Set the 'MinChangeTime' attribute value. Number of minutes between connections.
         * 
         * @param minChangeTime
         */
        public void setMinChangeTime(BigInteger minChangeTime) {
            this.minChangeTime = minChangeTime;
        }

        /** 
         * Get the 'ConnectionInfo' attribute value.
         * 
         * @return value
         */
        public ConnectionInfo getConnectionInfo() {
            return connectionInfo;
        }

        /** 
         * Set the 'ConnectionInfo' attribute value.
         * 
         * @param connectionInfo
         */
        public void setConnectionInfo(ConnectionInfo connectionInfo) {
            this.connectionInfo = connectionInfo;
        }
        /** 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
         *   &lt;xs:restriction base="xs:string">
         *     &lt;xs:enumeration value="Via"/>
         *     &lt;xs:enumeration value="Stop"/>
         *     &lt;xs:enumeration value="Change"/>
         *   &lt;/xs:restriction>
         * &lt;/xs:simpleType>
         * </pre>
         */
        public static enum ConnectionInfo {
            VIA("Via"), STOP("Stop"), CHANGE("Change");
            private final String value;

            private ConnectionInfo(String value) {
                this.value = value;
            }

            public String xmlValue() {
                return value;
            }

            public static ConnectionInfo convert(String value) {
                for (ConnectionInfo inst : values()) {
                    if (inst.xmlValue().equals(value)) {
                        return inst;
                    }
                }
                return null;
            }
        }
    }
}
