package eu.icred.deprecated.impl;

import java.util.List;

import org.apache.log4j.Logger;

import eu.icred.deprecated.ITransformContext;
import eu.icred.deprecated.ITransformer;
import eu.icred.deprecated.MapperValidationException;
import eu.icred.deprecated.ValidationError;

/**
 * @author Martin Fluegge
 * 
 * @deprecated
 */
public abstract class BasicTransformer<A, B> implements ITransformer<A, B> {

    private static Logger LOG = Logger.getLogger(BasicTransformer.class);
    
	private boolean validate = true;
	private Validator<A> validator;
	/**
	 * @deprecated
	 */
	protected abstract B doTransform(A a, ITransformContext context);
	/**
	 * @deprecated
	 */
	public B transform(A a, ITransformContext context) throws MapperValidationException {

		if (isValidate()) {

			validate(a);
		}

		return doTransform(a, context);
	}
	/**
	 * @deprecated
	 */
	public boolean isValidate() {
		return validate;
	}
	/**
	 * @deprecated
	 */
	public void setValidate(boolean validate) {
		this.validate = validate;
	}
	/**
	 * @deprecated
	 */
	protected void validate(A o) throws MapperValidationException {
		Validator<A> validator = getValidator();

		if (validator != null) {

			List<ValidationError> validationResults = validator.validate(o);

			for (ValidationError e : validationResults) {
				LOG.warn(e.getMessage());
			}

			if (validationResults != null && validationResults.size() > 0) {
				throw new MapperValidationException(validationResults);
			}
		}
	}
	/**
	 * @deprecated
	 */
	public Validator<A> getValidator() {
		return validator;
	}
	/**
	 * @deprecated
	 */
	public void setValidator(Validator<A> validator) {
		this.validator = validator;
	}
}
