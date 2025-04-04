package abstractfactory.instrument;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class ElectricBassGuitarStrategy implements InstrumentStrategy{

	/**
	 * assigns the instrument to electric bass guitar (finger)
	 * 
	 */
	@Override
	public void applyInstrument(Track track, int channel) {
		ShortMessage programChange = new ShortMessage();
		try {
			programChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, 33, 0);
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}
		MidiEvent event = new MidiEvent(programChange, 0);
		track.add(event);
	}

}
