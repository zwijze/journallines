
package org.opentravel.ota;

/** 
 * Provides meaning to a company code.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompanyID_AttributesGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="CompanyShortName"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="TravelSector"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Code"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="CodeContext"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class CompanyIDAttributesGroup
{
    private String companyShortName;
    private String travelSector;
    private String code;
    private String codeContext;

    /** 
     * Get the 'CompanyShortName' attribute value. Used to provide the company common name.
     * 
     * @return value
     */
    public String getCompanyShortName() {
        return companyShortName;
    }

    /** 
     * Set the 'CompanyShortName' attribute value. Used to provide the company common name.
     * 
     * @param companyShortName
     */
    public void setCompanyShortName(String companyShortName) {
        this.companyShortName = companyShortName;
    }

    /** 
     * Get the 'TravelSector' attribute value. 
    Refer to OTA Code List Travel Sector (TVS).
    	
     * 
     * @return value
     */
    public String getTravelSector() {
        return travelSector;
    }

    /** 
     * Set the 'TravelSector' attribute value. 
    Refer to OTA Code List Travel Sector (TVS).
    	
     * 
     * @param travelSector
     */
    public void setTravelSector(String travelSector) {
        this.travelSector = travelSector;
    }

    /** 
     * Get the 'Code' attribute value. Identifies a company by the company code.
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' attribute value. Identifies a company by the company code.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'CodeContext' attribute value. Identifies the context of the identifying code, such as DUNS, IATA or internal code, etc.
     * 
     * @return value
     */
    public String getCodeContext() {
        return codeContext;
    }

    /** 
     * Set the 'CodeContext' attribute value. Identifies the context of the identifying code, such as DUNS, IATA or internal code, etc.
     * 
     * @param codeContext
     */
    public void setCodeContext(String codeContext) {
        this.codeContext = codeContext;
    }
}
