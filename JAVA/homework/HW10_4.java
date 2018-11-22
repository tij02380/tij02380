import java.util.ArrayList;


public class HW10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Webhard wh = new Webhard(); 
		File[] fileList = {new Movie("나를 찾아줘"), new Movie("니모를 찾아서"),
				new Movie("어벤져스"), new Music("벚꽃엔딩"), new Documentary("Sicko")};  
		for(File f: fileList) wh.upload(f);
		wh.showList();
		wh.categoryDownload("Music");
		wh.categoryDownload("Movie");
		wh.removeFile("찾아");
		wh.categoryDownload("Movie");
	}
}
class Webhard {
	ArrayList<File>	List = new ArrayList<>();
	public void upload(File f) {
		List.add(f);
	}
	public void showList() {
		System.out.println(List);
	}
	public void categoryDownload(String s) {
		for(int i = 0; i<List.size(); i++){
			File f = (File)List.get(i);
			if(s.equals(f.getClass().getName()))
				System.out.printf("%s : %s 다운로드 완료.\n", s, f.file);
		}
		System.out.printf("%s 카테고리 다운로드 완료\n", s);
		System.out.println();
	}
	public void removeFile(String s) {
		int n = 0;
		for(int j=0; j<List.size(); j++) {
			File f = (File)List.get(j);
			int len = f.file.length();
			for(int i=0; i<len; i++)
			{
				int a = s.length();
				String eq = f.file.substring(i,i+a);
				if(s.equalsIgnoreCase(eq)==true) {
					List.remove(j);
					System.out.printf("%s 파일이 제거됨.\n", f.file);
					j--;
				}
				if(i==len-a) break;
			}
		}
		System.out.println();
	}
}
abstract class File {
	String file;
	File(String f) {
		file = f;
	}
	public String toString(){
		return file;
	}
}
class Movie extends File {
	Movie(String f) {
		super(f);
	}
}
class Music extends File {
	Music(String f) {
		super(f);
	}
}
class Documentary extends File {
	Documentary(String f) {
		super(f);
	}
}