public class Main {

    public static void main(String[] args) {


    //Creando usuario para mostrar diferencias.:

    Usuario u1 = new Usuario(1,"Tito","tito@tempmail.com");
    
        

    //Los ticket de soporte con o sin usuarios:

    TicketSoporte t1 = new TicketSoporte(1,"Problema de Sistema Operativo/No Hardware","01/01/1991");

    TicketSoporte t2 = new TicketSoporte(2,"Problema de Hardware -Revisar","02/02/1992");


    TicketSoporte t3 = new TicketSoporte(3,"Problema en una de las memorias ram -Reemplazar","03/02/1992",u1);


   //Asignando Tecnicos: 


    t1.asignarTecnico("Raul");

    t2.asignarTecnico("Lucia");

    t3.asignarTecnico("Mariano");



    //Mostrando el cambio de estado en ticket 1:

    t1.cerrarTicket();

    System.out.println("---------------------------------------------------------");

    t1.mostrarDetalle();

    System.out.println("---------------------------------------------------------");
    t2.mostrarDetalle();


    System.out.println("---------------------------------------------------------");

    t3.mostrarDetalle(u1);



    }


}
