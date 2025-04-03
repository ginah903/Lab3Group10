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
					//parse the values as integers
					//convert Note on/off to integers 1 or 0
					//create MidiEventData object
					//not done yet!!!!!
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
