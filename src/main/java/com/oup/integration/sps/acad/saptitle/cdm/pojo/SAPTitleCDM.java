package com.oup.integration.sps.acad.saptitle.cdm.pojo;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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
public class SAPTitleCDM {

/**
* product ISBN
* <p>
* 
* 
*/
@JsonProperty("productISBN")
private String productISBN = "";
/**
* binding
* <p>
* 
* 
*/
@JsonProperty("binding")
private String binding = "";
/**
* bindingType
* <p>
* 
* 
*/
@JsonProperty("bindType")
private String bindType = "";
/**
* workTitle
* <p>
* 
* 
*/
@JsonProperty("workTitle")
private String workTitle = "";
/**
* coverPrint
* <p>
* 
* 
*/
@JsonProperty("coverPrint")
private String coverPrint = "";
/**
* productExtent
* <p>
* 
* 
*/
@JsonProperty("productExtent")
private String productExtent = "";
/**
* finish
* <p>
* 
* 
*/
@JsonProperty("finish")
private String finish = "";
/**
* productTrimPage
* <p>
* 
* 
*/
@JsonProperty("productTrimPage")
private String productTrimPage;
/**
* impressionController
* <p>
* 
* 
*/
@JsonProperty("impressionController")
private Integer impressionController;
/**
* textPrint
* <p>
* 
* 
*/
@JsonProperty("textPrint")
private String textPrint = "";
/**
* textPrintNotes
* <p>
* 
* 
*/
@JsonProperty("textPrintNotes")
private String textPrintNotes = "";
/**
* Main Text (pp)
* <p>
* 
* 
*/
@JsonProperty("mainTextPP")
private Integer mainTextPP;
/**
* Plates?
* <p>
* 
* 
*/
@JsonProperty("platesExist")
private String platesExist = "";
/**
* Number of Plate Pages
* <p>
* 
* 
*/
@JsonProperty("platePagesCount")
private String platePagesCount;
/**
* Position of Plate Pages
* <p>
* 
* 
*/
@JsonProperty("platePagesPosition")
private String platePagesPosition = "";
/**
* Color of Plate Pages
* <p>
* 
* 
*/
@JsonProperty("platePagesColour")
private String platePagesColour = "";
/**
* Bleeds?
* <p>
* 
* 
*/
@JsonProperty("bleedsExist")
private String bleedsExist = "";
/**
* Bleeds?
* <p>
* 
* 
*/
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
public Integer getImpressionController() {
return impressionController;
}

/**
* impressionController
* <p>
* 
* 
*/
@JsonProperty("impressionController")
public void setImpressionController(Integer impressionController) {
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