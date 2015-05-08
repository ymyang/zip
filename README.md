# zip
zip & unzip

使用ant实现文件的压缩与解压缩

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
