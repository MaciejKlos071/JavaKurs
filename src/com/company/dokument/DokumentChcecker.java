package com.company.dokument;

public class DokumentChcecker {
    public static void main(String[] args) {
        ExcelDokument dokument = new ExcelDokument();
        Dokument excelDok = new ExcelDokument();
        Dokument pdfDok = new PdfDokument();
        excelDok.getDescription();
        pdfDok.getDescription();
    }
}
