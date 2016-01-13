package eu.icred.deprecated;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Martin Fluegge
 * 
 *         This class encapsulates a validation and its result. It is thrown
 *         after validation errors are found and collected. Users can collect
 *         the validation result data from the exception.
 * @deprecated
 */
public class MapperValidationException extends Exception {
    /**
     * @deprecated
     */
	private static final long serialVersionUID = 1L;
	/**
	 * @deprecated
	 */
	private List<ValidationError> results = new ArrayList<ValidationError>();
	/**
	 * @deprecated
	 */
	public MapperValidationException(List<ValidationError> validationResults) {
		setResults(validationResults);
	}
	/**
	 * @deprecated
	 */
	public List<ValidationError> getResults() {
		return results;
	}
	/**
	 * @deprecated
	 */
	public void setResults(List<ValidationError> results) {
		this.results = results;
	}
}
