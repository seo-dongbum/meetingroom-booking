package sbt.booking.vo;

public class Booking {

	private String seq;
	private String company;
	private String room;
	private String booking_human;
	private String participant;
	private String subject;
	private String stdate;
	private String sttime;
	private String eddate;
	private String edtime;
	
	
	
	public Booking() {
		super();
	}
	
	public Booking(String seq, String company, String room, String booking_human, String participant, String subject,
			String stdate, String sttime, String eddate, String edtime) {
		super();
		this.seq = seq;
		this.company = company;
		this.room = room;
		this.booking_human = booking_human;
		this.participant = participant;
		this.subject = subject;
		this.stdate = stdate;
		this.sttime = sttime;
		this.eddate = eddate;
		this.edtime = edtime;
	}

	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getBooking_human() {
		return booking_human;
	}
	public void setBooking_human(String booking_human) {
		this.booking_human = booking_human;
	}
	public String getParticipant() {
		return participant;
	}
	public void setParticipant(String participant) {
		this.participant = participant;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getStdate() {
		return stdate;
	}
	public void setStdate(String stdate) {
		this.stdate = stdate;
	}
	public String getSttime() {
		return sttime;
	}
	public void setSttime(String sttime) {
		this.sttime = sttime;
	}
	public String getEddate() {
		return eddate;
	}
	public void setEddate(String eddate) {
		this.eddate = eddate;
	}
	public String getEdtime() {
		return edtime;
	}
	public void setEdtime(String edtime) {
		this.edtime = edtime;
	}

	@Override
	public String toString() {
		return "Booking [seq=" + seq + ", company=" + company + ", room=" + room + ", booking_human=" + booking_human
				+ ", participant=" + participant + ", subject=" + subject + ", stdate=" + stdate + ", sttime=" + sttime
				+ ", eddate=" + eddate + ", edtime=" + edtime + "]";
	}
	
}
