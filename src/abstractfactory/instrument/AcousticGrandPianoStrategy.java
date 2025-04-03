package abstractfactory.instrument;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class AcousticGrandPianoStrategy implements InstrumentStrategy{

	/**
	 * Assigns instrument to acoustic grand piano within the specific channel
	 */
	@Override
	public void applyInstrument(Track track, int channel) {
		ShortMessage programChange = new ShortMessage();
		try {
			programChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, 0, 0);
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}
		MidiEvent event = new MidiEvent(programChange, 0);
		track.add(event);
	}

}
