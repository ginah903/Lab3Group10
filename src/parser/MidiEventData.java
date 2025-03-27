package parser;

public class MidiEventData {
	private int channel;
	private int note;
	private int startTick;
	private int endTick;
	private int velocity;
	private int instrument;
	
	/**
	 * Constructor to initialize MidiEventData
	 */
	public MidiEventData(int channel, int note, int startTick, int endTick, int velocity, int instrument) {
		this.channel = channel;
		this.note = note;
		this.startTick = startTick;
		this.endTick = endTick;
		this.velocity = velocity;
		this.instrument = instrument;
	}
	/**
	 * Gets the channel of the MidiEventData.
	 * @return Returns the channel.
	 */
	public int getChannel() {
		return channel;
	}

	/**
	 * Sets the channel of the MidiEventData.
	 * @param channel
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}

	/**
	 * Gets the note of the MidiEventData.
	 * @return Returns the note.
	 */
	public int getNote() {
		return note;
	}
	
	/**
	 * Sets the note of the MidiEventData.
	 * @param note
	 */
	public void setNote(int note) {
		this.note = note;
	}
	
	/**
	 * Gets the start tick of the MidiEventData.
	 * @return Returns the start tick.
	 */
	public int getStartTick() {
		return startTick;
	}

	/**
	 * Sets the start tick of the MidiEventData.
	 * @param startTick
	 */
	public void setStartTick(int startTick) {
		this.startTick = startTick;
	}

	/**
	 * Gets the end tick of the MidiEventData.
	 * @return Returns the end tick.
	 */
	public int getEndTick() {
		return endTick;
	}
	
	/**
	 * Sets the end tick of the MidiEventData.
	 * @param endTick
	 */
	public void setEndTick(int endTick) {
		this.endTick = endTick;
	}

	/**
	 * Gets the velocity of the MidiEventData.
	 * @return Returns the velocity.
	 */
	public int getVelocity() {
		return velocity;
	}

	/**
	 * Sets the velocity of the MidiEventData.
	 * @param velocity
	 */
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	/**
	 * Gets the instrument of the MidiEventData.
	 * @return Returns the instrument.
	 */
	public int getInstrument() {
		return instrument;
	}
	/**
	 * Sets the instrument of the MidiEventData.
	 * @param instrument
	 */
	public void setInstrument(int instrument) {
		this.instrument = instrument;
	}
	
}
