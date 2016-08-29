
package org.opentravel.ota;

/** 
 * Identifies a loyalty certificate.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LoyaltyCertificateNumberGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="CertificateNumber"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="MemberNumber"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ProgramName"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class LoyaltyCertificateNumberGroup
{
    private String certificateNumber;
    private String memberNumber;
    private String programName;

    /** 
     * Get the 'CertificateNumber' attribute value. The loyalty redemption certificate identifier.
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' attribute value. The loyalty redemption certificate identifier.
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /** 
     * Get the 'MemberNumber' attribute value. Unique identifier of the member in the program.
     * 
     * @return value
     */
    public String getMemberNumber() {
        return memberNumber;
    }

    /** 
     * Set the 'MemberNumber' attribute value. Unique identifier of the member in the program.
     * 
     * @param memberNumber
     */
    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    /** 
     * Get the 'ProgramName' attribute value. This identifies the loyalty program.
     * 
     * @return value
     */
    public String getProgramName() {
        return programName;
    }

    /** 
     * Set the 'ProgramName' attribute value. This identifies the loyalty program.
     * 
     * @param programName
     */
    public void setProgramName(String programName) {
        this.programName = programName;
    }
}
