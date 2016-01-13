package eu.icred.validator;

import java.util.ArrayList;
import java.util.List;

import eu.icred.deprecated.ValidationError;
import eu.icred.deprecated.impl.Validator;
import eu.icred.model.node.entity.Unit;

public class BasicUnitValidator extends Validator<Unit> {

	@Override
	public List<ValidationError> validate(Unit unit) {
		//TODO add global unit validation
		List<ValidationError> results = new ArrayList<ValidationError>();

		validateObjectIdSender(unit, results);
		
		return results;
	}

	private void validateObjectIdSender(Unit unit, List<ValidationError> results) {
		String objectIdSender = unit.getObjectIdSender();
		if (objectIdSender == null) {
			createAndAddValidationError(null, "objectIdSender must be not null", results);
		}
		if (objectIdSender.length() == 0) {
			createAndAddValidationError(null, "objectIdSender must be not empty", results);
		}
	}
	
}
