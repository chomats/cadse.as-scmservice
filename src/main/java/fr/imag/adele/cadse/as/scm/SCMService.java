package fr.imag.adele.cadse.as.scm;

import fr.imag.adele.cadse.core.content.ContentItem;

/**
 * Service to perform evolution action on content.
 * 
 * @author Thomas
 *
 */
public interface SCMService {

	/**
	 * Performs import operation on specified content.
	 * 
	 * @param contentItem an item which represents a content
	 * @param revision revision
	 * @return true if operation succeed.
	 */
	public boolean importContent(ContentItem contentItem, String revision);

	/**
	 * Performs update operation on specified content.
	 * 
	 * @param contentItem an item which represents a content
	 * @param revision revision
	 * @return true if operation succeed.
	 */
	public boolean updateContent(ContentItem contentItem, String revision);
	
	/**
	 * Performs revert operation on specified item
	 * 
	 * @param contentItem an item which represents a content
	 * @return true if operation succeed.
	 */
	public boolean revertContent(ContentItem contentItem);
	
	/**
	 * Performs commit operation on specified item
	 * 
	 * @param contentItem an item which represents a content
	 * @param comment     comment recorded with this commit
	 * @return true if operation succeed.
	 */
	public boolean commitContent(ContentItem contentItem, String comment);
	
	/**
	 * Returns true if specified content has been modified from last logical evolution action.
	 * 
	 * @return true if specified content has been modified from last logical evolution action.
	 */
	public boolean contentHasBeenChanged(ContentItem contentItem);
}
