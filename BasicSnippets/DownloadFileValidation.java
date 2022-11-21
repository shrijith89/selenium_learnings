import java.io.File;

public class DownloadFileValidation {

	public boolean isFileDownloaded(String filename) throws Exception {
		String downloadPath = System.getProperty("user.home");
		File file = new File(downloadPath + "/Downloads/" + filename);
		boolean flag = (file.exists()) ? true : false;
		return flag;
	}
}
