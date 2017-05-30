package com.cla.action;

import org.apache.log4j.Logger;
import com.pfframe.action.CurdBaseAction;
import com.appsys.model.Newsinfo;
import com.appsys.service.INewsinfoService;

@SuppressWarnings("serial")
public class NewsinfoAction extends CurdBaseAction<Newsinfo, String>{
	private static final Logger logger = Logger.getLogger(NewsinfoAction.class);
	private INewsinfoService newsinfoService;

	public void setNewsinfoService(INewsinfoService newsinfoService) {
		this.newsinfoService = newsinfoService;
	}

	public Newsinfo getObj() {
		return obj;
	}

	public void setObj(Newsinfo obj) {
		this.obj = obj;
	}
	
	public String getObjid(){
		if(obj !=null && objid ==null){
			objid = obj.getNewsinfoid();
		}
		return objid;
	}
	
	public void setObjid(String objid) {
		this.objid = objid;
	}

	public NewsinfoAction() {
		super();
	}
}
