package org.araqne.netflow.packet.version9;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.araqne.netflow.packet.NetflowRecord;
import org.araqne.netflow.packet.version9.fieldtype.TemplateFlowSet;

public class Netflow9TemplateFlowsSetRecord implements NetflowRecord{

	private short flowSetId;
	private short length;
	private ArrayList<TemplateFlowSet> templates;
		
	@Override
	public void parse(ByteBuffer b) {
		// TODO Auto-generated method stub
		
	}

}
