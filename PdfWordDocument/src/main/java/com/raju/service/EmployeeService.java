package com.raju.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.springframework.stereotype.Service;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.raju.model.Employee;

@Service
public class EmployeeService {

	public String savePdfFile(Employee employee) {
		// pdfFileCreation.pdfFileCreation(employee);
		String pdfPath = "F:\\PdfFileSave\\" + employee.getEmpId() + ".pdf";
		try {
			PdfWriter writer = new PdfWriter(pdfPath);
			PdfDocument pdfDoc = new PdfDocument(writer);
			// Paragraph p1= new Paragraph("Imayam");
			// Paragraph p2= new Paragraph("SaRa");
			// pdfDoc.addNewPage();
			Document document = new Document(pdfDoc);
			String empId = "" + employee.getEmpId();
			document.add(new Paragraph(empId));
			String name = employee.getFirstName() + " " + employee.getLastName();
			document.add(new Paragraph(name));
			document.add(new Paragraph(employee.getAddress()));
			document.add(new Paragraph(employee.getRoll()));
			document.add(new Paragraph(employee.getCompanyName()));
			document.add(new Paragraph(employee.getLocation()));
			String contact = "" + employee.getContactNumber();
			document.add(new Paragraph(contact));
			String salary = "" + employee.getSalary();
			document.add(new Paragraph(salary));
			document.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return "Pdf file Save successfully";
	}

	public String saveDocFile(Employee employee) {
		String filePath = "F:\\DocFileSave\\"+employee.getEmpId()+".docx";
		try {
			XWPFDocument doc = new XWPFDocument();

			// create a paragraph
			XWPFParagraph p1 = doc.createParagraph();
			//p1.setAlignment(ParagraphAlignment.CENTER);

			// set font
			XWPFRun r1 = p1.createRun();
			r1.setBold(true);
			// r1.setItalic(true);
			r1.setFontSize(22);
			r1.setFontFamily("New Roman");
			String empId = "" + employee.getEmpId();
			r1.setText(empId);
			r1.addBreak();
			r1.setText(employee.getFirstName() + " " + employee.getLastName());
			r1.addBreak();
			r1.setText(employee.getAddress());
			r1.addBreak();
			r1.setText(employee.getRoll());
			r1.addBreak();
			r1.setText(employee.getCompanyName());
			r1.addBreak();
			r1.setText(employee.getLocation());
			r1.addBreak();
			String contact = "" + employee.getContactNumber();
			r1.setText(contact);
			r1.addBreak();
			String salary = "" + employee.getSalary();
			r1.setText(salary);
			r1.addBreak();

			FileOutputStream out = new FileOutputStream(filePath);
			try {
				doc.write(out);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return "Doc file Save successfully";
	}

}
