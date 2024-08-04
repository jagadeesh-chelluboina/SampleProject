package com.jumbo.epay.beans;

import java.math.BigDecimal;

import org.codehaus.jackson.annotate.JsonProperty;

public class JEEpaySaleAPIrequest {
	@JsonProperty("postedinfo")private String postedinfo;
	@JsonProperty("url")private String url;
	
	@JsonProperty("saleType") private String saleType; 
	@JsonProperty("terminalid") private String terminalid;
	@JsonProperty("localdatetime") private BigDecimal localdatetime; 
	@JsonProperty("servicedatetime") private String servicedatetime;
	@JsonProperty("taxid") private String taxid;
	@JsonProperty("hosttaxid") private String hosttaxid;
	@JsonProperty("productid") private BigDecimal productid;
	@JsonProperty("amount") private String amount; 
	@JsonProperty("currrency") private String currrency;
	@JsonProperty("limit") private BigDecimal limit; 
	@JsonProperty("result") private String result;
	@JsonProperty("resulttext") private String resulttext;
	@JsonProperty("receipt") private String receipt;
	@JsonProperty("customer") private BigDecimal customer;
	@JsonProperty("pincredentials") private String pincredentials;
	/**
	 * @return the postedinfo
	 */
	private String getPostedinfo() {
		return postedinfo;
	}
	/**
	 * @param postedinfo the postedinfo to set
	 */
	private void setPostedinfo(String postedinfo) {
		this.postedinfo = postedinfo;
	}
	/**
	 * @return the url
	 */
	private String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	private void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the saleType
	 */
	private String getSaleType() {
		return saleType;
	}
	/**
	 * @param saleType the saleType to set
	 */
	private void setSaleType(String saleType) {
		this.saleType = saleType;
	}
	/**
	 * @return the terminalid
	 */
	private String getTerminalid() {
		return terminalid;
	}
	/**
	 * @param terminalid the terminalid to set
	 */
	private void setTerminalid(String terminalid) {
		this.terminalid = terminalid;
	}
	/**
	 * @return the localdatetime
	 */
	private BigDecimal getLocaldatetime() {
		return localdatetime;
	}
	/**
	 * @param localdatetime the localdatetime to set
	 */
	private void setLocaldatetime(BigDecimal localdatetime) {
		this.localdatetime = localdatetime;
	}
	/**
	 * @return the servicedatetime
	 */
	private String getServicedatetime() {
		return servicedatetime;
	}
	/**
	 * @param servicedatetime the servicedatetime to set
	 */
	private void setServicedatetime(String servicedatetime) {
		this.servicedatetime = servicedatetime;
	}
	/**
	 * @return the taxid
	 */
	private String getTaxid() {
		return taxid;
	}
	/**
	 * @param taxid the taxid to set
	 */
	private void setTaxid(String taxid) {
		this.taxid = taxid;
	}
	/**
	 * @return the hosttaxid
	 */
	private String getHosttaxid() {
		return hosttaxid;
	}
	/**
	 * @param hosttaxid the hosttaxid to set
	 */
	private void setHosttaxid(String hosttaxid) {
		this.hosttaxid = hosttaxid;
	}
	/**
	 * @return the productid
	 */
	private BigDecimal getProductid() {
		return productid;
	}
	/**
	 * @param productid the productid to set
	 */
	private void setProductid(BigDecimal productid) {
		this.productid = productid;
	}
	/**
	 * @return the amount
	 */
	private String getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	private void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * @return the currrency
	 */
	private String getCurrrency() {
		return currrency;
	}
	/**
	 * @param currrency the currrency to set
	 */
	private void setCurrrency(String currrency) {
		this.currrency = currrency;
	}
	/**
	 * @return the limit
	 */
	private BigDecimal getLimit() {
		return limit;
	}
	/**
	 * @param limit the limit to set
	 */
	private void setLimit(BigDecimal limit) {
		this.limit = limit;
	}
	/**
	 * @return the result
	 */
	private String getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	private void setResult(String result) {
		this.result = result;
	}
	/**
	 * @return the resulttext
	 */
	private String getResulttext() {
		return resulttext;
	}
	/**
	 * @param resulttext the resulttext to set
	 */
	private void setResulttext(String resulttext) {
		this.resulttext = resulttext;
	}
	/**
	 * @return the receipt
	 */
	private String getReceipt() {
		return receipt;
	}
	/**
	 * @param receipt the receipt to set
	 */
	private void setReceipt(String receipt) {
		this.receipt = receipt;
	}
	/**
	 * @return the customer
	 */
	private BigDecimal getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	private void setCustomer(BigDecimal customer) {
		this.customer = customer;
	}
	/**
	 * @return the pincredentials
	 */
	private String getPincredentials() {
		return pincredentials;
	}
	/**
	 * @param pincredentials the pincredentials to set
	 */
	private void setPincredentials(String pincredentials) {
		this.pincredentials = pincredentials;
	}
	@Override
	public String toString() {
		return "JEEpaySaleAPIrequest [postedinfo=" + postedinfo + ", url=" + url + ", saleType=" + saleType
				+ ", terminalid=" + terminalid + ", localdatetime=" + localdatetime + ", servicedatetime="
				+ servicedatetime + ", taxid=" + taxid + ", hosttaxid=" + hosttaxid + ", productid=" + productid
				+ ", amount=" + amount + ", currrency=" + currrency + ", limit=" + limit + ", result=" + result
				+ ", resulttext=" + resulttext + ", receipt=" + receipt + ", customer=" + customer + ", pincredentials="
				+ pincredentials + "]";
	}
}


//Changes are made in JEsale class
