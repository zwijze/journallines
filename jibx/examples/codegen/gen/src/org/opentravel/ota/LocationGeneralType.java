
package org.opentravel.ota;

/** 
 * Provides high-level information regarding a location.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LocationGeneralType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="CityName" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="StateProv" minOccurs="0"/>
 *     &lt;xs:element type="ns:CountryNameType" name="CountryName" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class LocationGeneralType
{
    private String cityName;
    private String stateProv;
    private CountryNameType countryName;

    /** 
     * Get the 'CityName' element value. City (e.g., Dublin), town, or postal station (i.e., a postal service territory, often used in a military address).
     * 
     * @return value
     */
    public String getCityName() {
        return cityName;
    }

    /** 
     * Set the 'CityName' element value. City (e.g., Dublin), town, or postal station (i.e., a postal service territory, often used in a military address).
     * 
     * @param cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /** 
     * Get the 'StateProv' element value. State or Province name (e.g., Texas).
     * 
     * @return value
     */
    public String getStateProv() {
        return stateProv;
    }

    /** 
     * Set the 'StateProv' element value. State or Province name (e.g., Texas).
     * 
     * @param stateProv
     */
    public void setStateProv(String stateProv) {
        this.stateProv = stateProv;
    }

    /** 
     * Get the 'CountryName' element value. Country name (e.g., Ireland).
     * 
     * @return value
     */
    public CountryNameType getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. Country name (e.g., Ireland).
     * 
     * @param countryName
     */
    public void setCountryName(CountryNameType countryName) {
        this.countryName = countryName;
    }
}
