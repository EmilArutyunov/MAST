import jade.core.Agent;
import jade.core.AID;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;

import java.util.*;

class Room {
    ArrayList<String> events = new ArrayList<>();
    Room (int... args){
        for (int i: args){
            events.add(WumpusWorldAgent.roomCodes.get(i));
        }
    }
}
class Coords {
    int row = 0;
    int column = 0;
    Coords(int row, int column){
        this.row = row;
        this.column = column;
    }
}