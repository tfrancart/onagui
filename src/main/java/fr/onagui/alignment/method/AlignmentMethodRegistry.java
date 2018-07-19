package fr.onagui.alignment.method;

import fr.onagui.alignment.AlignmentMethod;
import fr.onagui.alignment.ServiceRegistry;

public class AlignmentMethodRegistry extends ServiceRegistry<String, AlignmentMethod> {

	/**
	 * Internal helper class to avoid continuous synchronized checking.
	 */
	private static class AlignmentMethodRegistryHolder {

		public static final AlignmentMethodRegistry instance = new AlignmentMethodRegistry();
	}

	/**
	 * Gets the default RDFParserRegistry.
	 * 
	 * @return The default registry.
	 */
	public static AlignmentMethodRegistry getInstance() {
		return AlignmentMethodRegistryHolder.instance;
	}
	
	public AlignmentMethodRegistry() {
		super(AlignmentMethod.class);
	}

	@Override
	protected String getKey(AlignmentMethod service) {
		return service.getDisplayName();
	}

}
