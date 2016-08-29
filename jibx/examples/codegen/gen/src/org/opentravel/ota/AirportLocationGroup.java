
package org.opentravel.ota;

/** 
 * Airport location includes 3 letter code, terminal and gate.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AirportLocationGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="LocationCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" default="IATA" name="CodeContext"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Terminal"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Gate"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class AirportLocationGroup
{
    private String locationCode;
    private String codeContext;
    private String terminal;
    private String gate;

    /** 
     * Get the 'LocationCode' attribute value.  Location code used to identify a specific airport.
     * 
     * @return value
     */
    public String getLocationCode() {
        return locationCode;
    }

    /** 
     * Set the 'LocationCode' attribute value.  Location code used to identify a specific airport.
     * 
     * @param locationCode
     */
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    /** 
     * Get the 'CodeContext' attribute value. Identifies the context of the identifying code, such as IATA, ARC, or internal code, etc.
     * 
     * @return value
     */
    public String getCodeContext() {
        return codeContext;
    }

    /** 
     * Set the 'CodeContext' attribute value. Identifies the context of the identifying code, such as IATA, ARC, or internal code, etc.
     * 
     * @param codeContext
     */
    public void setCodeContext(String codeContext) {
        this.codeContext = codeContext;
    }

    /** 
     * Get the 'Terminal' attribute value.  Arrival or departure terminal (e.g., Concourse A)
     * 
     * @return value
     */
    public String getTerminal() {
        return terminal;
    }

    /** 
     * Set the 'Terminal' attribute value.  Arrival or departure terminal (e.g., Concourse A)
     * 
     * @param terminal
     */
    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    /** 
     * Get the 'Gate' attribute value.  Arrival or departure gate (e.g., B12)
     * 
     * @return value
     */
    public String getGate() {
        return gate;
    }

    /** 
     * Set the 'Gate' attribute value.  Arrival or departure gate (e.g., B12)
     * 
     * @param gate
     */
    public void setGate(String gate) {
        this.gate = gate;
    }
}
