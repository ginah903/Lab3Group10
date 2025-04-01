package parser;

public class MidiEventData {
	private int startEndTick, velocity, note, channel, noteOnOff;
	private int instrument;
	
	/**
	 * Constructor to initialize MidiEventData
	 */
	public MidiEventData(int startEndTick, int velocity, int note, int channel, int instrument, int noteOnOff) {
		this.startEndTick = startEndTick;
		this.velocity = velocity;
		this.note = note;
		this.channel = channel;
		this.instrument = instrument;
		this.noteOnOff= noteOnOff;
		}

	/**
	 * Gets the startEndTick.
	 * @return Returns the startEndTick.
	 */
	public int getStartEndTick() {
		return startEndTick;
	}

	/**
	 * Sets the startEndTick.
	 * @param startEndTick
	 */
	public void setStartEndTick(int startEndTick) {
		this.startEndTick = startEndTick;
	}

	/**
	 * Gets the velocity.
	 * @return Returns the velocity.
	 */
	public int getVelocity() {
		return velocity;
	}

	/**
	 * Sets the velocity.
	 * @param velocity
	 */
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	/**
	 * Gets the note.
	 * @return Returns the note.
	 */
	public int getNote() {
		return note;
	}

	/**
	 * Sets the note.
	 * @param note
	 */
	public void setNote(int note) {
		this.note = note;
	}
	
	/**
	 * Gets the channel.
	 * @return Returns the channel.
	 */
	public int getChannel() {
		return channel;
	}
	
	/**
	 * Sets the channel.
	 * @param channel
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}

	/**
	 * Gets the NoteOnOff.
	 * @return Returns the NoteOnOff.
	 */
	public int getNoteOnOff() {
		return noteOnOff;
	}

	/**
	 * Sets the NoteOnOff.
	 * @param NoteOnOff
	 */
	public void setNoteOnOff(int noteOnOff) {
		this.noteOnOff = noteOnOff;
	}

	/**
	 * Gets the instrument.
	 * @return Returns the instrument.
	 */
	public int getInstrument() {
		return instrument;
	}

	/**
	 * Sets the instrument.
	 * @param instrument
	 */
	public void setInstrument(int instrument) {
		this.instrument = instrument;
	}
	
}
	
	