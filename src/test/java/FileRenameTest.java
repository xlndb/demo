import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import java.util.UUID;

/**
 * @author lide
 */
public class FileRenameTest {
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        String fileName = "C:\\Users\\Public\\图片\\wallpaper\\风景";
        File file = new File(fileName);
        for (File listFile : Objects.requireNonNull(file.listFiles())) {
            String md5 = calculateMD5(listFile.getPath());
            listFile.renameTo(new File(replace(listFile.getPath(), md5)));
        }
    }

    static String replace(String fullName, String replace) {
        return fullName.replaceAll("([^/\\\\]+)(\\.[^.]+)$", replace + "$2");
    }


    public static String calculateMD5(String filePath) throws NoSuchAlgorithmException, IOException {
        MessageDigest md = MessageDigest.getInstance("MD5");

        try (DigestInputStream dis = new DigestInputStream(new FileInputStream(filePath), md)) {
            byte[] buffer = new byte[4096];
            while (dis.read(buffer) != -1) {
                // 读取文件内容，更新MD5摘要
            }
        }

        byte[] mdBytes = md.digest();

        // 转换为十六进制格式
        StringBuilder sb = new StringBuilder();
        for (byte mdByte : mdBytes) {
            sb.append(String.format("%02x", mdByte & 0xFF));
        }

        return sb.toString();
    }


}
