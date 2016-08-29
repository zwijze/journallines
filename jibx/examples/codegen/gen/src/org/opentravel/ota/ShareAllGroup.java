
package org.opentravel.ota;

/** 
 * Used to indicate whether information can be shared.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ShareAllGroup">
 *   &lt;xs:attribute type="ns:YesNoType" use="optional" default="No" name="ShareAllSynchInd"/>
 *   &lt;xs:attribute type="ns:YesNoType" use="optional" default="No" name="ShareAllMarketInd"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class ShareAllGroup
{
    private YesNoType shareAllSynchInd;
    private YesNoType shareAllMarketInd;

    /** 
     * Get the 'ShareAllSynchInd' attribute value. Permission for sharing all data in profile for synchronization of profiles held by other travel service providers.
     * 
     * @return value
     */
    public YesNoType getShareAllSynchInd() {
        return shareAllSynchInd;
    }

    /** 
     * Set the 'ShareAllSynchInd' attribute value. Permission for sharing all data in profile for synchronization of profiles held by other travel service providers.
     * 
     * @param shareAllSynchInd
     */
    public void setShareAllSynchInd(YesNoType shareAllSynchInd) {
        this.shareAllSynchInd = shareAllSynchInd;
    }

    /** 
     * Get the 'ShareAllMarketInd' attribute value. Permission for sharing all data in profile for marketing purposes.
     * 
     * @return value
     */
    public YesNoType getShareAllMarketInd() {
        return shareAllMarketInd;
    }

    /** 
     * Set the 'ShareAllMarketInd' attribute value. Permission for sharing all data in profile for marketing purposes.
     * 
     * @param shareAllMarketInd
     */
    public void setShareAllMarketInd(YesNoType shareAllMarketInd) {
        this.shareAllMarketInd = shareAllMarketInd;
    }
}
