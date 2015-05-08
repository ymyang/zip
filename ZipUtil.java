package com.qycloud.oatos.file;

import java.io.File;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.Expand;
import org.apache.tools.ant.taskdefs.Zip;

public class ZipUtil {

	public static void zip(String target, String source) {
		zip(new File(target), new File(source));
	}

	public static void zip(File target, File source) {
		Zip zip = new Zip();
		zip.setProject(new Project());
		zip.setDestFile(target);
		zip.setBasedir(source);
		zip.setEncoding("gbk");
		zip.execute();
	}

	public static void unzip(File target, File source) {
		Expand expand = new Expand();
		expand.setProject(new Project());
		expand.setDest(target);
		expand.setSrc(source);
		expand.setEncoding("gbk");
		expand.execute();
	}

	public static void main(String[] args) {
		try {
			File target = new File("D:/logs.zip");
			File source = new File("D:/logs");
			zip(target, source);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
