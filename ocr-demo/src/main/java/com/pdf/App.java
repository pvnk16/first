package com.pdf;

import java.io.File;

import com.pdf.ocr.tessaract.ReadPdf;
import com.pdf.ocr.tessaractimpl.ReadPdfImpl;

/**
 * Main method to test the file.
 * 
 * @author pavan
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		/*
		 * Create the object and call the method to parse.
		 */
		ReadPdf pdf = new ReadPdfImpl();
		File tiffName = pdf.convertPdfToTiff("/home/pavan/custom/ocr/invoice/198808666_4039031170905.pdf");
		pdf.extractContent(tiffName);
	}
}
