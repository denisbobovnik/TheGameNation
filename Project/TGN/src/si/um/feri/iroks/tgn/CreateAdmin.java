package si.um.feri.iroks.tgn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateAdmin {

	public static void main(String[] args) {
		Connection conn = DBConnect.getConnection();
		
		Blob photo = null;
		try {
			photo = new javax.sql.rowset.serial.SerialBlob(convertFileContentToBlob("C:\\Users\\Denis Bobovnik\\Desktop\\default.png"));
		} catch (SQLException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		};
		
		try {

			PreparedStatement ps=conn.prepareStatement("insert into users(first_name , last_name , email, pass, photo) values (?,?,?,?,?)");
			ps.setString(1, "Ivan");
			ps.setString(2, "Stovanovski");
			ps.setString(3, "admin@tgn.com");
			ps.setString(4, "6a2a12424456d51a417e685b99019dbd9c5bb437");
			ps.setBlob(5, photo);
			
			
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
	}
	public static byte[] convertFileContentToBlob(String filePath) throws IOException {
		// create file object
		File file = new File(filePath);
		// initialize a byte array of size of the file
		byte[] fileContent = new byte[(int) file.length()];
		FileInputStream inputStream = null;
		try {
			// create an input stream pointing to the file
			inputStream = new FileInputStream(file);
			// read the contents of file into byte array
			inputStream.read(fileContent);
		} catch (IOException e) {
			throw new IOException("Unable to convert file to byte array. " + e.getMessage());
		} finally {
			// close input stream
			if (inputStream != null) {
				inputStream.close();
			}
		}
		return fileContent;
	}


}
