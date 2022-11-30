package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface AgentCrudBeanRemote {
	List<Agent> showAgentBean() throws ClassNotFoundException, SQLException;
	Agent searchAgentBean(int agentId) throws ClassNotFoundException, SQLException;
	String addAgentBean(Agent agent) throws ClassNotFoundException, SQLException;;
	String deleteAgentBean(int agentId) throws ClassNotFoundException, SQLException;;
	String updateAgentBean(Agent agent) throws ClassNotFoundException, SQLException;;
}
