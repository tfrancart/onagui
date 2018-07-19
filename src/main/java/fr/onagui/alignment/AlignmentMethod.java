/**
 * 
 */
package fr.onagui.alignment;


/**
 * @author Laurent Mazuel
 */
public interface AlignmentMethod<ONTORES1, ONTORES2> {
	
	public abstract boolean init() ;
	
	public abstract Mapping<ONTORES1, ONTORES2> computeMapping(
			OntoContainer<ONTORES1> model1,
			ONTORES1 cpt1Inst,
			OntoContainer<ONTORES2> model2,
			ONTORES2 cpt2Inst
	);
	
	/**
	 * Returns the name of the method (usually displayed in menu and stored in mappings)
	 * @return
	 */
	public String getName();
}
