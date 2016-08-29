
package org.opentravel.ota;

/** 
 * Used to define the types of transportation offered.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TransportationsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:TransportationType" name="Transportations" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TransportationsType
{
    private TransportationType transportations;

    /** 
     * Get the 'Transportations' element value. Collection of directions to/from a specific location via various modes of transportation
     * 
     * @return value
     */
    public TransportationType getTransportations() {
        return transportations;
    }

    /** 
     * Set the 'Transportations' element value. Collection of directions to/from a specific location via various modes of transportation
     * 
     * @param transportations
     */
    public void setTransportations(TransportationType transportations) {
        this.transportations = transportations;
    }
}
