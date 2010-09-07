/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 * Copyright (C) 2006-2010 Adele Team/LIG/Grenoble University, France
 */
package fr.imag.adele.cadse.as.scm;

import fr.imag.adele.cadse.core.content.ContentItem;

/**
 * Service to perform evolution action on content.
 * 
 * @author Thomas
 *
 */
public interface SCMService {
	public static final String CANNOT_RETRIEVE_SCM_URL = "Cannot retrieve scm url";
	
	/**
	 * Performs import operation on specified content.
	 * 
	 * @param contentItem an item which represents a content
	 * @param revision revision
	 * @return information about new content revision.
	 */
	public SCMRevision importContent(ContentItem contentItem, String revision) throws SCMException;

	/**
	 * Performs update operation on specified content.
	 * 
	 * @param contentItem an item which represents a content
	 * @param revision revision
	 * @return information about new content revision.
	 */
	public SCMRevision updateContent(ContentItem contentItem, String revision) throws SCMException;
	
	/**
	 * Performs revert operation on specified item
	 * 
	 * @param contentItem an item which represents a content
	 * @return information about new content revision.
	 */
	public SCMRevision revertContent(ContentItem contentItem) throws SCMException;
	
	/**
	 * Performs commit operation on specified item
	 * 
	 * @param contentItem an item which represents a content
	 * @param comment     comment recorded with this commit
	 * @return information about new content revision.
	 */
	public SCMRevision commitContent(ContentItem contentItem, String comment) throws SCMException;
	
	/**
	 * Returns true if specified content has been modified from last logical evolution action.
	 * 
	 * @return true if specified content has been modified from last logical evolution action.
	 */
	public boolean contentHasBeenChanged(ContentItem contentItem) throws SCMException;
	
	/**
	 * Returns Maven SCM URL of content represented by specified content item.
	 * If no repository is attached to this content, returns null;
	 * 
	 * @param contentItem an item which represents a content
	 * @return Maven SCM URL of content represented by specified content item.
	 */
	public String getSCMRepositoryURL(ContentItem contentItem) throws SCMException;
}
