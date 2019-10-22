package csv.utils;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

import org.supercsv.prefs.CsvPreference;

import com.github.mygreen.supercsv.io.CsvAnnotationBeanWriter;

public class CsvUtils {
	
	public static <T> String convertToCsv(List<T> entitiesList, Class<T> clazz) {
		String csvStrings = "";
		try (Writer w = new StringWriter();
			 CsvAnnotationBeanWriter<T> csvWriter = new CsvAnnotationBeanWriter<T>(
					clazz, 
					w, 
					CsvPreference.STANDARD_PREFERENCE)) {
			csvWriter.writeHeader();
			csvWriter.writeAll(entitiesList);
			csvStrings = w.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return csvStrings;
	}

}
