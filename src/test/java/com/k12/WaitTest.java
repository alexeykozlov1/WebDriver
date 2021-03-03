//package com.k12;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.TimeoutException;
//
//import java.net.URISyntaxException;
//
//import static org.junit.Assert.assertEquals;
//
//public class WaitTest {
//    private static final AutomatedBrowserFactory AUTOMATED_BROWSER_FACTORY = new AutomatedBrowserFactory();
//
//    @Test
//    public void clickDynamicElement() throws URISyntaxException {
//        final AutomatedBrowser automatedBrowser = AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("Chrome");
//
//        try {
//            automatedBrowser.init();
//            automatedBrowser.goTo("https://ipublicmarketing.s3.amazonaws.com/form.html");
//            automatedBrowser.clickElementWithId("newdiv_element");
//        } finally {
//            automatedBrowser.destroy();
//        }
//    }
//
////    @Test
////    public void clickDynamicElementWithExplicitWait() throws URISyntaxException {
////        final AutomatedBrowser automatedBrowser =
////                AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("Chrome");
////
////        try {
////            automatedBrowser.init();
////            automatedBrowser.goTo("https://ipublicmarketing.s3.amazonaws.com/form.html");
////            automatedBrowser.clickElementWithId("newdiv_element", 10);
////
////        } finally {
////            automatedBrowser.destroy();
////        }
////    }
////
////    @Test
////    public void clickHiddenElement() throws URISyntaxException {
////
////        final AutomatedBrowser automatedBrowser =
////                AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("Chrome");
////
////        try {
////            automatedBrowser.init();
////            automatedBrowser.goTo("https://ipublicmarketing.s3.amazonaws.com/form.html");
////            automatedBrowser.clickElementWithId("div3_element");
////        } finally {
////            automatedBrowser.destroy();
////        }
////    }
////
////    @Test
////    public void clickHiddenElementWithExplicitWait() throws URISyntaxException {
////        final AutomatedBrowser automatedBrowser =
////                AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("Chrome");
////
////        try {
////            automatedBrowser.init();
////            automatedBrowser.goTo("https://ipublicmarketing.s3.amazonaws.com/form.html");
////            automatedBrowser.clickElementWithId("div3_element", 10);
////        } finally {
////            automatedBrowser.destroy();
////        }
////    }
////
////    @Test(expected = TimeoutException.class)
////    public void mixedTestShortExplicitWait() throws URISyntaxException {
////
////        final AutomatedBrowser automatedBrowser = AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("Chrome");
////
////        final long start = System.currentTimeMillis();
////
////        try {
////            automatedBrowser.init();
////            automatedBrowser.goTo("https://ipublicmarketing.s3.amazonaws.com/form.html");
////            automatedBrowser.clickElementWithId("This ID does not exist", 1);
////        } finally {
////            automatedBrowser.destroy();
////            final long duration = System.currentTimeMillis() - start;
////            System.out.println("Duration: " + duration / 1000);
////        }
////    }
////
////    @Test
////    public void shortExplicitWaitForDynamicElement() throws URISyntaxException {
////
////        final AutomatedBrowser automatedBrowser = AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("Chrome");
////
////        final long start = System.currentTimeMillis();
////
////        try {
////            automatedBrowser.init();
////            automatedBrowser.goTo("https://ipublicmarketing.s3.amazonaws.com/form.html");
////            automatedBrowser.clickElementWithId("newdiv_element", 2);
////        } finally {
////            automatedBrowser.destroy();
////            final long duration = System.currentTimeMillis() - start;
////            System.out.println("Duration: " + duration / 1000);
////        }
////    }
////
////    @Test(expected = TimeoutException.class)
////    public void shortExplicitWaitNoImplicitWaitForDynamicElement() throws URISyntaxException {
////        final AutomatedBrowser automatedBrowser = AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("ChromeNoImplicitWait");
////        final long start = System.currentTimeMillis();
////
////        try {
////            automatedBrowser.init();
////            automatedBrowser.goTo("https://ipublicmarketing.s3.amazonaws.com/form.html");
////            automatedBrowser.clickElementWithId("newdiv_element", 2);
////        } finally {
////            automatedBrowser.destroy();
////            final long duration = System.currentTimeMillis() - start;
////            System.out.println("Duration: " + duration / 1000);
////        }
////    }
////
////    @Test
////    public void formTestWithSimpleBy() throws URISyntaxException {
////        final AutomatedBrowser automatedBrowser = AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("ChromeNoImplicitWait");
////
////        final String formButtonLocator = "button_element";
////        final String formTextBoxLocator = "text_element";
////        final String formTextAreaLocator = "textarea_element";
////        final String formDropDownListLocator = "[name=select_element]";
////
////        final String formCheckboxLocator = "//*[@name=\"checkbox1_element\"]";
////
////        final String messageLocator = "message";
////
////        try {
////            automatedBrowser.init();
////
////            automatedBrowser.goTo("https://ipublicmarketing.s3.amazonaws.com/form.html");
////
////            automatedBrowser.clickElement(formButtonLocator, 10);
////            assertEquals("Button Mouse Over", automatedBrowser.getTextFromElement(messageLocator));
////
////            automatedBrowser.populateElement(formTextBoxLocator, "test text", 10);
////            assertEquals("Text Input Changed", automatedBrowser.getTextFromElement(messageLocator));
////
////            automatedBrowser.populateElement(formTextAreaLocator, "test text", 10);
////            assertEquals("Text Area Changed", automatedBrowser.getTextFromElement(messageLocator));
////
////            automatedBrowser.selectOptionByTextFromSelect("Option 2.1", formDropDownListLocator, 10);
////            assertEquals("Select Changed", automatedBrowser.getTextFromElement(messageLocator));
////
////            automatedBrowser.clickElement(formCheckboxLocator, 10);
////            assertEquals("Checkbox Changed", automatedBrowser.getTextFromElement(messageLocator));
////        } finally {
////            automatedBrowser.destroy();
////        }
////    }
////
////    @Test
////    public void formTestByIDFirefox() throws URISyntaxException {
////
////        final AutomatedBrowser automatedBrowser =
////                AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("Firefox");
////
////        try {
////            automatedBrowser.init();
////
////            automatedBrowser.goTo("https://ipublicmarketing.s3.amazonaws.com/form.html");
////
////            automatedBrowser.clickElementWithId("button_element");
////            assertEquals("Button Mouse Over", automatedBrowser.getTextFromElementWithId("message"));
////
////            automatedBrowser.populateElementWithId("text_element", "test text");
////            assertEquals("Text Input Changed", automatedBrowser.getTextFromElementWithId("message"));
////
////            automatedBrowser.populateElementWithId("textarea_element", "test text");
////            assertEquals("Text Area Changed", automatedBrowser.getTextFromElementWithId("message"));
////
////            automatedBrowser.selectOptionByTextFromSelectWithId("Option 2.1", "select_element");
////            assertEquals("Select Changed", automatedBrowser.getTextFromElementWithId("message"));
////
////            automatedBrowser.clickElementWithId("radio3_element");
////            assertEquals("Radio Button Changed", automatedBrowser.getTextFromElementWithId("message"));
////
////            automatedBrowser.clickElementWithId("checkbox2_element");
////            assertEquals("Checkbox Changed", automatedBrowser.getTextFromElementWithId("message"));
////
////            automatedBrowser.clickElementWithId("image_element");
////            assertEquals("Image Clicked", automatedBrowser.getTextFromElementWithId("message"));
////
////            automatedBrowser.clickElementWithId("div_element");
////            assertEquals("Div Clicked", automatedBrowser.getTextFromElementWithId("message"));
////        } finally {
////            automatedBrowser.destroy();
////        }
////    }
////
////    @Test
////    public void captureHarFile() throws URISyntaxException {
////        final AutomatedBrowser automatedBrowser =
////                AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("Chrome");
////
////        try {
////            automatedBrowser.init();
////            automatedBrowser.captureHarFile();
////            automatedBrowser.goTo("https://octopus.com/");
////        } finally {
////            try {
////                automatedBrowser.saveHarFile("test.har");
////            } finally {
////                automatedBrowser.destroy();
////            }
////        }
////    }
////
////    @Test
////    public void captureCompleteHarFile() throws URISyntaxException {
////
////        final AutomatedBrowser automatedBrowser =
////                AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("Chrome");
////
////        try {
////            automatedBrowser.init();
////            automatedBrowser.captureCompleteHarFile();
////            automatedBrowser.goTo("https://google.com/");
////        } finally {
////            try {
////                automatedBrowser.saveHarFile("test1.har");
////            } finally {
////                automatedBrowser.destroy();
////            }
////        }
////    }
////
////    @Test
////    public void modifyRequests() {
////        final AutomatedBrowser automatedBrowser =
////                AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("Firefox");
////
////        automatedBrowser.init();
////        automatedBrowser.blockRequestTo(".*?\\.png", 201);
////        automatedBrowser.blockRequestTo(".*?\\.svg", 201);
////        automatedBrowser.blockRequestTo("https://.*?twitter\\.com/", 500);
////        automatedBrowser.goTo("https://octopus.com/");
////        automatedBrowser.destroy();
////    }
////
//////    @Test
//////    public void mockRequests() throws URISyntaxException {
//////        final AutomatedBrowser automatedBrowser = AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("Firefox");
//////
//////        try {
//////            automatedBrowser.init();
//////
//////            automatedBrowser.alterResponseFrom(
//////                    ".*?query\\.yahooapis\\.com.*",
//////                    200,
//////                    "{\"query\":{\"count\":1,\"created\":\"2020-04-28T05:20:30Z\",\"lang\":\"en-US\",\"results\":{\"channel\":{\"astronomy\":{\"sunset\":\"7:00 pm\"}}}}}");
//////
//////            automatedBrowser.goTo(FormTest.class.getResource("/apitest.html").toURI().toString());
//////
//////            final String sunset = automatedBrowser.getTextFromElementWithId("sunset", 60);
//////            Assert.assertTrue(sunset, sunset.contains("7:00 pm"));
//////        } finally {
//////            automatedBrowser.destroy();
//////        }
//////    }
////
//////    @Test
//////    public void mockRequests2() throws URISyntaxException {
//////        final AutomatedBrowser automatedBrowser = AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("Firefox");
//////
//////        try {
//////            automatedBrowser.init();
//////
//////            automatedBrowser.alterResponseFrom(
//////                    ".*?query\\.yahooapis\\.com.*",
//////                    200,
//////                    "{\"query\":{\"count\":1,\"created\":\"2018-04-28T05:20:30Z\",\"lang\":\"en-US\",\"results\":{\"channel\":{\"astronomy\":{\"sunset\":\"7:4 pm\"}}}}}");
//////
//////            automatedBrowser.goTo(FormTest.class.getResource("/apitest.html").toURI().toString());
//////
//////            final String sunset = automatedBrowser.getTextFromElementWithId("sunset", 60);
//////            Assert.assertTrue(sunset, sunset.contains("7:4 pm"));
//////        } finally {
//////            automatedBrowser.destroy();
//////        }
//////    }
//
//    @Test
//    public void browserStackTest() {
//
//        final AutomatedBrowser automatedBrowser =
//                AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("BrowserStackEdge");
//
//        final String formButtonLocator = "button_element";
//        final String formTextBoxLocator = "text_element";
//        final String formTextAreaLocator = "textarea_element";
//        final String formDropDownListLocator = "//*[@name=\"select_element\"]";
//        final String formCheckboxLocator = "//*[@name=\"checkbox1_element\"]";
//
//        final String messageLocator = "message";
//
//        try {
//            automatedBrowser.init();
//
//            automatedBrowser.maximizeWindow();
//
//            automatedBrowser.goTo("https://ipublicmarketing.s3.amazonaws.com/form.html");
//
//            automatedBrowser.clickElement(formButtonLocator);
//            assertEquals("Button Mouse Over", automatedBrowser.getTextFromElement(messageLocator));
//
//            automatedBrowser.populateElement(formTextBoxLocator, "test text");
//            assertEquals("Text Input Changed", automatedBrowser.getTextFromElement(messageLocator));
//
//            automatedBrowser.populateElement(formTextAreaLocator, "test text");
//            assertEquals("Text Area Changed", automatedBrowser.getTextFromElement(messageLocator));
//
//            automatedBrowser.selectOptionByTextFromSelect("Option 2.1", formDropDownListLocator);
//            assertEquals("Select Changed",  automatedBrowser.getTextFromElement(messageLocator));
//
//            automatedBrowser.clickElement(formCheckboxLocator);
//            assertEquals("Checkbox Changed", automatedBrowser.getTextFromElement(messageLocator));
//
//        } finally {
//            automatedBrowser.destroy();
//        }
//    }
//    @Test
//    public void browserStackAndroidTest() {
//
//        final AutomatedBrowser automatedBrowser =
//                AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("BrowserStackAndroid");
//
//        final String formButtonLocator = "button_element";
//        final String formTextBoxLocator = "text_element";
//        final String formTextAreaLocator = "textarea_element";
//        final String formDropDownListLocator = "//*[@name=\"select_element\"]";
//        final String formCheckboxLocator = "//*[@name=\"checkbox1_element\"]";
//        final String messageLocator = "message";
//
//        try {
//            automatedBrowser.init();
//
//            automatedBrowser.goTo("https://s3.amazonaws.com/webdriver-testing-website/form.html");
//
//            automatedBrowser.clickElement(formButtonLocator);
//            assertEquals("Button Mouse Over", automatedBrowser.getTextFromElement(messageLocator));
//
//            automatedBrowser.populateElement(formTextBoxLocator, "test text");
//            assertEquals("Text Input Changed", automatedBrowser.getTextFromElement(messageLocator));
//
//            automatedBrowser.populateElement(formTextAreaLocator, "test text");
//            assertEquals("Text Area Changed", automatedBrowser.getTextFromElement(messageLocator));
//
//            automatedBrowser.selectOptionByTextFromSelect("Option 2.1",
//                    formDropDownListLocator);
//            assertEquals("Select Changed", automatedBrowser.getTextFromElement(messageLocator));
//
//            automatedBrowser.clickElement(formCheckboxLocator);
//            assertEquals("Checkbox Changed", automatedBrowser.getTextFromElement(messageLocator));
//        } finally {
//            automatedBrowser.destroy();
//        }
//    }
//
//}