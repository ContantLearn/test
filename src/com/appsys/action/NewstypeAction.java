package com.cla.action;

import org.apache.log4j.Logger;
import com.pfframe.action.CurdBaseAction;
import com.appsys.model.Newstype;
import com.appsys.service.INewstypeService;

@SuppressWarnings("serial")
public class NewstypeAction extends CurdBaseAction<Newstype, String>{
	private static final Logger logger = Logger.getLogger(NewstypeAction.class);
	private INewstypeService newstypeService;

	public void setNewstypeService(INewstypeService newstypeService) {
		this.newstypeService = newstypeService;
	}

	public Newstype getObj() {
		return obj;
	}

	public void setObj(Newstype obj) {
		this.obj = obj;
	}
	
	public String getObjid(){
		if(obj !=null && objid ==null){
			objid = obj.getNewstypeid();
		}
		return objid;
	}
	
	public void setObjid(String objid) {
		this.objid = objid;
	}

	public NewstypeAction() {
		super();
	}
}
