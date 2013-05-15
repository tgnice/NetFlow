package org.araqne.netflow.packet.version9;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.araqne.netflow.packet.NetflowRecord;
import org.araqne.netflow.packet.version9.fieldtype.Field;

public class Netflow9Record implements NetflowRecord{

	private short flowSetId;
	private short length;
	private short templateId;
	private short fieldCount;
	private ArrayList<Field> fields;
		
	@Override
	public void parse(ByteBuffer b) {
		// TODO Auto-generated method stub
		
	}

}
