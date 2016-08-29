
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * A collection of comments.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CommentType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="Comment" maxOccurs="unbounded">
 *       &lt;!-- Reference to inner class Comment -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CommentType
{
    private List<Comment> commentList = new ArrayList<Comment>();

    /** 
     * Get the list of 'Comment' element items.
     * 
     * @return list
     */
    public List<Comment> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comment' element items.
     * 
     * @param list
     */
    public void setCommentList(List<Comment> list) {
        commentList = list;
    }
    /** 
     * Comment details.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Comment" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:ParagraphType">
     *         &lt;xs:attribute type="xs:string" use="optional" name="CommentOriginatorCode"/>
     *         &lt;xs:attribute type="xs:boolean" use="optional" name="GuestViewable"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Comment extends ParagraphType
    {
        private String commentOriginatorCode;
        private Boolean guestViewable;

        /** 
         * Get the 'CommentOriginatorCode' attribute value. CommentOriginatorCode : String
        Unique identifier for the system which created the comment.
         * 
         * @return value
         */
        public String getCommentOriginatorCode() {
            return commentOriginatorCode;
        }

        /** 
         * Set the 'CommentOriginatorCode' attribute value. CommentOriginatorCode : String
        Unique identifier for the system which created the comment.
         * 
         * @param commentOriginatorCode
         */
        public void setCommentOriginatorCode(String commentOriginatorCode) {
            this.commentOriginatorCode = commentOriginatorCode;
        }

        /** 
         * Get the 'GuestViewable' attribute value. GuestViewable : Boolean
        Whether or not this comment should be shown to the guest.
        Values: False or No, and True or Yes.
         * 
         * @return value
         */
        public Boolean getGuestViewable() {
            return guestViewable;
        }

        /** 
         * Set the 'GuestViewable' attribute value. GuestViewable : Boolean
        Whether or not this comment should be shown to the guest.
        Values: False or No, and True or Yes.
         * 
         * @param guestViewable
         */
        public void setGuestViewable(Boolean guestViewable) {
            this.guestViewable = guestViewable;
        }
    }
}
