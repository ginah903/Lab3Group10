package abstractfactory.main;

import java.util.List;
import javax.sound.midi.*;

import abstractfactory.MidiEventFactory;
import abstractfactory.MidiEventFactoryAbstract;
import abstractfactory.behavior.LegatoMidiEventFactoryAbstract;
import abstractfactory.instrument.TrumpetStrategy;
import abstractfactory.instrument.InstrumentStrategy;
import abstractfactory.pitch.HigherPitchStrategy;
import abstractfactory.pitch.PitchStrategy;
import parser.MidiCsvParser;
import parser.MidiEventData;

/**
 * RAYYAN HERE PLEASE READ: 
 * Trying to create a main() instance where we use the following: 
 * "Legato" style behavior, Trumpet, and higher pitch strategy
 * 
 * I do not have any clue how to list the file source for the CSV file
 */
public class Main {

	public static void main(String[] args) {
		try {
			
			// Rayyan here! This is where CSV stuff is happening like the actual parse, but I am #LOST! 
            MidiCsvParser parser = new MidiCsvParser();
            
            
            //THERE SHOULD BE MORE HERE FOR THE CSV READ!!!!
            

            //Rayyan here again! From here onwards, I am under the assumption the CSV read was successful, this logic is based from the example he has in the instructions!
            Sequence sequence = new Sequence(Sequence.PPQ, 384);
            
            Track track = sequence.createTrack();

            //Rayyan again! This is the thing I was talking about earlier where I created 3 "instantiators" of the abstract behavior classes so when selecting them you aren't having...
            //to do the selection and the logic in the same class cus that can go bad really fast, so I added 3 new classes just for "selecting" the type of behavior
            MidiEventFactoryAbstract factoryAbstract = new LegatoMidiEventFactoryAbstract();
            
            MidiEventFactory factory = factoryAbstract.createFactory();

            InstrumentStrategy instrumentStrategy = new TrumpetStrategy();
            
            instrumentStrategy.applyInstrument(track, 0);

            PitchStrategy pitchStrategy = new HigherPitchStrategy();

            //Rayyan (again I know, snooze-fest) here is where I think the actual assembly of the "track" should start, with all of the factors selected above.
            //however, I have not finished this yet because I am getting really confused with the logic, I think i need a brain break, will be coming back to this later!
            
            for (MidiEventData event 

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

			
		
}


