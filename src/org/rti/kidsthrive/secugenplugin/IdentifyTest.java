package org.rti.kidsthrive.secugenplugin;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import sourceafis.simple.AfisEngine;

public class IdentifyTest {

	@Test
	public final void testIdentify() {
		/*
	     * Create AFIS Engine and set the Threshold
	     */
		AfisEngine afis = new AfisEngine();
		afis.setThreshold(25);
		
		SecugenPlugin plugin = new SecugenPlugin();
		ScanProperties props = new ScanProperties(260, 300);
		File file = new File("/sdcard/Download/");
		byte[] fileByte = null;
		try {
			fileByte = FileUtils.readFileToByteArray(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SecugenPlugin.identify(afis, props, fileByte);
		fail("Not yet implemented"); // TODO
	}

}
