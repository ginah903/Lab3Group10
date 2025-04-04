package parser;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MidiCsvParser {

	/**
	 * Reads each line of the .csv file using BufferedReader, splits the values by commas, and
	 * creates MidiEventData objects.
	 * @param filename The file to read
	 * @return Returns the read events as MidiEventData objects. 
	 */
	public static List<MidiEventData> parsedMidiEvent(String filename) {
		
		List<MidiEventData> events = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(filename))){
			String line;
			
			while((line = br.readLine())!= null) {
				String[] values = line.split(",");
				
				if(values.length == 6) {
					
					//pulling values separated by commas here
					
					int startEndTick = Integer.parseInt(values[0].trim());
					
                    String noteType = values[1].trim();
                    
                    int channel = Integer.parseInt(values[2].trim());
                    
                    int note = Integer.parseInt(values[3].trim());
                    
                    int velocity = Integer.parseInt(values[4].trim());
                    
                    int instrument = Integer.parseInt(values[5].trim());
                    
                    int noteOnOff;
                    
                    if (noteType.equalsIgnoreCase("Note_on_c") && velocity > 0) {
                        noteOnOff = 1;
                    } else if (noteType.equalsIgnoreCase("Note_off_c") || 
                               (noteType.equalsIgnoreCase("Note_on_c") && velocity == 0)) {
                        noteOnOff = 0;
                    } else {
                        continue; // Skip unknown event types
                    }
                    
                    MidiEventData event = new MidiEventData(
                    	startEndTick, velocity, note, channel, instrument, noteOnOff
                    );
                    
                    events.add(event);
				}
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return events;
	}
}
