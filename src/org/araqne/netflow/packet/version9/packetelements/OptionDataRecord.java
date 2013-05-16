package org.araqne.netflow.packet.version9.packetelements;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.araqne.netflow.packet.version9.packetelements.optiondatarecordfield.ScopeOptionField;

public class OptionDataRecord {

	private short templatedId;
	private short length;
	private ArrayList<ScopeOptionField> scopeFields;
	private ArrayList<Field> optionFields;

	public void parse(ByteBuffer b){
		templatedId = b.getShort();
		length = b.getShort();
		//TODO
	}
	
	public short getTemplatedId() {
		return templatedId;
	}

	public void setTemplatedId(short templatedId) {
		this.templatedId = templatedId;
	}

	public short getLength() {
		return length;
	}

	public void setLength(short length) {
		this.length = length;
	}

	public ArrayList<ScopeOptionField> getScopeFields() {
		return scopeFields;
	}

	public void setScopeFields(ArrayList<ScopeOptionField> scopeFields) {
		this.scopeFields = scopeFields;
	}

	public ArrayList<Field> getOptionFields() {
		return optionFields;
	}

	public void setOptionFields(ArrayList<Field> optionFields) {
		this.optionFields = optionFields;
	}

}
