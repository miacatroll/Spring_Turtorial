package mrs.domain.model;
import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class ReservableRoom implements Serializable{
	@EmbeddedId
	private ReservableRoomId reservableRoomId;

	@ManyToOne
	@JoinColumn(name = "room_id", insertable = false, updatable = false)
	@MapsId("roomId")
	private MeetingRoom meetingRoom;

	public ReservableRoomId getReservableRoomId() {
		return reservableRoomId;
	}
	public void setReservableRoomId(ReservableRoomId reservableRoomId) {
		this.reservableRoomId = reservableRoomId;
	}
	public MeetingRoom getMeetingRoom() {
		return meetingRoom;
	}
	public void setMeetingRoom(MeetingRoom meetingRoom) {
		this.meetingRoom = meetingRoom;
	}
	public ReservableRoom(ReservableRoomId reservableRoomId) {
		 this.reservableRoomId = reservableRoomId;
	}
	public ReservableRoom() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
}
