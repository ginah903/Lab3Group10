package abstractfactory.behavior;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

import abstractfactory.MidiEventFactory;

public class StaccatoMidiEventFactory implements MidiEventFactory {
	

	/**
	 * Overrides the createNoteOn method from MidiEventFactory, and creates a MIDI "note on" event. 
	 * Throws an exception if the parameters are invalid. 
	 */
	@Override
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.NOTE_ON, channel, note, velocity);
		return new MidiEvent(message, tick);
		
	}

	/**
	 * Overrides createNoteOff method from MidiEventFactory, and creates a MIDI "note off" event.
	 * Throws an exception if the parameters are invalid, and decreases the duration between notes by 120 ticks.
	 */
	@Override
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.NOTE_OFF, channel, note);
		return new MidiEvent(message, tick-120);
	}
}
