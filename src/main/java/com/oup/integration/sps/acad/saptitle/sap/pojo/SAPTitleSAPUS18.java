

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
"productExtent",
"productTrimPage",
"impressionController",
"indicator",
"marketingController",
"productionEditor",
"originalIdentificationCode",
"series",
"responsibleEditor",
"mediaType",
"materialPricingGroup",
"cycle",
"isTitleNegotiated",
"onlineProduct",
"previoustISBN",
"catalog"
})
public class SAPTitleSAPUS18 {

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
* productExtent
* <p>
* 
* 
*/
	@DataField(pos=2)
@JsonProperty("productExtent")
private String productExtent = "";
/**
* productTrimPage
* <p>
* 
* 
*/
	@DataField(pos=3)
@JsonProperty("productTrimPage")
private Long productTrimPage;
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
* indicator
* <p>
* 
* 
*/
	@DataField(pos=5)
@JsonProperty("indicator")
private String indicator = "";
/**
* marketingController
* <p>
* 
* 
*/
	@DataField(pos=6)
@JsonProperty("marketingController")
private String marketingController = "";
/**
* productionEditor
* <p>
* 
* 
*/
	@DataField(pos=7)
@JsonProperty("productionEditor")
private String productionEditor = "";
/**
* originalIdentificationCode
* <p>
* 
* 
*/
	@DataField(pos=8)
@JsonProperty("originalIdentificationCode")
private String originalIdentificationCode = "";
/**
* series
* <p>
* 
* 
*/
	@DataField(pos=9)
@JsonProperty("series")
private String series = "";
/**
* responsibleEditor
* <p>
* 
* 
*/
	@DataField(pos=10)
@JsonProperty("responsibleEditor")
private String responsibleEditor = "";
/**
* mediaType
* <p>
* 
* 
*/
	@DataField(pos=11)
@JsonProperty("mediaType")
private String mediaType = "";
/**
* materialPricingGroup
* <p>
* 
* 
*/
	@DataField(pos=12)
@JsonProperty("materialPricingGroup")
private String materialPricingGroup = "";
/**
* cycle
* <p>
* 
* 
*/
	@DataField(pos=13)
@JsonProperty("cycle")
private Long cycle;
/**
* isTitleNegotiated
* <p>
* 
* 
*/
	@DataField(pos=14)
@JsonProperty("isTitleNegotiated")
private String isTitleNegotiated = "";
/**
* onlineProduct
* <p>
* 
* 
*/
	@DataField(pos=15)
@JsonProperty("onlineProduct")
private String onlineProduct = "";
/**
* previoustISBN
* <p>
* 
* 
*/
	@DataField(pos=16)
@JsonProperty("previoustISBN")
private String previoustISBN = "";
/**
* catalog
* <p>
* 
* 
*/
	@DataField(pos=17)
@JsonProperty("catalog")
private String catalog = "";


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
* productTrimPage
* <p>
* 
* 
*/
@JsonProperty("productTrimPage")
public Long getProductTrimPage() {
return productTrimPage;
}

/**
* productTrimPage
* <p>
* 
* 
*/
@JsonProperty("productTrimPage")
public void setProductTrimPage(Long productTrimPage) {
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
* indicator
* <p>
* 
* 
*/
@JsonProperty("indicator")
public String getIndicator() {
return indicator;
}

/**
* indicator
* <p>
* 
* 
*/
@JsonProperty("indicator")
public void setIndicator(String indicator) {
this.indicator = indicator;
}

/**
* marketingController
* <p>
* 
* 
*/
@JsonProperty("marketingController")
public String getMarketingController() {
return marketingController;
}

/**
* marketingController
* <p>
* 
* 
*/
@JsonProperty("marketingController")
public void setMarketingController(String marketingController) {
this.marketingController = marketingController;
}

/**
* productionEditor
* <p>
* 
* 
*/
@JsonProperty("productionEditor")
public String getProductionEditor() {
return productionEditor;
}

/**
* productionEditor
* <p>
* 
* 
*/
@JsonProperty("productionEditor")
public void setProductionEditor(String productionEditor) {
this.productionEditor = productionEditor;
}

/**
* originalIdentificationCode
* <p>
* 
* 
*/
@JsonProperty("originalIdentificationCode")
public String getOriginalIdentificationCode() {
return originalIdentificationCode;
}

/**
* originalIdentificationCode
* <p>
* 
* 
*/
@JsonProperty("originalIdentificationCode")
public void setOriginalIdentificationCode(String originalIdentificationCode) {
this.originalIdentificationCode = originalIdentificationCode;
}

/**
* series
* <p>
* 
* 
*/
@JsonProperty("series")
public String getSeries() {
return series;
}

/**
* series
* <p>
* 
* 
*/
@JsonProperty("series")
public void setSeries(String series) {
this.series = series;
}

/**
* responsibleEditor
* <p>
* 
* 
*/
@JsonProperty("responsibleEditor")
public String getResponsibleEditor() {
return responsibleEditor;
}

/**
* responsibleEditor
* <p>
* 
* 
*/
@JsonProperty("responsibleEditor")
public void setResponsibleEditor(String responsibleEditor) {
this.responsibleEditor = responsibleEditor;
}

/**
* mediaType
* <p>
* 
* 
*/
@JsonProperty("mediaType")
public String getMediaType() {
return mediaType;
}

/**
* mediaType
* <p>
* 
* 
*/
@JsonProperty("mediaType")
public void setMediaType(String mediaType) {
this.mediaType = mediaType;
}

/**
* materialPricingGroup
* <p>
* 
* 
*/
@JsonProperty("materialPricingGroup")
public String getMaterialPricingGroup() {
return materialPricingGroup;
}

/**
* materialPricingGroup
* <p>
* 
* 
*/
@JsonProperty("materialPricingGroup")
public void setMaterialPricingGroup(String materialPricingGroup) {
this.materialPricingGroup = materialPricingGroup;
}

/**
* cycle
* <p>
* 
* 
*/
@JsonProperty("cycle")
public Long getCycle() {
return cycle;
}

/**
* cycle
* <p>
* 
* 
*/
@JsonProperty("cycle")
public void setCycle(Long cycle) {
this.cycle = cycle;
}

/**
* isTitleNegotiated
* <p>
* 
* 
*/
@JsonProperty("isTitleNegotiated")
public String getIsTitleNegotiated() {
return isTitleNegotiated;
}

/**
* isTitleNegotiated
* <p>
* 
* 
*/
@JsonProperty("isTitleNegotiated")
public void setIsTitleNegotiated(String isTitleNegotiated) {
this.isTitleNegotiated = isTitleNegotiated;
}

/**
* onlineProduct
* <p>
* 
* 
*/
@JsonProperty("onlineProduct")
public String getOnlineProduct() {
return onlineProduct;
}

/**
* onlineProduct
* <p>
* 
* 
*/
@JsonProperty("onlineProduct")
public void setOnlineProduct(String onlineProduct) {
this.onlineProduct = onlineProduct;
}

/**
* previoustISBN
* <p>
* 
* 
*/
@JsonProperty("previoustISBN")
public String getPrevioustISBN() {
return previoustISBN;
}

/**
* previoustISBN
* <p>
* 
* 
*/
@JsonProperty("previoustISBN")
public void setPrevioustISBN(String previoustISBN) {
this.previoustISBN = previoustISBN;
}

/**
* catalog
* <p>
* 
* 
*/
@JsonProperty("catalog")
public String getCatalog() {
return catalog;
}

/**
* catalog
* <p>
* 
* 
*/
@JsonProperty("catalog")
public void setCatalog(String catalog) {
this.catalog = catalog;
}



}