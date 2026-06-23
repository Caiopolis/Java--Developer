package Model.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import Model.Exceptions.DomainException;

public class Reserva {

	
	private Integer numQuarto;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public Reserva(Integer numQuarto, Date checkIn, Date checkOut) {
		
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		
		this.numQuarto = numQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}


	public Integer getNumQuarto() {
		return numQuarto;
	}


	public void setNumQuarto(Integer numQuarto) {
		this.numQuarto = numQuarto;
	}


	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	
	public long duracaoDias() {
		
		long diff = checkOut.getTime() - checkIn.getTime(); //Subtração de datas convertidas em MileSegundos (Por isso o tipo long)
		
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //Aqui convertemos essa diferença (variavel diff), usando a Classe do java TimeUnit, para a quantiodade de dias.
		
	}
	
	public void attDatas(Date checkIn, Date checkOut) {
		
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
		
	}
	
	@Override //Como todos os objetos já vem com o toString padrão é necessario o Override.
	public String toString() {
		
		return "Room " + this.numQuarto + ", check-in: " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut) + ", duração: " + this.duracaoDias() + " Noites.";
	}
	
	
	
	
}
