package abstractfactory.main;

import java.util.List;
import javax.sound.midi.*;

import abstractfactory.MidiEventFactory;
import abstractfactory.MidiEventFactoryAbstract;
import abstractfactory.behavior.LegatoMidiEventFactoryAbstract;
import abstractfactory.instrument.AcousticGrandPianoStrategy;
import abstractfactory.instrument.InstrumentStrategy;
import abstractfactory.pitch.HigherPitchStrategy;
import abstractfactory.pitch.PitchStrategy;
import parser.MidiCsvParser;
import parser.MidiEventData;

public class Main {

	public static void main(String[] args) {
		try {
			List<MidiEventData> midiEvents = MidiCsvParser.parsedMidiEvent("./src/files/mystery_song.csv"); // parse from provided file
            Sequence sequence = new Sequence(Sequence.PPQ, 384);
            Track track = sequence.createTrack();

            // Choose a behavior: Legato
            MidiEventFactoryAbstract factoryAbstract = new LegatoMidiEventFactoryAbstract(); 
            MidiEventFactory factory = factoryAbstract.createFactory();

            // Choose an instrument: Piano
            InstrumentStrategy instrumentStrategy = new AcousticGrandPianoStrategy();
            instrumentStrategy.applyInstrument(track, 0);

            // Choose a pitch: Higher
            PitchStrategy pitchStrategy = new HigherPitchStrategy();


            for (MidiEventData event : midiEvents) {
            	int modifiedNote = pitchStrategy.modifyPitch(event.getNote()); 
            	modifiedNote = pitchStrategy.modifyPitch(modifiedNote);
            	
            	if (event.getNoteOnOff() == 1) {
            		track.add(factory.createNoteOn(event.getStartEndTick(),
            				modifiedNote,
            				event.getVelocity(),
            				event.getChannel()));
            	}
            	else {
            		track.add(factory.createNoteOff(event.getStartEndTick(), modifiedNote, event.getChannel()));
            	}
            }
            
            // Play sequence
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.setSequence(sequence);
            sequencer.start();
           
            while (sequencer.isRunning() | sequencer.isOpen()) {
            	Thread.sleep(100);
            }
            Thread.sleep(500);
            sequencer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }		
		
}


