
package org.opentravel.ota;

/** 
 * Provides employee information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ID_LevelTitleGroup">
 *   &lt;xs:attributeGroup ref="ns:ID_OptionalGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Level"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Title"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ID_OptionalGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="ID"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class IDLevelTitleGroup
{
    private String ID;
    private String level;
    private String title;

    /** 
     * Get the 'ID' attribute value. A unique identifying value assigned by the creating system.  The ID attribute may be used to reference a primary-key value within a database or in a particular implementation.
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' attribute value. A unique identifying value assigned by the creating system.  The ID attribute may be used to reference a primary-key value within a database or in a particular implementation.
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /** 
     * Get the 'Level' attribute value. Level in employer organization (e.g. seniority) that conveys privileges.
     * 
     * @return value
     */
    public String getLevel() {
        return level;
    }

    /** 
     * Set the 'Level' attribute value. Level in employer organization (e.g. seniority) that conveys privileges.
     * 
     * @param level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /** 
     * Get the 'Title' attribute value. Title of employee in the employer company that conveys rank or privileges.
     * 
     * @return value
     */
    public String getTitle() {
        return title;
    }

    /** 
     * Set the 'Title' attribute value. Title of employee in the employer company that conveys rank or privileges.
     * 
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
