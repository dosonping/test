package com.dosonping.design_patterns.prototype.deepcopywithserilization;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class NewSpoon implements Serializable{
	private String id;
	private Spoon spoon;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Spoon getSpoon() {
		return spoon;
	}
	public void setSpoon(Spoon spoon) {
		this.spoon = spoon;
	}
	/**
	 * 利用串行化来做深复制
	 * 把对象写道流里的过程是串行化(Serilization)过程;把对象从流中读出来是并行化(Deserialization)过程. 写在流里的是对象的一个拷贝,然后再从流里读出来重建对象.
	 * @dateTime 2016年5月10日 下午2:42:17
	 * @author dosonping
	 * @return
	 */
	public Object deepClone(){
		try {
			ByteArrayOutputStream bo = new ByteArrayOutputStream();
			ObjectOutputStream oo = new ObjectOutputStream(bo);
			oo.writeObject(this);
			
			ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
			ObjectInputStream oi = new ObjectInputStream(bi);
			return oi.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
