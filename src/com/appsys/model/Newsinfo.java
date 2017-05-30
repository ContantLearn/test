package com.appsys.model;

import java.util.Date;

public class Newsinfo {
  private String newsinfoid;
  
  private String newstypeid;
  
  private String newstitle;
  
  private Date pubdate;
  
  private String pubman;
  
  private Byte[] newscontent;
  
  private String imgurl;
  
  private String linkurl;
  
      
  public String getNewsinfoid() {
		return newsinfoid;
	}
    
  public void setNewsinfoid(String  newsinfoid) {
		this. newsinfoid =  newsinfoid;
	}

  public String getNewstypeid() {
		return newstypeid;
	}
    
  public void setNewstypeid(String  newstypeid) {
		this. newstypeid =  newstypeid;
	}

  public String getNewstitle() {
		return newstitle;
	}
    
  public void setNewstitle(String  newstitle) {
		this. newstitle =  newstitle;
	}

  public Date getPubdate() {
		return pubdate;
	}
    
  public void setPubdate(Date  pubdate) {
		this. pubdate =  pubdate;
	}

  public String getPubman() {
		return pubman;
	}
    
  public void setPubman(String  pubman) {
		this. pubman =  pubman;
	}

  public Byte[] getNewscontent() {
		return newscontent;
	}
    
  public void setNewscontent(Byte[]  newscontent) {
		this. newscontent =  newscontent;
	}

  public String getImgurl() {
		return imgurl;
	}
    
  public void setImgurl(String  imgurl) {
		this. imgurl =  imgurl;
	}

  public String getLinkurl() {
		return linkurl;
	}
    
  public void setLinkurl(String  linkurl) {
		this. linkurl =  linkurl;
	}

}
