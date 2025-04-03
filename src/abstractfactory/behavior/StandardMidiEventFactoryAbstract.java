package abstractfactory.behavior;

import abstractfactory.MidiEventFactory;
import abstractfactory.MidiEventFactoryAbstract;

public class StandardMidiEventFactoryAbstract implements MidiEventFactoryAbstract {

    /**
     * Returns a new StandardMidiEventFactory.
     */
    @Override
    public MidiEventFactory createFactory() {
    	
        return new StandardMidiEventFactory();
        
    }

}