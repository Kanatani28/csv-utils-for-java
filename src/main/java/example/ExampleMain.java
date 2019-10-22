package example;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import csv.utils.CsvUtils;

public class ExampleMain {

	public static void main(String[] args) {
		List<ExampleModel> models = new ArrayList<>(
			Arrays.asList(
				new ExampleModel(1, "Taro", "Yamada", 30, LocalDateTime.now()),
				new ExampleModel(2, "Jiro", "Tanaka", 25, LocalDateTime.now())
			)
		);
		
		System.out.println(CsvUtils.convertToCsv(models, ExampleModel.class));
	}
}
