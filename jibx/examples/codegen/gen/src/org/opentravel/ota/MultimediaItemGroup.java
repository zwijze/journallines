
package org.opentravel.ota;

/** 
 * Specific information about a multimedia item.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MultimediaItemGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="Language"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Format"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="FileSize"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="FileName"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class MultimediaItemGroup
{
    private String language;
    private String format;
    private String fileSize;
    private String fileName;

    /** 
     * Get the 'Language' attribute value.
     * 
     * @return value
     */
    public String getLanguage() {
        return language;
    }

    /** 
     * Set the 'Language' attribute value.
     * 
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /** 
     * Get the 'Format' attribute value. The code associated with the format of the multimedia item.
    Refer to OTA code list Content Format Code (CFC)
     * 
     * @return value
     */
    public String getFormat() {
        return format;
    }

    /** 
     * Set the 'Format' attribute value. The code associated with the format of the multimedia item.
    Refer to OTA code list Content Format Code (CFC)
     * 
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /** 
     * Get the 'FileSize' attribute value. The size of the multimedia file in bytes.
     * 
     * @return value
     */
    public String getFileSize() {
        return fileSize;
    }

    /** 
     * Set the 'FileSize' attribute value. The size of the multimedia file in bytes.
     * 
     * @param fileSize
     */
    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    /** 
     * Get the 'FileName' attribute value. The name of the multimedia  file.
     * 
     * @return value
     */
    public String getFileName() {
        return fileName;
    }

    /** 
     * Set the 'FileName' attribute value. The name of the multimedia  file.
     * 
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
