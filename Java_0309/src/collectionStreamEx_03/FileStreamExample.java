package collectionStreamEx_03;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStreamExample {

	public static void main(String[] args) throws Exception{
		// ���Ͽ��� ��Ʈ�� ���
		
		//������ ��� ��ü ���
		Path path = Paths.get(FileStreamExample.class.getResource("filedata.txt").toURI());
		
		//Path�κ��� ������ ���� �� �྿ �����鼭 ���ڿ� ��Ʈ���� ������ + �⺻ ���ڼ����� ����
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(line -> System.out.println(line));
		stream.close();
		// Files.lines(path, Charset.defaultCharset()).forEach(line->System.out.println(line));
	}

}
