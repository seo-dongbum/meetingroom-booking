package sbt.booking.vo;

public class Master {

	private String gubun;
	private String seq;
	private String name;
	private String upper;
	
	public Master(String gubun, String seq, String name, String upper) {
		super();
		this.gubun = gubun;
		this.seq = seq;
		this.name = name;
		this.upper = upper;
	}

	public String getGubun() {
		return gubun;
	}

	public void setGubun(String gubun) {
		this.gubun = gubun;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUpper() {
		return upper;
	}

	public void setUpper(String upper) {
		this.upper = upper;
	}

	@Override
	public String toString() {
		return "Master [gubun=" + gubun + ", seq=" + seq + ", name=" + name + ", upper=" + upper + "]";
	}
	
	
}
