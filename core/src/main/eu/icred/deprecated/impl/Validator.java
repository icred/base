package eu.icred.deprecated.impl;

import java.util.List;

import eu.icred.deprecated.ValidationError;

/**
 * 
 * @author Martin Fluegge
 * 
 * @deprecated
 */
public abstract class Validator<A> {
    /**
     * @deprecated
     */
	public abstract List<ValidationError> validate(A o);
	/**
	 * @deprecated
	 */
	protected ValidationError createAndAddValidationError(String objectId, String message, List<ValidationError> results) {
		ValidationError validationError = new ValidationError();
		validationError.setMessage(message);
		validationError.setObjectId(objectId);
		results.add(validationError);
		return validationError;
	}
}
