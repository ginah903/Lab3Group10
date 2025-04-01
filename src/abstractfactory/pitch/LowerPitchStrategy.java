package abstractfactory.pitch;

public class LowerPitchStrategy implements PitchStrategy{

	/**
	 * Lowers the pitch by two semitones.
	 */
	@Override
	public int modifyPitch(int note) {
		return note - 2;
	}

	
}
