package eu.icred.deprecated;

/**
 * @author Martin Fluegge
 * @deprecated
 */
public interface ITransformer<A, B> {
    /**
     * @deprecated
     */
	public B transform(A a, ITransformContext context) throws MapperValidationException;

}
