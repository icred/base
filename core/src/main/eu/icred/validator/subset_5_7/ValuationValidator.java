package eu.icred.validator.subset_5_7;

import java.util.List;

import org.apache.log4j.Logger;

import eu.icred.model.node.entity.Valuation;

public class ValuationValidator {
    private static Logger logger = Logger.getLogger(Valuation.class);
    
    public List<?> validate(Valuation val) {
        if(val.getCapitalizationRate() != null && !(val.getCapitalizationRate() > 1)) {
            logger.warn("assert failed for Valuation with ID '"+val.getObjectIdSender()+"': capitalizationRate > 1");
        }
        
        return null;
    }
}
