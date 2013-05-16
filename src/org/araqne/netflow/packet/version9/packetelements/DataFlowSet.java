package org.araqne.netflow.packet.version9.packetelements;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/**
 * @author tgnice@nchovy.com
 *
 */
public class DataFlowSet {

	private short flowSetId;
	private short length;
	private ArrayList<Field> fields;
	private short[] padding;
	
	public void parse(ByteBuffer b , ArrayList<RecordField> fieldTypes){
		int recordSize=0;
		int paddingSize=0;
		
		flowSetId = b.getShort();
		length = b.getShort();
		
		for(int i=0; i<fieldTypes.size();i++){
			recordSize += fieldTypes.get(i).getLength(); 
		}

		for(int i=0; i< (length-4)/recordSize;i++){
			//TODO
		}
		
		paddingSize = 4 - (length%4);
		if(paddingSize !=0){
			byte[] pad = new byte[paddingSize];
			b.get(pad);
		}
	}

	public short getFlowSetId() {
		return flowSetId;
	}

	public void setFlowSetId(short flowSetId) {
		this.flowSetId = flowSetId;
	}

	public short getLength() {
		return length;
	}

	public void setLength(short length) {
		this.length = length;
	}

	public ArrayList<Field> getFields() {
		return fields;
	}

	public void setFields(ArrayList<Field> fields) {
		this.fields = fields;
	}

	public short[] getPadding() {
		return padding;
	}

	public void setPadding(short[] padding) {
		this.padding = padding;
	}
	
}
