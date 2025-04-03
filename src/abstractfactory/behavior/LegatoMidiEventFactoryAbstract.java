package abstractfactory.behavior;

import abstractfactory.MidiEventFactory;
import abstractfactory.MidiEventFactoryAbstract;

public class LegatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract {
	
	/**
	 * Returns a new LegatoMidiEventFactory
	 */
	@Override
	public MidiEventFactory createFactory() {
		
		return new LegatoMidiEventFactory();
		
	}

}
