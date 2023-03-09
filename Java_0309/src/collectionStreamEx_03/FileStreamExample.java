package collectionStreamEx_03;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStreamExample {

	public static void main(String[] args) throws Exception{
		// 파일에서 스트림 얻기
		
		//파일의 경로 객체 얻기
		Path path = Paths.get(FileStreamExample.class.getResource("filedata.txt").toURI());
		
		//Path로부터 파일을 열고 한 행씩 읽으면서 문자열 스트림을 생성함 + 기본 문자셋으로 읽음
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(line -> System.out.println(line));
		stream.close();
		// Files.lines(path, Charset.defaultCharset()).forEach(line->System.out.println(line));
	}

}
