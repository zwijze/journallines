
package org.opentravel.ota;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/** 
 * Used to provide subsection formatted text information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FormattedTextSubSectionType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:ParagraphType" name="Paragraph" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" use="optional" name="SubTitle"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="SubCode"/>
 *   &lt;xs:attribute type="xs:integer" use="optional" name="SubSectionNumber"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FormattedTextSubSectionType
{
    private List<ParagraphType> paragraphList = new ArrayList<ParagraphType>();
    private String subTitle;
    private String subCode;
    private BigInteger subSectionNumber;

    /** 
     * Get the list of 'Paragraph' element items.
     * 
     * @return list
     */
    public List<ParagraphType> getParagraphList() {
        return paragraphList;
    }

    /** 
     * Set the list of 'Paragraph' element items.
     * 
     * @param list
     */
    public void setParagraphList(List<ParagraphType> list) {
        paragraphList = list;
    }

    /** 
     * Get the 'SubTitle' attribute value. This attribute may be used to provide a title for a sub-section of the formatted free text.  A sub-section may have multiple related paragraphs of information.  For example, if used to provide driving directions there may be multiple paragraphs, and these paragraphs may be grouped into a sub-section called "Driving from the North".  A second subsection may be titled "Driving from the South", and may contain several paragraphs to describe the driving directions when driving from the south. 
     * 
     * @return value
     */
    public String getSubTitle() {
        return subTitle;
    }

    /** 
     * Set the 'SubTitle' attribute value. This attribute may be used to provide a title for a sub-section of the formatted free text.  A sub-section may have multiple related paragraphs of information.  For example, if used to provide driving directions there may be multiple paragraphs, and these paragraphs may be grouped into a sub-section called "Driving from the North".  A second subsection may be titled "Driving from the South", and may contain several paragraphs to describe the driving directions when driving from the south. 
     * 
     * @param subTitle
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    /** 
     * Get the 'SubCode' attribute value. An optional code that may be assigned to this sub-section of formatted free text.
     * 
     * @return value
     */
    public String getSubCode() {
        return subCode;
    }

    /** 
     * Set the 'SubCode' attribute value. An optional code that may be assigned to this sub-section of formatted free text.
     * 
     * @param subCode
     */
    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    /** 
     * Get the 'SubSectionNumber' attribute value. This attribute may be used when there is a need to number all of the sub-sections of information that is to be presented.
     * 
     * @return value
     */
    public BigInteger getSubSectionNumber() {
        return subSectionNumber;
    }

    /** 
     * Set the 'SubSectionNumber' attribute value. This attribute may be used when there is a need to number all of the sub-sections of information that is to be presented.
     * 
     * @param subSectionNumber
     */
    public void setSubSectionNumber(BigInteger subSectionNumber) {
        this.subSectionNumber = subSectionNumber;
    }
}
