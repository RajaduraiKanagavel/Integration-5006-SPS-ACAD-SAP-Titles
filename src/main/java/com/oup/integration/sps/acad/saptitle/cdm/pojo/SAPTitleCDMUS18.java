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
public class SAPTitleCDMUS18 {

/**
* product ISBN
* <p>
* 
* 
*/
@JsonProperty("productISBN")
private String productISBN = "";
/**
* productExtent
* <p>
* 
* 
*/
@JsonProperty("productExtent")
private String productExtent = "";
/**
* productTrimPage
* <p>
* 
* 
*/
@JsonProperty("productTrimPage")
private Long productTrimPage;
/**
* impressionController
* <p>
* 
* 
*/
@JsonProperty("impressionController")
private Long impressionController;
/**
* indicator
* <p>
* 
* 
*/
@JsonProperty("indicator")
private String indicator = "";
/**
* marketingController
* <p>
* 
* 
*/
@JsonProperty("marketingController")
private String marketingController = "";
/**
* productionEditor
* <p>
* 
* 
*/
@JsonProperty("productionEditor")
private String productionEditor = "";
/**
* originalIdentificationCode
* <p>
* 
* 
*/
@JsonProperty("originalIdentificationCode")
private String originalIdentificationCode = "";
/**
* series
* <p>
* 
* 
*/
@JsonProperty("series")
private String series = "";
/**
* responsibleEditor
* <p>
* 
* 
*/
@JsonProperty("responsibleEditor")
private String responsibleEditor = "";
/**
* mediaType
* <p>
* 
* 
*/
@JsonProperty("mediaType")
private String mediaType = "";
/**
* materialPricingGroup
* <p>
* 
* 
*/
@JsonProperty("materialPricingGroup")
private String materialPricingGroup = "";
/**
* cycle
* <p>
* 
* 
*/
@JsonProperty("cycle")
private Long cycle;
/**
* isTitleNegotiated
* <p>
* 
* 
*/
@JsonProperty("isTitleNegotiated")
private String isTitleNegotiated = "";
/**
* onlineProduct
* <p>
* 
* 
*/
@JsonProperty("onlineProduct")
private String onlineProduct = "";
/**
* previoustISBN
* <p>
* 
* 
*/
@JsonProperty("previoustISBN")
private String previoustISBN = "";
/**
* catalog
* <p>
* 
* 
*/
@JsonProperty("catalog")
private String catalog = "";
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
public Long getImpressionController() {
return impressionController;
}

/**
* impressionController
* <p>
* 
* 
*/
@JsonProperty("impressionController")
public void setImpressionController(Long impressionController) {
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

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}