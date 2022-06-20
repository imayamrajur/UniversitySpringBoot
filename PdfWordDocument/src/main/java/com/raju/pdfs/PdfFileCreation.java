package com.raju.pdfs;

import java.io.FileNotFoundException;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.raju.model.Employee;

public class PdfFileCreation {

	
	public void pdfFileCreation(Employee employee) {
		String pdfPath = "F:\\PdfFileSave\\"+employee.getEmpId()+".pdf";
		try {
			PdfWriter writer = new PdfWriter(pdfPath);
			PdfDocument pdfDoc = new PdfDocument(writer);
			Paragraph p1= new Paragraph("Imayam");
			Paragraph p2= new Paragraph("SaRa");
			//pdfDoc.addNewPage();
			Document document = new Document(pdfDoc);
			String empId =""+employee.getEmpId();
			document.add(new Paragraph(empId));
			String name = employee.getFirstName()+" "+employee.getLastName();
			document.add(new Paragraph(name));
			document.add(new Paragraph(employee.getAddress()));
			document.add(new Paragraph(employee.getRoll()));
			document.add(new Paragraph(employee.getCompanyName()));
			document.add(new Paragraph(employee.getLocation()));
			String contact = ""+employee.getContactNumber();
			document.add(new Paragraph(contact));
			String salary = ""+employee.getSalary();
			document.add(new Paragraph(salary));
			document.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
