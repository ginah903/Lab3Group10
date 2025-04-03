package parser;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MidiCsvParser {

	public List<MidiEventData> parsedMidiEvent(String filename) {
		
		List<MidiEventData> events = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(filename))){
			String line;
			
			while((line = br.readLine())!= null) {
				String[] values = line.split(",");
				
				if(values.length == 6) {
					
					//pulling values separated by commas here
					
					int startEndTick = Integer.parseInt(values[0].trim());
					
                    String noteType = values[1].trim();
                    
                    int noteOnOff = noteType.equalsIgnoreCase("Note_on_c") ? 1 : 0;
                    
                    int channel = Integer.parseInt(values[2].trim());
                    
                    int note = Integer.parseInt(values[3].trim());
                    
                    int velocity = Integer.parseInt(values[4].trim());
                    
                    int instrument = Integer.parseInt(values[5].trim());
                    
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
