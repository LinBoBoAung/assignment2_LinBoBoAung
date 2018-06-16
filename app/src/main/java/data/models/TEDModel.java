package data.models;

import network.HttpUrlConnectionTEDDataAgentImpl;
import network.TEDDataAgent;

import static utils.TEDTalkConstants.DUMMY_ACCESS_TOKEN;


public class TEDModel
{
    private static TEDModel objInstance;
    private TEDDataAgent tedDataAgent;
    private TEDModel()
    {
        tedDataAgent= HttpUrlConnectionTEDDataAgentImpl.getObjstance();

    }
    public static TEDModel  getObjInstance()
    {
        if(objInstance==null)
        {
            objInstance=new TEDModel();
        }
        return objInstance;
    }
    public void loadTEDTalk()
    {
tedDataAgent.loadTEDTalk(1,DUMMY_ACCESS_TOKEN);
    }
}
