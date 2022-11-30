package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class EmployBean
 */
@Stateless
@Remote(AgentCrudBeanRemote.class)
public class AgentBean implements AgentCrudBeanRemote {

	static AgentDAO edao;
	static {
		edao = new AgentDAO();
	}
    /**
     * Default constructor. 
     */
    public AgentBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Agent> showAgentBean() throws ClassNotFoundException, SQLException {
			return edao.showAgent();
	}

	@Override
	public Agent searchAgentBean(int agentId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return edao.searchAgent(agentId);
	}

	@Override
	public String addAgentBean(Agent agent) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return edao.addAgent(agent);
	}

	@Override
	public String deleteAgentBean(int agentId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return edao.deleteAgent(agentId);
	}

	@Override
	public String updateAgentBean(Agent agent) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return edao.updateAgent(agent);
	}

}