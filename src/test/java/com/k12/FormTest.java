//package com.k12;
//
//import org.junit.Test;
//import java.net.URISyntaxException;
//
//import static org.junit.Assert.assertEquals;
//
//public class FormTest {
//
//    private static final AutomatedBrowserFactory AUTOMATED_BROWSER_FACTORY = new AutomatedBrowserFactory();
//
//    @Test
//    public void formTestByID() throws URISyntaxException {
//        final AutomatedBrowser automatedBrowser =
//                AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("Chrome");
//
//        try {
//            automatedBrowser.init();
//            automatedBrowser.goTo("https://ipublicmarketing.s3.amazonaws.com/form.html");
//            automatedBrowser.clickElementWithId("button_element");
//            assertEquals("Button Mouse Over", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.populateElementWithId("text_element", "test text");
//            assertEquals("Text Input Changed", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.populateElementWithId("textarea_element", "test text");
//            assertEquals("Text Area Changed", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.selectOptionByTextFromSelectWithId("Option 2.1", "select_element");
//            assertEquals("Select Changed", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.clickElementWithId("radio3_element");
//            assertEquals("Radio Button Changed", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.clickElementWithId("checkbox2_element");
//            assertEquals("Checkbox Changed", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.clickElementWithId("image_element");
//            assertEquals("Image Clicked", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.clickElementWithId("div_element");
//            assertEquals("Div Clicked", automatedBrowser.getTextFromElementWithId("message"));
//
//        } finally {
//            automatedBrowser.destroy();
//        }
//    }
//
//    @Test
//    public void formTestByXPath() throws URISyntaxException {
//
//        final AutomatedBrowser automatedBrowser = AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("Chrome");
//
//        try {
//            automatedBrowser.init();
//
////            automatedBrowser.goTo(FormTest.class.getResource("https://ipublicmarketing.s3.amazonaws.com/form.html").toURI().toString());
//            automatedBrowser.goTo("https://ipublicmarketing.s3.amazonaws.com/form.html");
//            automatedBrowser.clickElementWithXPath("//*[@id=\"button_element\"]");
//            assertEquals("Button Mouse Over", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.populateElementWithXPath("//*[@id=\"text_element\"]", "test text");
//            assertEquals("Text Input Changed", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.populateElementWithXPath("//*[@id=\"textarea_element\"]", "test text");
//            assertEquals("Text Area Changed", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.selectOptionByTextFromSelectWithXPath("Option 2.1", "//*[@id=\"select_element\"]");
//            assertEquals("Select Changed", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.clickElementWithXPath("//*[@id=\"radio3_element\"]");
//            assertEquals("Radio Button Changed", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.clickElementWithXPath("//*[@id=\"checkbox2_element\"]");
//            assertEquals("Checkbox Changed", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.clickElementWithXPath("//*[@id=\"image_element\"]");
//            assertEquals("Image Clicked", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.clickElementWithXPath("//*[@id=\"div_element\"]");
//            assertEquals("Div Clicked", automatedBrowser.getTextFromElementWithId("message"));
//        } finally {
//            automatedBrowser.destroy();
//        }
//    }
//
//    @Test
//    public void formTestByCSSSelector() throws URISyntaxException {
//        final AutomatedBrowser automatedBrowser = AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("FirefoxHeadless");
//
//        try {
//            automatedBrowser.init();
//
//            automatedBrowser.goTo("https://ipublicmarketing.s3.amazonaws.com/form.html");
//            automatedBrowser.clickElementWithCSSSelector("#button_element");
//            assertEquals("Button Mouse Over", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.populateElementWithCSSSelector("#text_element", "test text");
//            assertEquals("Text Input Changed", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.populateElementWithCSSSelector("#textarea_element", "test text");
//            assertEquals("Text Area Changed", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.selectOptionByTextFromSelectWithCSSSelector("Option 2.1", "#select_element");
//            assertEquals("Select Changed", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.clickElementWithCSSSelector("#radio3_element");
//            assertEquals("Radio Button Changed", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.clickElementWithCSSSelector("#checkbox2_element");
//            assertEquals("Checkbox Changed", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.clickElementWithCSSSelector("#image_element");
//            assertEquals("Image Clicked", automatedBrowser.getTextFromElementWithId("message"));
//
//            automatedBrowser.clickElementWithCSSSelector("#div_element");
//            assertEquals("Div Clicked", automatedBrowser.getTextFromElementWithId("message"));
//        } finally {
//            automatedBrowser.destroy();
//        }
//    }
//}