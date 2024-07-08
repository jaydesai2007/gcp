package com.test.gcp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.BucketInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

public class Test {

	public static void main(String[] args) {
		/*
		 * GoogleCredentials credentials; try { credentials =
		 * GoogleCredentials.fromStream(new
		 * FileInputStream("/home/digvijay/gcp/myproject-241713-bd0eeba220b4.json"));
		 * Storage storage = StorageOptions.newBuilder().setCredentials(credentials)
		 * .setProjectId("myproject-241713").build().getService(); //Bucket bucket =
		 * storage.create(BucketInfo.of("baeldung-bucket-digvijay"));
		 * 
		 * //BucketInfo info = BucketInfo.of("testdigvijay"); Bucket bucket =
		 * storage.get("testdigvijay",Storage.BucketGetOption.fields());
		 * System.out.println(bucket.getGeneratedId());
		 * 
		 * 
		 * } catch (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */

		InputStream inputStream;
		try {
			inputStream = new ClassPathResource("myproject-241713.json").getInputStream();
			StorageOptions options = StorageOptions.newBuilder().setProjectId("myproject-241713")
					.setCredentials(GoogleCredentials.fromStream(inputStream)).build();

			Storage storage = options.getService();
			Bucket bucket = storage.get("testdigvijay", Storage.BucketGetOption.fields());
			
			BucketInfo info = BucketInfo.of("testdigvijay");
			System.out.println(info);
			Bucket bucket1 = storage.create(BucketInfo.of("baeldung-bucket-digvijay"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
