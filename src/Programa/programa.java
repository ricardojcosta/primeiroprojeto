package Programa;

import Excecao.dominioExcecao;
import entidades.reserva;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        try {
            System.out.println("Numero da reserva");
            int numero = sc.nextInt();
            System.out.println("Check-in data (dd/MM/yyyy): ");
            Date checkin = sdf.parse(sc.next());
            System.out.println("Check-out data (dd/MM/yyyy): ");
            Date checkout = sdf.parse(sc.next());
            reserva re = new reserva(numero, checkin, checkout);
            System.out.println("Reserva: " + re);
            System.out.println("");
            System.out.println("Entre com os dados para atualizar a reserva");
            System.out.println("Check-in data (dd/MM/yyyy): ");
            checkin = sdf.parse(sc.next());
            System.out.println("Check-out data (dd/MM/yyyy): ");
            checkout = sdf.parse(sc.next());
            re.atualizareserva(checkin, checkout);
            System.out.println("Reserva: " + re);

        } catch (ParseException e) {
            System.out.println("data no formato invalido");

        } catch (dominioExcecao e) {
            System.out.println(e.getMessage());
        }
    }

}
