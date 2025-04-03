package abstractfactory.behavior;

import abstractfactory.MidiEventFactory;
import abstractfactory.MidiEventFactoryAbstract;

public class StaccatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract {

    /**
     * Returns a new StaccatoMidiEventFactory.
     */
    @Override
    public MidiEventFactory createFactory() {
    	
        return new StaccatoMidiEventFactory();
        
    }
    
}