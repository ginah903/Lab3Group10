package abstractfactory.pitch;

public class HigherPitchStrategy implements PitchStrategy {
	
	/**
	 * Raises the pitch by two semitones.
	 */
	@Override
	public int modifyPitch(int note) {
		return note + 2;
	}
		
}
