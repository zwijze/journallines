
package org.opentravel.ota;

/** 
 * Indicates that additional records are available and provides the echo token to be used to retrieve those records.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ResponseGroup">
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="MoreIndicator"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="MoreDataEchoToken"/>
 *   &lt;xs:attributeGroup ref="ns:MaxResponsesGroup"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MaxResponsesGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="MaxResponses"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class ResponseGroup
{
    private Boolean moreIndicator;
    private String moreDataEchoToken;
    private String maxResponses;

    /** 
     * Get the 'MoreIndicator' attribute value. If true, this indicates more items are available. If false, no more items are available.
     * 
     * @return value
     */
    public Boolean getMoreIndicator() {
        return moreIndicator;
    }

    /** 
     * Set the 'MoreIndicator' attribute value. If true, this indicates more items are available. If false, no more items are available.
     * 
     * @param moreIndicator
     */
    public void setMoreIndicator(Boolean moreIndicator) {
        this.moreIndicator = moreIndicator;
    }

    /** 
     * Get the 'MoreDataEchoToken' attribute value. A reference to the last response returned. Originally set in the response message and will be used in the next query for more details.
     * 
     * @return value
     */
    public String getMoreDataEchoToken() {
        return moreDataEchoToken;
    }

    /** 
     * Set the 'MoreDataEchoToken' attribute value. A reference to the last response returned. Originally set in the response message and will be used in the next query for more details.
     * 
     * @param moreDataEchoToken
     */
    public void setMoreDataEchoToken(String moreDataEchoToken) {
        this.moreDataEchoToken = moreDataEchoToken;
    }

    /** 
     * Get the 'MaxResponses' attribute value. A positive integer value that indicates the maximum number of responses desired in the return.
     * 
     * @return value
     */
    public String getMaxResponses() {
        return maxResponses;
    }

    /** 
     * Set the 'MaxResponses' attribute value. A positive integer value that indicates the maximum number of responses desired in the return.
     * 
     * @param maxResponses
     */
    public void setMaxResponses(String maxResponses) {
        this.maxResponses = maxResponses;
    }
}
