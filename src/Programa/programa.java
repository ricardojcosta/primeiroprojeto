
package Programa;

import entidades.reserva;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class programa {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        System.out.println("Numero da reserva");
        int numero = sc.nextInt();
        System.out.println("Check-in data (dd/MM/yyyy): ");
        Date checkin = sdf.parse(sc.next());
        System.out.println("Check-out data (dd/MM/yyyy): ");
        Date checkout = sdf.parse(sc.next());

        if (!checkout.after(checkin)) {
            System.out.println("Erro na reserva,"
                    + " a data de Check-out"
                    + " precisa ser depois da data de Check-in");
        } else {
            reserva re = new reserva(numero, checkin, checkout);
            System.out.println("Reserva: " + re);
                       
            
            System.out.println("");
            System.out.println("Entre com os dados para atualizar a reserva");
            System.out.println("Check-in data (dd/MM/yyyy): ");
            checkin = sdf.parse(sc.next());
            System.out.println("Check-out data (dd/MM/yyyy): ");
            checkout = sdf.parse(sc.next());

            String error = re.atualizareserva(checkin, checkout);
            if(error != null){
                System.out.println("Erro na reserva: "+error); 
            }else{   
                re.atualizareserva(checkin, checkout);
                System.out.println("Reserva: " + re);
            } 
          

        }
    }
    
}
