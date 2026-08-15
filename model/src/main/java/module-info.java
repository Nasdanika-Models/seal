import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.seal.capability.SealArrayResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.seal.capability.SealEPackageResourceSetCapabilityFactory;
import org.nasdanika.models.seal.capability.SealResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.seal.capability.SealResourceFactoryCapabilityFactory;

module org.nasdanika.models.seal {
	
	exports org.nasdanika.models.seal;
	exports org.nasdanika.models.seal.impl;
	exports org.nasdanika.models.seal.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.iam;
	
	provides CapabilityFactory with 
		SealEPackageResourceSetCapabilityFactory,
		SealResourceFactoryCapabilityFactory;
	
}