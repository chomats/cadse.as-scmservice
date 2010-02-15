package fr.imag.adele.cadse.as.scm;

/**
 * Represents informations about a content revision.
 * 
 * @author Thomas
 *
 */
public class SCMRevision {

	private String _revision;
	
	private String _scmRepoUrl;
	
	public SCMRevision(String revision, String scmRepoUrl) {
		_revision = revision;
		_scmRepoUrl = scmRepoUrl;
	}
	
	public String getRevision() {
		return _revision;
	}

	public String getScmRepoUrl() {
		return _scmRepoUrl;
	}

}
