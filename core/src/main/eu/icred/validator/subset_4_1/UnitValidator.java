package eu.icred.validator.subset_4_1;

import java.util.List;

import eu.icred.deprecated.ValidationError;
import eu.icred.model.node.entity.Unit;
import eu.icred.validator.BasicUnitValidator;

public class UnitValidator extends BasicUnitValidator {

	@Override
	public List<ValidationError> validate(Unit unit) {
		return validate((Unit)unit);
	}

//	public List<ValidationError> validate(Unit unit) {
//		List<ValidationError> errors = super.validate(unit);
//		
//		//TODO add unit validation for 4.1
//
//		return errors;
//	}
}
