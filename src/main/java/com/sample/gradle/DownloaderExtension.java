package com.sample.gradle;

public class DownloaderExtension {
    private String pdfTemplate = "https://github.com/stebadmitriy/files/raw/main/Clevertec_Template.pdf";
    private String source = "src/main/resources/Clevertec_Template.pdf";

    public String getPdfTemplate() {
        return pdfTemplate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setFilePath(String filePath) {
        this.pdfTemplate = filePath;
    }

    public String getFilePath() {
        return pdfTemplate;
    }
}
