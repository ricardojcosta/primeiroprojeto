package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class reserva {

    private int numeroreserva;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

    public reserva(int numeroreserva, Date checkin, Date checkout) {
        this.numeroreserva = numeroreserva;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int getNumeroreserva() {
        return numeroreserva;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setNumeroreserva(int numeroreserva) {
        this.numeroreserva = numeroreserva;
    }
    
    public long duracao(){
        long diff = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    
    public void atualizareserva(Date checkin, Date checkout){
        this.checkin=checkin;
        this.checkout=checkout;
    }

    @Override
    public String toString() {
        return "Numero da reserva=" + numeroreserva + ",Data de checkin=" + 
                sdf.format(checkin) + 
                ", Data de checkout=" + sdf.format(checkout)+
                ", " +duracao()+" noites";
    }
    
    
    
    

}
