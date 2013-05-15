package org.araqne.netflow.packet.version9;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.araqne.netflow.packet.NetflowRecord;
import org.araqne.netflow.packet.version9.packetelements.DataFlowSet;
import org.araqne.netflow.packet.version9.packetelements.OptionTemplateField;
import org.araqne.netflow.packet.version9.packetelements.TemplateFlowSet;

public class Netflow9Record implements NetflowRecord{

	private TemplateFlowSet templateFlow;
	private ArrayList<DataFlowSet> dataFlowSets;
	private OptionTemplateField optionTemplateFlow;
		
	@Override
	public void parse(ByteBuffer b) {
		// TODO Auto-generated method stub
		
	}

}
