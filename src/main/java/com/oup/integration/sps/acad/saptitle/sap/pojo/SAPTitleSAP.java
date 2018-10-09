package com.oup.integration.sps.acad.saptitle.sap.pojo;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@CsvRecord(separator = ",")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"productISBN",
"binding",
"bindType",
"workTitle",
"coverPrint",
"productExtent",
"finish",
"productTrimPage",
"impressionController",
"textPrint",
"textPrintNotes",
"mainTextPP",
"platesExist",
"platePagesCount",
"platePagesPosition",
"platePagesColour",
"bleedsExist",
"textPaper"
})
public class SAPTitleSAP {

/**
* product ISBN
* <p>
* 
* 
*/
@DataField(pos=1)
@JsonProperty("productISBN")
private String productISBN = "";
/**
* binding
* <p>
* 
* 
*/
@DataField(pos=8)
@JsonProperty("binding")
private String binding = "";
/**
* bindingType
* <p>
* 
* 
*/
@DataField(pos=9)
@JsonProperty("bindType")
private String bindType = "";
/**
* workTitle
* <p>
* 
* 
*/
@DataField(pos=4)
@JsonProperty("workTitle")
private String workTitle = "";
/**
* coverPrint
* <p>
* 
* 
*/
@DataField(pos=7)
@JsonProperty("coverPrint")
private String coverPrint = "";
/**
* productExtent
* <p>
* 
* 
*/
@DataField(pos=3)
@JsonProperty("productExtent")
private String productExtent = "";
/**
* 6
* <p>
* 
* 
*/
@DataField(pos=6)
@JsonProperty("finish")
private String finish = "";
/**
* productTrimPage
* <p>
* 
* 
*/
@DataField(pos=2)
@JsonProperty("productTrimPage")
private String productTrimPage;
/**
* impressionController
* <p>
* 
* 
*/
@DataField(pos=4)
@JsonProperty("impressionController")
private String impressionController;
/**
* textPrint
* <p>
* 
* 
*/
@DataField(pos=10)
@JsonProperty("textPrint")
private String textPrint = "";
/**
* textPrintNotes
* <p>
* 
* 
*/
@DataField(pos=11)
@JsonProperty("textPrintNotes")
private String textPrintNotes = "";
/**
* Main Text (pp)
* <p>
* 
* 
*/
@DataField(pos=12)
@JsonProperty("mainTextPP")
private Integer mainTextPP;
/**
* Plates?
* <p>
* 
* 
*/
@DataField(pos=13)
@JsonProperty("platesExist")
private String platesExist = "";
/**
* Number of Plate Pages
* <p>
* 
* 
*/
@DataField(pos=14)
@JsonProperty("platePagesCount")
private String platePagesCount;
/**
* Position of Plate Pages
* <p>
* 
* 
*/
@DataField(pos=15)
@JsonProperty("platePagesPosition")
private String platePagesPosition = "";
/**
* Color of Plate Pages
* <p>
* 
* 
*/
@DataField(pos=16)
@JsonProperty("platePagesColour")
private String platePagesColour = "";
/**
* Bleeds?
* <p>
* 
* 
*/
@DataField(pos=17)
@JsonProperty("bleedsExist")
private String bleedsExist = "";
/**
* Bleeds?
* <p>
* 
* 
*/
@DataField(pos=18)
@JsonProperty("textPaper")
private String textPaper = "";
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* product ISBN
* <p>
* 
* 
*/
@JsonProperty("productISBN")
public String getProductISBN() {
return productISBN;
}

/**
* product ISBN
* <p>
* 
* 
*/
@JsonProperty("productISBN")
public void setProductISBN(String productISBN) {
this.productISBN = productISBN;
}

/**
* binding
* <p>
* 
* 
*/
@JsonProperty("binding")
public String getBinding() {
return binding;
}

/**
* binding
* <p>
* 
* 
*/
@JsonProperty("binding")
public void setBinding(String binding) {
this.binding = binding;
}

/**
* bindingType
* <p>
* 
* 
*/
@JsonProperty("bindType")
public String getBindType() {
return bindType;
}

/**
* bindingType
* <p>
* 
* 
*/
@JsonProperty("bindType")
public void setBindType(String bindType) {
this.bindType = bindType;
}

/**
* workTitle
* <p>
* 
* 
*/
@JsonProperty("workTitle")
public String getWorkTitle() {
return workTitle;
}

/**
* workTitle
* <p>
* 
* 
*/
@JsonProperty("workTitle")
public void setWorkTitle(String workTitle) {
this.workTitle = workTitle;
}

/**
* coverPrint
* <p>
* 
* 
*/
@JsonProperty("coverPrint")
public String getCoverPrint() {
return coverPrint;
}

/**
* coverPrint
* <p>
* 
* 
*/
@JsonProperty("coverPrint")
public void setCoverPrint(String coverPrint) {
this.coverPrint = coverPrint;
}

/**
* productExtent
* <p>
* 
* 
*/
@JsonProperty("productExtent")
public String getProductExtent() {
return productExtent;
}

/**
* productExtent
* <p>
* 
* 
*/
@JsonProperty("productExtent")
public void setProductExtent(String productExtent) {
this.productExtent = productExtent;
}

/**
* finish
* <p>
* 
* 
*/
@JsonProperty("finish")
public String getFinish() {
return finish;
}

/**
* finish
* <p>
* 
* 
*/
@JsonProperty("finish")
public void setFinish(String finish) {
this.finish = finish;
}

/**
* productTrimPage
* <p>
* 
* 
*/
@JsonProperty("productTrimPage")
public String getProductTrimPage() {
return productTrimPage;
}

/**
* productTrimPage
* <p>
* 
* 
*/
@JsonProperty("productTrimPage")
public void setProductTrimPage(String productTrimPage) {
this.productTrimPage = productTrimPage;
}

/**
* impressionController
* <p>
* 
* 
*/
@JsonProperty("impressionController")
public String getImpressionController() {
return impressionController;
}

/**
* impressionController
* <p>
* 
* 
*/
@JsonProperty("impressionController")
public void setImpressionController(String impressionController) {
this.impressionController = impressionController;
}

/**
* textPrint
* <p>
* 
* 
*/
@JsonProperty("textPrint")
public String getTextPrint() {
return textPrint;
}

/**
* textPrint
* <p>
* 
* 
*/
@JsonProperty("textPrint")
public void setTextPrint(String textPrint) {
this.textPrint = textPrint;
}

/**
* textPrintNotes
* <p>
* 
* 
*/
@JsonProperty("textPrintNotes")
public String getTextPrintNotes() {
return textPrintNotes;
}

/**
* textPrintNotes
* <p>
* 
* 
*/
@JsonProperty("textPrintNotes")
public void setTextPrintNotes(String textPrintNotes) {
this.textPrintNotes = textPrintNotes;
}

/**
* Main Text (pp)
* <p>
* 
* 
*/
@JsonProperty("mainTextPP")
public Integer getMainTextPP() {
return mainTextPP;
}

/**
* Main Text (pp)
* <p>
* 
* 
*/
@JsonProperty("mainTextPP")
public void setMainTextPP(Integer mainTextPP) {
this.mainTextPP = mainTextPP;
}

/**
* Plates?
* <p>
* 
* 
*/
@JsonProperty("platesExist")
public String getPlatesExist() {
return platesExist;
}

/**
* Plates?
* <p>
* 
* 
*/
@JsonProperty("platesExist")
public void setPlatesExist(String platesExist) {
this.platesExist = platesExist;
}

/**
* Number of Plate Pages
* <p>
* 
* 
*/
@JsonProperty("platePagesCount")
public String getPlatePagesCount() {
return platePagesCount;
}

/**
* Number of Plate Pages
* <p>
* 
* 
*/
@JsonProperty("platePagesCount")
public void setPlatePagesCount(String platePagesCount) {
this.platePagesCount = platePagesCount;
}

/**
* Position of Plate Pages
* <p>
* 
* 
*/
@JsonProperty("platePagesPosition")
public String getPlatePagesPosition() {
return platePagesPosition;
}

/**
* Position of Plate Pages
* <p>
* 
* 
*/
@JsonProperty("platePagesPosition")
public void setPlatePagesPosition(String platePagesPosition) {
this.platePagesPosition = platePagesPosition;
}

/**
* Color of Plate Pages
* <p>
* 
* 
*/
@JsonProperty("platePagesColour")
public String getPlatePagesColour() {
return platePagesColour;
}

/**
* Color of Plate Pages
* <p>
* 
* 
*/
@JsonProperty("platePagesColour")
public void setPlatePagesColour(String platePagesColour) {
this.platePagesColour = platePagesColour;
}

/**
* Bleeds?
* <p>
* 
* 
*/
@JsonProperty("bleedsExist")
public String getBleedsExist() {
return bleedsExist;
}

/**
* Bleeds?
* <p>
* 
* 
*/
@JsonProperty("bleedsExist")
public void setBleedsExist(String bleedsExist) {
this.bleedsExist = bleedsExist;
}

/**
* Bleeds?
* <p>
* 
* 
*/
@JsonProperty("textPaper")
public String getTextPaper() {
return textPaper;
}

/**
* Bleeds?
* <p>
* 
* 
*/
@JsonProperty("textPaper")
public void setTextPaper(String textPaper) {
this.textPaper = textPaper;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}