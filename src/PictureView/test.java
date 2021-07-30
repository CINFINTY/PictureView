package PictureView;

import java.sql.Connection;

public class test {
    Connection con = null;

    public static void main(String[] args) {

    }

    public void listar(){
        con = ConexionBD.getConexion();
        System.out.println(con);
    }

    class Sumar implements Runnable{

        @Override
        public void run() {
            int r = 5 + 6;
            System.out.println("La suma es:" +r);
        }
    }

    static class  Restar implements Runnable{

        @Override
        public void run() {
            int r = 20 - 6;
            System.out.println("La suma es:" +r);
        }
    }
}
