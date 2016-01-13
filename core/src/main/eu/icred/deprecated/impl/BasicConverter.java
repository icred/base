package eu.icred.deprecated.impl;

import eu.icred.deprecated.IConverter;
import eu.icred.deprecated.IConverterDescriptor;
import eu.icred.deprecated.ITransformer;

/**
 * @author Martin Fluegge
 * 
 * @deprecated
 */
public abstract class BasicConverter implements IConverter {
    /**
     * @deprecated
     */
	public abstract void doConvertData(IConverterDescriptor descriptor);
	/**
	 * @deprecated
	 */
	public abstract ITransformer<?, ?> getTransformer();
	/**
	 * @deprecated
	 */
	public void convertData(IConverterDescriptor descriptor) {

		doConvertData(descriptor);
	}
}
